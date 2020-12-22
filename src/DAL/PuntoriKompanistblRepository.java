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

public class PuntoriKompanistblRepository extends EntMngClass implements PuntoriKompanistblInterface{

    @Override
    public void creat(PuntoriKompanistbl p) throws PuntoriException {
         try{
           em.getTransaction().begin();
           em.persist(p);
           em.getTransaction().commit();
       }catch(Exception e){
           throw new PuntoriException("Msg \n" + e.getMessage());
       }
    }

    @Override
    public void edit(PuntoriKompanistbl p) throws PuntoriException {
        try{
            em.getTransaction().begin();
            em.merge(p);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new PuntoriException("Msg \n" + e.getMessage());
       }
    }
    
    @Override
    public void delete(PuntoriKompanistbl p) throws PuntoriException {
          try{
            em.getTransaction().begin();
            em.remove(p);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new PuntoriException("Msg \n" + e.getMessage());
        }
    }
    
    @Override
    public List<PuntoriKompanistbl> findAll() throws PuntoriException {
           try{
            return em.createNamedQuery("PuntoriKompanistbl.findAll").getResultList();
        }catch(Exception e){
            throw new PuntoriException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public PuntoriKompanistbl findByID(Integer ID) throws PuntoriException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
