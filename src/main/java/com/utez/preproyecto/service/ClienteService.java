package com.example.crud.service;

import com.example.crud.model.Cliente;
import java.util.List;

/**
 *
 * @author HEBERTO
 */
public interface ClienteService {
    
     //Se crean metodos abtractos
    
    public List<Cliente> obtenerTodosLosClientes();
    public void nuevoCliente(Cliente neCliente);
    public void actualizarCliente(Cliente upCliente);
    public Cliente obtenerCliente (int id);
    public void eliminarCliente(int id);
}
