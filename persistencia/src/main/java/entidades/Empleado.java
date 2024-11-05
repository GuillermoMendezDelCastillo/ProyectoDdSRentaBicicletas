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
//        if (!(object instanceof Empleado)) {
//            return false;
//        }
//        Empleado other = (Empleado) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
//    }
    
}
