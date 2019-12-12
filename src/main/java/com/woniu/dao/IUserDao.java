package com.woniu.dao;

import com.woniu.pojo.User;

public interface IUserDao {
	void delete(Integer id);
	void update(User user);
}
