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
import BLL.Autobusettbl;
import BLL.Kompaniatbl;
import java.util.List;
import BLL.LinjatEUdhetimittbl;

public interface LinjatEUdhetimittblInterface {
    void creat(LinjatEUdhetimittbl l) throws LinjatEUdhetimitException;
    void edit(LinjatEUdhetimittbl l) throws LinjatEUdhetimitException;
    void delete(LinjatEUdhetimittbl l) throws LinjatEUdhetimitException;
    List <LinjatEUdhetimittbl> findAll() throws LinjatEUdhetimitException;
    List <Autobusettbl> findAllAutobuset() throws AutobusiException;
    LinjatEUdhetimittbl findByID(Integer ID) throws LinjatEUdhetimitException;
    
}
