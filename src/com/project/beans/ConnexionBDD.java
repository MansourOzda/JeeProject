package com.project.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionBDD {
	private Connection bdd;
	public Connection getBdd() {
		this.connection();
		return bdd;
	}


public void connection() {

	        Connection conntemp = null;
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
	        } catch (Exception ex) {
	        }
	        try {
	           
	        	
	            conntemp = DriverManager.getConnection("jdbc:mysql://localhost:3306/tp_jee","root","");


	        } catch (SQLException ex) {
	            System.out.println("SQLException: " + ex.getMessage());
	            System.out.println("SQLState: " + ex.getSQLState());
	            System.out.println("VendorError: " + ex.getErrorCode());
	        } 


	        this.bdd = conntemp;
	    }
	
	
	
}