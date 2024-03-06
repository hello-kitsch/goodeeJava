package com.object.model.vo;

public class Board {
	private String name;
	private String date;
	private String title;
	private String content;
	
	public Board() {
		// TODO Auto-generated constructor stub
	}
	
	public Board(String name, String date, String title, String content) {
		super();
		this.name = name;
		this.date = date;
		this.title = title;
		this.content = content;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
