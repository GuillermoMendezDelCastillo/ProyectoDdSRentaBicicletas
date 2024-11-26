/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexion.Conexion;
import entidades.Bicicleta;
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
public class BicicletaDAO implements IObjetoDAO<Bicicleta>{
    
    private EntityManager em;
    
    public BicicletaDAO() {
        this.em = Conexion.getEntityManager();
    }
    
    @Override
    public Bicicleta agregar(Bicicleta bicicleta){
       try {
            em.getTransaction().begin();
            em.persist(bicicleta);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        }
        return bicicleta;
    }
    
    @Override
    public Bicicleta buscarPorId(Long id){
        try {
            return em.find(Bicicleta.class, id);
        } catch (NoResultException e) {
            return null;
        }
    }
    
    @Override
    public Bicicleta actualizar(Bicicleta bicicleta){
         try {
            em.getTransaction().begin();
            em.merge(bicicleta);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        }
        return bicicleta;
    }
    
    public Bicicleta eliminar(Long id){
      try {
            Bicicleta bicicleta = em.find(Bicicleta.class, id);
            if (bicicleta != null) {
                em.getTransaction().begin();
                em.remove(bicicleta);
                em.getTransaction().commit();
            }
            return bicicleta;
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
            return null;
        }
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
        }
    }
    
}
