package br.com.leo.Classes;

public class Aluno extends Usuario {
	double notaMatematica = 0;
	double notaPortugues = 0;
	double notaGeografia = 0;
	
	
	 public double getNotaMatematica() {
		return notaMatematica;
	}


	public void setNotaMatematica(double notaMatematica) {
		this.notaMatematica = notaMatematica;
	}


	public double getNotaPortugues() {
		return notaPortugues;
	}


	public void setNotaPortugues(double notaPortugues) {
		this.notaPortugues = notaPortugues;
	}


	public double getNotaGeografia() {
		return notaGeografia;
	}


	public void setNotaGeografia(double notaGeografia) {
		this.notaGeografia = notaGeografia;
	}


	Aluno(String nome, String cpf, String nascimento, String email, String senha){
		 super(nome, cpf, nascimento, email, senha);
	}
	 

}
