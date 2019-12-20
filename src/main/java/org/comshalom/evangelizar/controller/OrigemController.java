/**
 * 
 */
package org.comshalom.evangelizar.controller;

import java.util.List;
import java.util.Optional;

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
	public Optional<Origem> findById(@PathVariable Integer id) {
		return repository.findById(id);
	}

	@PostMapping("/")
	@PutMapping("/")
	public Origem save(@Valid @RequestBody Origem origem) {
		return repository.save(origem);
	}
	
	@DeleteMapping(value = "/{id}")
	public void deleteById(@PathVariable Integer id) {
		repository.deleteById(id);
	}
}
