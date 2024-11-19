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
public interface IObjetoDAO<T> {

    public T agregar(T tipo);

    public T buscarPorId(Long id);

    public T actualizar(T tipo);

    public T eliminar(Long id);

    public List<T> lista();
    
}
