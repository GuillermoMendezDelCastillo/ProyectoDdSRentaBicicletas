/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

/**
 *
 * @author Gui26
 */
public class BicicletaBO {
    
    private Long id;
    private String rodado;
    private String estado;

    public BicicletaBO() {
    }

    public BicicletaBO(Long id, String rodado, String estado) {
        this.id = id;
        this.rodado = rodado;
        this.estado = estado;
    }

    public BicicletaBO(String rodado, String estado) {
        this.rodado = rodado;
        this.estado = estado;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
