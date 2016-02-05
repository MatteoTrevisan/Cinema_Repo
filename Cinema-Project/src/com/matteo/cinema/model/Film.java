package com.matteo.cinema.model;

public class Film {

	private int id;
	private String title;
	private String price;
	private String link;

	public Film(final int id, final String title, final String price, final String link) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.title = title;
		this.price = price;
		this.link = link;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
