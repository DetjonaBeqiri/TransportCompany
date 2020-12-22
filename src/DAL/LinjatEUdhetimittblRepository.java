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
import javax.persistence.Query;
import javax.swing.JOptionPane;

public class LinjatEUdhetimittblRepository extends EntMngClass implements LinjatEUdhetimittblInterface{

    @Override
    public void creat(LinjatEUdhetimittbl l) throws LinjatEUdhetimitException {
         try{
           em.getTransaction().begin();
           em.persist(l);
           em.getTransaction().commit();
       }catch(Exception e){
           throw new LinjatEUdhetimitException("Msg \n" + e.getMessage());
       }
    }

    @Override
    public void edit(LinjatEUdhetimittbl l) throws LinjatEUdhetimitException {
        try{
            em.getTransaction().begin();
            em.merge(l);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new LinjatEUdhetimitException("Msg \n" + e.getMessage());
       }
    }
    
    @Override
    public void delete(LinjatEUdhetimittbl l) throws LinjatEUdhetimitException {
          try{
            em.getTransaction().begin();
            em.remove(l);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new LinjatEUdhetimitException("Msg \n" + e.getMessage());
        }
    }
    
    @Override
    public List<LinjatEUdhetimittbl> findAll() throws LinjatEUdhetimitException {
        try{
            return em.createNamedQuery("LinjatEUdhetimittbl.findAll").getResultList();
        }catch(Exception e){
            throw new LinjatEUdhetimitException("Msg \n" + e.getMessage());
        }
    }
    

    @Override
    public LinjatEUdhetimittbl findByID(Integer ID) throws LinjatEUdhetimitException {
       try{
            return (LinjatEUdhetimittbl)em.createNamedQuery("LinjatEUdhetimittbl.findByIDLinjave").getSingleResult();
        }catch(Exception e){
            throw new LinjatEUdhetimitException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Autobusettbl> findAllAutobuset() throws AutobusiException {
       try{
            Query query = em.createQuery("SELECT a FROM Autobusettbl a");
//            query.setParameter("idK", id);
           
            return  query.getResultList();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
    
}
