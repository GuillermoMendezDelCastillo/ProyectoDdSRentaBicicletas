/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subsistemaIniciarSesion;

import bo.EmpleadoBO;
import dto.EmpleadoDTO;

/**
 *
 * @author Gui26
 */
public class IniciarSesion {
    
    public boolean iniciar(EmpleadoDTO empleadoDto) {
        EmpleadoBO empleado = new EmpleadoBO(empleadoDto);
        return empleado.inicia();
    }
    
    
}
