/**
 * 
 */
package org.comshalom.evangelizar.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.comshalom.evangelizar.domain.Pessoa;
import org.comshalom.evangelizar.repository.PessoaRepository;
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
@RequestMapping("/api/v1/pessoa")
public class PessoaController {

	@Autowired
	private PessoaRepository repository;

	@GetMapping(value = "/")
	public List<Pessoa> findAll() {
		return repository.findAll();
	}

	@GetMapping(value = "/{id}")
	public Optional<Pessoa> findById(@PathVariable Integer id) {
		return repository.findById(id);
	}

	@PostMapping("/")
	@PutMapping("/")
	public Pessoa save(@Valid @RequestBody Pessoa pessoa) {
		return repository.save(pessoa);
	}
	
	@DeleteMapping(value = "/{id}")
	public void deleteById(@PathVariable Integer id) {
		repository.deleteById(id);
	}
}
