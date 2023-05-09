package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVector {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setNome("Ewerton");

		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Spring Boot");
		double[] notas = { 2, 6, 5, 5 };
		disciplina.setNota(notas);
		aluno.getDisciplinas().add(disciplina);

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Java");
		double[] notas2 = { 1, 5, 8.9, 9, };
		disciplina2.setNota(notas2);
		aluno.getDisciplinas().add(disciplina2);
		
		System.out.println("Nome do aluno: " + aluno.getNome());
		
		//percorre as disciplinas
		for(Disciplina disc : aluno.getDisciplinas()) {
			
			System.out.println("Disciplina: " + disc.getDisciplina());
			
			// e para cada disciplina, eu percorro as notas
			double notaMaxima = 0.0;
			double notaMinima = 0.0;
			for(int pos = 0; pos < disc.getNota().length; pos++) {
				System.out.println("Nota : " + disc.getNota()[pos]);
				
				
				// se a posicao for zero entao...
				if(pos==0) {
					// armazena a primeira nota como sendo a maior nota
					notaMaxima = disc.getNota()[pos];
					notaMinima = disc.getNota()[pos];
				}else {
					// se a proxima nota for maior que a nota anterior, então "notaMaxima" recebe o valor dessa nota maior
					if (disc.getNota()[pos] > notaMaxima) {
						notaMaxima = disc.getNota()[pos];
					}if (disc.getNota()[pos] < notaMinima) {
						notaMinima = disc.getNota()[pos];
					}
				}
			}
			
			//Manipulando Array de Objetos parei aqyu
			System.out.println("A maior nota da disciplina: *" + disc.getDisciplina() + "* é de: " + notaMaxima);
			System.out.println("A menor nota da disciplina: *" + disc.getDisciplina() + "* é de: " + notaMinima);
		}
		

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
