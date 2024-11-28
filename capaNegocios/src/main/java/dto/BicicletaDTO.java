/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author Gui26
 */
public class BicicletaDTO {
    
    private Long id;
    private String rodado;
    private String tipo;
    private String estado;
    private Float precio;
    private ClienteDTO cliente;

    public BicicletaDTO() {
    }
    
    public BicicletaDTO(Long id) {
        this.id = id;
    }
    
    public BicicletaDTO(Long id, String rodado, String estado, Float precio) {
        this.id = id;
        this.rodado = rodado;
        this.estado = estado;
        this.precio = precio;
    }

    public BicicletaDTO(String rodado, String estado, Float precio) {
        this.rodado = rodado;
        this.estado = estado;
        this.precio = precio;
    }

    public BicicletaDTO(Long id, String rodado, String tipo, String estado, Float precio) {
        this.id = id;
        this.rodado = rodado;
        this.tipo = tipo;
        this.estado = estado;
        this.precio = precio;
    }

    public BicicletaDTO(String rodado, String tipo, String estado, Float precio) {
        this.rodado = rodado;
        this.tipo = tipo;
        this.estado = estado;
        this.precio = precio;
    }
    
    public BicicletaDTO(Long id,String rodado, String tipo, String estado, Float precio, ClienteDTO cliente) {
        this.id = id;
        this.rodado = rodado;
        this.tipo = tipo;
        this.estado = estado;
        this.precio = precio;
        this.cliente=cliente;
    }

    public Long getId() {
        return id;
    }

    public String getRodado() {
        return rodado;
    }

    public String getTipo() {
        return tipo;
    }

    public String getEstado() {
        return estado;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setRodado(String rodado) {
        this.rodado = rodado;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public ClienteDTO getCliente() {
        return cliente;
    }

    public void setCliente(ClienteDTO cliente) {
        this.cliente = cliente;
    } 
}
