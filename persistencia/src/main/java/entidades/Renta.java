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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Gui26
 */
@Entity
public class Renta implements Serializable {

    //private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne()
    @JoinColumn(name = "idBicicleta", nullable = false)
    private Bicicleta bicicleta;
    
    @ManyToOne()
    @JoinColumn(name = "idCliente", nullable = false)
    private Cliente cliente;
    
    @Column(name = "fecha", nullable = false)
    private Date fecha;
    
    @Column(name = "tiempo", nullable = false)
    private int tiempo;
    
    @Column(name = "costo", nullable = false)
    private float costo;
    
    @Column(name = "metodoPago", nullable = false, length = 50)
    private String metodoPago;

    public Renta() {
    }

    public Renta(Long id, Bicicleta bicicleta, Cliente cliente, Date fecha, int tiempo, float costo, String metodoPago) {
        this.id = id;
        this.bicicleta = bicicleta;
        this.cliente = cliente;
        this.fecha = fecha;
        this.tiempo = tiempo;
        this.costo = costo;
        this.metodoPago = metodoPago;
    }

    public Renta(Bicicleta bicicleta, Cliente cliente, Date fecha, int tiempo, float costo, String metodoPago) {
        this.bicicleta = bicicleta;
        this.cliente = cliente;
        this.fecha = fecha;
        this.tiempo = tiempo;
        this.costo = costo;
        this.metodoPago = metodoPago;
    }

    public Renta(Bicicleta bicicleta, Cliente cliente, int tiempo, float costo, String metodoPago) {
        this.bicicleta = bicicleta;
        this.cliente = cliente;
        this.tiempo = tiempo;
        this.costo = costo;
        this.metodoPago = metodoPago;
    }

    public Renta(Long id, Bicicleta bicicleta, Cliente cliente, int tiempo, float costo, String metodoPago) {
        this.id = id;
        this.bicicleta = bicicleta;
        this.cliente = cliente;
        this.tiempo = tiempo;
        this.costo = costo;
        this.metodoPago = metodoPago;
    }

    public Bicicleta getBicicleta() {
        return bicicleta;
    }

    public void setBicicleta(Bicicleta bicicleta) {
        this.bicicleta = bicicleta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Renta)) {
            return false;
        }
        Renta other = (Renta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Renta{" + "id=" + id + ", bicicleta=" + bicicleta + ", cliente="
                + cliente + ", fecha=" + fecha + ", tiempo=" + tiempo + ", costo="
                + costo + ", metodoPago=" + metodoPago + '}';
    }
    
}
