/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import entidades.Cliente;
import java.util.List;

/**
 *
 * @author Gui26
 */
public interface IClienteDAO {
    public Cliente agregar(Cliente cliente);
    public Cliente buscar(Long id);
    public Cliente actualizar(Cliente cliente);
    public Cliente eliminar(Long id);
    public List<Cliente> lista();
}
