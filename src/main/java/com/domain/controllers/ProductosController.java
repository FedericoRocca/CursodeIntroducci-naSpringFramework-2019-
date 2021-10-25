package com.domain.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/productos")
public class ProductosController {
	@RequestMapping("/list")
	public String goListaProductoString(Model model)
	{
		List<String> categorias = new ArrayList<String>();
		categorias.add("Vestimenta");
		categorias.add("Joyería");
		categorias.add("Juguetes");
		categorias.add("Perfumes");
		model.addAttribute("listaCategorias", categorias);
		
		List<String> productos = new ArrayList<String>();
		productos.add("Anillo de oro");
		productos.add("Reloj");
		productos.add("Camisa manga larga");
		productos.add("T-Shirt");
		model.addAttribute("listaProductos", productos);
		return "productos/listaProductos";
	}
}
