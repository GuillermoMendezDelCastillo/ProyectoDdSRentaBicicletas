/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import bo.BicicletaBO;
import bo.ClienteBO;
import java.sql.Date;

/**
 *
 * @author Gui26
 */
public class RentaBO {
    
    private Long id;
    private BicicletaBO bicicleta;
    private ClienteBO cliente;
    private Date fecha;
    private int tiempo;
    private float costo;
    private String metodoPago;

    public RentaBO() {
    }

    public RentaBO(BicicletaBO bicicleta, ClienteBO cliente, Date fecha, int tiempo, float costo, String metodoPago) {
        this.bicicleta = bicicleta;
        this.cliente = cliente;
        this.fecha = fecha;
        this.tiempo = tiempo;
        this.costo = costo;
        this.metodoPago = metodoPago;
    }

    public RentaBO(Long id, BicicletaBO bicicleta, ClienteBO cliente, Date fecha, int tiempo, float costo, String metodoPago) {
        this.id = id;
        this.bicicleta = bicicleta;
        this.cliente = cliente;
        this.fecha = fecha;
        this.tiempo = tiempo;
        this.costo = costo;
        this.metodoPago = metodoPago;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BicicletaBO getBicicleta() {
        return bicicleta;
    }

    public void setBicicleta(BicicletaBO bicicleta) {
        this.bicicleta = bicicleta;
    }

    public ClienteBO getCliente() {
        return cliente;
    }

    public void setCliente(ClienteBO cliente) {
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
    
}
