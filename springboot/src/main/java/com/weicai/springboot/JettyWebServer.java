package com.weicai.springboot;

import org.springframework.web.context.WebApplicationContext;

/**
 * @ClassName JettyWebServer
 * @Description
 * @Author weicai.yan
 * @Date 2022/11/6 21:53
 * @Version 1.0
 **/
public class JettyWebServer implements WebServer {
	public void start(WebApplicationContext webApplicationContext) {
		System.out.println("启动Jetty！");
	}
}
