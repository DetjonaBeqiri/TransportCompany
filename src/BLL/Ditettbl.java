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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author detjona
 */
@Entity
@Table(name = "Ditet_tbl")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ditettbl.findAll", query = "SELECT d FROM Ditettbl d")
    , @NamedQuery(name = "Ditettbl.findByIDdites", query = "SELECT d FROM Ditettbl d WHERE d.iDdites = :iDdites")
    , @NamedQuery(name = "Ditettbl.findByDita", query = "SELECT d FROM Ditettbl d WHERE d.dita = :dita")
    , @NamedQuery(name = "Ditettbl.findByIDLinjes", query = "SELECT d FROM Ditettbl d WHERE d.iDLinjes = :iDLinjes")})
public class Ditettbl implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_dites")
    private Integer iDdites;
    @Column(name = "dita")
    private String dita;
    @Column(name = "ID_Linjes")
    private Integer iDLinjes;

    public Ditettbl() {
    }

    public Ditettbl(Integer iDdites) {
        this.iDdites = iDdites;
    }

    public Integer getIDdites() {
        return iDdites;
    }

    public void setIDdites(Integer iDdites) {
        this.iDdites = iDdites;
    }

    public String getDita() {
        return dita;
    }

    public void setDita(String dita) {
        this.dita = dita;
    }

    public Integer getIDLinjes() {
        return iDLinjes;
    }

    public void setIDLinjes(Integer iDLinjes) {
        this.iDLinjes = iDLinjes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDdites != null ? iDdites.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ditettbl)) {
            return false;
        }
        Ditettbl other = (Ditettbl) object;
        if ((this.iDdites == null && other.iDdites != null) || (this.iDdites != null && !this.iDdites.equals(other.iDdites))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.Ditettbl[ iDdites=" + iDdites + " ]";
    }
    
}
