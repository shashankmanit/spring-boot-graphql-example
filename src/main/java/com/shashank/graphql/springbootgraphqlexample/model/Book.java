package com.shashank.graphql.springbootgraphqlexample.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@AllArgsConstructor
//@NoArgsConstructor
//@Setter
//@Getter
@Table
@Entity
public class Book {

	@Id
	private String isn;
	private String title;
	private String publisher;
	private String[] authors;
	private String publishedDate;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String isn, String title, String publisher, String[] authors, String publishedDate) {
		super();
		this.isn = isn;
		this.title = title;
		this.publisher = publisher;
		this.authors = authors;
		this.publishedDate = publishedDate;
	}

	public String getIsn() {
		return isn;
	}

	public void setIsn(String isn) {
		this.isn = isn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String[] getAuthors() {
		return authors;
	}

	public void setAuthors(String[] authors) {
		this.authors = authors;
	}

	public String getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(String publishedDate) {
		this.publishedDate = publishedDate;
	}

	@Override
	public String toString() {
		return "Book [isn=" + isn + ", title=" + title + ", publisher=" + publisher + ", authors="
				+ Arrays.toString(authors) + ", publishedDate=" + publishedDate + "]";
	}

}
