package com.bajaj.library.services;


import java.util.ArrayList;

import com.bajaj.library.beans.BooksBean;


public interface BooksServices {

	public BooksBean addBook(BooksBean booksBean);
	public ArrayList<BooksBean> getBooks();
	public String updateBook(int bookId,BooksBean booksBean);
	public String deleteBook(int bookId);
	public String findBook(int bookId);
	public ArrayList<BooksBean> findBooksStartingWith(String keyWord);
	public ArrayList<BooksBean> findBooksOfCategory(String category);
}
