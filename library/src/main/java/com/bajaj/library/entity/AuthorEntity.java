package com.bajaj.library.entity;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Author_Table")
public class AuthorEntity {

	@Id
	private int authorId;
	private String authorName;
	private String authorMobileNumber;
	private String authorEmailId;
	private String authorAddress;

	private String authorStatus;

	@ManyToMany(mappedBy = "authorEntity", fetch = FetchType.LAZY)
	private Set<BooksEntity> booksEntity;

	public String getAuthorStatus() {
		return authorStatus;
	}

	public void setAuthorStatus(String authorStatus) {
		this.authorStatus = authorStatus;
	}

	public Set<BooksEntity> getBooksEntity() {
		return booksEntity;
	}

	public void setBooksEntity(Set<BooksEntity> booksEntity) {
		this.booksEntity = booksEntity;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getAuthorMobileNumber() {
		return authorMobileNumber;
	}

	public void setAuthorMobileNumber(String authorMobileNumber) {
		this.authorMobileNumber = authorMobileNumber;
	}

	public String getAuthorEmailId() {
		return authorEmailId;
	}

	public void setAuthorEmailId(String authorEmailId) {
		this.authorEmailId = authorEmailId;
	}

	public String getAuthorAddress() {
		return authorAddress;
	}

	public void setAuthorAddress(String authorAddress) {
		this.authorAddress = authorAddress;
	}

	public AuthorEntity(int authorId, String authorName, String authorMobileNumber, String authorEmailId,
			String authorAddress, String authorStatus, Set<BooksEntity> booksEntity) {
		super();
		this.authorId = authorId;
		this.authorName = authorName;
		this.authorMobileNumber = authorMobileNumber;
		this.authorEmailId = authorEmailId;
		this.authorAddress = authorAddress;
		this.authorStatus = authorStatus;
		this.booksEntity = booksEntity;
	}

	public AuthorEntity() {
		super();
	}

	@Override
	public String toString() {
		return "AuthorEntity [authorId=" + authorId + ", authorName=" + authorName + ", authorMobileNumber="
				+ authorMobileNumber + ", authorEmailId=" + authorEmailId + ", authorAddress=" + authorAddress
				+ ", authorStatus=" + authorStatus + ", booksEntity=" + booksEntity + "]";
	}

}
