package com.primeiro.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.primeiro.model.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@GetMapping
	public List<Cliente> listar() {
		return a ;
	}
}
