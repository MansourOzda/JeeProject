package com.project.Repository;

import com.project.beans.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RepriseRepository {


private Connection bdd;
	
	public Connection getBdd() {

		ConnexionBDD Cobdd = new ConnexionBDD();
		
		
	 Cobdd.connection();   
	 bdd=Cobdd.getBdd();

		return bdd;
	}
	
	
	protected Reprise buildObjet(ResultSet result) throws SQLException {
		Reprise reprise = new Reprise();
		
			int id = result.getInt(1);
			reprise.setId(id);
			
			String description = result.getString(2);
			reprise.setDescription(description);
			
			int tauxDépriecié = result.getInt(3);
			reprise.setTauxDépriecié(tauxDépriecié);

		return reprise;
	}
	

public int getNewId() {
	int newid = -1;
	try {
		PreparedStatement statement = this.getBdd().prepareStatement("SELECT max(IdReprise)+1 as newid from reprise");
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



public ArrayList<Reprise> getListReprise() {
	ArrayList<Reprise> reprises = new ArrayList();

	try {

		PreparedStatement statement = this.getBdd().prepareStatement("Select * from reprise");
		
		

		ResultSet rs = statement.executeQuery();
		
		while(rs.next()){
			Reprise reprise = buildObjet(rs);
			reprises.add(reprise);
		}
	} catch (SQLException ex) {
    	System.out.println("SQLException: " + ex.getMessage());
        System.out.println("SQLState: " + ex.getSQLState());
        System.out.println("VendorError: " + ex.getErrorCode());
    }

	return reprises;		
}


//CRUD pour Reprise
public Reprise find(int id) {
	
	try {
		PreparedStatement statement = this.getBdd().prepareStatement("Select * from Reprise where IdReprise = ?");
		statement.setInt(1, id);
		ResultSet result = statement.executeQuery();
		Reprise reprise = buildObjet(result);
		return reprise;
		
	}catch(Exception e) {
		System.out.println("");
		e.printStackTrace();
		Reprise reprise = new Reprise();
  return reprise;
	}
}
	

public boolean addReprise(Reprise reprise) {
	try {
		PreparedStatement statement = this.getBdd().prepareStatement("insert into reprise values(?,?,?)");
		
		statement.setInt(1,this.getNewId());
				
		statement.setString(2, reprise.getDescription());

		statement.setInt(3, reprise.getTauxDépriecié());

		if(statement.executeUpdate() < 1)
			
			return false;
		
	} catch (SQLException ex) {
    	System.out.println("SQLException: " + ex.getMessage());
        System.out.println("SQLState: " + ex.getSQLState());
        System.out.println("VendorError: " + ex.getErrorCode());
    }
	return true;
}
	

public boolean updateReprise(Reprise reprise) {
	try {
		PreparedStatement statement = this.getBdd().prepareStatement("update reprise set  Description = ? , TauxDepriecie = ?  where IdReprise = ?");		
		statement.setString(1, reprise.getDescription());

		statement.setInt(2,reprise.getTauxDépriecié());
		
		statement.setInt(3,reprise.getId());
		
		if(statement.executeUpdate() < 1)
			return false;
		
	} catch (SQLException ex) {
    	System.out.println("SQLException: " + ex.getMessage());
        System.out.println("SQLState: " + ex.getSQLState());
        System.out.println("VendorError: " + ex.getErrorCode());
    }
	return true;
}

	

public boolean deleteReprise(Reprise reprise) {
	try {
		PreparedStatement statement = this.getBdd().prepareStatement("delete from reprise where IdReprise = ?");
		statement.setInt(1, reprise.getId());
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
