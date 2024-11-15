/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.EmpleadoDAO;
import dao.IObjetoDAO;
import dto.EmpleadoDTO;

/**
 *
 * @author Gui26
 */
public class ControlEmpleado {
    
    private String correo;
    private String contrasena;

    public ControlEmpleado() {
    }
    
    public ControlEmpleado(EmpleadoDTO empleadoDto) {
        this.correo = empleadoDto.getCorreo();
        this.contrasena = empleadoDto.getContrasena();
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public boolean inicia(){
        EmpleadoDAO empleado = new EmpleadoDAO();
        return empleado.iniciar(correo, contrasena) != null;
    }
    
}
