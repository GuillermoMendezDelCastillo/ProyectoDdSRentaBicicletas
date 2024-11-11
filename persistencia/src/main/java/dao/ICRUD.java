/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.List;

/**
 *
 * @author Gui26
 */
public interface ICRUD<T> {

    public T agregar(T cliente);

    public T buscar(Long id);

    public T actualizar(T cliente);

    public T eliminar(Long id);

    public List<T> lista();
}
