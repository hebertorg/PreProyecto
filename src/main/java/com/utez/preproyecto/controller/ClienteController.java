package com.example.crud.controller;

import com.example.crud.model.Cliente;
import com.example.crud.service.ClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author HEBERTO
 */
@Controller
public class ClienteController {

    @Autowired
    private ClienteService service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String irAIndex(Model model) {
        System.out.println("------------------------------------------");
        System.out.println("------------------------------------------");
        System.out.println("------------------------------------------");
        System.out.println("------------------------------------------");
        System.out.println("-----------------ClienteController------------------");
        List<Cliente> cliente = service.obtenerTodosLosClientes();
        for (int i = 0; i < cliente.size(); i++) {
            System.out.println(cliente.get(i).getId());
            System.out.println(cliente.get(i).getNombre());
            System.out.println(cliente.get(i).getApPaterno());
            System.out.println(cliente.get(i).getApMaterno());
            System.out.println(cliente.get(i).getDireccion());
            System.out.println(cliente.get(i).getTelefono());
            System.out.println(cliente.get(i).getCorreo());
        }
        model.addAttribute("Cliente", cliente);
        return "index";
    }
//

    @RequestMapping(value = "/save", method = RequestMethod.GET)
    public String altaCliente(@ModelAttribute Cliente cliente) {

        service.nuevoCliente(cliente);

        return "redirect:/";
    }

    @RequestMapping(value = "/gotoupdate")
    public String irAActualizar(@RequestParam int id, Model model) {
        Cliente cliente = service.obtenerCliente(id);
        model.addAttribute(cliente);
        return "update";
    }

    @RequestMapping(value = "/update")
    public String actualizarCliente(@ModelAttribute Cliente cliente) {
        service.actualizarCliente(cliente);
        return "redirect:/";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String eliminarCliente(@RequestParam int id) {
        service.eliminarCliente(id);
        return "redirect:/";
    }
}
