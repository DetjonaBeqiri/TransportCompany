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
@Table(name = "StafiAdministrates_tbl")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StafiAdministratestbl.findAll", query = "SELECT s FROM StafiAdministratestbl s")
    , @NamedQuery(name = "StafiAdministratestbl.findByIDPunonjesit", query = "SELECT s FROM StafiAdministratestbl s WHERE s.iDPunonjesit = :iDPunonjesit")
    , @NamedQuery(name = "StafiAdministratestbl.findByEmri", query = "SELECT s FROM StafiAdministratestbl s WHERE s.emri = :emri")
    , @NamedQuery(name = "StafiAdministratestbl.findByMbiemri", query = "SELECT s FROM StafiAdministratestbl s WHERE s.mbiemri = :mbiemri")
    , @NamedQuery(name = "StafiAdministratestbl.findByDataLindjes", query = "SELECT s FROM StafiAdministratestbl s WHERE s.dataLindjes = :dataLindjes")
    , @NamedQuery(name = "StafiAdministratestbl.findByDataFillimit", query = "SELECT s FROM StafiAdministratestbl s WHERE s.dataFillimit = :dataFillimit")
    , @NamedQuery(name = "StafiAdministratestbl.findByPagesaMujore", query = "SELECT s FROM StafiAdministratestbl s WHERE s.pagesaMujore = :pagesaMujore")
    , @NamedQuery(name = "StafiAdministratestbl.findByPozita", query = "SELECT s FROM StafiAdministratestbl s WHERE s.pozita = :pozita")
    , @NamedQuery(name = "StafiAdministratestbl.findByIDRegjistrimit", query = "SELECT s FROM StafiAdministratestbl s WHERE s.iDRegjistrimit = :iDRegjistrimit")
    , @NamedQuery(name = "StafiAdministratestbl.findByIDPuntorit", query = "SELECT s FROM StafiAdministratestbl s WHERE s.iDPuntorit = :iDPuntorit")})
public class StafiAdministratestbl implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_Punonjesit")
    private Integer iDPunonjesit;
    @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator(name = "InvSeq",sequenceName = "INV_SEQ",allocationSize = 1)
    @Column(name = "Emri")
    private String emri;
    @Column(name = "Mbiemri")
    private String mbiemri;
    @Column(name = "DataLindjes")
    private String dataLindjes;
    @Column(name = "DataFillimit")
    private String dataFillimit;
    @Column(name = "PagesaMujore")
    private Integer pagesaMujore;
    @Column(name = "Pozita")
    private String pozita;
    @Basic(optional = false)
    @Column(name = "ID_Regjistrimit")
    private int iDRegjistrimit;
    @Basic(optional = false)
    @Column(name = "ID_Puntorit")
    private int iDPuntorit;

    public StafiAdministratestbl() {
    }

    public StafiAdministratestbl(Integer iDPunonjesit) {
        this.iDPunonjesit = iDPunonjesit;
    }

    public StafiAdministratestbl(Integer iDPunonjesit, int iDRegjistrimit, int iDPuntorit) {
        this.iDPunonjesit = iDPunonjesit;
        this.iDRegjistrimit = iDRegjistrimit;
        this.iDPuntorit = iDPuntorit;
    }

    public Integer getIDPunonjesit() {
        return iDPunonjesit;
    }

    public void setIDPunonjesit(Integer iDPunonjesit) {
        this.iDPunonjesit = iDPunonjesit;
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

    public String getDataLindjes() {
        return dataLindjes;
    }

    public void setDataLindjes(String dataLindjes) {
        this.dataLindjes = dataLindjes;
    }

    public String getDataFillimit() {
        return dataFillimit;
    }

    public void setDataFillimit(String dataFillimit) {
        this.dataFillimit = dataFillimit;
    }

    public Integer getPagesaMujore() {
        return pagesaMujore;
    }

    public void setPagesaMujore(Integer pagesaMujore) {
        this.pagesaMujore = pagesaMujore;
    }

    public String getPozita() {
        return pozita;
    }

    public void setPozita(String pozita) {
        this.pozita = pozita;
    }

    public int getIDRegjistrimit() {
        return iDRegjistrimit;
    }

    public void setIDRegjistrimit(int iDRegjistrimit) {
        this.iDRegjistrimit = iDRegjistrimit;
    }

    public int getIDPuntorit() {
        return iDPuntorit;
    }

    public void setIDPuntorit(int iDPuntorit) {
        this.iDPuntorit = iDPuntorit;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDPunonjesit != null ? iDPunonjesit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StafiAdministratestbl)) {
            return false;
        }
        StafiAdministratestbl other = (StafiAdministratestbl) object;
        if ((this.iDPunonjesit == null && other.iDPunonjesit != null) || (this.iDPunonjesit != null && !this.iDPunonjesit.equals(other.iDPunonjesit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.StafiAdministratestbl[ iDPunonjesit=" + iDPunonjesit + " ]";
    }
    
}
