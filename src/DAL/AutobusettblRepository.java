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
import java.util.logging.Level;
import java.util.logging.Logger;

public class AutobusettblRepository extends EntMngClass implements AutobusettblInterface {

    @Override
    public void creat(Autobusettbl a) throws AutobusiException {
         try{
           em.getTransaction().begin();
           em.persist(a);
           em.getTransaction().commit();
       }catch(Exception e){
           throw new AutobusiException("Msg \n" + e.getMessage());
       }
    }

    @Override
    public void edit(Autobusettbl a) throws AutobusiException {
        try{
            em.getTransaction().begin();
            em.merge(a);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new AutobusiException("Msg \n" + e.getMessage());
       }
    }

    @Override
    public void delete(Autobusettbl a) throws AutobusiException {
          try{
            em.getTransaction().begin();
            em.remove(a);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new AutobusiException("Msg \n" + e.getMessage());
        }
    }
    
    @Override
    public List<Autobusettbl> findAll() throws AutobusiException {
           try{
            return em.createNamedQuery("Autobusettbl.findAll").getResultList();
        }catch(Exception e){
            throw new AutobusiException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public Autobusettbl findByID(Integer ID) throws AutobusiException {
          try{
            return (Autobusettbl)em.createNamedQuery("Autobusettbl.findByIDAutobusi").getSingleResult();
        }catch(Exception e){
            throw new AutobusiException("Msg \n" + e.getMessage());
        }
    }
    
}
