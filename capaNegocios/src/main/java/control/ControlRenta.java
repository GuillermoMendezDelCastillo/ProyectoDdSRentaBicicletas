/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import control.ControlBicicleta;
import control.ControlCliente;
import dao.RentaDAO;
import dto.BicicletaDTO;
import dto.ClienteDTO;
import dto.RentaDTO;
import entidades.Bicicleta;
import entidades.Cliente;
import entidades.Renta;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gui26
 */
public class ControlRenta {
    
    private RentaDAO rentaDAO;
    private ControlBicicleta bicicletaBO;
    private ControlCliente clienteBO;
    
    public ControlRenta() {
        rentaDAO = new RentaDAO();
    }

    public RentaDTO agregarRenta(RentaDTO rentaDTO) {
        Bicicleta bicicleta = bicicletaBO.convertirDTOAEntidad(rentaDTO.getBicicleta());
        Cliente cliente = clienteBO.convertirDTOAEntidad(rentaDTO.getCliente()) ;
        
        Renta renta = new Renta(bicicleta, cliente, rentaDTO.getFecha(),
                rentaDTO.getTiempo(), rentaDTO.getCosto(), rentaDTO.getMetodoPago());
        renta = rentaDAO.agregar(renta);
        return convertirARentaDTO(renta);
    }

    public RentaDTO buscarRenta(Long id) {
        Renta renta = rentaDAO.buscar(id);
        if (renta != null) {
            return convertirARentaDTO(renta);
        }
        return null;
    }

    public List<RentaDTO> obtenerTodasLasRentas() {
        List<Renta> rentas = rentaDAO.lista();
        List<RentaDTO> rentaDTOs = new ArrayList<>();
        for (Renta renta : rentas) {
            rentaDTOs.add(convertirARentaDTO(renta));
        }
        return rentaDTOs;
    }

    public RentaDTO actualizarRenta(Long id, RentaDTO rentaDTO) {
        Renta rentaExistente = rentaDAO.buscar(id);
        if (rentaExistente != null) {
            rentaExistente.setBicicleta(bicicletaBO.convertirDTOAEntidad(rentaDTO.getBicicleta()));
            rentaExistente.setCliente(clienteBO.convertirDTOAEntidad(rentaDTO.getCliente()));
            rentaExistente.setFecha(rentaDTO.getFecha());
            rentaExistente.setTiempo(rentaDTO.getTiempo());
            rentaExistente.setCosto(rentaDTO.getCosto());
            rentaExistente.setMetodoPago(rentaDTO.getMetodoPago());
            rentaDAO.actualizar(rentaExistente);
            return convertirARentaDTO(rentaExistente);
        }
        return null;
    }

    public boolean eliminarRenta(Long id) {
        Renta renta = rentaDAO.buscar(id);
        if (renta != null) {
            rentaDAO.eliminar(id);
            return true;
        }
        return false;
    }

    private RentaDTO convertirARentaDTO(Renta renta) {
        return new RentaDTO(
            renta.getId(),
            bicicletaBO.convertirEntidadADTO(renta.getBicicleta()),
            clienteBO.convertirEntidadADTO(renta.getCliente()),
            renta.getFecha(),
            renta.getTiempo(),
            renta.getCosto(),
            renta.getMetodoPago()
        );
    }
    
}
