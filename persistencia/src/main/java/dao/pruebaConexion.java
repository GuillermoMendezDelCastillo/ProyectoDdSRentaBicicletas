/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dao;

import entidades.Usuario;
import javax.persistence.EntityManager;

/**
 *
 * @author Gui26
 */
public class pruebaConexion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IConexion conexion = new Conexion();
        //conexion.crearConexion();
        
        Usuario test = new Usuario("Jesus", "jesus@gmail.com", "12345");
        
        IUsuarioDAO prueba = new UsuarioDAO();
        
        prueba.agregar(test);
        
    }
    
}
