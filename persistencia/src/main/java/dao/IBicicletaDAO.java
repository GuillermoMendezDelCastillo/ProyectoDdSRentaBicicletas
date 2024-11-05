/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import entidades.Bicicleta;
import java.util.List;

/**
 *
 * @author Gui26
 */
public interface IBicicletaDAO {
    public Bicicleta agregar(Bicicleta bicicleta);
    public Bicicleta buscar(Long id);
    public Bicicleta actualizar(Bicicleta bicicleta);
    public Bicicleta eliminar(Long id);
    public List<Bicicleta> lista();
}
