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
import BLL.PuntoriKompanistbl;

public interface PuntoriKompanistblInterface {
    void creat(PuntoriKompanistbl p) throws PuntoriException;
    void edit(PuntoriKompanistbl p) throws PuntoriException;
    void delete(PuntoriKompanistbl p) throws PuntoriException;
    List <PuntoriKompanistbl> findAll() throws PuntoriException;
    PuntoriKompanistbl findByID(Integer ID) throws PuntoriException;
}
