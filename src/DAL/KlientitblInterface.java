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
import BLL.Klientitbl;

public interface KlientitblInterface {
    void creat(Klientitbl k) throws AdministrataFormException;
    void edit(Klientitbl k) throws AdministrataFormException;
    void delete(Klientitbl k) throws AdministrataFormException;
    List <Klientitbl> findAll() throws AdministrataFormException;
    Klientitbl findByID(Integer ID) throws AdministrataFormException;
    
    
}
