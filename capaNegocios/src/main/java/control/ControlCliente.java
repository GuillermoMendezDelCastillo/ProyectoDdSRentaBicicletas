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

    public ControlCliente() {
        this.clienteDAO = new ClienteDAO();
    }

    public ClienteDTO agregarCliente(ClienteDTO clienteDTO) {
        Cliente cliente = convertirDTOAEntidad(clienteDTO);
        Cliente clienteAgregado = clienteDAO.agregar(cliente);
        return convertirEntidadADTO(clienteAgregado);
    }

    public ClienteDTO eliminarCliente(Long id) {
        Cliente clienteEliminado = clienteDAO.eliminar(id);
        return (clienteEliminado != null) ? convertirEntidadADTO(clienteEliminado) : null;
    }

    public ClienteDTO actualizarCliente(ClienteDTO clienteDTO) {
        Cliente cliente = convertirDTOAEntidad(clienteDTO);
        Cliente clienteActualizado = clienteDAO.actualizar(cliente);
        return convertirEntidadADTO(clienteActualizado);
    }

    public List<ClienteDTO> obtenerTodosLosClientes() {
        List<Cliente> clientes = clienteDAO.lista();
        return clientes.stream().map(this::convertirEntidadADTO).toList();
    }

    public ClienteDTO buscarCliente(Long id) {
        Cliente cliente = clienteDAO.buscar(id);
        return (cliente != null) ? convertirEntidadADTO(cliente) : null;
    }

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

    public Cliente convertirDTOAEntidad(ClienteDTO clienteDTO) {
        Cliente cliente = new Cliente();
        cliente.setId(clienteDTO.getId());
        cliente.setNombre(clienteDTO.getNombre());
        cliente.setCorreo(clienteDTO.getCorreo());
        cliente.setContrasena(clienteDTO.getContrasena());
        cliente.setNacimiento(clienteDTO.getNacimiento());
        cliente.setTelefono(clienteDTO.getTelefono());
        cliente.setDireccion(clienteDTO.getDireccion());
        return cliente;
    }
}
