package com.project.servlets.profil.voiture;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditAssurance extends HttpServlet {
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		/* Transmission de la paire d'objets request/response � notre JSP */
		this.getServletContext().getRequestDispatcher( "/WEB-INF/Profil/Voiture/EditAssurance.jsp" ).forward( request, response );
	}
}