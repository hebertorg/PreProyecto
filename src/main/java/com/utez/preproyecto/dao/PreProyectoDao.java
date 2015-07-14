package com.utez.preproyecto.dao;

import com.utez.preproyecto.model.PreProyecto;
import java.util.List;

/**
 *
 * @author Shura
 */
public interface PreProyectoDao {
    
    public void createPreProyecto(PreProyecto pre);
    public PreProyecto getProyectoById(int id);
    public List<PreProyecto> getAllPreProyecto(PreProyecto pre);
    public void updatePreProyecto(PreProyecto pre);
    public void deletePreProyecto(int id);
    
}
