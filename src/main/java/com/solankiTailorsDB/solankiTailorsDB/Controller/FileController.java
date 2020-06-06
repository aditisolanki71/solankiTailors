package com.solankiTailorsDB.solankiTailorsDB.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.solankiTailorsDB.solankiTailorsDB.Service.FileService;


@RestController
@RequestMapping("/file")
public class FileController {
	
	@Autowired	
	FileService fileservice;
	
	@PostMapping("/upload")
	public ResponseEntity uploadFile(@RequestParam("file") MultipartFile file1) {
		return fileservice.uploadFile(file1);
		
	}

}
