package com.winter.app.board;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardDAO {
	
	//상세정보
	public BoardDTO detail(BoardDTO boardDTO)throws Exception;
	// Mapper는 패키지명:클래스명
	// Result 타입: BoardDTO
	// id:detail
	//글 추가
	public int add(BoardDTO boardDTO)throws Exception;
}
