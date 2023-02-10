package fr.isis.transport.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "departements", schema = "public", catalog = "transport")
public class DepartementsEntity {

    @Id
    @Column(name = "idept")
    private String idept;
    @Basic
    @Column(name = "nomdept")
    private String nomdept;
    @Basic
    @Column(name = "nbhab")
    private Integer nbhab;
    @Basic
    @Column(name = "codereg")
    private String codereg;

    public String getIdept() {
        return idept;
    }

    public void setIdept(String idept) {
        this.idept = idept;
    }

    public String getNomdept() {
        return nomdept;
    }

    public void setNomdept(String nomdept) {
        this.nomdept = nomdept;
    }

    public Integer getNbhab() {
        return nbhab;
    }

    public void setNbhab(Integer nbhab) {
        this.nbhab = nbhab;
    }

    public String getCodereg() {
        return codereg;
    }

    public void setCodereg(String codereg) {
        this.codereg = codereg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DepartementsEntity that = (DepartementsEntity) o;

        if (idept != null ? !idept.equals(that.idept) : that.idept != null) return false;
        if (nomdept != null ? !nomdept.equals(that.nomdept) : that.nomdept != null) return false;
        if (nbhab != null ? !nbhab.equals(that.nbhab) : that.nbhab != null) return false;
        if (codereg != null ? !codereg.equals(that.codereg) : that.codereg != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idept != null ? idept.hashCode() : 0;
        result = 31 * result + (nomdept != null ? nomdept.hashCode() : 0);
        result = 31 * result + (nbhab != null ? nbhab.hashCode() : 0);
        result = 31 * result + (codereg != null ? codereg.hashCode() : 0);
        return result;
    }
}
