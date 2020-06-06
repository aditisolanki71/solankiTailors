package com.solankiTailorsDB.solankiTailorsDB.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.solankiTailorsDB.solankiTailorsDB.Model.FileModel;
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
	
	@GetMapping("/download/{filename}")
	public ResponseEntity downloadFile(@PathVariable String filename) {
		FileModel f = fileservice.downloadFile(filename);
		if(f == null) {
			return ResponseEntity.badRequest().body("File Not Found");
		}
		else {
			return ResponseEntity.ok()
					.contentType(MediaType.parseMediaType("image/jpeg"))
					.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + f.getFilename() + "\"")
					.body(f.getFile());
		}
	}

}
