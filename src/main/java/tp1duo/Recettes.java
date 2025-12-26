package tp1duo;

import java.sql.Date;

public class Recettes {
	
	private int id;
	private String nom;
	private int tempsPreparation;
	private Integer tempsCuisson;
	private int nbParts;
	private String description;
	private int idType;
	private Date dateInsertion;
	
	
	
	
	public Recettes(int id, String nom, int tempsPreparation, Integer tempsCuisson, int nbParts, String description,
			int idType, Date dateInsertion) {
		this.id = id;
		this.nom = nom;
		this.tempsPreparation = tempsPreparation;
		this.tempsCuisson = tempsCuisson;
		this.nbParts = nbParts;
		this.description = description;
		this.idType = idType;
		this.dateInsertion = dateInsertion;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getTempsPreparation() {
		return tempsPreparation;
	}
	public void setTempsPreparation(int tempsPreparation) {
		this.tempsPreparation = tempsPreparation;
	}
	public Integer getTempsCuisson() {
		if (tempsCuisson ==null) {
			tempsCuisson = 0;
		}
		return tempsCuisson;
	}
	public void setTempsCuisson(int tempsCuisson) {
		this.tempsCuisson = tempsCuisson;
	}
	public int getNbParts() {
		return nbParts;
	}
	public void setNbParts(int nbParts) {
		this.nbParts = nbParts;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getIdType() {
		return idType;
	}
	public void setIdType(int idType) {
		this.idType = idType;
	}
	public Date getDateInsertion() {
		return dateInsertion;
	}
	public void setDateInsertion(Date dateInsertion) {
		this.dateInsertion = dateInsertion;
	}
	
	
	

}
