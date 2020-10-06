package com.project.Repository;


import com.project.beans.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class ReparationRepository {

private Connection bdd;//co a la bdd
	
	public Connection getBdd() {

		ConnexionBDD Cobdd = new ConnexionBDD();
		
		
	 Cobdd.connection();   
	 bdd=Cobdd.getBdd();

		return bdd;
	}

	protected Reparation buildObjet(ResultSet result) throws SQLException {
		Reparation reparation = new Reparation();
		
			int id = result.getInt(1);
			reparation.setId(id);
			
			String typeReparation = result.getString(2);
			reparation.setTypeReparation(typeReparation);
			
			int prix = result.getInt(3);
			reparation.setPrix(prix);

		return reparation;
	}
	

public int getNewId() {
	int newid = -1;
	try {
		PreparedStatement statement = this.getBdd().prepareStatement("SELECT max(IdReparation)+1 as newid from Reparation");
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
		


public ArrayList<Reparation> getListReparation() {
	ArrayList<Reparation>reparations = new ArrayList();

	try {

		PreparedStatement statement = this.getBdd().prepareStatement("Select * from Reparation");
		
		

		ResultSet rs = statement.executeQuery();
		
		while(rs.next()){
			Reparation reparation = buildObjet(rs);
			reparations.add(reparation);
		}
	} catch (SQLException ex) {
    	System.out.println("SQLException: " + ex.getMessage());
        System.out.println("SQLState: " + ex.getSQLState());
        System.out.println("VendorError: " + ex.getErrorCode());
    }

	return reparations;		
}


//CRUD pour Reparation  
public Reparation find(int id) {
	
	try {
		PreparedStatement statement = this.getBdd().prepareStatement("Select * from Reparation where IdReparation = ?");
		statement.setInt(1, id);
		ResultSet result = statement.executeQuery();
		Reparation reparation = buildObjet(result);
		return reparation;
		
	}catch(Exception e) {
		System.out.println("");
		e.printStackTrace();
		Reparation reparation = new Reparation();
  return reparation;
	}
}


public boolean addReparation(Reparation reparation) {
	try {
		PreparedStatement statement = this.getBdd().prepareStatement("insert into Reparation values(?,?,?)");
		
		statement.setInt(1,this.getNewId());
				
		statement.setString(2, reparation.getTypeReparation());

		statement.setInt(3, reparation.getPrix());

		if(statement.executeUpdate() < 1)
			
			return false;
		
	} catch (SQLException ex) {
    	System.out.println("SQLException: " + ex.getMessage());
        System.out.println("SQLState: " + ex.getSQLState());
        System.out.println("VendorError: " + ex.getErrorCode());
    }
	return true;
}


public boolean updateReparation(Reparation reparation) {
	try {
		PreparedStatement statement = this.getBdd().prepareStatement("update Reparation set  TypeReparation = ? , Prix = ?  where IdReparation = ?");		
		statement.setString(1, reparation.getTypeReparation());

		statement.setInt(2,reparation.getPrix());
		
		statement.setInt(3,reparation.getId());
		
		if(statement.executeUpdate() < 1)
			return false;
		
	} catch (SQLException ex) {
    	System.out.println("SQLException: " + ex.getMessage());
        System.out.println("SQLState: " + ex.getSQLState());
        System.out.println("VendorError: " + ex.getErrorCode());
    }
	return true;
}

public boolean deleteReparation(Reparation reparation) {
	try {
		PreparedStatement statement = this.getBdd().prepareStatement("delete from Reparation where IdReparation = ?");
		statement.setInt(1, reparation.getId());
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
