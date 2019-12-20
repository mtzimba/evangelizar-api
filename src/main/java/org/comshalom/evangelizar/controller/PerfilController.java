/**
 * 
 */
package org.comshalom.evangelizar.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.comshalom.evangelizar.domain.Perfil;
import org.comshalom.evangelizar.repository.PerfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author matheus.cardoso
 *
 */
@RestController
@RequestMapping("/api/v1/perfil")
public class PerfilController {

	
	@Autowired
	private PerfilRepository repository;

	@GetMapping(value = "/")
	public List<Perfil> findAll() {
		return repository.findAll();
	}

	@GetMapping(value = "/{id}")
	public Optional<Perfil> findById(@PathVariable Integer id) {
		return repository.findById(id);
	}

	@PostMapping("/")
	@PutMapping("/")
	public Perfil save(@Valid @RequestBody Perfil evento) {
		return repository.save(evento);
	}
	
	@DeleteMapping(value = "/{id}")
	public void deleteById(@PathVariable Integer id) {
		repository.deleteById(id);
	}
}
