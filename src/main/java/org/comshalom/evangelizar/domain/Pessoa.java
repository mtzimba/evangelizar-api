/**
 * 
 */
package org.comshalom.evangelizar.domain;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author matheus.cardoso
 *
 */
@Entity
public class Pessoa implements Serializable {

	private static final long serialVersionUID = 4976766210459640579L;

	@Id
	@GeneratedValue
	private Integer id;

	@NotNull
	@Size(min=3, max=100)
	private String nome;

	private Integer idade;

	private String telefone;

	private String email;

	private String facebook;

	private LocalDate dataCadastro;

	@ManyToOne
	private Origem origemCadastro;

	@ManyToOne
	private Evento evento;

	@ManyToOne
	private CentroEvangelizacao cePreferencia;

	@ManyToOne
	private Perfil evangelizador;

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
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the idade
	 */
	public Integer getIdade() {
		return idade;
	}

	/**
	 * @param idade
	 *            the idade to set
	 */
	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	/**
	 * @return the telefone
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * @param telefone
	 *            the telefone to set
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the facebook
	 */
	public String getFacebook() {
		return facebook;
	}

	/**
	 * @param facebook
	 *            the facebook to set
	 */
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	/**
	 * @return the dataCadastro
	 */
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	/**
	 * @param dataCadastro
	 *            the dataCadastro to set
	 */
	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	/**
	 * @return the evento
	 */
	public Evento getEvento() {
		return evento;
	}

	/**
	 * @param evento
	 *            the evento to set
	 */
	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	/**
	 * @return the cePreferencia
	 */
	public CentroEvangelizacao getCePreferencia() {
		return cePreferencia;
	}

	/**
	 * @param cePreferencia
	 *            the cePreferencia to set
	 */
	public void setCePreferencia(CentroEvangelizacao cePreferencia) {
		this.cePreferencia = cePreferencia;
	}

	/**
	 * @return the evangelizador
	 */
	public Perfil getEvangelizador() {
		return evangelizador;
	}

	/**
	 * @param evangelizador
	 *            the evangelizador to set
	 */
	public void setEvangelizador(Perfil evangelizador) {
		this.evangelizador = evangelizador;
	}

	/**
	 * @return the origemCadastro
	 */
	public Origem getOrigemCadastro() {
		return origemCadastro;
	}

	/**
	 * @param origemCadastro
	 *            the origemCadastro to set
	 */
	public void setOrigemCadastro(Origem origemCadastro) {
		this.origemCadastro = origemCadastro;
	}

}
