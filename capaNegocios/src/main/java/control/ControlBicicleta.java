/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.BicicletaDAO;
import dto.BicicletaDTO;
import entidades.Bicicleta;
import java.util.List;

/**
 *
 * @author Gui26
 */
public class ControlBicicleta {
   private BicicletaDAO bicicletaDAO;

    public ControlBicicleta() {
        this.bicicletaDAO = new BicicletaDAO();
    }

    public BicicletaDTO agregarBicicleta(BicicletaDTO bicicletaDTO) {
        Bicicleta bicicleta = convertirDTOAEntidad(bicicletaDTO);
        Bicicleta bicicletaAgregada = bicicletaDAO.agregar(bicicleta);
        return convertirEntidadADTO(bicicletaAgregada);
    }

    public BicicletaDTO eliminarBicicleta(Long id) {
        Bicicleta bicicletaEliminada = bicicletaDAO.eliminar(id);
        return (bicicletaEliminada != null) ? convertirEntidadADTO(bicicletaEliminada) : null;
    }

    public BicicletaDTO actualizarBicicleta(BicicletaDTO bicicletaDTO) {
        Bicicleta bicicleta = convertirDTOAEntidad(bicicletaDTO);
        Bicicleta bicicletaActualizada = bicicletaDAO.actualizar(bicicleta);
        return convertirEntidadADTO(bicicletaActualizada);
    }

    public List<BicicletaDTO> obtenerTodasLasBicicletas() {
        List<Bicicleta> bicicletas = bicicletaDAO.lista();
        return bicicletas.stream().map(this::convertirEntidadADTO).toList();
    }

    public List<BicicletaDTO> obtenerBicicletasDisponibles() {
        List<Bicicleta> bicicletas = bicicletaDAO.lista().stream()
                .filter(b -> b.getEstado().equalsIgnoreCase("disponible"))
                .toList();
        return bicicletas.stream().map(this::convertirEntidadADTO).toList();
    }

    public BicicletaDTO buscarBicicleta(Long id) {
        Bicicleta bicicleta = bicicletaDAO.buscarPorId(id);
        return (bicicleta != null) ? convertirEntidadADTO(bicicleta) : null;
    }

    public BicicletaDTO convertirEntidadADTO(Bicicleta bicicleta) {
        return new BicicletaDTO(
                bicicleta.getId(),
                bicicleta.getRodado(),
                bicicleta.getEstado(),
                bicicleta.getPrecio()
        );
    }

    public Bicicleta convertirDTOAEntidad(BicicletaDTO bicicletaDTO) {
        Bicicleta bicicleta = new Bicicleta();
        bicicleta.setId(bicicletaDTO.getId());
        bicicleta.setRodado(bicicletaDTO.getRodado());
        bicicleta.setEstado(bicicletaDTO.getEstado());
        return bicicleta;
    }
}
