package com.projecteh.service;

import java.util.List;

import com.projecteh.model.Categoria;

public interface ICategoriasService {
	void guardar(Categoria categoria);
	List<Categoria> buscarTodas();
	Categoria buscarPorId(Integer idCategoria);	
	
	//Ejercicio Implementar metodo
	void eliminar(Integer idCategoria);
}