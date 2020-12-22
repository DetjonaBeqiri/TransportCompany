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
import BLL.Rezervimettbl;

public interface RezervimettblInterface {
    void creat(Rezervimettbl r) throws AdministrataFormException;
    void edit(Rezervimettbl r) throws AdministrataFormException;
    void delete(Rezervimettbl r) throws AdministrataFormException;
    List <Rezervimettbl> findAll() throws AdministrataFormException;
    Rezervimettbl findByID(Integer ID) throws AdministrataFormException;
    
}
