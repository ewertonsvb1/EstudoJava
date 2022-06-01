package cursojava.classes;

public abstract class Pessoa {

	// PROTECTED, CONSIGO COMPARTILHAR COM AS CLASSES FILHAS
	protected String nome;
	protected int idade;
	
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
	
	
	
	
	
}
