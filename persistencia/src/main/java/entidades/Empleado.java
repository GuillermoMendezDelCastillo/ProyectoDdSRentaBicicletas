/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Gui26
 */
@Entity
public class Empleado extends Usuario implements Serializable {

    public Empleado() {
    }

    public Empleado(Long id, String nombre, String correo) {
        super(id, nombre, correo);
    }

    public Empleado(String correo, String contrasena) {
        super(correo, contrasena);
    }
    
    public Empleado(String nombre, String correo, String contrasena) {
        super(nombre, correo, contrasena);
    }

    public Empleado(String nombre, String correo, String contrasena, Date nacimiento) {
        super(nombre, correo, contrasena, nacimiento);
    }

    public Empleado(Long id, String nombre, String correo, String contrasena) {
        super(id, nombre, correo, contrasena);
    }

    public Empleado(Long id, String nombre, String correo, String contrasena, Date nacimiento) {
        super(id, nombre, correo, contrasena, nacimiento);
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + this.getId() + ", nombre=" + this.getNombre()
                + ", correo=" + this.getCorreo() + ", contrasena=" + this.getContrasena()
                + ", nacimiento=" + this.getNacimiento() + '}';
    }
    
}
