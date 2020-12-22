/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author detjona
 */
@Entity
@Table(name = "PuntoriKompanis_tbl")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PuntoriKompanistbl.findAll", query = "SELECT p FROM PuntoriKompanistbl p")
    , @NamedQuery(name = "PuntoriKompanistbl.findByIDPuntori", query = "SELECT p FROM PuntoriKompanistbl p WHERE p.iDPuntori = :iDPuntori")
    , @NamedQuery(name = "PuntoriKompanistbl.findByEmri", query = "SELECT p FROM PuntoriKompanistbl p WHERE p.emri = :emri")
    , @NamedQuery(name = "PuntoriKompanistbl.findByMbiemri", query = "SELECT p FROM PuntoriKompanistbl p WHERE p.mbiemri = :mbiemri")
    , @NamedQuery(name = "PuntoriKompanistbl.findByNumriTelefonit", query = "SELECT p FROM PuntoriKompanistbl p WHERE p.numriTelefonit = :numriTelefonit")
    , @NamedQuery(name = "PuntoriKompanistbl.findByDataLindjes", query = "SELECT p FROM PuntoriKompanistbl p WHERE p.dataLindjes = :dataLindjes")
    , @NamedQuery(name = "PuntoriKompanistbl.findByPagesa", query = "SELECT p FROM PuntoriKompanistbl p WHERE p.pagesa = :pagesa")})
public class PuntoriKompanistbl implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_Puntori")
    @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator(name = "InvSeq",sequenceName = "INV_SEQ",allocationSize = 1)
    private Integer iDPuntori;
    @Column(name = "Emri")
    private String emri;
    @Column(name = "Mbiemri")
    private String mbiemri;
    @Column(name = "NumriTelefonit")
    private String numriTelefonit;
    @Column(name = "DataLindjes")
    private String dataLindjes;
    @Column(name = "Pagesa")
    private Integer pagesa;
    @OneToMany(mappedBy = "iDPuntori")
    private Collection<Kompaniatbl> kompaniatblCollection;

    public PuntoriKompanistbl() {
    }

    public PuntoriKompanistbl(Integer iDPuntori) {
        this.iDPuntori = iDPuntori;
    }

    public Integer getIDPuntori() {
        return iDPuntori;
    }

    public void setIDPuntori(Integer iDPuntori) {
        this.iDPuntori = iDPuntori;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getMbiemri() {
        return mbiemri;
    }

    public void setMbiemri(String mbiemri) {
        this.mbiemri = mbiemri;
    }

    public String getNumriTelefonit() {
        return numriTelefonit;
    }

    public void setNumriTelefonit(String numriTelefonit) {
        this.numriTelefonit = numriTelefonit;
    }

    public String getDataLindjes() {
        return dataLindjes;
    }

    public void setDataLindjes(String dataLindjes) {
        this.dataLindjes = dataLindjes;
    }

    public Integer getPagesa() {
        return pagesa;
    }

    public void setPagesa(Integer pagesa) {
        this.pagesa = pagesa;
    }

    @XmlTransient
    public Collection<Kompaniatbl> getKompaniatblCollection() {
        return kompaniatblCollection;
    }

    public void setKompaniatblCollection(Collection<Kompaniatbl> kompaniatblCollection) {
        this.kompaniatblCollection = kompaniatblCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDPuntori != null ? iDPuntori.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PuntoriKompanistbl)) {
            return false;
        }
        PuntoriKompanistbl other = (PuntoriKompanistbl) object;
        if ((this.iDPuntori == null && other.iDPuntori != null) || (this.iDPuntori != null && !this.iDPuntori.equals(other.iDPuntori))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.PuntoriKompanistbl[ iDPuntori=" + iDPuntori + " ]";
    }
    
}
