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
    
}
