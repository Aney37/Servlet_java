package com.example.listener;

import javax.servlet.*;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener{
    
	
	 public void contextInitialized(ServletContextEvent sce)
     {
    	 ServletContext sc1 = sce.getServletContext();
    	 String dogbreed = sc1.getInitParameter("breed");
    	 Dog d1 = new Dog(dogbreed);
    	 sc1.setAttribute("dog", d1);
    	 
     }
     public void ContextDestroyed(ServletContextEvent event)
     {
    	 
     } 
}
