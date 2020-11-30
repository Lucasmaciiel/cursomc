package com.lmg.cursomc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lmg.cursomc.domain.Categoria;
import com.lmg.cursomc.repository.CategoriaRepository;
import com.lmg.cursomc.service.exception.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	CategoriaRepository repository;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> categoria = repository.findById(id);
		return categoria.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado ID: " + id
				+ ", Tipo" + Categoria.class.getName()));
	}	
}
