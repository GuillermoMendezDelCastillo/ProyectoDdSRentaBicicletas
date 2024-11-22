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

   /**
    * 
    */
    public ControlBicicleta() {
        this.bicicletaDAO = new BicicletaDAO();
    }

    /**
     * metodo para agregar una bicicleta
     * @param bicicletaDTO el dto de la bicicleta que se desee agregar
     * @return el dto de la bicicleta agregada
     */
    public BicicletaDTO agregarBicicleta(BicicletaDTO bicicletaDTO) {
        Bicicleta bicicleta = convertirDTOAEntidad(bicicletaDTO);
        Bicicleta bicicletaAgregada = bicicletaDAO.agregar(bicicleta);
        return convertirEntidadADTO(bicicletaAgregada);
    }

    /**
     * metodo para eliminar una bicicleta
     * @param id id de la bicicleta que se desea eliminar
     * @return el dto de la bicicleta eliminada o null en caso de que no se elimine
     */
    public BicicletaDTO eliminarBicicleta(Long id) {
        Bicicleta bicicletaEliminada = bicicletaDAO.eliminar(id);
        return (bicicletaEliminada != null) ? convertirEntidadADTO(bicicletaEliminada) : null;
    }

    /**
     * metodo para actualizar una bicicleta
     * @param bicicletaDTO bicicleta que se desea eliminar
     * @return dto de la bicicleta actualizada o null en caso de que no se pueda actualizar
     */
    public BicicletaDTO actualizarBicicleta(BicicletaDTO bicicletaDTO) {
        BicicletaDTO bicicletaExistente = buscarBicicleta(bicicletaDTO.getId());
        if(bicicletaExistente != null){
        Bicicleta bicicleta = convertirDTOAEntidad(bicicletaDTO);
        Bicicleta bicicletaActualizada = bicicletaDAO.actualizar(bicicleta);
        return convertirEntidadADTO(bicicletaActualizada);
        }
        return null;
    }
    
    /**
     * metodo para obtener todas las bicicletas
     * @return una lista con todos los dto de todas las bicicletas
     */
    public List<BicicletaDTO> obtenerTodasLasBicicletas() {
        List<Bicicleta> bicicletas = bicicletaDAO.lista();
        return bicicletas.stream().map(this::convertirEntidadADTO).toList();
    }

    /**
     * metodo para obtener todas las bicicletas disponibles
     * @return una lista con todos los dto de todas las bicicletas disponibles
     */
    public List<BicicletaDTO> obtenerBicicletasDisponibles() {
        List<Bicicleta> bicicletas = bicicletaDAO.lista().stream()
                .filter(b -> b.getEstado().equalsIgnoreCase("disponible"))
                .toList();
        return bicicletas.stream().map(this::convertirEntidadADTO).toList();
    }

    /**
     * metodo para buscar una bicicleta
     * @param id id de la bicicleta a buscar
     * @return el dto de la bicicleta encontrada o null en caso de que no la encuentre
     */
    public BicicletaDTO buscarBicicleta(Long id) {
        Bicicleta bicicleta = bicicletaDAO.buscarPorId(id);
        return (bicicleta != null) ? convertirEntidadADTO(bicicleta) : null;
    }

    /**
     * metodo para convertir una bicicleta en un dto
     * @param bicicleta bicicleta que se desea convertir en dto
     * @return dto de la bicicleta convertida
     */
    public BicicletaDTO convertirEntidadADTO(Bicicleta bicicleta) {
        return new BicicletaDTO(
                bicicleta.getId(),
                bicicleta.getRodado(),
                bicicleta.getTipo(),
                bicicleta.getEstado(),
                bicicleta.getPrecio()
        );
    }

    /**
     * metodo para convertir el deto de una bicicleta en una bicicleta
     * @param bicicletaDTO el dto de la bicicleta que se desea convertir
     * @return la bicicleta convertida a partir del dto
     */
    public Bicicleta convertirDTOAEntidad(BicicletaDTO bicicletaDTO) {
        return new Bicicleta(
                bicicletaDTO.getId(), 
                bicicletaDTO.getRodado(), 
                bicicletaDTO.getTipo(), 
                bicicletaDTO.getEstado(), 
                bicicletaDTO.getPrecio());
    }
    
    /**
     * metodo para verificar si una bicicleta esta disponible
     * @param id id de la bicicleta que se desea verificar
     * @return true en caso de que este disponible y false en caso contrario
     */
    public boolean biciDisponible(Long id){
        //pendiente
        
        return true;
    }
    
}
