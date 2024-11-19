/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import control.ControlBicicleta;
import control.ControlCliente;
import dao.BicicletaDAO;
import dao.RentaDAO;
import dto.BicicletaDTO;
import dto.ClienteDTO;
import dto.EmpleadoDTO;
import dto.RentaDTO;
import entidades.Bicicleta;
import entidades.Cliente;
import entidades.Empleado;
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
    private ControlEmpleado empleadoBO;
    
    public ControlRenta() {
        this.rentaDAO = new RentaDAO();
        this.bicicletaBO = new ControlBicicleta();
        this.clienteBO = new ControlCliente();
        this.empleadoBO = new ControlEmpleado();
    }

    public RentaDTO agregarRenta(RentaDTO rentaDTO) {
        Bicicleta bicicleta = bicicletaBO.convertirDTOAEntidad(rentaDTO.getBicicleta());
        Cliente cliente = clienteBO.convertirDTOAEntidad(rentaDTO.getCliente()) ;
        Empleado empleado = empleadoBO.convertirDTOaEmpleado(rentaDTO.getEmpleado()) ;
        
        Renta renta = new Renta(bicicleta, cliente, rentaDTO.getFecha(),
                rentaDTO.getTiempo(), rentaDTO.getCosto(), rentaDTO.getMetodoPago(), empleado);
        renta = rentaDAO.agregar(renta);
        return convertirARentaDTO(renta);
    }

    public RentaDTO buscarRenta(Long id) {
        Renta renta = rentaDAO.buscarPorId(id);
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
        Renta rentaExistente = rentaDAO.buscarPorId(id);
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
        Renta renta = rentaDAO.buscarPorId(id);
        if (renta != null) {
            rentaDAO.eliminar(id);
            return true;
        }
        return false;
    }

    public RentaDTO convertirARentaDTO(Renta renta) {
        return new RentaDTO(
            renta.getId(),
            bicicletaBO.convertirEntidadADTO(renta.getBicicleta()),
            clienteBO.convertirEntidadADTO(renta.getCliente()),
            renta.getFecha(),
            renta.getTiempo(),
            renta.getCosto(),
            renta.getMetodoPago(),
            empleadoBO.convertirEmpleadoAdto(renta.getEmpleado())
        );
    }
    
    public RentaDTO generarRenta(ClienteDTO clienteDto, int idBicicleta, float tiempo, EmpleadoDTO empleadoDto){
        
        BicicletaDTO bicicletaDto = bicicletaBO.buscarBicicleta((long)idBicicleta);
        
        float precioRenta = calcularRenta(tiempo, bicicletaDto.getPrecio());
        
        int tiempoMinutos = calcularTiempo(tiempo);
        
        RentaDTO rentaDto = new RentaDTO(bicicletaDto, clienteDto, tiempoMinutos, precioRenta, empleadoDto);
        
        return rentaDto;
    }
    
    private float calcularRenta(float tiempo, float precio){
        return (float) (precio*0.05*tiempo);
    }
    
    private int calcularTiempo(float tiempo){
        //conversion de horas a minutos
        return (int) tiempo * 60;
    }
    
}
