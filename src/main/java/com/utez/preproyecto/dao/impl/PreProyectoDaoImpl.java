package com.utez.preproyecto.dao.impl;

import com.utez.preproyecto.dao.PreProyectoDao;
import com.utez.preproyecto.model.PreProyecto;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Shura
 */
@Repository
public class PreProyectoDaoImpl implements PreProyectoDao {

    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public void createPreProyecto(PreProyecto pre) {
        sessionFactory.getCurrentSession().save(pre);
    }

    @Override
    public PreProyecto getProyectoById(int id) {
        String query  = "FROM pre_proyecto WHERE id = " + id;
        List list = sessionFactory.getCurrentSession().createQuery(query).list();
        return (PreProyecto)list.get(0);
    }

    @Override
    public List<PreProyecto> getAllPreProyectos() {
        String query  = "FROM pre_proyecto";
        List preproyectos = sessionFactory.getCurrentSession().createQuery(query).list();
        return preproyectos;
    }

    @Override
    public void updatePreProyecto(PreProyecto pre) {
        sessionFactory.getCurrentSession().update(pre);
    }

    @Override
    public void deletePreProyecto(int id) {
        PreProyecto pre = new PreProyecto();
        pre.setId(id);
        sessionFactory.getCurrentSession().delete(pre);
    }
    
}
