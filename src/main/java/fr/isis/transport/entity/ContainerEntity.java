package fr.isis.transport.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "container", schema = "public", catalog = "transport")
public class ContainerEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "codec")
    private Integer codec;
    @Basic
    @Column(name = "type")
    private String type;
    @Basic
    @Column(name = "etat")
    private String etat;
    @Basic
    @Column(name = "contenu")
    private String contenu;

    public Integer getCodec() {
        return codec;
    }

    public void setCodec(Integer codec) {
        this.codec = codec;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContainerEntity that = (ContainerEntity) o;

        if (codec != null ? !codec.equals(that.codec) : that.codec != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (etat != null ? !etat.equals(that.etat) : that.etat != null) return false;
        if (contenu != null ? !contenu.equals(that.contenu) : that.contenu != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codec != null ? codec.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (etat != null ? etat.hashCode() : 0);
        result = 31 * result + (contenu != null ? contenu.hashCode() : 0);
        return result;
    }
}
