/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entidades.Usuario;
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
public class UsuarioDAO implements IObjetoDAO<Usuario> {
   // private IConexion conexion;
    EntityManager em;
    public UsuarioDAO(EntityManager em) {
        this.em = em;
    }
    
    @Override
    public Usuario agregar(Usuario usuario){
       // EntityManager entityManager = conexion.getConexion();
        EntityTransaction transaction = null;

        try {
             
            em.getTransaction().begin();

            em.persist(usuario);
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

        return usuario;
    }
    
    @Override
    public Usuario buscar(Long id){
        try {
            Usuario u = em.find(Usuario.class, id);
            return u;
//            Query query = em.createQuery("SELECT u FROM Usuario u WHERE u.id = :id", Usuario.class);
//            query.setParameter("id", id);
//            return (Usuario) query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        } finally {
            if (em != null) {
                //em.close();
            }
        }
    }
    
    @Override
    public Usuario actualizar(Usuario usuario){
        EntityTransaction transaction = null;
        try {
            em.getTransaction().begin();
            em.merge(usuario);
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
        return usuario;
    }
    
    public Usuario eliminar(Long id){
        Usuario u = em.find(Usuario.class, id);
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
    public List<Usuario> lista(){
        try {
            
            CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
            CriteriaQuery<Usuario> criteriaQuery = criteriaBuilder.createQuery(Usuario.class);
            Root<Usuario> usuarioRoot = criteriaQuery.from(Usuario.class);
            criteriaQuery.select(usuarioRoot);
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
