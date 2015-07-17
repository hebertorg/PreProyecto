package com.example.crud.service.impl;

import com.example.crud.dao.ClienteDao;
import com.example.crud.model.Cliente;
import com.example.crud.service.ClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author HEBERTO
 */
@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    ClienteDao dao; //Se crea un objeto de tipo clienteDao
    
    @Override
    @Transactional
    public List<Cliente> obtenerTodosLosClientes() {
     return dao.obtenerTodosLosClientes();
    }

    @Override
    @Transactional
    public void nuevoCliente(Cliente neCliente) {
    dao.nuevoCliente(neCliente);
    }

    @Override
    @Transactional
    public void actualizarCliente(Cliente upCliente) {
        dao.actualizarCliente(upCliente);
    }

   

    @Override
    @Transactional
    public void eliminarCliente(int id) {
    dao.eliminarCliente(id);
    }

    @Override
    public Cliente obtenerCliente(int id) {
       return dao.obtenerCliente(id);
    }
    
}
