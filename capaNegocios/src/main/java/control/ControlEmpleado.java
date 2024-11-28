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
    
    /**
     * 
     */
    public ControlEmpleado(){
        this.empleadoDAO = new EmpleadoDAO();
    }
    
    /**
     * metodo para iniciar sesion
     * @param correo correo del empleado
     * @param contrasena contraseña del empleado
     * @return dto del empleado o null en caso de no poder iniciar sesion
     */
    public EmpleadoDTO iniciarSesion(String correo, String contrasena) {
        Empleado empleado = empleadoDAO.iniciar(correo, contrasena);
        
        if (empleado != null) {
            System.out.println("Inicio de sesión exitoso para: " + empleado.getNombre());
            return convertirEntidadADTO(empleado);
        } else {
            System.out.println("Credenciales incorrectas.");
            return null;
        }
    }

    /**
     * metodo para agregar empleado
     * @param empleadoDTO dto del empleado a agregar
     * @return dto del empleado agregado
     */
    public EmpleadoDTO agregarEmpleado(EmpleadoDTO empleadoDTO) {
        Empleado empleado = convertirDTOaEntidad(empleadoDTO);
        empleadoDAO.agregar(empleado);
        return convertirEntidadADTO(empleado);
    }
    
    /**
     * metodo para buscar un empleado
     * @param id id del empleado a buscar
     * @return regresa el empleado encontrado o unll en caso de que no lo encuentre
     */
    public EmpleadoDTO buscarEmpleado(Long id) {
        Empleado empleado = empleadoDAO.buscarPorId(id);
        return (empleado != null) ? convertirEntidadADTO(empleado) : null;
    }
    
    /**
     * metodo para actualizar empleado
     * @param empleadoDTO dto del empleado a actualizar
     * @return dto del empleado actualizado o null en caso de que no se pueda actualizar
     */
    public EmpleadoDTO actualizarEmpleado(EmpleadoDTO empleadoDTO) {
        EmpleadoDTO empleadoExistente = buscarEmpleado(empleadoDTO.getId());
        if (empleadoExistente != null) {
              Empleado empleadoActualizado = convertirDTOaEntidad(empleadoDTO);
//            empleadoExistente.setCorreo(empleadoDTO.getCorreo());
//            empleadoExistente.setContrasena(empleadoDTO.getContrasena());
            empleadoDAO.actualizar(empleadoActualizado);
            return convertirEntidadADTO(empleadoActualizado);
        }
        return null;
    }
    
    /**
     * metodo para obtener una lista con todos los empleados
     * @return una lista con los dto de todos los empleados
     */
    public List<Empleado> obtenerTodosEmpleados() {
        return empleadoDAO.lista();
    }
    
    /**
     * metodo para eliminar un empleado
     * @param id id del empleado a eliminar
     * @return dto del empleado eliminado o null en caso de que no se elimine
     */
    public EmpleadoDTO eliminarEmpleado(Long id) {
        EmpleadoDTO empleado = buscarEmpleado(id);
        if (empleado != null) {
             Empleado empleadoEliminado = empleadoDAO.eliminar(id);
        return (empleadoEliminado != null) ? convertirEntidadADTO(empleadoEliminado) : null;
        }
        return null;
    }
    
    public EmpleadoDTO iniciar(String correo){
        Empleado empleado = empleadoDAO.iniciar(correo);
        if (empleado == null) { 
            return null;
        }
        return convertirEntidadADTO(empleado);
    }

    /**
     * metodo para converitr dto en un empleado
     * @param empleadoDTO dto del empleado a crear
     * @return el empleado creado a partir del dto
     */
    public Empleado convertirDTOaEntidad(EmpleadoDTO empleadoDTO) {
        return new Empleado(
                empleadoDTO.getId(),
                empleadoDTO.getNombre(),
                empleadoDTO.getCorreo(),
                empleadoDTO.getContrasena(),
                empleadoDTO.getNacimiento()
        );
    }
    
    /**
     * metodo para convertir empleado a dto
     * @param empleado empleado a convertir
     * @return el dto del empleado convertido
     */
    public EmpleadoDTO convertirEntidadADTO(Empleado empleado){
        return new EmpleadoDTO(
                empleado.getId(),
                empleado.getNombre(),
                empleado.getCorreo(),
                empleado.getContrasena(),
                empleado.getNacimiento()
        );
    }
    
}
