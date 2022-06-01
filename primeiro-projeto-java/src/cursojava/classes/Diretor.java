package cursojava.classes;

public class Diretor extends Pessoa {

	private String registro;
	private String tempoDirecao;
	
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getTempoDirecao() {
		return tempoDirecao;
	}
	public void setTempoDirecao(String tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	@Override
	public String toString() {
		return "Diretor [registro=" + registro + ", tempoDirecao=" + tempoDirecao + ", nome=" + nome + ", idade="
				+ idade + "]";
	}
	
	
	
}
