package cursojava.classes;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
	
	private String nomeFaculdade;
	
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


	public String getNomeFaculdade() {
		return nomeFaculdade;
	}

	public void setNomeFaculdade(String nomeFaculdade) {
		this.nomeFaculdade = nomeFaculdade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getMediaNota() {
		
		double somaNotas = 0.0;
		
		for(Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getMediaNotas();
		}
		
		return somaNotas / disciplinas.size();
		
	}
	
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		if (media >= 7) {
			return true;
		}else {
			return false;
		}
	}
	
	public String getAlunoAprovado2() {
		double media = this.getMediaNota();
		if(media >= 7) {
			return "Aluno(a) está aprovado(a)!";
		}else {
			return "Aluno(a) está reprovado(a)!";
		}
	}
	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + "]";
	}

	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
