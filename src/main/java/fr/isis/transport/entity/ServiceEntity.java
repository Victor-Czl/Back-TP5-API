package fr.isis.transport.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "service", schema = "public", catalog = "transport")
public class ServiceEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "codeservice")
    private String codeservice;
    @Basic
    @Column(name = "nom")
    private String nom;
    @Basic
    @Column(name = "batiment")
    private String batiment;
    @Basic
    @Column(name = "codeet")
    private Integer codeet;

    public String getCodeservice() {
        return codeservice;
    }

    public void setCodeservice(String codeservice) {
        this.codeservice = codeservice;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getBatiment() {
        return batiment;
    }

    public void setBatiment(String batiment) {
        this.batiment = batiment;
    }

    public Integer getCodeet() {
        return codeet;
    }

    public void setCodeet(Integer codeet) {
        this.codeet = codeet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ServiceEntity that = (ServiceEntity) o;

        if (codeservice != null ? !codeservice.equals(that.codeservice) : that.codeservice != null) return false;
        if (nom != null ? !nom.equals(that.nom) : that.nom != null) return false;
        if (batiment != null ? !batiment.equals(that.batiment) : that.batiment != null) return false;
        if (codeet != null ? !codeet.equals(that.codeet) : that.codeet != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codeservice != null ? codeservice.hashCode() : 0;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (batiment != null ? batiment.hashCode() : 0);
        result = 31 * result + (codeet != null ? codeet.hashCode() : 0);
        return result;
    }
}
