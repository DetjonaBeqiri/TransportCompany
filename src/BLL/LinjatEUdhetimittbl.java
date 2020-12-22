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
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author detjona
 */
@Entity
@Table(name = "LinjatEUdhetimit_tbl")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LinjatEUdhetimittbl.findAll", query = "SELECT l FROM LinjatEUdhetimittbl l")
    , @NamedQuery(name = "LinjatEUdhetimittbl.findByIDLinjave", query = "SELECT l FROM LinjatEUdhetimittbl l WHERE l.iDLinjave = :iDLinjave")
    , @NamedQuery(name = "LinjatEUdhetimittbl.findByDita", query = "SELECT l FROM LinjatEUdhetimittbl l WHERE l.dita = :dita")
    , @NamedQuery(name = "LinjatEUdhetimittbl.findByKoha", query = "SELECT l FROM LinjatEUdhetimittbl l WHERE l.koha = :koha")
    , @NamedQuery(name = "LinjatEUdhetimittbl.findByVendiNisjes", query = "SELECT l FROM LinjatEUdhetimittbl l WHERE l.vendiNisjes = :vendiNisjes")
    , @NamedQuery(name = "LinjatEUdhetimittbl.findByDestinacioni", query = "SELECT l FROM LinjatEUdhetimittbl l WHERE l.destinacioni = :destinacioni")})
public class LinjatEUdhetimittbl implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_Linjave")
    @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator(name = "InvSeq",sequenceName = "INV_SEQ",allocationSize = 1)
    private Integer iDLinjave;
    
    @Column(name = "Dita")
    private String dita;
    @Column(name = "Koha")
    private String koha;
    @Column(name = "Vendi_Nisjes")
    private String vendiNisjes;
    @Column(name = "Destinacioni")
    private String destinacioni;
    @JoinColumn(name = "ID_Autobusi", referencedColumnName = "ID_Autobusi")
    @ManyToOne(optional = false)
    private Autobusettbl iDAutobusi;

    public LinjatEUdhetimittbl() {
    }

    public LinjatEUdhetimittbl(Integer iDLinjave) {
        this.iDLinjave = iDLinjave;
    }

    public Integer getIDLinjave() {
        return iDLinjave;
    }

    public void setIDLinjave(Integer iDLinjave) {
        this.iDLinjave = iDLinjave;
    }

    public String getDita() {
        return dita;
    }

    public void setDita(String dita) {
        this.dita = dita;
    }

    public String getKoha() {
        return koha;
    }

    public void setKoha(String koha) {
        this.koha = koha;
    }

    public String getVendiNisjes() {
        return vendiNisjes;
    }

    public void setVendiNisjes(String vendiNisjes) {
        this.vendiNisjes = vendiNisjes;
    }

    public String getDestinacioni() {
        return destinacioni;
    }

    public void setDestinacioni(String destinacioni) {
        this.destinacioni = destinacioni;
    }

    public Autobusettbl getIDAutobusi() {
        return iDAutobusi;
    }

    public void setIDAutobusi(Autobusettbl iDAutobusi) {
        this.iDAutobusi = iDAutobusi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDLinjave != null ? iDLinjave.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LinjatEUdhetimittbl)) {
            return false;
        }
        LinjatEUdhetimittbl other = (LinjatEUdhetimittbl) object;
        if ((this.iDLinjave == null && other.iDLinjave != null) || (this.iDLinjave != null && !this.iDLinjave.equals(other.iDLinjave))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.LinjatEUdhetimittbl[ iDLinjave=" + iDLinjave + " ]";
    }
    
}
