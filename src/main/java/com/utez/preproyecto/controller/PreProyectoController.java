package com.utez.preproyecto.controller;

import com.utez.preproyecto.model.PreProyecto;
import com.utez.preproyecto.service.PreProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Shura
 */

@Controller
public class PreProyectoController {

    @Autowired
    private PreProyectoService preservice;
    
    @RequestMapping(value = "/registrarPre", method = RequestMethod.GET)
    public String registrarPreProyecto(@ModelAttribute PreProyecto pre, Model model) {
        List<PreProyecto> preproyectos = preservice.getAllPreProyectos();
        String message = "";
        boolean exist = false;
        for(PreProyecto p : preproyectos) {
            if(p.getName().equals(pre.getName())){
                exist = true;
                message = "Pre-Proyecto existente, Agrege nuevo proyecto";
                model.addAttribute("message", message);
            }
        }
        if(!exist) {
            preservice.createPreProyecto(pre);
        }
        
        return "preproyectos";
    }
    
    @RequestMapping(value = "/registrarPre", method = RequestMethod.GET)
    public String registrarPreProyecto(@ModelAttribute Cliente cliente, @ModelAttribute PreProyecto pre) {
        return "preproyectos"  
    }
}
