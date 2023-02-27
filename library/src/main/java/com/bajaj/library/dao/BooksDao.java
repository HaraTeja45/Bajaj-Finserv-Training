package com.bajaj.library.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bajaj.library.entity.BooksEntity;



@Repository
public interface BooksDao extends JpaRepository<BooksEntity, Integer>{

	@Query(value="SELECT b FROM BooksEntity b WHERE b.bookName ILIKE :keyWord% ")
	public ArrayList<BooksEntity> findBooksStartingWith(@Param("keyWord") String keyWord);
	
	@Query(value = "SELECT  b FROM BooksEntity b WHERE b.bookCategory ILIKE :category")
	public ArrayList<BooksEntity> findBooksOfCategory(@Param("category") String category);
	
	
}
