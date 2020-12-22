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

public class StafiAdministratestblRepository extends EntMngClass implements StafiAdministratestblInterface{

    @Override
    public void creat(StafiAdministratestbl sa) throws AdministrataFormException {
         try{
           em.getTransaction().begin();
           em.persist(sa);
           em.getTransaction().commit();
       }catch(Exception e){
           throw new AdministrataFormException("Msg \n" + e.getMessage());
       }
    }
    
    @Override
    public void edit(StafiAdministratestbl sa) throws AdministrataFormException {
        try{
            em.getTransaction().begin();
            em.merge(sa);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new AdministrataFormException("Msg \n" + e.getMessage());
       }
    }
    
    @Override
    public void delete(StafiAdministratestbl sa) throws AdministrataFormException {
          try{
            em.getTransaction().begin();
            em.remove(sa);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new AdministrataFormException("Msg \n" + e.getMessage());
        }
    }
    
    @Override
    public List<StafiAdministratestbl> findAll() throws AdministrataFormException {
           try{
            return em.createNamedQuery("StafiAdministratestbl.findAll").getResultList();
        }catch(Exception e){
            throw new AdministrataFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public StafiAdministratestbl findByID(Integer ID) throws AdministrataFormException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
