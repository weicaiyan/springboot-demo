package com.weicai.springboot;

import org.apache.catalina.*;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.core.StandardEngine;
import org.apache.catalina.core.StandardHost;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * @ClassName TomcatWebServer
 * @Description
 * @Author weicai.yan
 * @Date 2022/11/6 21:43
 * @Version 1.0
 **/
public class TomcatWebServer implements WebServer {
	public void start(WebApplicationContext applicationContext) {
		Tomcat tomcat = new Tomcat();
		Server server = tomcat.getServer();
		Service service = server.findService("Tomcat");
		Connector connector = new Connector();
		connector.setPort(8081);
		Engine engine = new StandardEngine();
		engine.setDefaultHost("localhost");
		Host host = new StandardHost();
		host.setName("localhost");
		String contextPath = "";
		Context context = new StandardContext();
		context.setPath(contextPath);
		context.addLifecycleListener(new Tomcat.FixContextListener());
		host.addChild(context);
		engine.addChild(host);
		service.setContainer(engine);
		service.addConnector(connector);
		tomcat.addServlet(contextPath, "dispatcher", new DispatcherServlet(applicationContext));
		context.addServletMappingDecoded("/*", "dispatcher");
		try {
			tomcat.start();
		} catch (LifecycleException e) {
			e.printStackTrace();
		}
	}
}
