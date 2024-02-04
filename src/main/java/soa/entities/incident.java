package soa.entities;

import jakarta.persistence.*;


import java.util.Objects;

@Entity
public class incident {


	@Id
	private int Num_Incident;

	private int Annee_Inc ;
	private int Mois_Inc ;
	private int Jour_Inc ;
	private int Heure_Inc ;
	private int Minute_Inc ;
	private int Annee_Ret ;
	private int Mois_Ret ;
	private int Jour_Ret ;
	private int Heure_Ret ;
	private int Minute_Ret ;




	@JoinColumn(name = "Code_Cause")
	private String Code_Cause;
	private String Code_Siege1;

	@JoinColumn(name = "Nom_Poste")
	private String Nom_Poste;
	private String Nom_Depart;
	private String Code_Nat_Dcl;


	public incident() {
	}

	public incident(int num_Incident, int annee_Inc, int mois_Inc, int jour_Inc, int heure_Inc, int minute_Inc, int annee_Ret, int mois_Ret, int jour_Ret, int heure_Ret, int minute_Ret, String code_Cause, String code_Siege1, String nom_Poste, String nom_Depart, String code_Nat_Dcl) {
		Num_Incident = num_Incident;
		Annee_Inc = annee_Inc;
		Mois_Inc = mois_Inc;
		Jour_Inc = jour_Inc;
		Heure_Inc = heure_Inc;
		Minute_Inc = minute_Inc;
		Annee_Ret = annee_Ret;
		Mois_Ret = mois_Ret;
		Jour_Ret = jour_Ret;
		Heure_Ret = heure_Ret;
		Minute_Ret = minute_Ret;
		Code_Cause = code_Cause;
		Code_Siege1 = code_Siege1;
		Nom_Poste = nom_Poste;
		Nom_Depart = nom_Depart;
		Code_Nat_Dcl = code_Nat_Dcl;
	}

	public int getNum_Incident() {
		return Num_Incident;
	}

	public void setNum_Incident(int num_Incident) {
		Num_Incident = num_Incident;
	}

	public int getAnnee_Inc() {
		return Annee_Inc;
	}

	public void setAnnee_Inc(int annee_Inc) {
		Annee_Inc = annee_Inc;
	}

	public int getMois_Inc() {
		return Mois_Inc;
	}

	public void setMois_Inc(int mois_Inc) {
		Mois_Inc = mois_Inc;
	}

	public int getJour_Inc() {
		return Jour_Inc;
	}

	public void setJour_Inc(int jour_Inc) {
		Jour_Inc = jour_Inc;
	}

	public int getHeure_Inc() {
		return Heure_Inc;
	}

	public void setHeure_Inc(int heure_Inc) {
		Heure_Inc = heure_Inc;
	}

	public int getMinute_Inc() {
		return Minute_Inc;
	}

	public void setMinute_Inc(int minute_Inc) {
		Minute_Inc = minute_Inc;
	}

	public int getAnnee_Ret() {
		return Annee_Ret;
	}

	public void setAnnee_Ret(int annee_Ret) {
		Annee_Ret = annee_Ret;
	}

	public int getMois_Ret() {
		return Mois_Ret;
	}

	public void setMois_Ret(int mois_Ret) {
		Mois_Ret = mois_Ret;
	}

	public int getJour_Ret() {
		return Jour_Ret;
	}

	public void setJour_Ret(int jour_Ret) {
		Jour_Ret = jour_Ret;
	}

	public int getHeure_Ret() {
		return Heure_Ret;
	}

	public void setHeure_Ret(int heure_Ret) {
		Heure_Ret = heure_Ret;
	}

	public int getMinute_Ret() {
		return Minute_Ret;
	}

	public void setMinute_Ret(int minute_Ret) {
		Minute_Ret = minute_Ret;
	}

	public String getCode_Cause() {
		return Code_Cause;
	}

	public void setCode_Cause(String code_Cause) {
		Code_Cause = code_Cause;
	}

	public String getCode_Siege1() {
		return Code_Siege1;
	}

	public void setCode_Siege1(String code_Siege1) {
		Code_Siege1 = code_Siege1;
	}

	public String getNom_Poste() {
		return Nom_Poste;
	}

	public void setNom_Poste(String nom_Poste) {
		Nom_Poste = nom_Poste;
	}

	public String getNom_Depart() {
		return Nom_Depart;
	}

	public void setNom_Depart(String nom_Depart) {
		Nom_Depart = nom_Depart;
	}

	public String getCode_Nat_Dcl() {
		return Code_Nat_Dcl;
	}

	public void setCode_Nat_Dcl(String code_Nat_Dcl) {
		Code_Nat_Dcl = code_Nat_Dcl;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		incident incident = (incident) o;
		return Num_Incident == incident.Num_Incident && Annee_Inc == incident.Annee_Inc && Mois_Inc == incident.Mois_Inc && Jour_Inc == incident.Jour_Inc && Heure_Inc == incident.Heure_Inc && Minute_Inc == incident.Minute_Inc && Annee_Ret == incident.Annee_Ret && Mois_Ret == incident.Mois_Ret && Jour_Ret == incident.Jour_Ret && Heure_Ret == incident.Heure_Ret && Minute_Ret == incident.Minute_Ret && Objects.equals(Code_Cause, incident.Code_Cause) && Objects.equals(Code_Siege1, incident.Code_Siege1) && Objects.equals(Nom_Poste, incident.Nom_Poste) && Objects.equals(Nom_Depart, incident.Nom_Depart) && Objects.equals(Code_Nat_Dcl, incident.Code_Nat_Dcl);
	}

	@Override
	public int hashCode() {
		return Objects.hash(Num_Incident, Annee_Inc, Mois_Inc, Jour_Inc, Heure_Inc, Minute_Inc, Annee_Ret, Mois_Ret, Jour_Ret, Heure_Ret, Minute_Ret, Code_Cause, Code_Siege1, Nom_Poste, Nom_Depart, Code_Nat_Dcl);
	}

	@Override
	public String toString() {
		return "incident{" +
				"Num_Incident=" + Num_Incident +
				", Annee_Inc=" + Annee_Inc +
				", Mois_Inc=" + Mois_Inc +
				", Jour_Inc=" + Jour_Inc +
				", Heure_Inc=" + Heure_Inc +
				", Minute_Inc=" + Minute_Inc +
				", Annee_Ret=" + Annee_Ret +
				", Mois_Ret=" + Mois_Ret +
				", Jour_Ret=" + Jour_Ret +
				", Heure_Ret=" + Heure_Ret +
				", Minute_Ret=" + Minute_Ret +
				", Code_Cause='" + Code_Cause + '\'' +
				", Code_Siege1='" + Code_Siege1 + '\'' +
				", Nom_Poste='" + Nom_Poste + '\'' +
				", Nom_Depart='" + Nom_Depart + '\'' +
				", Code_Nat_Dcl='" + Code_Nat_Dcl + '\'' +
				'}';
	}
}
