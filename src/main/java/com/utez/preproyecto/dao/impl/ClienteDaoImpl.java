package com.example.crud.dao.impl;

import com.example.crud.dao.ClienteDao;
import com.example.crud.model.Cliente;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Heberto
 */
public class ClienteDaoImpl implements ClienteDao {

    @Autowired
    SessionFactory sessionFactory;
    
    @Override
    public List<Cliente> obtenerTodosLosClientes() {
          return sessionFactory.getCurrentSession().createQuery("FROM clientes").list();
//        Session session = sessionFactory.getCurrentSession();
//        return session.createQuery("from user").list();
    }

    @Override
    public void nuevoCliente(Cliente nuevoCliente) {
        sessionFactory.getCurrentSession().save(nuevoCliente);
//         sessionFactory.getCurrentSession().save(user);
    }

    @Override
    public void actualizarCliente(Cliente actualizarCliente) {
        sessionFactory.getCurrentSession().update(actualizarCliente);
       //sessionFactory.getCurrentSession().update(user);
    }

    public Cliente obtenerCliente(int id) {
    List lista = sessionFactory.getCurrentSession().createQuery("FROM cliente WHERE id = " + id).list();
    return (Cliente) lista.get(0);
//       Session session = sessionFactory.getCurrentSession();
//        List list = session.createQuery("FROM user WHERE id = " + id).list();
//        return (User) list.get(0);
    }

    @Override
    public void eliminarCliente(int id) {
        Cliente cliente = new Cliente();
        cliente.setId(id);
        sessionFactory.getCurrentSession().delete(cliente);
//         User user = new User();
//        user.setId(id);
//        sessionFactory.getCurrentSession().delete(user);
    }

   
}
