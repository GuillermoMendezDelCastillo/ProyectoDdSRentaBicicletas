/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entidades.Empleado;
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
public class EmpleadoDAO implements IObjetoDAO<Empleado>{
   // private IConexion conexion;
    EntityManager em;
//    public EmpleadoDAO(EntityManager em) {
//        this.em = em;
//    }

    public EmpleadoDAO() {
        this.em = Persistence.createEntityManagerFactory("renta_bicicletas").createEntityManager();
    }
    
    @Override
    public Empleado agregar(Empleado empleado){
       // EntityManager entityManager = conexion.getConexion();
        EntityTransaction transaction = null;

        try {
             
            em.getTransaction().begin();

            em.persist(empleado);
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

        return empleado;
    }
    
    @Override
    public Empleado buscar(Long id){
        try {
            Empleado u = em.find(Empleado.class, id);
            return u;
//            Query query = em.createQuery("SELECT u FROM Empleado u WHERE u.id = :id", Empleado.class);
//            query.setParameter("id", id);
//            return (Empleado) query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    @Override
    public Empleado actualizar(Empleado empleado){
        EntityTransaction transaction = null;
        try {
            em.getTransaction().begin();
            em.merge(empleado);
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
        return empleado;
    }
    
    public Empleado eliminar(Long id){
        Empleado u = em.find(Empleado.class, id);
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
    public List<Empleado> lista(){
        try {
            
            CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
            CriteriaQuery<Empleado> criteriaQuery = criteriaBuilder.createQuery(Empleado.class);
            Root<Empleado> empleadoRoot = criteriaQuery.from(Empleado.class);
            criteriaQuery.select(empleadoRoot);
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
    
    public Empleado iniciar(String correo, String contrasena){
        try {
//            Empleado u = em.contains(new Empleado(correo, contrasena));
//            Empleado u = em.find(Empleado.class, correo);
            Query query = em.createQuery("SELECT e FROM Usuario e WHERE "
                    + "e.correo = :correo AND "
                    + "e.contrasena = :contrasena", Empleado.class);
            query.setParameter("correo", correo);
            query.setParameter("contrasena", contrasena);
            return (Empleado) query.getSingleResult();
        } catch (NoResultException e) {
            return null; // No se encontró ningún cliente con el apodo y contraseña dada
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
}
