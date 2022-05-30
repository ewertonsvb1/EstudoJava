package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {
	
	public static void main(String[] args) {
		
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		for(int qtd = 1 ; qtd <=2; qtd++) {
		
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno "+qtd+" ?");
		String idade = JOptionPane.showInputDialog("Qual a idade "+qtd+" ?");
		
		
		Aluno aluno = new Aluno();
		
		aluno.setNome(nome);
		aluno.setIdade((Integer.valueOf(idade)));

		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("Banco de dados");
		disciplina1.setNota(0);
		
		for(int pos = 1; pos <= 4; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina "+pos+" ?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina "+pos+" ?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno.getDisciplinas().add(disciplina);
		}
		
		
		alunos.add(aluno);
	}
		
		for (int pos = 0; pos < alunos.size(); pos++) {
			
			Aluno aluno = alunos.get(pos);
			
			System.out.println("Aluno = " + aluno.getNome());
			
			
			for(int posd =0; posd < aluno.getDisciplinas().size(); posd ++){
				Disciplina disc = aluno.getDisciplinas().get(posd);
				System.out.println("Disciplina: " + disc.getDisciplina() + " --- Nota: " + disc.getNota());
			}
			
			
			System.out.println("Média do aluno = " + aluno.getMediaNota());
			System.out.println("Resultado = " + aluno.GetAlunoAprovado2());
			System.out.println("#==============================================================================================================#");
		}
	}

	/*
	 * System.out.println("Nome: " + aluno2.getNome() + "\nIdade: " + aluno2.getIdade() + " anos" + 
		"\nMedia: " +aluno2.getMediaNota());
		System.out.println(aluno2.getDisciplinas() + "\n"+aluno2.GetAlunoAprovado2());
		System.out.println("#==============================================================================================================#");
	 * */
	
	
}
