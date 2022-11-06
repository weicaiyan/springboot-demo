package com.weicai.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName WebServerAutoConfiguration
 * @Description
 * @Author weicai.yan
 * @Date 2022/11/6 21:52
 * @Version 1.0
 **/
@Configuration
public class WebServerAutoConfiguration implements AutoConfiguration {

	@Bean
	@ConditionalOnClass("org.apache.catalina.startup.Tomcat")
	public WebServer tomcatWebServer() {
		return new TomcatWebServer();
	}

	@Bean
	@ConditionalOnClass("org.eclipse.jetty.server.Server")
	public WebServer jettyWebServer() {
		return new JettyWebServer();
	}
}
