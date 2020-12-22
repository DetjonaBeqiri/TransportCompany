/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author detjona
 */
@Entity
@Table(name = "Kompania_tbl")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kompaniatbl.findAll", query = "SELECT k FROM Kompaniatbl k")
    , @NamedQuery(name = "Kompaniatbl.findByIDKompanise", query = "SELECT k FROM Kompaniatbl k WHERE k.iDKompanise = :iDKompanise")
    , @NamedQuery(name = "Kompaniatbl.findByEmriKompanise", query = "SELECT k FROM Kompaniatbl k WHERE k.emriKompanise = :emriKompanise")
    , @NamedQuery(name = "Kompaniatbl.findByNumriLicenses", query = "SELECT k FROM Kompaniatbl k WHERE k.numriLicenses = :numriLicenses")
    , @NamedQuery(name = "Kompaniatbl.findByEmriPronarit", query = "SELECT k FROM Kompaniatbl k WHERE k.emriPronarit = :emriPronarit")
    , @NamedQuery(name = "Kompaniatbl.findByMbiemriPronarit", query = "SELECT k FROM Kompaniatbl k WHERE k.mbiemriPronarit = :mbiemriPronarit")
    , @NamedQuery(name = "Kompaniatbl.findByDataLindjes", query = "SELECT k FROM Kompaniatbl k WHERE k.dataLindjes = :dataLindjes")
    , @NamedQuery(name = "Kompaniatbl.findByVendbanimi", query = "SELECT k FROM Kompaniatbl k WHERE k.vendbanimi = :vendbanimi")
    , @NamedQuery(name = "Kompaniatbl.findByNumriPersonal", query = "SELECT k FROM Kompaniatbl k WHERE k.numriPersonal = :numriPersonal")
    , @NamedQuery(name = "Kompaniatbl.findByNumriTelefonit", query = "SELECT k FROM Kompaniatbl k WHERE k.numriTelefonit = :numriTelefonit")
    , @NamedQuery(name = "Kompaniatbl.findByPagesa", query = "SELECT k FROM Kompaniatbl k WHERE k.pagesa = :pagesa")
    , @NamedQuery(name = "Kompaniatbl.findByIDDataRegjistrimit", query = "SELECT k FROM Kompaniatbl k WHERE k.iDDataRegjistrimit = :iDDataRegjistrimit")})
public class Kompaniatbl implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_Kompanise")
    @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator(name = "InvSeq",sequenceName = "INV_SEQ",allocationSize = 1)
    private Integer iDKompanise;
    @Column(name = "Emri_Kompanise")
    private String emriKompanise;
    @Column(name = "Numri_Licenses")
    private String numriLicenses;
    @Column(name = "Emri_Pronarit")
    private String emriPronarit;
    @Column(name = "Mbiemri_Pronarit")
    private String mbiemriPronarit;
    @Column(name = "Data_Lindjes")
    @Temporal(TemporalType.DATE)
    private Date dataLindjes;
    @Column(name = "Vendbanimi")
    private String vendbanimi;
    @Column(name = "Numri_Personal")
    private String numriPersonal;
    @Column(name = "Numri_Telefonit")
    private String numriTelefonit;
    @Column(name = "Pagesa")
    private String pagesa;
    @Column(name = "ID_DataRegjistrimit")
    @Temporal(TemporalType.DATE)
    private Date iDDataRegjistrimit;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDKompanise")
    private Collection<Autobusettbl> autobusettblCollection;
    @JoinColumn(name = "ID_Puntori", referencedColumnName = "ID_Puntori")
    @ManyToOne
    private PuntoriKompanistbl iDPuntori;

    public Kompaniatbl() {
    }

    public Kompaniatbl(Integer iDKompanise) {
        this.iDKompanise = iDKompanise;
    }

    public Integer getIDKompanise() {
        return iDKompanise;
    }

    public void setIDKompanise(Integer iDKompanise) {
        this.iDKompanise = iDKompanise;
    }

    public String getEmriKompanise() {
        return emriKompanise;
    }

    public void setEmriKompanise(String emriKompanise) {
        this.emriKompanise = emriKompanise;
    }

    public String getNumriLicenses() {
        return numriLicenses;
    }

    public void setNumriLicenses(String numriLicenses) {
        this.numriLicenses = numriLicenses;
    }

    public String getEmriPronarit() {
        return emriPronarit;
    }

    public void setEmriPronarit(String emriPronarit) {
        this.emriPronarit = emriPronarit;
    }

    public String getMbiemriPronarit() {
        return mbiemriPronarit;
    }

    public void setMbiemriPronarit(String mbiemriPronarit) {
        this.mbiemriPronarit = mbiemriPronarit;
    }

    public Date getDataLindjes() {
        return dataLindjes;
    }

    public void setDataLindjes(Date dataLindjes) {
        this.dataLindjes = dataLindjes;
    }

    public String getVendbanimi() {
        return vendbanimi;
    }

    public void setVendbanimi(String vendbanimi) {
        this.vendbanimi = vendbanimi;
    }

    public String getNumriPersonal() {
        return numriPersonal;
    }

    public void setNumriPersonal(String numriPersonal) {
        this.numriPersonal = numriPersonal;
    }

    public String getNumriTelefonit() {
        return numriTelefonit;
    }

    public void setNumriTelefonit(String numriTelefonit) {
        this.numriTelefonit = numriTelefonit;
    }

    public String getPagesa() {
        return pagesa;
    }

    public void setPagesa(String pagesa) {
        this.pagesa = pagesa;
    }

    public Date getIDDataRegjistrimit() {
        return iDDataRegjistrimit;
    }

    public void setIDDataRegjistrimit(Date iDDataRegjistrimit) {
        this.iDDataRegjistrimit = iDDataRegjistrimit;
    }

    @XmlTransient
    public Collection<Autobusettbl> getAutobusettblCollection() {
        return autobusettblCollection;
    }

    public void setAutobusettblCollection(Collection<Autobusettbl> autobusettblCollection) {
        this.autobusettblCollection = autobusettblCollection;
    }

    public PuntoriKompanistbl getIDPuntori() {
        return iDPuntori;
    }

    public void setIDPuntori(PuntoriKompanistbl iDPuntori) {
        this.iDPuntori = iDPuntori;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDKompanise != null ? iDKompanise.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kompaniatbl)) {
            return false;
        }
        Kompaniatbl other = (Kompaniatbl) object;
        if ((this.iDKompanise == null && other.iDKompanise != null) || (this.iDKompanise != null && !this.iDKompanise.equals(other.iDKompanise))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.Kompaniatbl[ iDKompanise=" + iDKompanise + " ]";
    }
    
}
