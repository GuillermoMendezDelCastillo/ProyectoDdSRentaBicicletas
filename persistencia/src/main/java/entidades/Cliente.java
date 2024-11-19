/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author Gui26
 */
@Entity
public class Cliente extends Usuario implements Serializable {

    @Column(name = "telefono", nullable = true, length = 20)
    private String telefono;
    
    @Column(name = "direccion", nullable = true, length = 500)
    private String direccion;

    public Cliente() {
    }

    public Cliente(Long id, String nombre, String correo) {
        super(id, nombre, correo);
    }

    public Cliente(String correo, String contrasena) {
        super(correo, contrasena);
    }

    public Cliente(String telefono, String direccion, String nombre, String correo, String contrasena) {
        super(nombre, correo, contrasena);
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public Cliente(String telefono, String direccion, String nombre, String correo, String contrasena, Date nacimiento) {
        super(nombre, correo, contrasena, nacimiento);
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public Cliente(String telefono, String direccion, Long id, String nombre, String correo, String contrasena) {
        super(id, nombre, correo, contrasena);
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public Cliente(String telefono, String direccion, Long id, String nombre, String correo, String contrasena, Date nacimiento) {
        super(id, nombre, correo, contrasena, nacimiento);
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + this.getId() + ", nombre=" + this.getNombre()
                + ", correo=" + this.getCorreo() + ", contrasena=" + this.getContrasena()
                + ", nacimiento=" + this.getNacimiento() + ", telefono=" + telefono + ", direccion=" + direccion + '}';
    }
    
}
