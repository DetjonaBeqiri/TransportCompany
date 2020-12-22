/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.Serializable;
import java.util.Collection;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author detjona
 */
@Entity
@Table(name = "Autobuset_tbl")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Autobusettbl.findAll", query = "SELECT a FROM Autobusettbl a")
    , @NamedQuery(name = "Autobusettbl.findByIDAutobusi", query = "SELECT a FROM Autobusettbl a WHERE a.iDAutobusi = :iDAutobusi")
    , @NamedQuery(name = "Autobusettbl.findByEmriAutobusit", query = "SELECT a FROM Autobusettbl a WHERE a.emriAutobusit = :emriAutobusit")
    , @NamedQuery(name = "Autobusettbl.findByShoferi", query = "SELECT a FROM Autobusettbl a WHERE a.shoferi = :shoferi")
    , @NamedQuery(name = "Autobusettbl.findByKondukteri", query = "SELECT a FROM Autobusettbl a WHERE a.kondukteri = :kondukteri")})
public class Autobusettbl implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_Autobusi")
    @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator(name = "InvSeq",sequenceName = "INV_SEQ",allocationSize = 1)
    private Integer iDAutobusi;

    @Column(name = "Emri_Autobusit")
    private String emriAutobusit;
    @Column(name = "Shoferi")
    private String shoferi;
    @Column(name = "Kondukteri")
    private String kondukteri;
    @JoinColumn(name = "ID_Kompanise", referencedColumnName = "ID_Kompanise")
    @ManyToOne(optional = false)
    private Kompaniatbl iDKompanise;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDAutobusi")
    private Collection<LinjatEUdhetimittbl> linjatEUdhetimittblCollection;

    public Autobusettbl() {
    }

    public Autobusettbl(Integer iDAutobusi) {
        this.iDAutobusi = iDAutobusi;
    }

    public Integer getIDAutobusi() {
        return iDAutobusi;
    }

    public void setIDAutobusi(Integer iDAutobusi) {
        this.iDAutobusi = iDAutobusi;
    }

    public String getEmriAutobusit() {
        return emriAutobusit;
    }

    public void setEmriAutobusit(String emriAutobusit) {
        this.emriAutobusit = emriAutobusit;
    }

    public String getShoferi() {
        return shoferi;
    }

    public void setShoferi(String shoferi) {
        this.shoferi = shoferi;
    }

    public String getKondukteri() {
        return kondukteri;
    }

    public void setKondukteri(String kondukteri) {
        this.kondukteri = kondukteri;
    }

    public Kompaniatbl getIDKompanise() {
        return iDKompanise;
    }

    public void setIDKompanise(Kompaniatbl iDKompanise) {
        this.iDKompanise = iDKompanise;
    }

    @XmlTransient
    public Collection<LinjatEUdhetimittbl> getLinjatEUdhetimittblCollection() {
        return linjatEUdhetimittblCollection;
    }

    public void setLinjatEUdhetimittblCollection(Collection<LinjatEUdhetimittbl> linjatEUdhetimittblCollection) {
        this.linjatEUdhetimittblCollection = linjatEUdhetimittblCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDAutobusi != null ? iDAutobusi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Autobusettbl)) {
            return false;
        }
        Autobusettbl other = (Autobusettbl) object;
        if ((this.iDAutobusi == null && other.iDAutobusi != null) || (this.iDAutobusi != null && !this.iDAutobusi.equals(other.iDAutobusi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.Autobusettbl[ iDAutobusi=" + iDAutobusi + " ]";
    }
    
}
