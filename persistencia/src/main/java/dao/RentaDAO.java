/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexion.Conexion;
import entidades.Renta;
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
public class RentaDAO implements IObjetoDAO<Renta>{

    private EntityManager em;

    public RentaDAO() {
        this.em = Conexion.getEntityManager();
    }
    
    @Override
    public Renta agregar(Renta renta) {
        try {
            em.getTransaction().begin();
            em.persist(renta);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        }
        return renta;
    }

    @Override
    public Renta buscarPorId(Long id) {
        try {
            return em.find(Renta.class, id);
        } catch (NoResultException e) {
            return null;
        }
    }

    @Override
    public Renta actualizar(Renta renta) {
        try {
            em.getTransaction().begin();
            em.merge(renta);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        }
        return renta;
    }

    public Renta eliminar(Long id) {
        try {
            Renta renta = em.find(Renta.class, id);
            if (renta != null) {
                em.getTransaction().begin();
                em.remove(renta);
                em.getTransaction().commit();
            }
            return renta;
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Renta> lista() {
        try {
            CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
            CriteriaQuery<Renta> criteriaQuery = criteriaBuilder.createQuery(Renta.class);
            Root<Renta> rentaRoot = criteriaQuery.from(Renta.class);
            criteriaQuery.select(rentaRoot);
            Query query = em.createQuery(criteriaQuery);
            return query.getResultList();
        } catch (NoResultException e) {
            return null;
        }
    }
    
}
