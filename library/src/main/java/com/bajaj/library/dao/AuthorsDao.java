package com.bajaj.library.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bajaj.library.entity.AuthorEntity;



public interface AuthorsDao extends JpaRepository<AuthorEntity, Integer>{

}
