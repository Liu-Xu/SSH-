package com.ht.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ht.dao.IUserDao;
import com.ht.model.User;
import com.ht.service.IUserService;

@Service
@Transactional
public class UserServiceImpl implements IUserService {
	
	@Resource(name = "userDaoImpl")
	private IUserDao userDao;

	@Override
	public List<User> list() {
		
		return userDao.list();
	}

	@Override
	public void insert(User t) {
		userDao.insert(t);
	}

	@Override
	public void update(User t) {
		userDao.update(t);
	}

	@Override
	public void delete(Integer id) {
		userDao.delete(id);
	}

	@Override
	public User get(Integer id) {
		return userDao.get(id);
	}

}
