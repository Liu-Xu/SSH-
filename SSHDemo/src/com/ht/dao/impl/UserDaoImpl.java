package com.ht.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.ht.dao.IUserDao;
import com.ht.model.User;
import com.ht.util.SessionFactoryUtil;

@Repository
public class UserDaoImpl implements IUserDao {

	@Override
	public List<User> list() {
		
		Session session = SessionFactoryUtil.getSession();
		
		List<User> list = session.createQuery("from User").list();
		
		SessionFactoryUtil.closeSession(session);
		
		return list;
	}

	@Override
	public void insert(User t) {
		Session session = SessionFactoryUtil.getSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(t);
		
		tx.commit();
		SessionFactoryUtil.closeSession(session);
	}

	@Override
	public void update(User t) {
		Session session = SessionFactoryUtil.getSession();
		
		Transaction tx = session.beginTransaction();
		
		session.update(t);
		
		tx.commit();
		SessionFactoryUtil.closeSession(session);
	}

	@Override
	public void delete(Integer id) {
		Session session = SessionFactoryUtil.getSession();
		
		Transaction tx = session.beginTransaction();
		
		User user = session.get(User.class, id);
		
		session.delete(user);
		
		tx.commit();
		SessionFactoryUtil.closeSession(session);
	}

	@Override
	public User get(Integer id) {
		Session session = SessionFactoryUtil.getSession();
		
		User user = session.get(User.class, id);
		
		SessionFactoryUtil.closeSession(session);
		
		return user;
	}

}
