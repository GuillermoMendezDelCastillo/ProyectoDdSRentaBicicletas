/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dao;

import entidades.Bicicleta;
import entidades.Empleado;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author Gui26
 */
public class pruebaConexion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EntityManager em = Persistence.createEntityManagerFactory("renta_bicicletas").createEntityManager();
        
//        Bicicleta test = new Bicicleta("29","Montaña", "Disponible", (float) 7000);
//        BicicletaDAO prueba = new BicicletaDAO();
//        prueba.agregar(test);
        
        BicicletaDAO prueba = new BicicletaDAO();
        System.out.println(prueba.lista());

//        Empleado test = new Empleado((long) 1, "Ricardo", "ricardo@gmail.com", "12345");
//        EmpleadoDAO prueba = new EmpleadoDAO();
//        prueba.agregar(test);
        
        //em.close();
    }

}
