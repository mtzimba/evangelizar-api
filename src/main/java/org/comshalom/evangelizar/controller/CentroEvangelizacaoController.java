/**
 * 
 */
package org.comshalom.evangelizar.controller;

import java.util.List;

import javax.validation.Valid;

import org.comshalom.evangelizar.domain.CentroEvangelizacao;
import org.comshalom.evangelizar.repository.CentroEvangelizacaoRepository;
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
@RequestMapping("/api/v1/ce")
public class CentroEvangelizacaoController {

	
	@Autowired
	private CentroEvangelizacaoRepository repository;

	@GetMapping(value = "/")
	public List<CentroEvangelizacao> findAll() {
		return repository.findAll();
	}

	@GetMapping(value = "/{id}")
	public CentroEvangelizacao findOne(@PathVariable Integer id) {
		return repository.findOne(id);
	}

	@PostMapping("/")
	@PutMapping("/")
	public CentroEvangelizacao save(@Valid @RequestBody CentroEvangelizacao evento) {
		return repository.save(evento);
	}
	
	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable Integer id) {
		repository.delete(id);
	}
}
