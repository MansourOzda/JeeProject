package com.project.Repository;

import com.project.beans.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class AssuranceRepository {


private Connection bdd;
	
	public Connection getBdd() {

		ConnexionBDD Cobdd = new ConnexionBDD();
		
		
	 Cobdd.connection();   
	 bdd=Cobdd.getBdd();

		return bdd;
	}
	
	protected Assurance buildObjet(ResultSet result) throws SQLException {
		Assurance assurance = new Assurance();
		
			int id = result.getInt(1);
			assurance.setId(id);
			
			String libelleAssurance = result.getString(2);
			assurance.setLibelleAssurance(libelleAssurance);
			
			int prix = result.getInt(3);
			assurance.setPrix(prix);

		return assurance;
	}
		

public int getNewId() {
	int newid = -1;
	try {
		PreparedStatement statement = this.getBdd().prepareStatement("SELECT max(IdAssurance)+1 as newid from Assurance");
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
	




public ArrayList<Assurance> getListAssurance() {
	ArrayList<Assurance> assurances = new ArrayList();

	try {

		PreparedStatement statement = this.getBdd().prepareStatement("Select * from Assurance");
		
		

		ResultSet rs = statement.executeQuery();
		
		while(rs.next()){
			Assurance assurance = buildObjet(rs);
			assurances.add(assurance);
		}
	} catch (SQLException ex) {
    	System.out.println("SQLException: " + ex.getMessage());
        System.out.println("SQLState: " + ex.getSQLState());
        System.out.println("VendorError: " + ex.getErrorCode());
    }

	return assurances;		
}



//CRUD pour Assurance
public Assurance find(int id) {
	
	try {
		PreparedStatement statement = this.getBdd().prepareStatement("Select * from Assurance where IdAssurance = ?");
		statement.setInt(1, id);
		ResultSet result = statement.executeQuery();
		Assurance assurances = buildObjet(result);
		return assurances;
		
	}catch(Exception e) {
		System.out.println("");
		e.printStackTrace();
		Assurance assurances = new Assurance();
    return assurances;
	}
}

public boolean addAssurance(Assurance assurances) {
	try {
		PreparedStatement statement = this.getBdd().prepareStatement("insert into assurance values(?,?,?)");
		
		statement.setInt(1,this.getNewId());
				
		statement.setString(2, assurances.getLibelleAssurance());

		statement.setInt(3, assurances.getPrix());

		if(statement.executeUpdate() < 1)
			
			return false;
		
	} catch (SQLException ex) {
    	System.out.println("SQLException: " + ex.getMessage());
        System.out.println("SQLState: " + ex.getSQLState());
        System.out.println("VendorError: " + ex.getErrorCode());
    }
	return true;
}


public boolean updateAssurance(Assurance assurances) {
	try {
		PreparedStatement statement = this.getBdd().prepareStatement("update assurance set  LibelleAssurance = ? , Prix = ?  where IdAssurance = ?");		
		statement.setString(1, assurances.getLibelleAssurance());

		statement.setInt(2,assurances.getPrix());
		
		statement.setInt(3,assurances.getId());
		
		if(statement.executeUpdate() < 1)
			return false;
		
	} catch (SQLException ex) {
    	System.out.println("SQLException: " + ex.getMessage());
        System.out.println("SQLState: " + ex.getSQLState());
        System.out.println("VendorError: " + ex.getErrorCode());
    }
	return true;
}

public boolean deleteAssurance(Assurance assurances) {
	try {
		PreparedStatement statement = this.getBdd().prepareStatement("delete from assurance where IdAssurance = ?");
		statement.setInt(1, assurances.getId());
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
