/**
 * 
 */
package org.comshalom.evangelizar.controller;

import java.util.List;

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
@RequestMapping("/api/v1/eventos")
public class EventoController {

	
	@Autowired
	private EventoRepository repository;

	@GetMapping(value = "/")
	public List<Evento> findAll() {
		return repository.findAll();
	}

	@GetMapping(value = "/{id}")
	public Evento findOne(@PathVariable Integer id) {
		return repository.findOne(id);
	}

	@PostMapping("/")
	public Evento save(@RequestBody Evento evento) {
		return repository.save(evento);
	}
	
	@PutMapping("/")
	public Evento update(@RequestBody Evento evento) {
		return repository.save(evento);
	}

	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable Integer id) {
		repository.delete(id);
	}
}
