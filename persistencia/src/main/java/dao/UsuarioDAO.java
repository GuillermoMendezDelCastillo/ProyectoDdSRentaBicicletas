/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entidades.Usuario;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author Gui26
 */
public class UsuarioDAO implements IUsuarioDAO{
    private IConexion conexion;
    
    public UsuarioDAO() {
        IConexion conexion = new Conexion();
        this.conexion = conexion;
    }
    
    @Override
    public Usuario agregar(Usuario usuario){
        EntityManager entityManager = conexion.getConexion();
        EntityTransaction transaction = null;

        try {
            transaction = entityManager.getTransaction();
            transaction.begin();

            entityManager.persist(usuario);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            entityManager.close();
        }

        return usuario;
    }
}
