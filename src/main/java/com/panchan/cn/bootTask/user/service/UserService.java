package com.panchan.cn.bootTask.user.service;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.panchan.cn.bootTask.user.dao.UserDao;
import com.panchan.cn.bootTask.user.domain.User;

@Service
public class UserService {
	
	 @Resource
	 private UserDao userDao;
		
	
	public User getUser() {
        User user=userDao.getUserById(1);
        return user;
	}
	
	public List<User> getUserList(){
		return userDao.getUserList();
	}

}
