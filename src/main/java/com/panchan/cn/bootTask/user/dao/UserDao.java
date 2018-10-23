package com.panchan.cn.bootTask.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

import com.panchan.cn.bootTask.user.domain.User;


@Mapper
public interface  UserDao {

	public User getUserById(Integer id);
	
	public List<User> getUserList();
}
