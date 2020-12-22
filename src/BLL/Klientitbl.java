/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "Klienti_tbl")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Klientitbl.findAll", query = "SELECT k FROM Klientitbl k")
    , @NamedQuery(name = "Klientitbl.findByIDKlientit", query = "SELECT k FROM Klientitbl k WHERE k.iDKlientit = :iDKlientit")
    , @NamedQuery(name = "Klientitbl.findByEmriKlientit", query = "SELECT k FROM Klientitbl k WHERE k.emriKlientit = :emriKlientit")
    , @NamedQuery(name = "Klientitbl.findByMbiemriKlientit", query = "SELECT k FROM Klientitbl k WHERE k.mbiemriKlientit = :mbiemriKlientit")
    , @NamedQuery(name = "Klientitbl.findByNrTelefonit", query = "SELECT k FROM Klientitbl k WHERE k.nrTelefonit = :nrTelefonit")
    , @NamedQuery(name = "Klientitbl.findByEmail", query = "SELECT k FROM Klientitbl k WHERE k.email = :email")
    , @NamedQuery(name = "Klientitbl.findByIDRezervimit", query = "SELECT k FROM Klientitbl k WHERE k.iDRezervimit = :iDRezervimit")})
public class Klientitbl implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_Klientit")
    private Integer iDKlientit;
    @Column(name = "Emri_Klientit")
    private String emriKlientit;
    @Column(name = "Mbiemri_Klientit")
    private String mbiemriKlientit;
    @Column(name = "Nr_Telefonit")
    private String nrTelefonit;
    @Column(name = "Email")
    private String email;
    @Column(name = "ID_Rezervimit")
    private Integer iDRezervimit;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "klientitbl")
    private Rezervimettbl rezervimettbl;

    public Klientitbl() {
    }

    public Klientitbl(Integer iDKlientit) {
        this.iDKlientit = iDKlientit;
    }

    public Integer getIDKlientit() {
        return iDKlientit;
    }

    public void setIDKlientit(Integer iDKlientit) {
        this.iDKlientit = iDKlientit;
    }

    public String getEmriKlientit() {
        return emriKlientit;
    }

    public void setEmriKlientit(String emriKlientit) {
        this.emriKlientit = emriKlientit;
    }

    public String getMbiemriKlientit() {
        return mbiemriKlientit;
    }

    public void setMbiemriKlientit(String mbiemriKlientit) {
        this.mbiemriKlientit = mbiemriKlientit;
    }

    public String getNrTelefonit() {
        return nrTelefonit;
    }

    public void setNrTelefonit(String nrTelefonit) {
        this.nrTelefonit = nrTelefonit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIDRezervimit() {
        return iDRezervimit;
    }

    public void setIDRezervimit(Integer iDRezervimit) {
        this.iDRezervimit = iDRezervimit;
    }

    public Rezervimettbl getRezervimettbl() {
        return rezervimettbl;
    }

    public void setRezervimettbl(Rezervimettbl rezervimettbl) {
        this.rezervimettbl = rezervimettbl;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDKlientit != null ? iDKlientit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Klientitbl)) {
            return false;
        }
        Klientitbl other = (Klientitbl) object;
        if ((this.iDKlientit == null && other.iDKlientit != null) || (this.iDKlientit != null && !this.iDKlientit.equals(other.iDKlientit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.Klientitbl[ iDKlientit=" + iDKlientit + " ]";
    }
    
}
