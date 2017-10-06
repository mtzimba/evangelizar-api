/**
 * 
 */
package org.comshalom.evangelizar.repository;

import org.comshalom.evangelizar.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author matheus.cardoso
 *
 */
public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
