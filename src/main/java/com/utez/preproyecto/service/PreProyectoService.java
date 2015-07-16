package com.utez.preproyecto.service;

import com.utez.preproyecto.model.PreProyecto;
import java.util.List;

/**
 *
 * @author Shura
 */
public interface PreProyectoService {
    
    public void createPreProyecto(PreProyecto pre);
    public PreProyecto getProyectoById(int id);
    public List<PreProyecto> getAllPreProyectos();
    public void updatePreProyecto(PreProyecto pre);
    public void deletePreProyecto(int id);
}
