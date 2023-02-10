package fr.isis.transport.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "transportmateriel", schema = "public", catalog = "transport")
public class TransportmaterielEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idtransport")
    private Integer idtransport;
    @Basic
    @Column(name = "codet")
    private Integer codet;
    @Basic
    @Column(name = "codec")
    private Integer codec;
    @Basic
    @Column(name = "codeg_gare_depart")
    private String codegGareDepart;
    @Basic
    @Column(name = "codeg_gare_arrivee")
    private String codegGareArrivee;
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

    public Integer getCodet() {
        return codet;
    }

    public void setCodet(Integer codet) {
        this.codet = codet;
    }

    public Integer getCodec() {
        return codec;
    }

    public void setCodec(Integer codec) {
        this.codec = codec;
    }

    public String getCodegGareDepart() {
        return codegGareDepart;
    }

    public void setCodegGareDepart(String codegGareDepart) {
        this.codegGareDepart = codegGareDepart;
    }

    public String getCodegGareArrivee() {
        return codegGareArrivee;
    }

    public void setCodegGareArrivee(String codegGareArrivee) {
        this.codegGareArrivee = codegGareArrivee;
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

        TransportmaterielEntity that = (TransportmaterielEntity) o;

        if (idtransport != null ? !idtransport.equals(that.idtransport) : that.idtransport != null) return false;
        if (codet != null ? !codet.equals(that.codet) : that.codet != null) return false;
        if (codec != null ? !codec.equals(that.codec) : that.codec != null) return false;
        if (codegGareDepart != null ? !codegGareDepart.equals(that.codegGareDepart) : that.codegGareDepart != null)
            return false;
        if (codegGareArrivee != null ? !codegGareArrivee.equals(that.codegGareArrivee) : that.codegGareArrivee != null)
            return false;
        if (dateT != null ? !dateT.equals(that.dateT) : that.dateT != null) return false;
        if (heuredepart != null ? !heuredepart.equals(that.heuredepart) : that.heuredepart != null) return false;
        if (heurearrivee != null ? !heurearrivee.equals(that.heurearrivee) : that.heurearrivee != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idtransport != null ? idtransport.hashCode() : 0;
        result = 31 * result + (codet != null ? codet.hashCode() : 0);
        result = 31 * result + (codec != null ? codec.hashCode() : 0);
        result = 31 * result + (codegGareDepart != null ? codegGareDepart.hashCode() : 0);
        result = 31 * result + (codegGareArrivee != null ? codegGareArrivee.hashCode() : 0);
        result = 31 * result + (dateT != null ? dateT.hashCode() : 0);
        result = 31 * result + (heuredepart != null ? heuredepart.hashCode() : 0);
        result = 31 * result + (heurearrivee != null ? heurearrivee.hashCode() : 0);
        return result;
    }
}
