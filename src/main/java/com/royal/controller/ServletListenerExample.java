package com.royal.controller;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ServletListenerExample implements ServletContextListener{
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("SERVER STARTED ... ");
	}
	
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("SERVER SHUTDOWN ... ");
	}
}
