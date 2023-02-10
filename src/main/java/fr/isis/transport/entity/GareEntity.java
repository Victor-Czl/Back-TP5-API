package fr.isis.transport.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "gare", schema = "public", catalog = "transport")
public class GareEntity {

    @Id
    @Column(name = "codeg")
    private String codeg;
    @Basic
    @Column(name = "codeservice")
    private String codeservice;
    @Basic
    @Column(name = "nomgare")
    private String nomgare;
    @Basic
    @Column(name = "type")
    private String type;

    public String getCodeg() {
        return codeg;
    }

    public void setCodeg(String codeg) {
        this.codeg = codeg;
    }

    public String getCodeservice() {
        return codeservice;
    }

    public void setCodeservice(String codeservice) {
        this.codeservice = codeservice;
    }

    public String getNomgare() {
        return nomgare;
    }

    public void setNomgare(String nomgare) {
        this.nomgare = nomgare;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GareEntity that = (GareEntity) o;

        if (codeg != null ? !codeg.equals(that.codeg) : that.codeg != null) return false;
        if (codeservice != null ? !codeservice.equals(that.codeservice) : that.codeservice != null) return false;
        if (nomgare != null ? !nomgare.equals(that.nomgare) : that.nomgare != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codeg != null ? codeg.hashCode() : 0;
        result = 31 * result + (codeservice != null ? codeservice.hashCode() : 0);
        result = 31 * result + (nomgare != null ? nomgare.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
