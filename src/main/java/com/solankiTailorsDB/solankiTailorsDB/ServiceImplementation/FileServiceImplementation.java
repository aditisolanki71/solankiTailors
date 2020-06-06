package com.solankiTailorsDB.solankiTailorsDB.ServiceImplementation;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.solankiTailorsDB.solankiTailorsDB.Model.FileModel;
import com.solankiTailorsDB.solankiTailorsDB.Repository.FileRepository;
import com.solankiTailorsDB.solankiTailorsDB.Service.FileService;

@Service
public class FileServiceImplementation implements FileService{

	@Autowired
	FileRepository fileRepository;
	
	@Override
	public ResponseEntity uploadFile(MultipartFile file1) {
		// TODO Auto-generated method stub
		//demo/aditi/img1
		//file=content
		//filename=
		FileModel file = new FileModel();	
		try {
			file.setFile(file1.getBytes());
			file.setFilename(file1.getOriginalFilename());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		fileRepository.save(file);
		return ResponseEntity.ok("Success");
	}

	@Override
	public FileModel downloadFile(String filename) {
		// TODO Auto-generated method stub
		return fileRepository.findByFilename(filename);
	}

}
