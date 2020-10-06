package com.project.Repository;


import com.project.beans.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;


public class VoitureAcquiseRepository {


private Connection bdd;
	
	public Connection getBdd() {

		ConnexionBDD Cobdd = new ConnexionBDD();
		
		
	 Cobdd.connection();   
	 bdd=Cobdd.getBdd();

		return bdd;
	}
	

	
	protected VoitureAcquise buildObjet(ResultSet result) throws SQLException {
		VoitureAcquise voitureacquise = new VoitureAcquise();
		
			int id = result.getInt(1);
			voitureacquise.setId(id);
			
			Date dateAcquisition = result.getDate(2);
			voitureacquise.setDateAcquisition(dateAcquisition);
			
			int idVoiture = result.getInt(3);
			voitureacquise.setIdVoiture(idVoiture);

			int idClient = result.getInt(4);
			voitureacquise.setIdClient(idClient);
			
			int idReparation = result.getInt(5);
			voitureacquise.setIdReparation(idReparation);
			
			int idReprise = result.getInt(6);
			voitureacquise.setIdReprise(idReprise);
			
		return voitureacquise;
	}
	
	
	public int getNewId() {
		int newid = -1;
		try {
			PreparedStatement statement = this.getBdd().prepareStatement("SELECT max(IdVoitureAcquise)+1 as newid from voiture_acquise");
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
	


public ArrayList<VoitureAcquise> getListReprise() {
	ArrayList<VoitureAcquise> voitureacquises = new ArrayList();

	try {

		PreparedStatement statement = this.getBdd().prepareStatement("Select * from voiture_acquise");
		
		

		ResultSet rs = statement.executeQuery();
		
		while(rs.next()){
			VoitureAcquise voitureacquise = buildObjet(rs);
			voitureacquises.add(voitureacquise);
		}
	} catch (SQLException ex) {
    	System.out.println("SQLException: " + ex.getMessage());
        System.out.println("SQLState: " + ex.getSQLState());
        System.out.println("VendorError: " + ex.getErrorCode());
    }

	return voitureacquises;		
}



//CRUD pour voiture_acquise
public VoitureAcquise find(int id) {
	
	try {
		PreparedStatement statement = this.getBdd().prepareStatement("Select * from voiture_acquise where IdVoitureAcquise = ?");
		statement.setInt(1, id);
		ResultSet result = statement.executeQuery();
		VoitureAcquise voitureacquise = buildObjet(result);
		return voitureacquise;
		
	}catch(Exception e) {
		System.out.println("");
		e.printStackTrace();
		VoitureAcquise voitureacquise = new VoitureAcquise();
return voitureacquise;
	}
}


public boolean addVoitureAcquise(VoitureAcquise voitureacquise) {
	try {
		PreparedStatement statement = this.getBdd().prepareStatement("insert into voiture_acquise values(?,?,?,?,?,?)");
		
		statement.setInt(1,this.getNewId());
				
		statement.setDate(2, (java.sql.Date) voitureacquise.getDateAcquisition());

		statement.setInt(3, voitureacquise.getIdVoiture());

		statement.setInt(4, voitureacquise.getIdClient());
		
		statement.setInt(5, voitureacquise.getIdReparation());

		statement.setInt(6, voitureacquise.getIdReprise());
		
		if(statement.executeUpdate() < 1)
			
			return false;
		
	} catch (SQLException ex) {
    	System.out.println("SQLException: " + ex.getMessage());
        System.out.println("SQLState: " + ex.getSQLState());
        System.out.println("VendorError: " + ex.getErrorCode());
    }
	return true;
}



public boolean updateAcquise(VoitureAcquise voitureacquise) {
	try {
		PreparedStatement statement = this.getBdd().prepareStatement("update voiture_acquise set  DateAcquisition = ? , IdVoiture = ?, IdClient = ?, IdAssurance = ?, IdReprise = ?  where IdVoitureAcquise = ?");		
		
		statement.setDate(1, (java.sql.Date) voitureacquise.getDateAcquisition());

		statement.setInt(2, voitureacquise.getIdVoiture());

		statement.setInt(3, voitureacquise.getIdClient());
		
		statement.setInt(4, voitureacquise.getIdReparation());

		statement.setInt(5, voitureacquise.getIdReprise());
		
		statement.setInt(6,voitureacquise.getId());
		
		if(statement.executeUpdate() < 1)
			return false;
		
	} catch (SQLException ex) {
    	System.out.println("SQLException: " + ex.getMessage());
        System.out.println("SQLState: " + ex.getSQLState());
        System.out.println("VendorError: " + ex.getErrorCode());
    }
	return true;
}

	
public boolean deleteAcquise(VoitureAcquise voitureacquise) {
	try {
		PreparedStatement statement = this.getBdd().prepareStatement("delete from voiture_acquise where IdVoitureAcquise = ?");
		statement.setInt(1, voitureacquise.getId());
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
