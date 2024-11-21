/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.ClienteDAO;
import dto.ClienteDTO;
import entidades.Cliente;
import java.util.List;

/**
 *
 * @author Gui26
 */
public class ControlCliente {
    
    private ClienteDAO clienteDAO;

    /**
     * 
     */
    public ControlCliente() {
        this.clienteDAO = new ClienteDAO();
    }

    /**
     * metodo para agregar un cliente
     * @param clienteDTO dto del cliente que se desea agregar
     * @return dto del cliente agregado
     */
    public ClienteDTO agregarCliente(ClienteDTO clienteDTO) {
        Cliente cliente = convertirDTOAEntidad(clienteDTO);
        Cliente clienteAgregado = clienteDAO.agregar(cliente);
        return convertirEntidadADTO(clienteAgregado);
    }

    /**
     * metodo para eliminar a un cliente
     * @param id id del cliente a eliminar 
    * @return dto del cliente eliminado o null en caso de que no se elimine
     */
        public ClienteDTO eliminarCliente(Long id) {
        Cliente clienteEliminado = clienteDAO.eliminar(id);
        return (clienteEliminado != null) ? convertirEntidadADTO(clienteEliminado) : null;
    }

    /**
     * metodo para actualizar un cliente
     * @param clienteDTO dto del cliente a actualizar
     * @return dto del cliente actualizado o null en caso de que el cliente no se pueda actualizar
     */
    public ClienteDTO actualizarCliente(ClienteDTO clienteDTO) {
        ClienteDTO clienteExistente = buscarCliente(clienteDTO.getId());
        if (clienteExistente != null){
        Cliente cliente = convertirDTOAEntidad(clienteDTO);
        Cliente clienteActualizado = clienteDAO.actualizar(cliente);
        return convertirEntidadADTO(clienteActualizado);
        }
        return null;
    }

    /**
     * metodo para obtener una lista de todos los clientes
     * @return una lista con todos los dto de todos los clientes
     */
    public List<ClienteDTO> obtenerTodosLosClientes() {
        List<Cliente> clientes = clienteDAO.lista();
        return clientes.stream().map(this::convertirEntidadADTO).toList();
    }

    /**
     * metodo para buscar un cliente
     * @param id id del cliente a buscar
     * @return dto del cliente encontrado o null en caso de que no lo encuentre
     */
    public ClienteDTO buscarCliente(Long id) {
        Cliente cliente = clienteDAO.buscarPorId(id);
        return (cliente != null) ? convertirEntidadADTO(cliente) : null;
    }

    /**
     * metodo para convertir un cliente en un dto
     * @param cliente cliente a convertir
     * @return dto del cliente convertido
     */
    public ClienteDTO convertirEntidadADTO(Cliente cliente) {
        return new ClienteDTO(
                cliente.getId(),
                cliente.getNombre(),
                cliente.getCorreo(),
                cliente.getContrasena(),
                cliente.getNacimiento(),
                cliente.getTelefono(),
                cliente.getDireccion()
        );
    }

    /**
     * metodo para convertir un dto en un cliente
     * @param clienteDTO dto del cliente a convertir
     * @return el cliente convertido
     */
    public Cliente convertirDTOAEntidad(ClienteDTO clienteDTO) {
        return new Cliente(
                clienteDTO.getTelefono(),
                clienteDTO.getDireccion(),
                clienteDTO.getId(),
                clienteDTO.getNombre(),
                clienteDTO.getCorreo(),
                clienteDTO.getContrasena(),
                clienteDTO.getNacimiento()
        );
    }
}
