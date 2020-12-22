/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

/**
 *
 * @author detjona
 */

import java.util.List;
import BLL.AdministrataTransportit;

public interface AdministrataTransportitInterface {
    void creat(AdministrataTransportit at) throws AdministrataFormException;
    void edit(AdministrataTransportit at) throws AdministrataFormException;
    void delete(AdministrataTransportit at) throws AdministrataFormException;
    List <AdministrataTransportit> findAll() throws AdministrataFormException;
    AdministrataTransportit findByID(Integer ID) throws AdministrataFormException;
}
