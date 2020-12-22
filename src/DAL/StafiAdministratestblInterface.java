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
import BLL.StafiAdministratestbl;

public interface StafiAdministratestblInterface {
    void creat(StafiAdministratestbl sa) throws AdministrataFormException;
    void edit(StafiAdministratestbl sa) throws AdministrataFormException;
    void delete(StafiAdministratestbl sa) throws AdministrataFormException;
    List <StafiAdministratestbl> findAll() throws AdministrataFormException;
    StafiAdministratestbl findByID(Integer ID) throws AdministrataFormException;
    
}
