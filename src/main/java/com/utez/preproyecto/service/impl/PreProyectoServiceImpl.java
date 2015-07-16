package com.utez.preproyecto.service.impl;

import com.utez.preproyecto.dao.PreProyectoDao;
import com.utez.preproyecto.model.PreProyecto;
import com.utez.preproyecto.service.PreProyectoService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Shura
 */
@Service
public class PreProyectoServiceImpl implements PreProyectoService {

    @Autowired
    private PreProyectoDao dao;
    
    @Override
    public void createPreProyecto(PreProyecto pre) {
        dao.createPreProyecto(pre);
    }

    @Override
    public PreProyecto getProyectoById(int id) {
       return  dao.getProyectoById(id);
    }

    @Override
    public List<PreProyecto> getAllPreProyectos() {
        List<PreProyecto> preproyectos = dao.getAllPreProyectos();
        return preproyectos;
    }

    @Override
    public void updatePreProyecto(PreProyecto pre) {
        dao.updatePreProyecto(pre);
    }

    @Override
    public void deletePreProyecto(int id) {
        dao.deletePreProyecto(id);
    }
    
}
