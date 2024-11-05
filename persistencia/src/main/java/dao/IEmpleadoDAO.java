/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import entidades.Empleado;
import java.util.List;

/**
 *
 * @author Gui26
 */
public interface IEmpleadoDAO {
    public Empleado agregar(Empleado empleado);
    public Empleado buscar(Long id);
    public Empleado actualizar(Empleado empleado);
    public Empleado eliminar(Long id);
    public List<Empleado> lista();
}
