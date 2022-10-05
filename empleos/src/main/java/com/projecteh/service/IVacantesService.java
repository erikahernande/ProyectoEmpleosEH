package com.projecteh.service;

import java.util.List;

import com.projecteh.model.Vacante;

public interface IVacantesService {

	List<Vacante> buscarTodas();
	Vacante buscarPorId(Integer idVacante);
	
	void guardar(Vacante vacante);
}
