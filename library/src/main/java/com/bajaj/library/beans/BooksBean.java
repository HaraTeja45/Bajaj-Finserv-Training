package com.bajaj.library.beans;

import java.util.Set;

import com.bajaj.library.entity.AuthorEntity;


public class BooksBean {
	
	private int bookId;
	private String bookName;
	private String status;
	private String bookCategory;
	private Set<AuthorEntity> authorEntity;
	
	
	
	public String getBookCategory() {
		return bookCategory;
	}
	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	
	
	public Set<AuthorEntity> getAuthorEntity() {
		return authorEntity;
	}
	public void setAuthorEntity(Set<AuthorEntity> authorEntity) {
		this.authorEntity = authorEntity;
	}
	
	public BooksBean(int bookId, String bookName, String status, String bookCategory, Set<AuthorEntity> authorEntity) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.status = status;
		this.bookCategory = bookCategory;
		this.authorEntity = authorEntity;
	}
	

	public BooksBean() {
		super();
	}
	@Override
	public String toString() {
		return "BooksBean [bookId=" + bookId + ", bookName=" + bookName + ", status=" + status + ", bookCategory="
				+ bookCategory + ", authorEntity=" + authorEntity + "]";
	}
	
	

}
