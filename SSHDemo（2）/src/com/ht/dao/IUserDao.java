package com.ht.dao;

import com.ht.base.IBaseDao;
import com.ht.model.User;

public interface IUserDao extends IBaseDao<Integer, User> {
	
	// 查询总记录数
	Integer getCount();
	
}
