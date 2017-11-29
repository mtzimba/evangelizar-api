/**
 * 
 */
package org.comshalom.evangelizar.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

import org.comshalom.evangelizar.type.Estado;

/**
 * @author matheus.cardoso
 *
 */
@Embeddable
public class Endereco implements Serializable {

	private static final long serialVersionUID = -5624117069979771335L;

	private String logradouro;

	private String bairro;

	private String cidade;
	
	private Estado estado;

	/**
	 * @return the logradouro
	 */
	public String getLogradouro() {
		return logradouro;
	}

	/**
	 * @param logradouro the logradouro to set
	 */
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	/**
	 * @return the bairro
	 */
	public String getBairro() {
		return bairro;
	}

	/**
	 * @param bairro the bairro to set
	 */
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	/**
	 * @return the cidade
	 */
	public String getCidade() {
		return cidade;
	}

	/**
	 * @param cidade the cidade to set
	 */
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	/**
	 * @return the estado
	 */
	public Estado getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(Estado estado) {
		this.estado = estado;
	}

}
