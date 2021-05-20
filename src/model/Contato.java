package model;

/**
 * Classe para armazenar os atributos e m�todos do objeto Contato
 * 
 * @author Diego Munhoz
 * @since 23/02/2021
 */
public class Contato {

	// declarando os atributos do objeto Contato
	private String celular;
	private String email;

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
