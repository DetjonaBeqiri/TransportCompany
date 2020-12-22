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
import BLL.Autobusettbl; 

public interface AutobusettblInterface {
    void creat(Autobusettbl a) throws AutobusiException;
    void edit(Autobusettbl a) throws AutobusiException;
    void delete(Autobusettbl a) throws AutobusiException;
    List <Autobusettbl> findAll() throws AutobusiException;
    Autobusettbl findByID(Integer ID) throws AutobusiException;
    
}
