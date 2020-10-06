package com.project.beans;

import java.util.Date;

public class Voiture {
	private int id;

	private Date Année;
	private String Marque;
	private String Modele;
	private String Couleur;
	private String Carburant;
	private String Energie;
	private String BoiteVitesse;
	private String EtatVoiture;
	private String Description;
	private int Nbporte;
	private int NbChevaux;
	private int NbKilometre;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getAnnée() {
		return Année;
	}
	public void setAnnée(Date année) {
		Année = année;
	}
	public String getMarque() {
		return Marque;
	}
	public void setMarque(String marque) {
		Marque = marque;
	}
	public String getModele() {
		return Modele;
	}
	public void setModele(String modele) {
		Modele = modele;
	}
	public String getCouleur() {
		return Couleur;
	}
	public void setCouleur(String couleur) {
		Couleur = couleur;
	}
	public String getCarburant() {
		return Carburant;
	}
	public void setCarburant(String carburant) {
		Carburant = carburant;
	}
	public String getEnergie() {
		return Energie;
	}
	public void setEnergie(String energie) {
		Energie = energie;
	}
	public String getBoiteVitesse() {
		return BoiteVitesse;
	}
	public void setBoiteVitesse(String boiteVitesse) {
		BoiteVitesse = boiteVitesse;
	}
	public String getEtatVoiture() {
		return EtatVoiture;
	}
	public void setEtatVoiture(String etatVoiture) {
		EtatVoiture = etatVoiture;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public int getNbporte() {
		return Nbporte;
	}
	public void setNbporte(int nbporte) {
		Nbporte = nbporte;
	}
	public int getNbChevaux() {
		return NbChevaux;
	}
	public void setNbChevaux(int nbChevaux) {
		NbChevaux = nbChevaux;
	}
	public int getNbKilometre() {
		return NbKilometre;
	}
	public void setNbKilometre(int nbKilometre) {
		NbKilometre = nbKilometre;
	}
	
}
