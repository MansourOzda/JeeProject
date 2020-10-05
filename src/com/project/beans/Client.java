package com.project.beans;
 import  java.util.Date ;


public class Client {
	private int id;
	private String Nom ;
	private String Prenom;
	private String Email;
	private String adresse;
	private String InformationBancaire;
	private int CodePostal;
	private int  Capital;
	private int Telephone;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getInformationBancaire() {
		return InformationBancaire;
	}
	public void setInformationBancaire(String informationBancaire) {
		InformationBancaire = informationBancaire;
	}
	public int getCodePostal() {
		return CodePostal;
	}
	public void setCodePostal(int codePostal) {
		CodePostal = codePostal;
	}
	public int getCapital() {
		return Capital;
	}
	public void setCapital(int capital) {
		Capital = capital;
	}
	public int getTelephone() {
		return Telephone;
	}
	public void setTelephone(int telephone) {
		Telephone = telephone;
	}
	
}
