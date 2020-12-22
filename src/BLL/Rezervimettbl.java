/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author detjona
 */
@Entity
@Table(name = "Rezervimet_tbl")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rezervimettbl.findAll", query = "SELECT r FROM Rezervimettbl r")
    , @NamedQuery(name = "Rezervimettbl.findByIDRezervimet", query = "SELECT r FROM Rezervimettbl r WHERE r.iDRezervimet = :iDRezervimet")
    , @NamedQuery(name = "Rezervimettbl.findByIDKlientit", query = "SELECT r FROM Rezervimettbl r WHERE r.iDKlientit = :iDKlientit")
    , @NamedQuery(name = "Rezervimettbl.findByDataRezervimit", query = "SELECT r FROM Rezervimettbl r WHERE r.dataRezervimit = :dataRezervimit")
    , @NamedQuery(name = "Rezervimettbl.findByIDLinjat", query = "SELECT r FROM Rezervimettbl r WHERE r.iDLinjat = :iDLinjat")
    , @NamedQuery(name = "Rezervimettbl.findByPagesa", query = "SELECT r FROM Rezervimettbl r WHERE r.pagesa = :pagesa")})
public class Rezervimettbl implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_Rezervimet")
    private Integer iDRezervimet;
    @Column(name = "ID_Klientit")
    private String iDKlientit;
    @Column(name = "Data_Rezervimit")
    private String dataRezervimit;
    @Column(name = "ID_Linjat")
    private String iDLinjat;
    @Column(name = "Pagesa")
    private String pagesa;
    @JoinColumn(name = "ID_Rezervimet", referencedColumnName = "ID_Klientit", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Klientitbl klientitbl;

    public Rezervimettbl() {
    }

    public Rezervimettbl(Integer iDRezervimet) {
        this.iDRezervimet = iDRezervimet;
    }

    public Integer getIDRezervimet() {
        return iDRezervimet;
    }

    public void setIDRezervimet(Integer iDRezervimet) {
        this.iDRezervimet = iDRezervimet;
    }

    public String getIDKlientit() {
        return iDKlientit;
    }

    public void setIDKlientit(String iDKlientit) {
        this.iDKlientit = iDKlientit;
    }

    public String getDataRezervimit() {
        return dataRezervimit;
    }

    public void setDataRezervimit(String dataRezervimit) {
        this.dataRezervimit = dataRezervimit;
    }

    public String getIDLinjat() {
        return iDLinjat;
    }

    public void setIDLinjat(String iDLinjat) {
        this.iDLinjat = iDLinjat;
    }

    public String getPagesa() {
        return pagesa;
    }

    public void setPagesa(String pagesa) {
        this.pagesa = pagesa;
    }

    public Klientitbl getKlientitbl() {
        return klientitbl;
    }

    public void setKlientitbl(Klientitbl klientitbl) {
        this.klientitbl = klientitbl;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDRezervimet != null ? iDRezervimet.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rezervimettbl)) {
            return false;
        }
        Rezervimettbl other = (Rezervimettbl) object;
        if ((this.iDRezervimet == null && other.iDRezervimet != null) || (this.iDRezervimet != null && !this.iDRezervimet.equals(other.iDRezervimet))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.Rezervimettbl[ iDRezervimet=" + iDRezervimet + " ]";
    }
    
}
