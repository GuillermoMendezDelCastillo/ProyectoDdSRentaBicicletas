/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author PC Gamer
 */
public class Conexion {
    private static EntityManagerFactory emf;

    private Conexion() {
    }

    public static EntityManager getEntityManager() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("renta_bicicletas");
        }
        return emf.createEntityManager();
    }

    public static void cerrar() {
        if (emf != null) {
            emf.close();
            emf = null;
        }
    }
}