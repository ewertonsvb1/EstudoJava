package cursojava.classes;

public abstract class Pessoa {

	// PROTECTED, CONSIGO COMPARTILHAR COM AS CLASSES FILHAS
	protected String nome;
	protected int idade;
	// METODO ABSTRATO FICA NA CLASSE PAI, EH OBRIGATORIO NAS CLASSES FILHAS
	public abstract double salario();
	
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
