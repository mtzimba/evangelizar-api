/**
 * 
 */
package org.comshalom.evangelizar.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.comshalom.evangelizar.domain.Evento;
import org.comshalom.evangelizar.repository.EventoRepository;
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
@RequestMapping("/api/v1/evento")
public class EventoController {

	
	@Autowired
	private EventoRepository repository;

	@GetMapping(value = "/")
	public List<Evento> findAll() {
		return repository.findAll();
	}

	@GetMapping(value = "/{id}")
	public Optional<Evento> findById(@PathVariable Integer id) {
		return repository.findById(id);
	}

	@PostMapping("/")
	@PutMapping("/")
	public Evento save(@Valid @RequestBody Evento evento) {
		return repository.save(evento);
	}
	
	@DeleteMapping(value = "/{id}")
	public void deleteById(@PathVariable Integer id) {
		repository.deleteById(id);
	}
}
