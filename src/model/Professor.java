package model;

import java.util.ArrayList;

/**
 * Classe respons�vel por armazenar os atributos e m�todos do objeto Professor
 * 
 * @author Diego Munhoz
 * @since 23/02/2021
 */
public class Professor extends Funcionario {

	// declarando os atributos do professor
	private ArrayList<Materia> listaMaterias;

	public ArrayList<Materia> getListaMaterias() {
		return listaMaterias;
	}

	public void setListaMaterias(ArrayList<Materia> listaMaterias) {
		this.listaMaterias = listaMaterias;
	}

}
