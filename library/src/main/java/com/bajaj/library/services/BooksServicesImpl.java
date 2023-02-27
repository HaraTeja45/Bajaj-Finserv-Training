package com.bajaj.library.services;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.bajaj.library.beans.BooksBean;
import com.bajaj.library.dao.BooksDao;
import com.bajaj.library.entity.AuthorEntity;
import com.bajaj.library.entity.BooksEntity;




@Service
public class BooksServicesImpl implements BooksServices {

	@Autowired
	private BooksDao booksDao;

	@Override
	public BooksBean addBook(BooksBean booksBean) {
		// TODO Auto-generated method stub
		BooksEntity booksEntity = new BooksEntity();
		booksBean.setStatus("Available");
		BeanUtils.copyProperties(booksBean, booksEntity);
		//booksEntity.setStatus("Available");
		booksDao.save(booksEntity);
		return booksBean;
	}

	@Override
	public ArrayList<BooksBean> getBooks() {
		// TODO Auto-generated method stub
		ArrayList<BooksBean> booksList = new ArrayList<>();

		Iterable<BooksEntity> it = booksDao.findAll();

		it.forEach(entity -> {
			if(entity.getStatus().equals("Available")) {
				
				BooksBean bean = new BooksBean();
				BeanUtils.copyProperties(entity, bean);
				booksList.add(bean);
			}
		});

		return booksList;
	}

	@Override
	public String updateBook( int bookId, BooksBean booksBean) {
		// TODO Auto-generated method stub
		BooksEntity booksEntity =new BooksEntity();
		BeanUtils.copyProperties(booksBean, booksEntity);
		booksDao.save(booksEntity);
		return "Updated details of the book of ID "+bookId+" are: "+booksBean;
	}
	

	@Override
	public String deleteBook( int bookId) {
		// TODO Auto-generated method stub
		

		
		Optional<BooksEntity> booksEntity= booksDao.findById(bookId);

	 BooksEntity booksEntity2 = booksEntity.get();
		BooksBean bean=new BooksBean();

		BeanUtils.copyProperties(booksEntity2, bean);
		
//		booksDao.delete(booksEntity2);
		booksEntity2.setStatus("Not-Available");
		booksDao.save(booksEntity2);
		
		return "Deleted Book of ID : "+bookId;
	}
	
	
	@Override
	public String findBook(int bookId) {
		// TODO Auto-generated method stub
		Optional<BooksEntity> booksEntity = booksDao.findById(bookId);
		BooksEntity booksEntity2 = booksEntity.get();
		if (booksEntity2.getStatus().equals("Available")) {
			BooksBean booksBean = new BooksBean();
			BeanUtils.copyProperties(booksEntity2, booksBean);
			return booksBean+"";
		}
		
		else {
			return "Book with ID "+bookId+" Not Found";
		}
		
	}

	@Override
	public ArrayList<BooksBean> findBooksStartingWith(String keyWord) {
		// TODO Auto-generated method stub
		
ArrayList<BooksBean> booksList=new ArrayList<>();
Iterable<BooksEntity> it=booksDao.findBooksStartingWith(keyWord);

it.forEach(entity -> {

	if(entity.getStatus().equals("Available")) {	
		BooksBean bean = new BooksBean();
		BeanUtils.copyProperties(entity, bean);
		booksList.add(bean);
	}
});
		
		return booksList;
	}
	
	@Override
	public ArrayList<BooksBean> findBooksOfCategory(String category) {
		// TODO Auto-generated method stub
		
ArrayList<BooksBean> booksList=new ArrayList<>();
Iterable<BooksEntity> it=booksDao.findBooksOfCategory(category);


it.forEach(entity -> {
	if(entity.getStatus().equals("Available")) {
				BooksBean bean = new BooksBean();
				BeanUtils.copyProperties(entity, bean);
				booksList.add(bean);
		
	
	}
});
		
		return booksList;
	}

}
