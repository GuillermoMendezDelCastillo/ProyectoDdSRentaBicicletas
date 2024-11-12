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
    private String estado;

    public BicicletaDTO(Long id, String rodado, String estado) {
        this.id = id;
        this.rodado = rodado;
        this.estado = estado;
    }

    public BicicletaDTO(String rodado, String estado) {
        this.rodado = rodado;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public String getRodado() {
        return rodado;
    }

    public String getEstado() {
        return estado;
    }
    
}
