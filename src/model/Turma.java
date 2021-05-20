package model;

import java.util.ArrayList;

/**
 * Classe para armazenar os atributos e m�todos do objeto Turma
 * 
 * @author Diego Munhoz
 * @since 24/02/2021
 */
public class Turma {

	// declarando os atributos
	private int codigo;
	private int ano;
	private Professor professor;
	private ArrayList<Aluno> alunos;
	private Materia materia;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

}
