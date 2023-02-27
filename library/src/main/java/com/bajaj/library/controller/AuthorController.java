package com.bajaj.library.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bajaj.library.beans.AuthorBean;
import com.bajaj.library.services.AuthorsServiceImpl;


@RestController
@RequestMapping("/authors")
public class AuthorController {

	@Autowired
	private AuthorsServiceImpl authorsServiceImpl;

	@PostMapping("/addAuthor")
	public ResponseEntity<?> addAuthor(@RequestBody AuthorBean authorBean) {

		String  messaage = authorsServiceImpl.addAuthor(authorBean);

		return new ResponseEntity<>(messaage, HttpStatus.OK);
	}
	
	@GetMapping("/getAuthors")
	public ResponseEntity<?> getAuthors() {

		ArrayList<AuthorBean> authorBeans= authorsServiceImpl.getAuthors();

		return new ResponseEntity<>(authorBeans, HttpStatus.OK);
	}
	
	@PutMapping("/updateAuthorsOfId/{authorId}")
	public ResponseEntity<?> updateAuthors(@PathVariable int authorId , @RequestBody AuthorBean authorBean) {

		String message= authorsServiceImpl.updateAuthor(authorId,authorBean);

		return new ResponseEntity<>(message, HttpStatus.OK);
	}
	
	@GetMapping("/findAuthorById/{authorId}")
	public ResponseEntity<?> findAuthor(@PathVariable int authorId){
		try {
			AuthorBean authorBean =authorsServiceImpl.findAuthor(authorId);
			return new ResponseEntity<>(authorBean,HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>("Author of ID"+authorId+"Not Found",HttpStatus.NOT_FOUND);
			
		}
	}
	

}
