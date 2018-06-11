package com.ht.base;

import java.io.Serializable;
import java.util.List;

import com.ht.model.Page;

public interface IBaseService<PK extends Serializable, T> {
	List<T> list(Page page);
	
	void insert(T t);
	
	void update(T t);
	
	void delete(PK id);
	
	T get(PK id);
}
