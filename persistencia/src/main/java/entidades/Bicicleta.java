/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Gui26
 */
@Entity
public class Bicicleta implements Serializable {

    //private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idBicicleta")
    private Long id;

    @Column(name = "rodado", nullable = false, length = 50)
    private String rodado;
    
    @Column(name = "tipo", nullable = true, length = 50)
    private String tipo;
    
    @Column(name = "estado", nullable = false, length = 50)
    private String estado;

    @Column(name = "precio", nullable = false, length = 50)
    private Float precio;
    
    @ManyToOne
    @JoinColumn(name = "idCliente", nullable = true)
    private Cliente idCliente;
    
    public Bicicleta() {
    }

    public Bicicleta(Long id, String rodado, String estado, Float precio) {
        this.id = id;
        this.rodado = rodado;
        this.estado = estado;
        this.precio = precio;
    }

    public Bicicleta(String rodado, String estado, Float precio) {
        this.rodado = rodado;
        this.estado = estado;
        this.precio = precio;
    }

    public Bicicleta(Long id, String rodado, String tipo, String estado, Float precio) {
        this.id = id;
        this.rodado = rodado;
        this.tipo = tipo;
        this.estado = estado;
        this.precio = precio;
    }

    public Bicicleta(String rodado, String tipo, String estado, Float precio) {
        this.rodado = rodado;
        this.tipo = tipo;
        this.estado = estado;
        this.precio = precio;
    }
    
    public Bicicleta(Long id,String rodado, String tipo, String estado, Float precio, Cliente idCliente) {
        this.rodado = rodado;
        this.tipo = tipo;
        this.estado = estado;
        this.precio = precio;
        this.idCliente = idCliente;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRodado() {
        return rodado;
    }

    public void setRodado(String rodado) {
        this.rodado = rodado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }
    
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bicicleta)) {
            return false;
        }
        Bicicleta other = (Bicicleta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "id=" + id + ", rodado=" + rodado + ", tipo=" + tipo + ", estado=" + estado + ", precio=" + precio + '}';
    }
    
}
