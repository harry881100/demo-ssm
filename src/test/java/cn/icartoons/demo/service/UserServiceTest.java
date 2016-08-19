package cn.icartoons.demo.service;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.test.annotation.Repeat;
import org.springframework.test.annotation.Rollback;

import cn.icartoons.demo.base.BaseJunit4Test;
import cn.icartoons.demo.entity.User;

public class UserServiceTest extends BaseJunit4Test {
	@Resource
	private UserService userService;

	@Test
	@Rollback(false)
	public void save() {
		User user = new User();
		user.setUsername("Hgs");
		user.setPassword("123");
		userService.save(user);

		User tmpUser = userService.findByUsername("Hgs");
		logger.info("user:{}。", tmpUser);
	}

	@Test
	@Repeat(3)
	public void testFindByUsername() {
		User user = userService.findByUsername("Lucy");
		logger.info("user:{}。", user);

	}

}
