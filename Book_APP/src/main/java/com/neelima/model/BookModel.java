package com.neelima.model;

public class BookModel {

	private String title;
	private String author;
	private String publisher;
	private double cost;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "BookModel [title=" + title + ", author=" + author + ", publisher=" + publisher + ", cost=" + cost + "]";
	}

}
