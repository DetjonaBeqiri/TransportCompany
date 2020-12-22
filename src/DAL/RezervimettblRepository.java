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

public class RezervimettblRepository extends EntMngClass implements RezervimettblInterface{

    @Override
    public void creat(Rezervimettbl r) throws AdministrataFormException {
         try{
           em.getTransaction().begin();
           em.persist(r);
           em.getTransaction().commit();
       }catch(Exception e){
           throw new AdministrataFormException("Msg \n" + e.getMessage());
       }
    }
    
    @Override
    public void edit(Rezervimettbl r) throws AdministrataFormException {
        try{
            em.getTransaction().begin();
            em.merge(r);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new AdministrataFormException("Msg \n" + e.getMessage());
       }
    }
    
    @Override
    public void delete(Rezervimettbl r) throws AdministrataFormException {
          try{
            em.getTransaction().begin();
            em.remove(r);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new AdministrataFormException("Msg \n" + e.getMessage());
        }
    }
    
    @Override
    public List<Rezervimettbl> findAll() throws AdministrataFormException {
           try{
            return em.createNamedQuery("Rezervimettbl.findAll").getResultList();
        }catch(Exception e){
            throw new AdministrataFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public Rezervimettbl findByID(Integer ID) throws AdministrataFormException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
