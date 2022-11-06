package com.weicai.springboot;

import org.springframework.web.context.WebApplicationContext;

/**
 * @ClassName WebServer
 * @Description
 * @Author weicai.yan
 * @Date 2022/11/6 21:43
 * @Version 1.0
 **/
public interface WebServer {

	void start(WebApplicationContext webApplicationContext);
}
