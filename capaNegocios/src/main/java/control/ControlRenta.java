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
    
    /**
     * 
     */
    public ControlRenta() {
        this.rentaDAO = new RentaDAO();
        this.bicicletaBO = new ControlBicicleta();
        this.clienteBO = new ControlCliente();
        this.empleadoBO = new ControlEmpleado();
    }

    /**
     * metodo para agreger renta
     * @param rentaDTO dto de la renta a agregar
     * @return dto de la renta agregada
     */
    public RentaDTO agregarRenta(RentaDTO rentaDTO) {
        Bicicleta bicicleta = bicicletaBO.convertirDTOAEntidad(rentaDTO.getBicicleta());
        Cliente cliente = clienteBO.convertirDTOAEntidad(rentaDTO.getCliente()) ;
        Empleado empleado = empleadoBO.convertirDTOaEntidad(rentaDTO.getEmpleado()) ;
        
        Renta renta = new Renta(bicicleta, cliente, rentaDTO.getFecha(),
                rentaDTO.getTiempo(), rentaDTO.getCosto(), rentaDTO.getMetodoPago(), empleado);
        renta = rentaDAO.agregar(renta);
        return convertirEntidadADTO(renta);
    }

    /**
     * metodo para buscar una renta
     * @param id id de la renta a buscar
     * @return dto de la renta encontrada o null en caso de que no la encuentre
     */
    public RentaDTO buscarRenta(Long id) {
        Renta renta = rentaDAO.buscarPorId(id);
        return (renta != null) ? convertirEntidadADTO(renta) : null;
        
    }

    /**
     * metodo para obtener todas las rentas
     * @return lista con todos dto de todas las rentas
     */
    public List<RentaDTO> obtenerTodasLasRentas() {
        List<Renta> rentas = rentaDAO.lista();
        return rentas.stream().map(this::convertirEntidadADTO).toList();
    }

    /**
     * metodo para actualizar una renta
     * @param rentaDTO dto de renta a actualizar
     * @return dto de renta actualizada o null en caso de no poder actualizarse
     */
    public RentaDTO actualizarRenta(RentaDTO rentaDTO) {
        Renta rentaExistente = rentaDAO.buscarPorId(rentaDTO.getId());
        if (rentaExistente != null) {
            rentaExistente.setBicicleta(bicicletaBO.convertirDTOAEntidad(rentaDTO.getBicicleta()));
            rentaExistente.setCliente(clienteBO.convertirDTOAEntidad(rentaDTO.getCliente()));
            rentaExistente.setFecha(rentaDTO.getFecha());
            rentaExistente.setTiempo(rentaDTO.getTiempo());
            rentaExistente.setCosto(rentaDTO.getCosto());
            rentaExistente.setMetodoPago(rentaDTO.getMetodoPago());
            rentaDAO.actualizar(rentaExistente);
            return convertirEntidadADTO(rentaExistente);
        }
        return null;
    }

    /**
     * metodo para eliminar renta
     * @param id id de renta a eliminar
     * @return el dto de la renta eliminada o null en caso de que no se elimine
     */
    public RentaDTO eliminarRenta(Long id) {
        Renta renta = rentaDAO.buscarPorId(id);
        if (renta != null) {
            rentaDAO.eliminar(id);
            return convertirEntidadADTO(renta);
        }
        return null;
    }

    /**
     * metodo para convertir una renta a dto
     * @param renta renta a convertir
     * @return dto de renta convertida
     */
    public RentaDTO convertirEntidadADTO(Renta renta) {
        return new RentaDTO(
            renta.getId(),
            bicicletaBO.convertirEntidadADTO(renta.getBicicleta()),
            clienteBO.convertirEntidadADTO(renta.getCliente()),
            renta.getFecha(),
            renta.getTiempo(),
            renta.getCosto(),
            renta.getMetodoPago(),
            empleadoBO.convertirEntidadADTO(renta.getEmpleado())
        );
    }
    
    /**
     * 
     * @param clienteDto
     * @param idBicicleta
     * @param tiempo
     * @param empleadoDto
     * @return 
     */
    public RentaDTO generarRenta(ClienteDTO clienteDto, int idBicicleta, float tiempo, EmpleadoDTO empleadoDto){
        
        BicicletaDTO bicicletaDto = bicicletaBO.buscarBicicleta((long)idBicicleta);
        
        float precioRenta = calcularRenta(tiempo, bicicletaDto.getPrecio());
        
        int tiempoMinutos = calcularTiempo(tiempo);
        
        RentaDTO rentaDto = new RentaDTO(bicicletaDto, clienteDto, tiempoMinutos, precioRenta, empleadoDto);
        
        return rentaDto;
    }
    
    /**
     * metodo para calcular el precio que el cliente pagara por una renta
     * @param tiempo tiempo que el cliente utilizara la bicicleta
     * @param precio precio de la bicicleta que se rentara
     * @return el total del precio por la renta
     */
    private float calcularRenta(float tiempo, float precio){
        return (float) (precio*0.05*tiempo);
    }
    
    /**
     * metodo para calcular el tiempo que se rentara la bicicleta
     * @param tiempo tiempo en horas que se rentara la bicicleta
     * @return el tiempo en minutos
     */
    private int calcularTiempo(float tiempo){
        //conversion de horas a minutos
        return (int) tiempo * 60;
    }
    
    
    /**
     * metodo para realizar pagos
     * @return 
     */
    public boolean realizarPagoRenta(){
        //pendiente
    return true;
    }
    
    /**
     * metodo para imprimir recibos
     */
    public void imprimirRecibo(){
        //pendiente
    }
    
    /**
     * metodo para liberar bicicletas
     */
    public void liberarBici(){
        //pendiente
    }
}
