package cn.icartoons.demo.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.icartoons.demo.dao.UserDao;
import cn.icartoons.demo.entity.User;

@Service
public class UserService {
	@Resource
	private UserDao userDao;

	public User findByUsername(String username) {
		return userDao.findByUsername(username);
	}
}
