package cn.icartoons.demo.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.icartoons.demo.controller.base.BaseController;
import cn.icartoons.demo.entity.User;
import cn.icartoons.demo.service.UserService;

@Controller
@RequestMapping("/demo")
public class DemoController extends BaseController{
	@Resource
	private UserService userService;
	
	@RequestMapping("/helloworld")
	public @ResponseBody String helloworld() {
		User user = userService.findByUsername("Lucy");
		System.out.println(user);
		logger.info("=user:{}.",user);
		
		return "helloworld";
	}
}
