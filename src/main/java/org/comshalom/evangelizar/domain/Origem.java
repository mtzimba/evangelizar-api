/**
 * 
 */
package org.comshalom.evangelizar.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author matheus.cardoso
 *
 */
@Entity
public class Origem implements Serializable {

	private static final long serialVersionUID = -4380237423958733983L;

	@Id
	@GeneratedValue
	private Integer id;

	@NotNull
	@Size(min=3, max=100)
	private String descricao;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao
	 *            the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
