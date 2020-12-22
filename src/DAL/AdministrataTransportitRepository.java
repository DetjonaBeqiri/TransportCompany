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
import BLL.AdministrataTransportit;

public class AdministrataTransportitRepository extends EntMngClass implements AdministrataTransportitInterface{

    @Override
    public void creat(AdministrataTransportit at) throws AdministrataFormException {
         try{
           em.getTransaction().begin();
           em.persist(at);
           em.getTransaction().commit();
       }catch(Exception e){
           throw new AdministrataFormException("Msg \n" + e.getMessage());
       }
    }

    @Override
    public void edit(AdministrataTransportit at) throws AdministrataFormException {
         try{
            em.getTransaction().begin();
            em.merge(at);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new AdministrataFormException("Msg \n" + e.getMessage());
       }
    }

    @Override
    public void delete(AdministrataTransportit at) throws AdministrataFormException {
          try{
            em.getTransaction().begin();
            em.remove(at);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new AdministrataFormException("Msg \n" + e.getMessage());
        }
    }
    @Override
    public List<AdministrataTransportit> findAll() throws AdministrataFormException {
           try{
            return em.createNamedQuery("AdministrataTransportit.findAll").getResultList();
        }catch(Exception e){
            throw new AdministrataFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public AdministrataTransportit findByID(Integer ID) throws AdministrataFormException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
