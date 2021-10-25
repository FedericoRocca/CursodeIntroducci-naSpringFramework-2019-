package com.domain.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/")
	public String goIndex(Model model)
	{
		List<String> categorias = new ArrayList<String>();
		categorias.add("Vestimenta");
		categorias.add("Joyería");
		categorias.add("Juguetes");
		categorias.add("Perfumes");
		model.addAttribute("listaCategorias", categorias);
		return "index";
	}
	
	@RequestMapping("/detalle")
	public String goDetalle(Model model)
	{
		model.addAttribute("mensaje", "Mensaje desde el IndexController");
		return "detalle";
	}
	
}