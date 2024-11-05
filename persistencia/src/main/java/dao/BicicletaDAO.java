/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entidades.Bicicleta;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Gui26
 */
public class BicicletaDAO implements IBicicletaDAO{
   // private IConexion conexion;
    EntityManager em;
    public BicicletaDAO(EntityManager em) {
        this.em = em;
    }
    
    @Override
    public Bicicleta agregar(Bicicleta bicicleta){
       // EntityManager entityManager = conexion.getConexion();
        EntityTransaction transaction = null;

        try {
             
            em.getTransaction().begin();

            em.persist(bicicleta);
            em.getTransaction()
                    .commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            //em.close();
        }

        return bicicleta;
    }
    
    @Override
    public Bicicleta buscar(Long id){
        try {
            Bicicleta u = em.find(Bicicleta.class, id);
            return u;
//            Query query = em.createQuery("SELECT u FROM Bicicleta u WHERE u.id = :id", Bicicleta.class);
//            query.setParameter("id", id);
//            return (Bicicleta) query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        } finally {
            if (em != null) {
                //em.close();
            }
        }
    }
    
    @Override
    public Bicicleta actualizar(Bicicleta bicicleta){
        EntityTransaction transaction = null;
        try {
            em.getTransaction().begin();
            em.merge(bicicleta);
            em.getTransaction()
                    .commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            //em.close();
        }
        return bicicleta;
    }
    
    public Bicicleta eliminar(Long id){
        Bicicleta u = em.find(Bicicleta.class, id);
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
            //em.close();
        }
        return u;
    }
    
    @Override
    public List<Bicicleta> lista(){
        try {
            
            CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
            CriteriaQuery<Bicicleta> criteriaQuery = criteriaBuilder.createQuery(Bicicleta.class);
            Root<Bicicleta> bicicletaRoot = criteriaQuery.from(Bicicleta.class);
            criteriaQuery.select(bicicletaRoot);
            Query query = em.createQuery(criteriaQuery);
            return query.getResultList();
            
        } catch (NoResultException e) {
            return null;
        } finally {
            if (em != null) {
                //em.close();
            }
        }
    }
    
}
