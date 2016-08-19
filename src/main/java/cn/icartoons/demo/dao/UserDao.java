package cn.icartoons.demo.dao;

import org.springframework.stereotype.Repository;

import cn.icartoons.demo.entity.User;

@Repository
public interface UserDao {

	User findByUsername(String username);

}
