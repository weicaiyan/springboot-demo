package com.weicai.user;

import com.weicai.springboot.WeicaiSpringApplicaton;
import com.weicai.springboot.WeicaiSpringBootApplication;

/**
 * @ClassName MyApplication
 * @Description
 * @Author weicai.yan
 * @Date 2022/11/6 21:24
 * @Version 1.0
 **/
@WeicaiSpringBootApplication
public class MyApplication {

	public static void main(String[] args) {
		WeicaiSpringApplicaton.run(MyApplication.class);
	}
}
