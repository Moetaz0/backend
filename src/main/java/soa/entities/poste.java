package soa.entities;



import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class poste {
    @Id
    @Column(name = "Nom_Poste")
    private String Nom_Poste;
    private String Designation;
    private String Type;

    public poste() {
    }

    public poste(String nom_Poste, String designation, String type) {
        Nom_Poste = nom_Poste;
        Designation = designation;
        Type = type;
    }

    public String getNom_Poste() {
        return Nom_Poste;
    }

    public void setNom_Poste(String nom_Poste) {
        Nom_Poste = nom_Poste;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        poste poste = (poste) o;
        return Objects.equals(Nom_Poste, poste.Nom_Poste) && Objects.equals(Designation, poste.Designation) && Objects.equals(Type, poste.Type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Nom_Poste, Designation, Type);
    }

    @Override
    public String toString() {
        return "poste{" +
                "Nom_Poste='" + Nom_Poste + '\'' +
                ", Designation='" + Designation + '\'' +
                ", Type='" + Type + '\'' +
                '}';
    }
}
