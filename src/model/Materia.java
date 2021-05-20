package model;

/**
 * Classe para armazenar os atributos e m�todos do objeto Materia
 * 
 * @author Diego Munhoz
 * @since 23/02/2021
 */
public class Materia {

	// declarando os atributos do objeto Materia
	private int codigo;
	private String nome;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
