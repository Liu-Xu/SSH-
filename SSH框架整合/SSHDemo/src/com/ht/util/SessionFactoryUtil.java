package com.ht.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class SessionFactoryUtil {
	private static SessionFactory sessionFactory = null;

	/**
	 * 获取session
	 * 
	 * @return session
	 */
	public static Session getSession() {
		if (sessionFactory != null) {
			return sessionFactory.openSession();
		}

		return null;
	}

	/**
	 * 关闭session
	 * 
	 * @param session
	 *            要关闭的session
	 */
	public static void closeSession(Session session) {
		if (session != null) {
			session.close();
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void setSessionFactory(SessionFactory sessionFactory) {
		SessionFactoryUtil.sessionFactory = sessionFactory;
	}
	
}
