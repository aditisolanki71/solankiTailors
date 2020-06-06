package com.solankiTailorsDB.solankiTailorsDB.Repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.solankiTailorsDB.solankiTailorsDB.Model.FileModel;

@Repository
@Transactional
public interface FileRepository extends JpaRepository<FileModel,Long> {
	FileModel findByFilename(String filename);
}
