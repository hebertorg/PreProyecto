package com.utez.preproyecto.controller;

import com.utez.preproyecto.model.PreProyecto;
import com.utez.preproyecto.service.PreProyectoService;
import com.utez.preproyecto.service.CleinteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Shura
 */

@Controller
public class OperationController {
    
    @Autowired
    private PreProyectoService preservice;
    
    @Autowired
    private ClienteServicio clienteservice;
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String goIndex() {
        return "index";
    }
    
    @RequestMapping(value = "/createpre", method = RequestMethod.GET)
    public String goCreatePre(Model model) {
        List<Cliente> clientes = clienteservice.getAllClientes();
        List<PreProyecto> proyectos = preservice.getAllPreProyectos();
        model.addAttribute("clientes", clientes);
        model.addAttribute("proyectos", proyectos);
        return "createpre";
    }
}
