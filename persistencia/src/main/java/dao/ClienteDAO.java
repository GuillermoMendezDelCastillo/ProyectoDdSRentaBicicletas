/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entidades.Cliente;
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
public class ClienteDAO implements ICRUD<Cliente>{
   // private IConexion conexion;
    EntityManager em;
    public ClienteDAO(EntityManager em) {
        this.em = em;
    }
    
    @Override
    public Cliente agregar(Cliente cliente){
       // EntityManager entityManager = conexion.getConexion();
        EntityTransaction transaction = null;

        try {
             
            em.getTransaction().begin();

            em.persist(cliente);
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

        return cliente;
    }
    
    @Override
    public Cliente buscar(Long id){
        try {
            Cliente u = em.find(Cliente.class, id);
            return u;
//            Query query = em.createQuery("SELECT u FROM Cliente u WHERE u.id = :id", Cliente.class);
//            query.setParameter("id", id);
//            return (Cliente) query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        } finally {
            if (em != null) {
                //em.close();
            }
        }
    }
    
    @Override
    public Cliente actualizar(Cliente cliente){
        EntityTransaction transaction = null;
        try {
            em.getTransaction().begin();
            em.merge(cliente);
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
        return cliente;
    }
    
    public Cliente eliminar(Long id){
        Cliente u = em.find(Cliente.class, id);
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
    public List<Cliente> lista(){
        try {
            
            CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
            CriteriaQuery<Cliente> criteriaQuery = criteriaBuilder.createQuery(Cliente.class);
            Root<Cliente> clienteRoot = criteriaQuery.from(Cliente.class);
            criteriaQuery.select(clienteRoot);
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