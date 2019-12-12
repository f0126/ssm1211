package com.woniu.dao;

import com.woniu.pojo.User;

public interface IUserDao {
	void save(User user);
	void update(User user);
}
