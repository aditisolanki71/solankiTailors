package com.solankiTailorsDB.solankiTailorsDB.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "blog" )
public class BlogModel {

	@Id
	@GeneratedValue
	
	int id;
	String name;
	String description;
	String image;
	Date date;
	long likes;
	String comments;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public long getLikes() {
		return likes;
	}
	public void setLikes(long likes) {
		this.likes = likes;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	@Override
	public String toString() {
		return "BlogModel [id=" + id + ", name=" + name + ", description=" + description + ", image=" + image
				+ ", date=" + date + ", likes=" + likes + ", comments=" + comments + "]";
	}
		
}
