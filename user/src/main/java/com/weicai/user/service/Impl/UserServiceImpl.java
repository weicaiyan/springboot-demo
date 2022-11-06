package com.weicai.user.service.Impl;

import com.weicai.user.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Description
 * @Author weicai.yan
 * @Date 2022/11/6 21:22
 * @Version 1.0
 **/
@Service
public class UserServiceImpl implements UserService {

	public String test() {
		return "hello userService";
	}
}
