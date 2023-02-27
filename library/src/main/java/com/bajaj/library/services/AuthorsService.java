package com.bajaj.library.services;

import java.util.ArrayList;

import com.bajaj.library.beans.AuthorBean;



public interface AuthorsService {

	public String addAuthor(AuthorBean authorBean);
	public ArrayList<AuthorBean> getAuthors();
	public String updateAuthor(int authorId,AuthorBean authorBean);
	public AuthorBean findAuthor(int authorId);
}
