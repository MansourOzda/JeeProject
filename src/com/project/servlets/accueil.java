package com.project.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;

public class accueil extends HttpServlet {

	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		/* Transmission de la paire d'objets request/response à notre JSP */
		this.getServletContext().getRequestDispatcher( "/WEB-INF/index.jsp" ).forward( request, response );
	}
	
	
}


