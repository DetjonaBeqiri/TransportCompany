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

public class KlientitblRepository extends EntMngClass implements KlientitblInterface {

    @Override
    public void creat(Klientitbl k) throws AdministrataFormException {
         try{
           em.getTransaction().begin();
           em.persist(k);
           em.getTransaction().commit();
       }catch(Exception e){
           throw new AdministrataFormException("Msg \n" + e.getMessage());
       }
    }

    @Override
    public void edit(Klientitbl k) throws AdministrataFormException {
        try{
            em.getTransaction().begin();
            em.merge(k);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new AdministrataFormException("Msg \n" + e.getMessage());
       }
    }
    
    @Override
    public void delete(Klientitbl k) throws AdministrataFormException {
          try{
            em.getTransaction().begin();
            em.remove(k);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new AdministrataFormException("Msg \n" + e.getMessage());
        }
    }
    
    @Override
    public List<Klientitbl> findAll() throws AdministrataFormException {
           try{
            return em.createNamedQuery("Klientitbl.findAll").getResultList();
        }catch(Exception e){
            throw new AdministrataFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public Klientitbl findByID(Integer ID) throws AdministrataFormException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
