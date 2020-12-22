/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Kompaniatbl;
import java.util.List;
import javax.persistence.Query;
import javax.swing.JOptionPane;

/**
 *
 * @author detjona
 */
public class KompaniaRepository  extends EntMngClass implements KompaniaInterface{

    @Override
    public void creat(Kompaniatbl k) throws KompaniaException {
       em.getTransaction().begin();
       em.persist(k);
       em.getTransaction().commit();
    }

    @Override
    public void edit(Kompaniatbl k) throws KompaniaException {
       em.getTransaction().begin();
       em.merge(k);
       em.getTransaction().commit();
    }

    @Override
    public void delete(Kompaniatbl k) throws KompaniaException {
       em.getTransaction().begin();
       em.remove(k);
       em.getTransaction().commit();
    }

    @Override
    public List<Kompaniatbl> findAll() throws KompaniaException {
         try{
            return em.createNamedQuery("Kompaniatbl.findAll").getResultList();
        }catch(Exception e){
            throw new KompaniaException("Msg \n" + e.getMessage());
        }
    }

    
    public Kompaniatbl findByID(String emri) throws KompaniaException {
         try{
            Query query = em.createQuery("Select k FROM Kompaniatbl k WHERE k.emriKompanise = :id");
            query.setParameter("id", emri);
           
            return (Kompaniatbl) query.getSingleResult();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
    
}
