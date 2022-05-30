package cursojava.classes;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	private String nome;
	private int idade;
	
	private List<Disciplina> disciplinas = new  ArrayList<Disciplina>();
	
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
	public Aluno() { /* Método Construtor*/
		
	}
	
	
	public Aluno (String nomePadrao ) {
		nome = nomePadrao;
	}
	
	public Aluno( String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getMediaNota() {
		
		double somaNotas = 0.0;
		
		for(Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();
		}
		
		return somaNotas / disciplinas.size();
		
	}
	
	public boolean GetAlunoAprovado() {
		double media = this.getMediaNota();
		if (media >= 7) {
			return true;
		}else {
			return false;
		}
	}
	
	public String GetAlunoAprovado2() {
		double media = this.getMediaNota();
		if(media >= 7) {
			return "Aluno está aprovado";
		}else {
			return "Aluno está reprovado";
		}
	}
	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + "]";
	}

	
}
