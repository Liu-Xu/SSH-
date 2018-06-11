package com.ht.service;

import com.ht.base.IBaseService;
import com.ht.model.User;

public interface IUserService extends IBaseService<Integer, User> {
	// 查询总记录数
	Integer getCount();
}
