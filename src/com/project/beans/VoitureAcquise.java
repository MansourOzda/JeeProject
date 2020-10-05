package com.project.beans;

public class VoitureAcquise {
	private int id;
	private int DateAcquisition;
	private int idVoiture;
	private int idClient;
	private int idReparation;
	private int idReprise;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDateAcquisition() {
		return DateAcquisition;
	}
	public void setDateAcquisition(int dateAcquisition) {
		DateAcquisition = dateAcquisition;
	}
	public int getIdVoiture() {
		return idVoiture;
	}
	public void setIdVoiture(int idVoiture) {
		this.idVoiture = idVoiture;
	}
	public int getIdClient() {
		return idClient;
	}
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}
	public int getIdReparation() {
		return idReparation;
	}
	public void setIdReparation(int idReparation) {
		this.idReparation = idReparation;
	}
	public int getIdReprise() {
		return idReprise;
	}
	public void setIdReprise(int idReprise) {
		this.idReprise = idReprise;
	}
	
	
}
