package com.project.Repository;

import com.project.beans.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;




public class VoitureRepository {

private Connection bdd;
	
	public Connection getBdd() {

		ConnexionBDD Cobdd = new ConnexionBDD();
		
		
	 Cobdd.connection();   
	 bdd=Cobdd.getBdd();

		return bdd;
	}
	
	

protected Voiture buildObjet(ResultSet result) throws SQLException {
	Voiture voiture = new Voiture();
	
		int id = result.getInt(1);
		voiture.setId(id);
		
		Date année = result.getDate(2);
		voiture.setAnnée(année);
		
		String marque = result.getString(3);
		voiture.setMarque(marque);
		
		String modele = result.getString(4);
		voiture.setModele(modele);
		
		String couleur = result.getString(5);
		voiture.setCouleur(couleur);
		
		String carburant = result.getString(6);
		voiture.setCarburant(carburant);
		
		String energie = result.getString(7);
		voiture.setEnergie(energie);
		
		String boiteVitesse = result.getString(8);
		voiture.setBoiteVitesse(boiteVitesse);
		
		String etatVoiture = result.getString(9);
		voiture.setEtatVoiture(etatVoiture);
		
		String description = result.getString(10);
		voiture.setDescription(description);
		
		int nbporte = result.getInt(11);
		voiture.setNbporte(nbporte);
		
		int nbChevaux = result.getInt(12);
		voiture.setNbChevaux(nbChevaux);
		
		int nbKilometre = result.getInt(13);
		voiture.setNbKilometre(nbKilometre);

	return voiture;
}
	
public int getNewId() {
	int newid = -1;
	try {
		PreparedStatement statement = this.getBdd().prepareStatement("SELECT max(IdVoiture)+1 as newid from Voiture");
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
	

public ArrayList<Voiture> getListVoiture() {
	ArrayList<Voiture> voitures = new ArrayList();

	try {

		PreparedStatement statement = this.getBdd().prepareStatement("Select * from client");
		
		

		ResultSet rs = statement.executeQuery();
		
		while(rs.next()){
			Voiture voiture = buildObjet(rs);
			voitures.add(voiture);
		}
	} catch (SQLException ex) {
    	System.out.println("SQLException: " + ex.getMessage());
        System.out.println("SQLState: " + ex.getSQLState());
        System.out.println("VendorError: " + ex.getErrorCode());
    }

	return voitures;		
}


//CRUD pour Voiture
public Voiture find(int id) {
	
	try {
		PreparedStatement statement = this.getBdd().prepareStatement("Select * from voiture where IdVoiture = ?");
		statement.setInt(1, id);
		ResultSet result = statement.executeQuery();
		Voiture voiture = buildObjet(result);
		return voiture;
		
	}catch(Exception e) {
		System.out.println("");
		e.printStackTrace();
		Voiture voiture = new Voiture();
      return voiture;
	}
}


public boolean addVoiture(Voiture voiture) {
	try {
		PreparedStatement statement = this.getBdd().prepareStatement("insert into voiture values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
		
		statement.setInt(1,this.getNewId());
		
		statement.setDate(2, (java.sql.Date) voiture.getAnnée());
		
		statement.setString(3, voiture.getMarque());

		statement.setString(4, voiture.getModele());
		
		statement.setString(5, voiture.getCouleur());
		
		statement.setString(6, voiture.getCarburant());

		statement.setString(7, voiture.getEnergie());
		
		statement.setString(8, voiture.getBoiteVitesse());
		
		statement.setString(9, voiture.getEtatVoiture());
		
		statement.setString(10, voiture.getDescription());
		
		statement.setInt(11, voiture.getNbporte());
		
		statement.setInt(12, voiture.getNbChevaux());
		
		statement.setInt(13, voiture.getNbKilometre());

		if(statement.executeUpdate() < 1)
			
			return false;
		
	} catch (SQLException ex) {
    	System.out.println("SQLException: " + ex.getMessage());
        System.out.println("SQLState: " + ex.getSQLState());
        System.out.println("VendorError: " + ex.getErrorCode());
    }
	return true;
}


public boolean updateVoiture(Voiture voiture) {
	try {
		PreparedStatement statement = this.getBdd().prepareStatement("update voiture set  Marque = ? , Annee = ? , Modele  = ? , Couleur = ? , Carburant = ? , Energie = ? , Nbporte = ? , NbChevaux = ? , Boite_de_vitesse = ? , NbKilometre = ? , EtatVoiture = ? , Description = ?   where IdVoiture = ?");
		statement.setDate(1, (java.sql.Date) voiture.getAnnée());
		
		statement.setString(2, voiture.getMarque());

		statement.setString(3, voiture.getModele());
		
		statement.setString(4, voiture.getCouleur());
		
		statement.setString(5, voiture.getCarburant());

		statement.setString(6, voiture.getEnergie());
		
		statement.setString(7, voiture.getBoiteVitesse());
		
		statement.setString(8, voiture.getEtatVoiture());
		
		statement.setString(9, voiture.getDescription());
		
		statement.setInt(10, voiture.getNbporte());
		
		statement.setInt(11, voiture.getNbChevaux());
		
		statement.setInt(12, voiture.getNbKilometre());

		statement.setInt(13,voiture.getId());
		
		if(statement.executeUpdate() < 1)
			return false;
		
	} catch (SQLException ex) {
    	System.out.println("SQLException: " + ex.getMessage());
        System.out.println("SQLState: " + ex.getSQLState());
        System.out.println("VendorError: " + ex.getErrorCode());
    }
	return true;
}
	


public boolean deleteVoiture(Voiture voiture) {
	try {
		PreparedStatement statement = this.getBdd().prepareStatement("delete from voiture where IdVoiture = ?");
		statement.setInt(1, voiture.getId());
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
