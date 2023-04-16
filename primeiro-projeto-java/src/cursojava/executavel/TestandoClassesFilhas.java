package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Inspetor;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {
	
	public static void main(String[] args) {
		
		
		
		Aluno aluno = new Aluno();
		aluno.setNome("ewerton");
		
		
		Diretor diretor = new Diretor();
		diretor.setRegistro("24587");
		
		
		Secretario secretario = new Secretario();
		secretario.setRegistroSec("000154");
		
		Inspetor inspetor = new Inspetor();
		
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		System.out.println(inspetor);
		
		System.out.println("Salário Diretor: " + diretor.salario() + "\nSalário Secretário: " + secretario.salario() + "\nSalário Inspetor: " + inspetor.salario());
	}

}
