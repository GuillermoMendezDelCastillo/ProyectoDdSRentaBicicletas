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
public class EmpleadoDTO {
    private Long id;
    private String nombre;
    private String correo;
    private String contrasena;
    private Date nacimiento;

    public EmpleadoDTO(Long id, String nombre, String correo, String contrasena, Date nacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
        this.nacimiento = nacimiento;
    }

    public EmpleadoDTO(String nombre, String correo, String contrasena, Date nacimiento) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
        this.nacimiento = nacimiento;
    }

    public EmpleadoDTO(Long id, String nombre, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
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
    
}
