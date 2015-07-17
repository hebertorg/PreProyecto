package com.example.crud.dao;

import com.example.crud.model.Cliente;
import java.util.List;

/**
 *
 * @author Heberto
 */
public interface ClienteDao {
    
    //Se crean metodos abtractos
    
    public List<Cliente> obtenerTodosLosClientes();
    public void nuevoCliente(Cliente neCliente);
    public void actualizarCliente(Cliente upCliente);
    public Cliente obtenerCliente (int id);
    public void eliminarCliente(int id);
    

}
