package fr.isis.transport.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "effectuer", schema = "public", catalog = "transport")
@IdClass(EffectuerEntityPK.class)
public class EffectuerEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "code")
    private Integer code;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idtransport")
    private Integer idtransport;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getIdtransport() {
        return idtransport;
    }

    public void setIdtransport(Integer idtransport) {
        this.idtransport = idtransport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EffectuerEntity that = (EffectuerEntity) o;

        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (idtransport != null ? !idtransport.equals(that.idtransport) : that.idtransport != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = code != null ? code.hashCode() : 0;
        result = 31 * result + (idtransport != null ? idtransport.hashCode() : 0);
        return result;
    }
}
