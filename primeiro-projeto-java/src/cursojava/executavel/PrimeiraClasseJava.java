package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		
		String login = JOptionPane.showInputDialog("Qual o login?");
		String senha = JOptionPane.showInputDialog("Qual a senha?");
		
		//CONDICAO DE LOGIN
		if(login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("123")) {
		
		// CRIANDO LISTA DE ALUNOS
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		// CRIANDO LISTA DE STATUS DOS ALUNOS
		List<Aluno> alunosAprovados = new ArrayList<Aluno>();
		List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
		List<Aluno> alunosReprovados = new ArrayList<Aluno>();
		
		
		// FAZ A CONTAGEM DOS ALUNOS 
		for (int qtd = 1; qtd <= 2; qtd++) {

			String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + " ?");
			String idade = JOptionPane.showInputDialog("Qual a idade " + qtd + " ?");

			Aluno aluno = new Aluno();

			aluno.setNome(nome);
			aluno.setIdade((Integer.valueOf(idade)));

			Disciplina disciplina1 = new Disciplina();
			disciplina1.setDisciplina("");
			disciplina1.setNota(0);

			for (int pos = 1; pos <= 4; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + " ?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno.getDisciplinas().add(disciplina);
			}

			alunos.add(aluno);
		}

		// LISTA DE STATUS
		for (Aluno aluno : alunos) {
			
			if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				alunosAprovados.add(aluno);
			}else {
				if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					alunosRecuperacao.add(aluno);
				}else {
					alunosReprovados.add(aluno);
				}
			}
		}

		for (int pos = 0; pos < alunos.size(); pos++) {

			Aluno aluno = alunos.get(pos);

			System.out.println("Aluno = " + aluno.getNome());

			for (int posd = 0; posd < aluno.getDisciplinas().size(); posd++) {
				Disciplina disc = aluno.getDisciplinas().get(posd);
				System.out.println("Disciplina: " + disc.getDisciplina() + " --- Nota: " + disc.getNota());
			}

			System.out.println("Média do aluno = " + aluno.getMediaNota());
			System.out.println("Resultado = " + aluno.getAlunoAprovado2());
			System.out.println("#==============================================================================================================#");
		}
	}else {
		System.out.println("Login ou senha inválidos!");
	}

	/*
	 * System.out.println("Nome: " + aluno2.getNome() + "\nIdade: " +
	 * aluno2.getIdade() + " anos" + "\nMedia: " +aluno2.getMediaNota());
	 * System.out.println(aluno2.getDisciplinas() +
	 * "\n"+aluno2.GetAlunoAprovado2()); System.out.println(
	 * "#==============================================================================================================#"
	 * );
	 */
	}
}
