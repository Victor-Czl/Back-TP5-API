package fr.isis.transport.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "regions", schema = "public", catalog = "transport")
public class RegionsEntity {

    @Id
    @Column(name = "codereg")
    private String codereg;
    @Basic
    @Column(name = "nomreg")
    private String nomreg;

    public String getCodereg() {
        return codereg;
    }

    public void setCodereg(String codereg) {
        this.codereg = codereg;
    }

    public String getNomreg() {
        return nomreg;
    }

    public void setNomreg(String nomreg) {
        this.nomreg = nomreg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RegionsEntity that = (RegionsEntity) o;

        if (codereg != null ? !codereg.equals(that.codereg) : that.codereg != null) return false;
        if (nomreg != null ? !nomreg.equals(that.nomreg) : that.nomreg != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codereg != null ? codereg.hashCode() : 0;
        result = 31 * result + (nomreg != null ? nomreg.hashCode() : 0);
        return result;
    }
}
