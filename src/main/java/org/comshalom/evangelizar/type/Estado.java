package org.comshalom.evangelizar.type;

/**
 * @author matheus.cardoso
 *
 */
public enum Estado {

	AC("Acre"),  
    AL("Alagoas"),  
    AM("Amazonas"),  
    AP("Amapá"),  
    BA("Bahia"),  
    CE("Ceará"),  
    DF("Distrito Federal"),  
    ES("Espirito Santo"),  
    GO("Goias"),   
    MA("Maranhão"),  
    MG("Minas Gerais"),  
    MS("Mato Grosso Sul"),  
    MT("Mato Grosso"),  
    PA("Pará"),  
    PB("Paraiba"),  
    PE("Pernanbuco"),  
    PI("Piaui"),  
    PR("Parana"),  
    RJ("Rio de Janeiro"),  
    RN("Rio Grande do Norte"),  
    RO("Rondônia"),  
    RR("Roraima"),  
    RS("Rio Grande do Sul"),  
    SC("Santa Catarina"),  
    SE("Sergipe"),  
    SP("São Paulo"),  
    TO("Tocantins");

	private String nome;

	Estado(String nome) {  
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return nome;
	}

}
