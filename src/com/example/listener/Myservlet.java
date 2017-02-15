package com.example.listener;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Myservlet extends HttpServlet{
	 public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
		   response.setContentType("text/html");
		   PrintWriter out = response.getWriter();
		   out.println("test context attributes set by listener <br>");
		   
		   Dog dog = (Dog) getServletContext().getAttribute("dog");
		   out.println("Dog's breed is: "+dog.getBreed());

}
}
