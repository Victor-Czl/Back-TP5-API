package fr.isis.transport.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class EffectuerEntityPK implements Serializable {
    @Column(name = "code")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer code;
    @Column(name = "idtransport")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

        EffectuerEntityPK that = (EffectuerEntityPK) o;

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
