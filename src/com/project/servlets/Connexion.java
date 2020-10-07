package com.project.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import  com.project.Repository.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.project.beans.*;


/**
 * Servlet implementation class Connexion
 */
@WebServlet("/Connexion")
public class Connexion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Connexion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
<<<<<<< HEAD:src/com/project/servlets/Connexion.java
		this.getServletContext().getRequestDispatcher( "/WEB-INF/Connexion.jsp" ).forward( request, response );
=======
		ClientRepository ObjetClientRepository = new ClientRepository();
		String paramIdClient = request.getParameter( "id" );
		int id =Integer.parseInt(paramIdClient);
		System.out.println(id);
		Client ObjetClient = ObjetClientRepository.find(id);

		request.setAttribute( "ObjetClient", ObjetClient );
		
		
		this.getServletContext().getRequestDispatcher( "/WEB-INF/Profil/Profil.jsp" ).forward( request, response );
>>>>>>> 8ea5601e7b4980e4872e3a428f8d38527ecc2c9e:src/com/project/servlets/profil/Profil.java
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
