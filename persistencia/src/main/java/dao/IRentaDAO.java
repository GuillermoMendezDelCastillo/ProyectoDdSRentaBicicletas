/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import entidades.Renta;
import java.util.List;

/**
 *
 * @author Gui26
 */
public interface IRentaDAO {
    public Renta agregar(Renta renta);
    public Renta buscar(Long id);
    public Renta actualizar(Renta renta);
    public Renta eliminar(Long id);
    public List<Renta> lista();
}
