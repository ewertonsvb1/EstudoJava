package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVector {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setNome("Ewerton");

		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Spring Boot");
		double[] notas = { 5, 5, 5, 5 };
		disciplina.setNota(notas);

		aluno.getDisciplinas().add(disciplina);

		Disciplina disciplina2 = new Disciplina();
		disciplina.setDisciplina("Java");
		double[] notas2 = { 4, 5, 6, 7, };
		disciplina.setNota(notas);
		
		aluno.getDisciplinas().add(disciplina);
		
		System.out.println(disciplina);

////		// Array de String
//////		 String[] valores = new String[2];
//////		 
//////		 valores[0] = "teste";
//////		 valores[1] = "2";
////		
//		
//		String[] valores = {"Ewerton", "29", "Teste"};
//		
//		
//		
//		// Array pode ser de todos os tipos de dados e também de objetos
//		
//		// Array sempre deve ter a quantidade de posições definidas 
//
//		double[] notas = new double[4]; // -> array do tipo double, onde "notas" é a variável desse ARRAY,  e tme o new double com 4 posições
//		// sempre vai começar em 0
//		double media;
//		notas[0]= 8;
//		notas[1]= 5;
//		notas[2] = 3;
//		notas[3] = 4;
//		
//		media = (notas[0]+notas[1]+notas[2]+notas[3])/4;
//		
//		for (int pos = 0; pos< valores.length; pos++) {
//			System.out.println("Valor " + (pos +1) + "º é = " + valores[pos]);
//		}
//		
////		System.out.println("A média é:  " + media);
	}

}
