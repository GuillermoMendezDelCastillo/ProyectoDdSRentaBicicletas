/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.EmpleadoDAO;
import dto.EmpleadoDTO;
import entidades.Empleado;
import java.util.List;

/**
 *
 * @author Gui26
 */
public class ControlEmpleado {
    
    private EmpleadoDAO empleadoDAO;
    
    public ControlEmpleado(){
        this.empleadoDAO = new EmpleadoDAO();
    }
    
    public EmpleadoDTO iniciarSesion(String correo, String contrasena) {
        Empleado empleado = empleadoDAO.iniciar(correo, contrasena);
        
        if (empleado != null) {
            System.out.println("Inicio de sesión exitoso para: " + empleado.getNombre());
            return convertirEmpleadoAdto(empleado);
        } else {
            System.out.println("Credenciales incorrectas.");
            return null;
        }
    }

    public void agregarEmpleado(EmpleadoDTO empleadoDTO) {
        Empleado empleado = convertirDTOaEmpleado(empleadoDTO);
        empleadoDAO.agregar(empleado);
        System.out.println("Empleado agregado: " + empleado.getNombre());
    }
    
    public Empleado obtenerEmpleadoPorId(Long id) {
        Empleado empleado = empleadoDAO.buscar(id);
        if (empleado != null) {
            return empleado;
        } else {
            System.out.println("Empleado con ID " + id + " no encontrado.");
            return null;
        }
    }
    
    public void actualizarEmpleado(Long id, EmpleadoDTO empleadoDTO) {
        Empleado empleadoExistente = obtenerEmpleadoPorId(id);
        if (empleadoExistente != null) {
            empleadoExistente.setCorreo(empleadoDTO.getCorreo());
            empleadoExistente.setContrasena(empleadoDTO.getContrasena());
            empleadoDAO.actualizar(empleadoExistente);
            System.out.println("Empleado actualizado: " + empleadoExistente.getNombre());
        }
    }
    
    public List<Empleado> obtenerTodosEmpleados() {
        return empleadoDAO.lista();
    }
    
    public void eliminarEmpleado(Long id) {
        Empleado empleado = obtenerEmpleadoPorId(id);
        if (empleado != null) {
            empleadoDAO.eliminar(id);
            System.out.println("Empleado eliminado: " + empleado.getNombre());
        }
    }

    public Empleado convertirDTOaEmpleado(EmpleadoDTO empleadoDTO) {
        return new Empleado(empleadoDTO.getCorreo(), empleadoDTO.getContrasena());
    }
    
    public EmpleadoDTO convertirEmpleadoAdto(Empleado empleado){
        EmpleadoDTO empleadoDto = new EmpleadoDTO(empleado.getId(),
                empleado.getNombre(),empleado.getCorreo());
        return empleadoDto;
    }
    
}
