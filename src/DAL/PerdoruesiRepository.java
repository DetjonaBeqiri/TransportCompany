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
import BLL.Perdoruesi;
import BLL.Roli;
import java.util.List;
import javax.persistence.Query;

public class PerdoruesiRepository extends EntMngClass implements PerdoruesiInterface {

    @Override
    public void create(Perdoruesi p) throws AdministrataFormException {
        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new AdministrataFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Perdoruesi p) throws AdministrataFormException {
        try {
            em.getTransaction().begin();
            em.merge(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new AdministrataFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Perdoruesi p) throws AdministrataFormException {
        try {
            em.getTransaction().begin();
            em.remove(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new AdministrataFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Perdoruesi> findAll() throws AdministrataFormException {
        try {
            return em.createNamedQuery("Perdoruesi.findAll").getResultList();
        } catch (Exception e) {
            throw new AdministrataFormException("Msg! \n" + e.getMessage());
        }
    }

    @Override
    public Perdoruesi findByID(Integer ID) throws AdministrataFormException {
        try {
            Query query = em.createQuery("SELECT p FROM Perdoruesi p WHERE p.id = :abc");
            query.setParameter("abc", ID);
            return (Perdoruesi) query.getSingleResult();
        } catch (Exception e) {
            throw new AdministrataFormException("Msg! \n" + e.getMessage());
        }
    }

    @Override
    public Perdoruesi loginByUsernameAndPassword(String u, String p) throws AdministrataFormException {
        try {
            Query query = em.createQuery("SELECT p FROM Perdoruesi p WHERE p.username = :us AND p.password=:psw");
            query.setParameter("us", u);
            query.setParameter("psw", p);
            return (Perdoruesi) query.getSingleResult();
        } catch (Exception e) {
            throw new AdministrataFormException("Msg! \n" + e.getMessage());
        }
    }
}