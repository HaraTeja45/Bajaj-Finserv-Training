package com.bajaj.library.controller;

import java.util.ArrayList;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bajaj.library.beans.BooksBean;
import com.bajaj.library.services.BooksServicesImpl;

@RestController
@RequestMapping("/books")
public class BooksController {

	@Autowired
	private BooksServicesImpl booksServicesImpl;

	@PostMapping("/addBook")
	public ResponseEntity<?> addBook(@RequestBody BooksBean booksBean) {
		BooksBean message = booksServicesImpl.addBook(booksBean);
		return new ResponseEntity<>(message, HttpStatus.OK);
	}

	@GetMapping("/getBooks")
	public ResponseEntity<?> addBook() {
		ArrayList<BooksBean> message = booksServicesImpl.getBooks();
		return new ResponseEntity<>(message, HttpStatus.OK);
	}

	@PutMapping("/updateBookUsingBookId{bookId}")
	public ResponseEntity<?> updateBookUsingBookId(@PathVariable int bookId, @RequestBody BooksBean booksBean) {
		try {

			String message = booksServicesImpl.updateBook(bookId, booksBean);
			return new ResponseEntity<>(message, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>("Book With the ID" + bookId + "Not Found", HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/deleteBookOfId/{bookId}")
	public ResponseEntity<?> deleteBookOfId(@PathVariable int bookId) {
		try {
			String message = booksServicesImpl.deleteBook(bookId);
			return new ResponseEntity<>(message, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>("Book With the ID" + bookId + "Not Found", HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/findBookById/{bookId}")
	public ResponseEntity<?> findBook(@PathVariable int bookId) {

		try {
			
			String msg = booksServicesImpl.findBook(bookId);

			return new ResponseEntity<>(msg, HttpStatus.OK);
			
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			return new ResponseEntity<>("Book with ID "+bookId+" Not Found",HttpStatus.NOT_FOUND);
		}
		

	}
	
	
	@GetMapping("/findBooksStartingWith/{keyWord}")
	public ResponseEntity<?> findBooksStartingWith(@PathVariable String keyWord){
		try {
			
			ArrayList<BooksBean> booksBean=booksServicesImpl.findBooksStartingWith(keyWord);
			return new ResponseEntity<>(booksBean,HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>("Books with KeyWord "+keyWord+" Not Found",HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/findBooksOfCategory/{category}")
	public ResponseEntity<?> findBooksOfCategory(@PathVariable String category){
		try {
			
			ArrayList<BooksBean> booksBean=booksServicesImpl.findBooksOfCategory(category);
			return new ResponseEntity<>(booksBean,HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>("Books with KeyWord "+category+" Not Found",HttpStatus.NOT_FOUND);
		}
	}

}
