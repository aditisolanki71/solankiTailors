package com.solankiTailorsDB.solankiTailorsDB.Model;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name= "file")
public class FileModel {
	
	@GeneratedValue
	@Id
	private Long id;
	
	@Column
	private String filename;
	
	@Lob
	@Column
	private byte[] file;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	
	public byte[] getFile() {
		return file;
	}
	public void setFile(byte[] file) {
		this.file = file;
	}
	@Override
	public String toString() {
		return "FileModel [id=" + id + ", filename=" + filename + ", file=" + Arrays.toString(file) + "]";
	}
	
	
	
}
