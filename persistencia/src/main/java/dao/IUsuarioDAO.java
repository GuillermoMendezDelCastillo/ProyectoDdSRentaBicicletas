/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import entidades.Usuario;
import java.util.List;

/**
 *
 * @author Gui26
 */
public interface IUsuarioDAO {
    public Usuario agregar(Usuario usuario);
    public Usuario buscar(Long id);
    public Usuario actualizar(Usuario usuario);
    public Usuario eliminar(Long id);
    public List<Usuario> lista();
}
