package fr.isis.transport.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "etablissement", schema = "public", catalog = "transport")
public class EtablissementEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "codeet")
    private Integer codeet;
    @Basic
    @Column(name = "nom")
    private String nom;
    @Basic
    @Column(name = "adresse")
    private String adresse;

    public Integer getCodeet() {
        return codeet;
    }

    public void setCodeet(Integer codeet) {
        this.codeet = codeet;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EtablissementEntity that = (EtablissementEntity) o;

        if (codeet != null ? !codeet.equals(that.codeet) : that.codeet != null) return false;
        if (nom != null ? !nom.equals(that.nom) : that.nom != null) return false;
        if (adresse != null ? !adresse.equals(that.adresse) : that.adresse != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codeet != null ? codeet.hashCode() : 0;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (adresse != null ? adresse.hashCode() : 0);
        return result;
    }
}
