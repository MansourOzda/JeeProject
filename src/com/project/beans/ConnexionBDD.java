package com.project.beans;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.*; 
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
import java.io.IOException;
import java.util.Properties;
import java.io.InputStream;


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
	           
	        	System.out.println("test1");
	            conntemp = DriverManager.getConnection("jdbc:mysql://localhost:3308/projetjee?useSSL=false&serverTimezone=UTC","root","");
	            System.out.println("test2");

	        } catch (SQLException ex) {
	            System.out.println("SQLException: " + ex.getMessage());
	            System.out.println("SQLState: " + ex.getSQLState());
	            System.out.println("VendorError: " + ex.getErrorCode());
	        } 


	        this.bdd = conntemp;
	    }
	
	
	
}