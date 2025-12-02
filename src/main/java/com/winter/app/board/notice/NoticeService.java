package com.winter.app.board.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winter.app.files.FileManager;
import com.winter.app.util.Pager;

@Service
public class NoticeService {
	//Autowired는 각각 줘야한다
	
	//@Autowired
	//private NoticeDAO noticeDAO;
	//private FileManager fileManager;
	// 이런식의 허용은 x
	
	
	@Autowired
	private NoticeDAO noticeDAO;
	
	@Autowired
	private FileManager fileManager;
	
	public List<NoticeDTO> list (Pager pager)throws Exception{
		//1. totalCount 구하기
		Long totalCount= noticeDAO.count(pager);
		
		pager.pageing(totalCount);

		
		return noticeDAO.list(pager);
	}
	
	public NoticeDTO detail(NoticeDTO noticeDTO)throws Exception{
		return noticeDAO.detail(noticeDTO);
	}
	
	public int add(NoticeDTO noticeDTO)throws Exception{
		return noticeDAO.add(noticeDTO);
	}
	
	public int update(NoticeDTO noticeDTO)throws Exception{
		return noticeDAO.update(noticeDTO);
	}
	
	public int delete(NoticeDTO noticeDTO)throws Exception{
		return noticeDAO.delete(noticeDTO);
	}
	
}
