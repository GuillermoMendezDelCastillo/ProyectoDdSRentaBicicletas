/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexion.Conexion;
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
    private EntityManager em;

    public EmpleadoDAO() {
        this.em = Conexion.getEntityManager();
    }
    
    @Override
    public Empleado agregar(Empleado empleado){
      try {
            em.getTransaction().begin();
            em.persist(empleado);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        }
        return empleado;
    }
    
     @Override
    public Empleado buscarPorId(Long id) {
        try {
            return em.find(Empleado.class, id);
        } catch (NoResultException e) {
            return null;
        }
    }

    @Override
    public Empleado actualizar(Empleado empleado) {
        try {
            em.getTransaction().begin();
            em.merge(empleado);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        }
        return empleado;
    }

    public Empleado eliminar(Long id) {
        try {
            Empleado empleado = em.find(Empleado.class, id);
            if (empleado != null) {
                em.getTransaction().begin();
                em.remove(empleado);
                em.getTransaction().commit();
            }
            return empleado;
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Empleado> lista() {
        try {
            CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
            CriteriaQuery<Empleado> criteriaQuery = criteriaBuilder.createQuery(Empleado.class);
            Root<Empleado> empleadoRoot = criteriaQuery.from(Empleado.class);
            criteriaQuery.select(empleadoRoot);
            Query query = em.createQuery(criteriaQuery);
            return query.getResultList();
        } catch (NoResultException e) {
            return null;
        }
    }

    public Empleado iniciar(String correo, String contrasena) {
        try {
            Query query = em.createQuery("SELECT u FROM Empleado u WHERE "
                    + "u.correo = :correo AND "
                    + "u.contrasena = :contrasena", Empleado.class);
            query.setParameter("correo", correo);
            query.setParameter("contrasena", contrasena);
            return (Empleado) query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
    
}
