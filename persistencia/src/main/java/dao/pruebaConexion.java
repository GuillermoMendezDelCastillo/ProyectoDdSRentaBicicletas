/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dao;

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
        EntityManager em = Persistence.createEntityManagerFactory("renta_bicicletas").createEntityManager();
        
//        System.out.println(em.contains(new Empleado("ricardo@gmail.com", "12345")));
        
        Empleado test = new Empleado((long) 1, "Ricardo", "ricardo@gmail.com", "12345");
        
        EmpleadoDAO prueba = new EmpleadoDAO();
        //System.out.println(prueba.iniciar("ricardo@gmail.com", "12345"));
        prueba.agregar(test);
        //System.out.println(prueba.iniciar("ricardo@gmail.com", "12345"));
        
//        System.out.println(em.contains(new Empleado("ricardo@gmail.com", "12345")));

//        Usuario test = new Usuario((long) 1, "Ricardo", "ricardo@gmail.com", "12345");
//
//        Usuario test2 = new Usuario("Alberto", "alberto@gmail.com", "12345");
//        
//        IObjetoDAO<Usuario> prueba = new UsuarioDAO(em);
//        Usuario u = prueba.agregar(test2);
//        
////        
//        List<Usuario> lista = prueba.lista();
//        System.out.println("4 "+lista);
//        
//        u = prueba.actualizar(test);
//        System.out.println("1 "+u);
//        
//        lista = prueba.lista();
//        System.out.println("4 "+lista);
//        
//        u = prueba.buscar((long)1);
//        System.out.println("2 "+u);
//        
//        lista = prueba.lista();
//        System.out.println("4 "+lista);
//        
//        u = prueba.eliminar((long)1);
//        System.out.println("3 "+u);
//
//        lista = prueba.lista();
//        System.out.println("4 "+lista);
        
        em.close();
    }

}
