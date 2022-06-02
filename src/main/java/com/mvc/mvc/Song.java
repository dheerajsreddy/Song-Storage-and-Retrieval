package com.mvc.mvc;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("Songs")
public class Song {
	private String name;
	private String genre;
	private String singer;
	private int year;

	//Getter Functions
	public String getName() {
		return name;
	}
	public String getDetails() {
		return genre;
	}
	public String getAuthor() {
		return singer;
	}
	public int getYearOfRelease() {
		return year;
	}

	//Setter Functions
	public void setName(String name) {
		this.name = name;
	}
	public void setDetails(String genre) {
		this.genre = genre;
	}
	public void setAuthor(String singer) {
		this.singer = singer;
	}
	public void setYearOfRelease(int year) {
		this.year = year;
	}

}
