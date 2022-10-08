package com.projecteh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.projecteh.model.Usuario;
import com.projecteh.service.IUsuariosService;

@Controller
@RequestMapping("/usuarios")
public class UsuariosController {

	//@Autowired
   	//private IUsuariosService serviceUsuarios;
	
    
    @GetMapping("/index")
	public String mostrarIndex(Model model) {
    	// Ejercicio
    	
    	
    	return "usuarios/listUsuarios";
	}
    
    @GetMapping("/delete/{id}")
	public String eliminar(@PathVariable("id") int idUsuario, RedirectAttributes attributes) {		    	
		
    	// Ejercicio.

		return "redirect:/usuarios/index";
	}
}
