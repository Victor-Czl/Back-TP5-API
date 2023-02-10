package fr.isis.transport.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "transportpersonne", schema = "public", catalog = "transport")
public class TransportpersonneEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idtransport")
    private Integer idtransport;
    @Basic
    @Column(name = "codeservice_service_depart")
    private String codeserviceServiceDepart;
    @Basic
    @Column(name = "ipp")
    private Integer ipp;
    @Basic
    @Column(name = "numexamen")
    private Integer numexamen;
    @Basic
    @Column(name = "codeservice_service_arrivee")
    private String codeserviceServiceArrivee;
    @Basic
    @Column(name = "date_t")
    private Date dateT;
    @Basic
    @Column(name = "heuredepart")
    private Time heuredepart;
    @Basic
    @Column(name = "heurearrivee")
    private Time heurearrivee;

    public Integer getIdtransport() {
        return idtransport;
    }

    public void setIdtransport(Integer idtransport) {
        this.idtransport = idtransport;
    }

    public String getCodeserviceServiceDepart() {
        return codeserviceServiceDepart;
    }

    public void setCodeserviceServiceDepart(String codeserviceServiceDepart) {
        this.codeserviceServiceDepart = codeserviceServiceDepart;
    }

    public Integer getIpp() {
        return ipp;
    }

    public void setIpp(Integer ipp) {
        this.ipp = ipp;
    }

    public Integer getNumexamen() {
        return numexamen;
    }

    public void setNumexamen(Integer numexamen) {
        this.numexamen = numexamen;
    }

    public String getCodeserviceServiceArrivee() {
        return codeserviceServiceArrivee;
    }

    public void setCodeserviceServiceArrivee(String codeserviceServiceArrivee) {
        this.codeserviceServiceArrivee = codeserviceServiceArrivee;
    }

    public Date getDateT() {
        return dateT;
    }

    public void setDateT(Date dateT) {
        this.dateT = dateT;
    }

    public Time getHeuredepart() {
        return heuredepart;
    }

    public void setHeuredepart(Time heuredepart) {
        this.heuredepart = heuredepart;
    }

    public Time getHeurearrivee() {
        return heurearrivee;
    }

    public void setHeurearrivee(Time heurearrivee) {
        this.heurearrivee = heurearrivee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TransportpersonneEntity that = (TransportpersonneEntity) o;

        if (idtransport != null ? !idtransport.equals(that.idtransport) : that.idtransport != null) return false;
        if (codeserviceServiceDepart != null ? !codeserviceServiceDepart.equals(that.codeserviceServiceDepart) : that.codeserviceServiceDepart != null)
            return false;
        if (ipp != null ? !ipp.equals(that.ipp) : that.ipp != null) return false;
        if (numexamen != null ? !numexamen.equals(that.numexamen) : that.numexamen != null) return false;
        if (codeserviceServiceArrivee != null ? !codeserviceServiceArrivee.equals(that.codeserviceServiceArrivee) : that.codeserviceServiceArrivee != null)
            return false;
        if (dateT != null ? !dateT.equals(that.dateT) : that.dateT != null) return false;
        if (heuredepart != null ? !heuredepart.equals(that.heuredepart) : that.heuredepart != null) return false;
        if (heurearrivee != null ? !heurearrivee.equals(that.heurearrivee) : that.heurearrivee != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idtransport != null ? idtransport.hashCode() : 0;
        result = 31 * result + (codeserviceServiceDepart != null ? codeserviceServiceDepart.hashCode() : 0);
        result = 31 * result + (ipp != null ? ipp.hashCode() : 0);
        result = 31 * result + (numexamen != null ? numexamen.hashCode() : 0);
        result = 31 * result + (codeserviceServiceArrivee != null ? codeserviceServiceArrivee.hashCode() : 0);
        result = 31 * result + (dateT != null ? dateT.hashCode() : 0);
        result = 31 * result + (heuredepart != null ? heuredepart.hashCode() : 0);
        result = 31 * result + (heurearrivee != null ? heurearrivee.hashCode() : 0);
        return result;
    }
}
