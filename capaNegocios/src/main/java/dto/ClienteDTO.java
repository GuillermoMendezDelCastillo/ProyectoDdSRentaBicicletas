/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.sql.Date;

/**
 *
 * @author Gui26
 */
public class ClienteDTO {
    private Long id;
    private String nombre;
    private String correo;
    private String contrasena;
    private Date nacimiento;
    private String telefono;
    private String direccion;

    public ClienteDTO(String correo, String contrasena) {
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public ClienteDTO(Long id, String correo, String contrasena) {
        this.id = id;
        this.correo = correo;
        this.contrasena = contrasena;
    }
    
    public ClienteDTO(Long id, String nombre, String correo, String contrasena, Date nacimiento, String telefono, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
        this.nacimiento = nacimiento;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public ClienteDTO(String nombre, String correo, String contrasena, Date nacimiento, String telefono, String direccion) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
        this.nacimiento = nacimiento;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }
}
