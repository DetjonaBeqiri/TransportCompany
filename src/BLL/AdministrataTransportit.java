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
@Table(name = "AdministrataTransportit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AdministrataTransportit.findAll", query = "SELECT a FROM AdministrataTransportit a")
    , @NamedQuery(name = "AdministrataTransportit.findByEmriadministrates", query = "SELECT a FROM AdministrataTransportit a WHERE a.emriadministrates = :emriadministrates")
    , @NamedQuery(name = "AdministrataTransportit.findByNrpunonjesve", query = "SELECT a FROM AdministrataTransportit a WHERE a.nrpunonjesve = :nrpunonjesve")
    , @NamedQuery(name = "AdministrataTransportit.findByIDAdministrates", query = "SELECT a FROM AdministrataTransportit a WHERE a.iDAdministrates = :iDAdministrates")})
public class AdministrataTransportit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "Emri_administrates")
    private String emriadministrates;
    @Column(name = "Nr_punonjesve")
    private Integer nrpunonjesve;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_Administrates")
    private Integer iDAdministrates;

    public AdministrataTransportit() {
    }

    public AdministrataTransportit(Integer iDAdministrates) {
        this.iDAdministrates = iDAdministrates;
    }

    public String getEmriadministrates() {
        return emriadministrates;
    }

    public void setEmriadministrates(String emriadministrates) {
        this.emriadministrates = emriadministrates;
    }

    public Integer getNrpunonjesve() {
        return nrpunonjesve;
    }

    public void setNrpunonjesve(Integer nrpunonjesve) {
        this.nrpunonjesve = nrpunonjesve;
    }

    public Integer getIDAdministrates() {
        return iDAdministrates;
    }

    public void setIDAdministrates(Integer iDAdministrates) {
        this.iDAdministrates = iDAdministrates;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDAdministrates != null ? iDAdministrates.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AdministrataTransportit)) {
            return false;
        }
        AdministrataTransportit other = (AdministrataTransportit) object;
        if ((this.iDAdministrates == null && other.iDAdministrates != null) || (this.iDAdministrates != null && !this.iDAdministrates.equals(other.iDAdministrates))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.AdministrataTransportit[ iDAdministrates=" + iDAdministrates + " ]";
    }
    
}
