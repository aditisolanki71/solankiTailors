package com.solankiTailorsDB.solankiTailorsDB.Service;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

public interface FileService {
	ResponseEntity uploadFile(MultipartFile file1);
}
