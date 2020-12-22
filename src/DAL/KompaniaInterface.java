/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Kompaniatbl;
import java.util.List;

/**
 *
 * @author detjona
 */
public interface KompaniaInterface {

    void creat(Kompaniatbl k) throws KompaniaException;
    void edit(Kompaniatbl k) throws KompaniaException;
    void delete(Kompaniatbl k) throws KompaniaException;
    List <Kompaniatbl> findAll() throws KompaniaException;
    Kompaniatbl findByID(String ID) throws KompaniaException;
    
    

}
