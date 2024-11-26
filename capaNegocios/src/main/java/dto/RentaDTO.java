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
    private EmpleadoDTO empleado;

    public RentaDTO(Long id, BicicletaDTO bicicleta, ClienteDTO cliente, Date fecha,
            int tiempo, float costo, String metodoPago, EmpleadoDTO empleado) {
        this.id = id;
        this.bicicleta = bicicleta;
        this.cliente = cliente;
        this.fecha = fecha;
        this.tiempo = tiempo;
        this.costo = costo;
        this.metodoPago = metodoPago;
        this.empleado = empleado;
    }

    public RentaDTO(BicicletaDTO bicicleta, ClienteDTO cliente, Date fecha, int tiempo,
            float costo, String metodoPago, EmpleadoDTO empleado) {
        this.bicicleta = bicicleta;
        this.cliente = cliente;
        this.fecha = fecha;
        this.tiempo = tiempo;
        this.costo = costo;
        this.metodoPago = metodoPago;
        this.empleado = empleado;
    }

    public RentaDTO(Long id, BicicletaDTO bicicleta, ClienteDTO cliente,
            int tiempo, float costo, EmpleadoDTO empleado) {
        this.id = id;
        this.bicicleta = bicicleta;
        this.cliente = cliente;
        this.tiempo = tiempo;
        this.costo = costo;
        this.empleado = empleado;
    }

    public RentaDTO(BicicletaDTO bicicleta, ClienteDTO cliente, int tiempo,
            float costo, EmpleadoDTO empleado) {
        this.bicicleta = bicicleta;
        this.cliente = cliente;
        this.tiempo = tiempo;
        this.costo = costo;
        this.empleado = empleado;
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

    public EmpleadoDTO getEmpleado() {
        return empleado;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setBicicleta(BicicletaDTO bicicleta) {
        this.bicicleta = bicicleta;
    }

    public void setCliente(ClienteDTO cliente) {
        this.cliente = cliente;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void setEmpleado(EmpleadoDTO empleado) {
        this.empleado = empleado;
    }
    
    
    
}
