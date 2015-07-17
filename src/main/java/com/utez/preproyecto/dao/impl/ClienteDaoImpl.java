package com.example.crud.dao.impl;

import com.example.crud.dao.ClienteDao;
import com.example.crud.model.Cliente;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author HEBERTO
 */
@Repository
public class ClienteDaoImpl implements ClienteDao {
    
    @Autowired
    private SessionFactory sessionFactory;
    
    

    @Override
    public List<Cliente> obtenerTodosLosClientes() {
       Session session = sessionFactory.getCurrentSession(); 
       return session.createQuery("from clientes").list();
    }

 
    @Override
    public void nuevoCliente(Cliente cliente) {
        System.out.println("***************************");
         System.out.println("***************************");
          System.out.println("***************************");
           System.out.println("***************************");
            System.out.println("***************************");
             System.out.println("***************************");
        System.out.println("Estamos en DAOImpl");
        System.out.println(cliente.getId());
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getApPaterno());
        System.out.println(cliente.getApMaterno());
        System.out.println(cliente.getDireccion());
        System.out.println(cliente.getTelefono());
        System.out.println(cliente.getCorreo());
   sessionFactory.getCurrentSession().save(cliente);
    }
    
    
    @Override
    public void actualizarCliente(Cliente cliente) {
    sessionFactory.getCurrentSession().update(cliente);
    }

    
    
    @Override
    public Cliente obtenerCliente(int id) {
          System.out.println("***************************");
         System.out.println("***************************");
          System.out.println("***************************");
           System.out.println("***************************");
            System.out.println("***************************");
             System.out.println("***************************");
        System.out.println("Estamos en DAOImpl");
        Session session = sessionFactory.getCurrentSession();
        List list = session.createQuery("FROM clientes WHERE id = "+id).list();
   
        return (Cliente) list.get(0);
    }
    

  
    @Override
    public void eliminarCliente(int id) {
    Cliente cliente = new Cliente();
    cliente.setId(id);
    sessionFactory.getCurrentSession().delete(cliente);
    }
    
 
}
