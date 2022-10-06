package com.projecteh.service.db;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projecteh.model.Categoria;
import com.projecteh.repository.CategoriasRepository;
import com.projecteh.service.ICategoriasService;

@Service
public class CategoriaServiceJpa implements ICategoriasService {

	@Autowired
	private CategoriasRepository categoriasRepo;
	
	@Override
	public void guardar(Categoria categoria) {
		// TODO Auto-generated method stub
		categoriasRepo.save(categoria);

	}

	@Override
	public List<Categoria> buscarTodas() {
		// TODO Auto-generated method stub
		return categoriasRepo.findAll();
	}

	@Override
	public Categoria buscarPorId(Integer idCategoria) {
		// TODO Auto-generated method stub
		Optional<Categoria> optional = categoriasRepo.findById(idCategoria);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

}
