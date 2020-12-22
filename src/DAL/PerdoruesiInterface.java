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
import BLL.Perdoruesi;

public interface PerdoruesiInterface {
    void create(Perdoruesi p) throws AdministrataFormException;
    void edit(Perdoruesi p) throws AdministrataFormException;
    void delete(Perdoruesi p) throws AdministrataFormException;
    List<Perdoruesi> findAll() throws AdministrataFormException;
    Perdoruesi findByID(Integer ID) throws AdministrataFormException;
    Perdoruesi loginByUsernameAndPassword(String u, String p) throws AdministrataFormException;
    
}
