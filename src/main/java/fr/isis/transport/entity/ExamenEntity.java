package fr.isis.transport.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "examen", schema = "public", catalog = "transport")
public class ExamenEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "numexamen")
    private Integer numexamen;
    @Basic
    @Column(name = "ipp")
    private Integer ipp;
    @Basic
    @Column(name = "type")
    private String type;
    @Basic
    @Column(name = "natureacte")
    private String natureacte;
    @Basic
    @Column(name = "contagiosite")
    private Integer contagiosite;
    @Basic
    @Column(name = "date_e")
    private Date dateE;
    @Basic
    @Column(name = "heure")
    private Time heure;
    @Basic
    @Column(name = "commentaire")
    private String commentaire;

    public Integer getNumexamen() {
        return numexamen;
    }

    public void setNumexamen(Integer numexamen) {
        this.numexamen = numexamen;
    }

    public Integer getIpp() {
        return ipp;
    }

    public void setIpp(Integer ipp) {
        this.ipp = ipp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNatureacte() {
        return natureacte;
    }

    public void setNatureacte(String natureacte) {
        this.natureacte = natureacte;
    }

    public Integer getContagiosite() {
        return contagiosite;
    }

    public void setContagiosite(Integer contagiosite) {
        this.contagiosite = contagiosite;
    }

    public Date getDateE() {
        return dateE;
    }

    public void setDateE(Date dateE) {
        this.dateE = dateE;
    }

    public Time getHeure() {
        return heure;
    }

    public void setHeure(Time heure) {
        this.heure = heure;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExamenEntity that = (ExamenEntity) o;

        if (numexamen != null ? !numexamen.equals(that.numexamen) : that.numexamen != null) return false;
        if (ipp != null ? !ipp.equals(that.ipp) : that.ipp != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (natureacte != null ? !natureacte.equals(that.natureacte) : that.natureacte != null) return false;
        if (contagiosite != null ? !contagiosite.equals(that.contagiosite) : that.contagiosite != null) return false;
        if (dateE != null ? !dateE.equals(that.dateE) : that.dateE != null) return false;
        if (heure != null ? !heure.equals(that.heure) : that.heure != null) return false;
        if (commentaire != null ? !commentaire.equals(that.commentaire) : that.commentaire != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numexamen != null ? numexamen.hashCode() : 0;
        result = 31 * result + (ipp != null ? ipp.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (natureacte != null ? natureacte.hashCode() : 0);
        result = 31 * result + (contagiosite != null ? contagiosite.hashCode() : 0);
        result = 31 * result + (dateE != null ? dateE.hashCode() : 0);
        result = 31 * result + (heure != null ? heure.hashCode() : 0);
        result = 31 * result + (commentaire != null ? commentaire.hashCode() : 0);
        return result;
    }
}
