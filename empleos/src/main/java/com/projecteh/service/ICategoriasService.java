package com.projecteh.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.projecteh.model.Categoria;
import com.projecteh.model.Vacante;

public interface ICategoriasService {
	void guardar(Categoria categoria);
	List<Categoria> buscarTodas();
	Categoria buscarPorId(Integer idCategoria);	
	
	//Ejercicio Implementar metodo
	void eliminar(Integer idCategoria);
	
	Page<Categoria>buscarTodas(Pageable page);
}