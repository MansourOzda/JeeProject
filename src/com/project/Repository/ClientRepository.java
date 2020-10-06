package com.project.Repository;

import com.project.beans.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class ClientRepository {
private Connection bdd;
	
	public Connection getBdd() {

		ConnexionBDD Cobdd = new ConnexionBDD();
		
		
	 Cobdd.connection();   
	 bdd=Cobdd.getBdd();

		return bdd;
	}


	
protected Client buildObjet(ResultSet result) throws SQLException {
	Client client = new Client();
	
		int id = result.getInt(1);
		client.setId(id);
		
		String Nom = result.getString(2);
		client.setNom(Nom);
		
		String prenom = result.getString(3);
		client.setPrenom(prenom);
		
		String Email = result.getString(4);
		client.setEmail(Email);
		
		String Adresse = result.getString(5);
		client.setAdresse(Adresse);
		
		String InformationBancaire = result.getString(6);
		client.setInformationBancaire(InformationBancaire);
		
		int CodePostal = result.getInt(7);
		client.setCodePostal(CodePostal);
		
		int Capital = result.getInt(8);
		client.setCapital(Capital);
		
		int Telephone = result.getInt(9);
		client.setTelephone(Telephone);

	return client;
}


public int getNewId() {
	int newid = -1;
	try {
		PreparedStatement statement = this.getBdd().prepareStatement("SELECT max(IdClient)+1 as newid from client");
		ResultSet rs = statement.executeQuery();
		if(rs.next()){
			newid = rs.getInt("newid");
		}
	} catch (SQLException ex) {
    	System.out.println("SQLException: " + ex.getMessage());
        System.out.println("SQLState: " + ex.getSQLState());
        System.out.println("VendorError: " + ex.getErrorCode());
    }
	return newid;
}

public ArrayList<Client> getListClient() {
	ArrayList<Client> clients = new ArrayList();

	try {

		PreparedStatement statement = this.getBdd().prepareStatement("Select * from client");
		
		

		ResultSet rs = statement.executeQuery();
		
		while(rs.next()){
			Client client = buildObjet(rs);
			clients.add(client);
		}
	} catch (SQLException ex) {
    	System.out.println("SQLException: " + ex.getMessage());
        System.out.println("SQLState: " + ex.getSQLState());
        System.out.println("VendorError: " + ex.getErrorCode());
    }

	return clients;		
}

//CRUD pour client
public Client find(int id) {
	
	try {
		PreparedStatement statement = this.getBdd().prepareStatement("Select * from Client where IdClient = ?");
		statement.setInt(1, id);
		ResultSet result = statement.executeQuery();
		Client client = buildObjet(result);
		return client;
		
	}catch(Exception e) {
		System.out.println("");
		e.printStackTrace();
		Client client = new Client();
        return client;
	}
}

public boolean addClient(Client client) {
	try {
		PreparedStatement statement = this.getBdd().prepareStatement("insert into client values(?,?,?,?,?,?,?,?,?)");
		
		statement.setInt(1,this.getNewId());
		
		statement.setString(2, client.getNom());
		
		statement.setString(3, client.getPrenom());

		statement.setString(4, client.getEmail());
		
		statement.setString(5, client.getAdresse());
		
		statement.setString(6, client.getInformationBancaire());

		statement.setInt(7, client.getCodePostal());
		
		statement.setInt(8, client.getCapital());
		
		statement.setInt(9, client.getTelephone());
		
		if(statement.executeUpdate() < 1)
			
			return false;
		
	} catch (SQLException ex) {
    	System.out.println("SQLException: " + ex.getMessage());
        System.out.println("SQLState: " + ex.getSQLState());
        System.out.println("VendorError: " + ex.getErrorCode());
    }
	return true;
}

public boolean updateClient(Client client) {
	try {
		PreparedStatement statement = this.getBdd().prepareStatement("update client set Nom = ? ,Prenom = ? , Email  = ? , adresse  = ? , CodePostal  = ? , Capital = ? , Information_bancaire = ? , Telephone = ?  where IdClient = ?");
		statement.setString(1, client.getNom());
		
		statement.setString(2, client.getPrenom());

		statement.setString(3, client.getEmail());
		
		statement.setString(4, client.getAdresse());
		
		statement.setString(5, client.getInformationBancaire());

		statement.setInt(6, client.getCodePostal());
		
		statement.setInt(7, client.getCapital());
		
		statement.setInt(8, client.getTelephone());
		
		statement.setInt(9, client.getId());

		
		if(statement.executeUpdate() < 1)
			return false;
		
	} catch (SQLException ex) {
    	System.out.println("SQLException: " + ex.getMessage());
        System.out.println("SQLState: " + ex.getSQLState());
        System.out.println("VendorError: " + ex.getErrorCode());
    }
	return true;
}
	
	
public boolean deleteClient(Client client) {
	try {
		PreparedStatement statement = this.getBdd().prepareStatement("delete from client where IdClient = ?");
		statement.setInt(1, client.getId());
		if(statement.executeUpdate() < 1)
			return false;			
	} catch (SQLException ex) {
    	System.out.println("SQLException: " + ex.getMessage());
        System.out.println("SQLState: " + ex.getSQLState());
        System.out.println("VendorError: " + ex.getErrorCode());
    }		
	return true;
}




}
