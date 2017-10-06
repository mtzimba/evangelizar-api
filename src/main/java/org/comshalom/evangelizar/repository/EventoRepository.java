/**
 * 
 */
package org.comshalom.evangelizar.repository;

import org.comshalom.evangelizar.domain.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author matheus.cardoso
 *
 */
public interface EventoRepository extends JpaRepository<Evento, Integer> {

}
