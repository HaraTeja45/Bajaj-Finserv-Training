package com.bajaj.library.entity;


import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

//import jakarta.persistence.OneToOne;




@Entity
@Table(name = "Book_Table")
public class BooksEntity {

	@Id
	private int bookId;
	private String bookName;
	private String status;
	private String bookCategory;
//	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "fk_authorEntity_book_Id")
	
	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinTable(name = "Books_Author_Table",
	
			joinColumns ={
					@JoinColumn(referencedColumnName = "bookId")
		
	},
			
			inverseJoinColumns = {
					@JoinColumn(referencedColumnName = "authorId"),
					@JoinColumn(referencedColumnName = "authorName")
			}
	
			)
	
	
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

	

	

	public BooksEntity(int bookId, String bookName, String status, String bookCategory,
			Set<AuthorEntity> authorEntity) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.status = status;
		this.bookCategory = bookCategory;
		this.authorEntity = authorEntity;
	}

	public BooksEntity() {
		super();
	}

	@Override
	public String toString() {
		return "BooksEntity [bookId=" + bookId + ", bookName=" + bookName + ", status=" + status + ", bookCategory="
				+ bookCategory + ", authorEntity=" + authorEntity + "]";
	}


	


}
