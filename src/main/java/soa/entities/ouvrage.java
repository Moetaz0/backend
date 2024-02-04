package soa.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity

public class ouvrage {

    @JoinColumn(name = "Nom_Poste")
    private String Nom_Poste;
    @Id
    @Column(name = "Nom_Ouvrage")
    private String Nom_Ouvrage;

    private String Designation;
    private String Type_SA;
    private String Tension_KV;
    private String Precision_KV;

    public ouvrage() {
    }

    public ouvrage(String nom_Poste, String nom_Ouvrage, String designation, String type_SA, String tension_KV, String precision_KV) {
        Nom_Poste = nom_Poste;
        Nom_Ouvrage = nom_Ouvrage;
        Designation = designation;
        Type_SA = type_SA;
        Tension_KV = tension_KV;
        Precision_KV = precision_KV;
    }

    public String getNom_Poste() {
        return Nom_Poste;
    }

    public void setNom_Poste(String nom_Poste) {
        Nom_Poste = nom_Poste;
    }

    public String getNom_Ouvrage() {
        return Nom_Ouvrage;
    }

    public void setNom_Ouvrage(String nom_Ouvrage) {
        Nom_Ouvrage = nom_Ouvrage;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public String getType_SA() {
        return Type_SA;
    }

    public void setType_SA(String type_SA) {
        Type_SA = type_SA;
    }

    public String getTension_KV() {
        return Tension_KV;
    }

    public void setTension_KV(String tension_KV) {
        Tension_KV = tension_KV;
    }

    public String getPrecision_KV() {
        return Precision_KV;
    }

    public void setPrecision_KV(String precision_KV) {
        Precision_KV = precision_KV;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ouvrage ouvrage = (ouvrage) o;
        return Objects.equals(Nom_Poste, ouvrage.Nom_Poste) && Objects.equals(Nom_Ouvrage, ouvrage.Nom_Ouvrage) && Objects.equals(Designation, ouvrage.Designation) && Objects.equals(Type_SA, ouvrage.Type_SA) && Objects.equals(Tension_KV, ouvrage.Tension_KV) && Objects.equals(Precision_KV, ouvrage.Precision_KV);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Nom_Poste, Nom_Ouvrage, Designation, Type_SA, Tension_KV, Precision_KV);
    }

    @Override
    public String toString() {
        return "ouvrage{" +
                "Nom_Poste='" + Nom_Poste + '\'' +
                ", Nom_Ouvrage='" + Nom_Ouvrage + '\'' +
                ", Designation='" + Designation + '\'' +
                ", Type_SA='" + Type_SA + '\'' +
                ", Tension_KV='" + Tension_KV + '\'' +
                ", Precision_KV='" + Precision_KV + '\'' +
                '}';
    }
}
