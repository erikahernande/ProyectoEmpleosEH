package com.projecteh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projecteh.model.Usuario;

public interface UsuariosRepository extends JpaRepository<Usuario, Integer> {

	Usuario findByUsername(String username);
}
