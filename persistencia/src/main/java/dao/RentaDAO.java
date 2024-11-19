/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entidades.Renta;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Gui26
 */
public class RentaDAO implements IObjetoDAO<Renta>{

    EntityManager em;
    
    public RentaDAO() {
        this.em = Persistence.createEntityManagerFactory("renta_bicicletas").createEntityManager();
    }
    
    @Override
    public Renta agregar(Renta renta){
       // EntityManager entityManager = conexion.getConexion();
        EntityTransaction transaction = null;

        try {
             
            em.getTransaction().begin();

            em.persist(renta);
            em.getTransaction()
                    .commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
        }

        return renta;
    }
    
    @Override
    public Renta buscarPorId(Long id){
        try {
            Renta u = em.find(Renta.class, id);
            return u;
//            Query query = em.createQuery("SELECT u FROM Renta u WHERE u.id = :id", Renta.class);
//            query.setParameter("id", id);
//            return (Renta) query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    @Override
    public Renta actualizar(Renta renta){
        EntityTransaction transaction = null;
        try {
            em.getTransaction().begin();
            em.merge(renta);
            em.getTransaction()
                    .commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
        }
        return renta;
    }
    
    public Renta eliminar(Long id){
        Renta u = em.find(Renta.class, id);
        EntityTransaction transaction = null;
        try {
            em.getTransaction().begin();
            em.remove(u);
            em.getTransaction()
                    .commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
        }
        return u;
    }
    
    @Override
    public List<Renta> lista(){
        try {
            
            CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
            CriteriaQuery<Renta> criteriaQuery = criteriaBuilder.createQuery(Renta.class);
            Root<Renta> rentaRoot = criteriaQuery.from(Renta.class);
            criteriaQuery.select(rentaRoot);
            Query query = em.createQuery(criteriaQuery);
            return query.getResultList();
            
        } catch (NoResultException e) {
            return null;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
}
