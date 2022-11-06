package com.weicai.user.controller;

import com.weicai.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description
 * @Author weicai.yan
 * @Date 2022/11/6 21:20
 * @Version 1.0
 **/
@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("test")
	public String test() {
		return userService.test();
	}
}
