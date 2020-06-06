package com.solankiTailorsDB.solankiTailorsDB.Service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import com.solankiTailorsDB.solankiTailorsDB.Model.FileModel;

public interface FileService {
	ResponseEntity uploadFile(MultipartFile file1);
	FileModel downloadFile(String filename);
}
