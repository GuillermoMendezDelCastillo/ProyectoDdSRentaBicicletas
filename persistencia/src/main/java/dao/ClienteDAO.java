/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexion.Conexion;
import entidades.Cliente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Gui26
 */
public class ClienteDAO implements IObjetoDAO<Cliente>{

    private EntityManager em;
    
    public ClienteDAO() {
        this.em = Conexion.getEntityManager();
    }
    
    @Override
    public Cliente agregar(Cliente cliente){
       try {
            em.getTransaction().begin();
            em.persist(cliente);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        }
        return cliente;
    }
    
    @Override
    public Cliente buscarPorId(Long id){
        try {
            return em.find(Cliente.class, id);
        } catch (NoResultException e) {
            return null;
        }
    }
    
    @Override
    public Cliente actualizar(Cliente cliente){
        try {
            em.getTransaction().begin();
            em.merge(cliente);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        }
        return cliente;
    }
    
    public Cliente eliminar(Long id){
        try {
            Cliente cliente = em.find(Cliente.class, id);
            if (cliente != null) {
                em.getTransaction().begin();
                em.remove(cliente);
                em.getTransaction().commit();
            }
            return cliente;
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
            return null;
        }
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
        }
    }
    
    public Cliente buscar(String correo, String contrasena){
        try {
            Query query = em.createQuery("SELECT u FROM Cliente u WHERE "
                    + "u.correo = :correo AND "
                    + "u.contrasena = :contrasena", Cliente.class);
            query.setParameter("correo", correo);
            query.setParameter("contrasena", contrasena);
            return (Cliente) query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
    
}
