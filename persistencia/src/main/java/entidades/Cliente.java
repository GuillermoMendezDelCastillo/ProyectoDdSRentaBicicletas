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
public class Cliente extends Usuario implements Serializable {

    //private static final long serialVersionUID = 1L;
    
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "idUsuario")
//    private Long id;
//    
//    @Column(name = "nombre", nullable = false, length = 200)
//    private String nombre;
//    
//    @Column(name = "correo", nullable = false, length = 200)
//    private String correo;
//    
//    @Column(name = "contrasena", nullable = false, length = 200)
//    private String contrasena;
//    
//    @Column(name = "nacimiento", nullable = true)//cambiar a false despues
//    private Date nacimiento;

    @Column(name = "telefono", nullable = true, length = 20)
    private String telefono;
    
    @Column(name = "direccion", nullable = true, length = 500)
    private String direccion;

    public Cliente() {
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
    
//    @Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (id != null ? id.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof Cliente)) {
//            return false;
//        }
//        Cliente other = (Cliente) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
//    }
    
}
