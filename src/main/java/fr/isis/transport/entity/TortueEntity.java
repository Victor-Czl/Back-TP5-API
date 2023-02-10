package fr.isis.transport.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tortue", schema = "public", catalog = "transport")
public class TortueEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "codet")
    private Integer codet;
    @Basic
    @Column(name = "nom")
    private String nom;

    public Integer getCodet() {
        return codet;
    }

    public void setCodet(Integer codet) {
        this.codet = codet;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TortueEntity that = (TortueEntity) o;

        if (codet != null ? !codet.equals(that.codet) : that.codet != null) return false;
        if (nom != null ? !nom.equals(that.nom) : that.nom != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codet != null ? codet.hashCode() : 0;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        return result;
    }
}
