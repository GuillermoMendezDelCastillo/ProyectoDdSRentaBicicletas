/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
/**
 *
 * @author Gui26
 */
public class Conexion implements IConexion{

    private EntityManager conexion;
    
    public Conexion() {
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("renta_bicicletas");
        this.conexion = emFactory.createEntityManager();
    }
    
    
    
    /*
    @Override
    public EntityManager crearConexion(){
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("renta_bicicletas");
        EntityManager entityManager = emFactory.createEntityManager();
        
        return entityManager;
    }
    */

    public EntityManager getConexion() {
        return conexion;
    }
    
}
