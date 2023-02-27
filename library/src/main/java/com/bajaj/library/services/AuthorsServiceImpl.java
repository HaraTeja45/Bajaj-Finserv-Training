package com.bajaj.library.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bajaj.library.beans.AuthorBean;
import com.bajaj.library.dao.AuthorsDao;
import com.bajaj.library.entity.AuthorEntity;



@Service
public class AuthorsServiceImpl implements AuthorsService {

	@Autowired
	private AuthorsDao authorDao;


	@Override
	public String addAuthor(AuthorBean authorBean) {
		// TODO Auto-generated method stub
		AuthorEntity authorEntity = new AuthorEntity();
		BeanUtils.copyProperties(authorBean, authorEntity);
		authorDao.save(authorEntity);
		return "Added:"+authorBean;
	}

	@Override
	public ArrayList<AuthorBean> getAuthors() {
		// TODO Auto-generated method stub

		ArrayList<AuthorBean> authorsList = new ArrayList<>();
		Iterable<AuthorEntity> it = authorDao.findAll();

		it.forEach(entity -> {

			AuthorBean bean = new AuthorBean();
			BeanUtils.copyProperties(entity, bean);
			authorsList.add(bean);

		});

		return authorsList;
	}

	@Override
	public String updateAuthor(int authorId, AuthorBean authorBean) {
		// TODO Auto-generated method stub

		AuthorEntity authorEntity = new AuthorEntity();
		authorEntity.setAuthorName(authorBean.getAuthorName());
		authorDao.save(authorEntity);

		return "Updated details of the Author: " + authorBean;
	}

	@Override
	public AuthorBean findAuthor(int authorId) {
		// TODO Auto-generated method stub
		Optional<AuthorEntity> authorEntity= authorDao.findById(authorId);
		AuthorEntity authorEntity2=authorEntity.get();
		
		AuthorBean authorBean=new AuthorBean();
		BeanUtils.copyProperties(authorEntity2, authorBean);
		
		return authorBean;
	}

}
