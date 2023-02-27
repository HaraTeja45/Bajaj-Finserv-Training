package com.bajaj.library.beans;



public class AuthorBean {

	private int authorId;
	private String authorName;
	private String authorMobileNumber;
	private String authorEmailId;
	private String authorAddress;
	private String authorStatus;
	
	
	
	public String getAuthorStatus() {
		return authorStatus;
	}
	public void setAuthorStatus(String authorStatus) {
		this.authorStatus = authorStatus;
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

	
	
	public AuthorBean(int authorId, String authorName, String authorMobileNumber, String authorEmailId,
			String authorAddress, String authorStatus) {
		super();
		this.authorId = authorId;
		this.authorName = authorName;
		this.authorMobileNumber = authorMobileNumber;
		this.authorEmailId = authorEmailId;
		this.authorAddress = authorAddress;
		this.authorStatus = authorStatus;
	}
	public AuthorBean() {
		super();
	}
	@Override
	public String toString() {
		return "AuthorBean [authorId=" + authorId + ", authorName=" + authorName + ", authorMobileNumber="
				+ authorMobileNumber + ", authorEmailId=" + authorEmailId + ", authorAddress=" + authorAddress
				+ ", authorStatus=" + authorStatus + "]";
	}

	
	
}
