package cursojava.executavel;

public class ArrayVector {

	public static void main(String[] args) {
		
		// Array pode ser de todos os tipos de dados e também de objetos
		
		// Array sempre deve ter a quantidade de posições definidas 

		double[] notas = new double[4]; // -> array do tipo double, onde "notas" é a variável desse ARRAY,  e tme o new double com 4 posições
		// sempre vai começar em 0
		double media;
		notas[0]= 8;
		notas[1]= 5;
		notas[2] = 3;
		notas[3] = 4;
		
		media = (notas[0]+notas[1]+notas[2]+notas[3])/4;
		
		for (int pos = 0; pos <4; pos++) {
			System.out.println("Nota " + (pos +1) + "º é = " + notas[pos]);
		}
		
		System.out.println("A média é:  " + media);
	}

}
