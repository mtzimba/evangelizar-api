/**
 * 
 */
package org.comshalom.evangelizar.controller;

import java.util.List;

import javax.validation.Valid;

import org.comshalom.evangelizar.domain.Origem;
import org.comshalom.evangelizar.repository.OrigemRepository;
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
@RequestMapping("/api/v1/origem")
public class OrigemController {

	
	@Autowired
	private OrigemRepository repository;

	@GetMapping(value = "/")
	public List<Origem> findAll() {
		return repository.findAll();
	}

	@GetMapping(value = "/{id}")
	public Origem findOne(@PathVariable Integer id) {
		return repository.findOne(id);
	}

	@PostMapping("/")
	@PutMapping("/")
	public Origem save(@Valid @RequestBody Origem origem) {
		return repository.save(origem);
	}
	
	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable Integer id) {
		repository.delete(id);
	}
}
