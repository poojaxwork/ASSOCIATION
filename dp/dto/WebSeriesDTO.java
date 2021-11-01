package com.xwork.dp.dto;

import com.xwork.dp.constants.Genre;

public class WebSeriesDTO {
 public static int length;
private String name;
 private String cast;
 private int noOfcharacter;
 private int  totalSeason;
 private int currentSeason;
 private Genre genre;
 private float rating;
 
 public WebSeriesDTO() {
	System.out.println("Webseries is invoked:");
}

public WebSeriesDTO(String name, String cast, int noOfcharacter, int totalSeason, int currentSeason, Genre genre,
		float rating) {
	super();
	this.name = name;
	this.cast = cast;
	this.noOfcharacter = noOfcharacter;
	this.totalSeason = totalSeason;
	this.currentSeason = currentSeason;
	this.genre = genre;
	this.rating = rating;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCast() {
	return cast;
}

public void setCast(String cast) {
	this.cast = cast;
}

public int getNoOfcharacter() {
	return noOfcharacter;
}

public void setNoOfcharacter(int noOfcharacter) {
	this.noOfcharacter = noOfcharacter;
}

public int getTotalSeason() {
	return totalSeason;
}

public void setTotalSeason(int totalSeason) {
	this.totalSeason = totalSeason;
}

public int getCurrentSeason() {
	return currentSeason;
}

public void setCurrentSeason(int currentSeason) {
	this.currentSeason = currentSeason;
}

public Genre getGenre() {
	return genre;
}

public void setGenre(Genre genre) {
	this.genre = genre;
}

public float getRating() {
	return rating;
}

public void setRating(float rating) {
	this.rating = rating;
}
 
 
 
 
}
