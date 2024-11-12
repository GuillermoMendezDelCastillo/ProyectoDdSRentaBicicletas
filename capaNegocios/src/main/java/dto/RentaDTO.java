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
public class RentaDTO {
    
    private Long id;
    private BicicletaDTO bicicleta;
    private ClienteDTO cliente;
    private Date fecha;
    private int tiempo;
    private float costo;
    private String metodoPago;

    public RentaDTO(Long id, BicicletaDTO bicicleta, ClienteDTO cliente, Date fecha, int tiempo, float costo, String metodoPago) {
        this.id = id;
        this.bicicleta = bicicleta;
        this.cliente = cliente;
        this.fecha = fecha;
        this.tiempo = tiempo;
        this.costo = costo;
        this.metodoPago = metodoPago;
    }

    public RentaDTO(BicicletaDTO bicicleta, ClienteDTO cliente, Date fecha, int tiempo, float costo, String metodoPago) {
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

    public BicicletaDTO getBicicleta() {
        return bicicleta;
    }

    public ClienteDTO getCliente() {
        return cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public int getTiempo() {
        return tiempo;
    }

    public float getCosto() {
        return costo;
    }

    public String getMetodoPago() {
        return metodoPago;
    }
    
}
