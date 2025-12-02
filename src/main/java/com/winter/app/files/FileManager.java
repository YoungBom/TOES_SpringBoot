package com.winter.app.files;

import java.util.UUID;

import org.springframework.web.multipart.MultipartFile;

public class FileManager {
	
	
	public void fileSave(File file, MultipartFile f)throws Exception{
		if(!file.exist()) {
			file.mkdirs();
		}
		if(f==null || f.isEmpty()) {
			return;
		}
		
		String fileName = UUID.randomUUID().toString();
		fileName = fileName + "_" + f.getOriginalFilename();
		
	}
}
