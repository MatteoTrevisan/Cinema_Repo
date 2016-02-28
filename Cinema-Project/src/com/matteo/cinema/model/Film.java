package com.matteo.cinema.model;

import java.util.List;

public class Film {

	private int filmId;
	private int filmIdDate;
	private String title;
	private String price;
	private String link;
	private String[] date;

	public Film(final int id, final String title, final String price, final String link) {
		// TODO Auto-generated constructor stub
		this.filmId = id;
		this.title = title;
		this.price = price;
		this.link = link;
	}
	
	public Film(final int id, final String[] date){
		this.filmIdDate = id;
		this.date = date;
		
	}

	public void setDate(String[] date) {
		this.date = date;
	}
	
	public String[] getDate() {
		return date;
	}

	public int getFilmId() {
		return filmId;
	}

	public void setFilmId(int id) {
		this.filmId = id;
	}

	public int getFilmIdDate() {
		return filmIdDate;
	}

	public void setFilmIdDate(int filmIdDate) {
		this.filmIdDate = filmIdDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	

}
