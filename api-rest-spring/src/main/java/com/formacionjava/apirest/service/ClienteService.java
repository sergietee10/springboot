package com.formacionjava.apirest.service;

import com.formacionjava.apirest.entity.Cliente;

import java.util.List;

public interface ClienteService {

	public List<Cliente> findAll();

	public Cliente findById(Long id);

	public Cliente save(Cliente cliente);

	public void delete(Long id);

}
