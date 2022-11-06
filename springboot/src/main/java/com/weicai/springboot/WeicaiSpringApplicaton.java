package com.weicai.springboot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

/**
 * @ClassName WeicaiSpringApplicaton
 * @Description
 * @Author weicai.yan
 * @Date 2022/11/6 21:25
 * @Version 1.0
 **/
public class WeicaiSpringApplicaton {

	public static void run(Class clazz) {
		AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
		applicationContext.register(clazz);
		applicationContext.refresh();

		WebServer webServer = applicationContext.getBean(WebServer.class);
		webServer.start(applicationContext);
	}
}
