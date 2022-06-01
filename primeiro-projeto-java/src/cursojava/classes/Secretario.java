package cursojava.classes;

public class Secretario extends Pessoa{
	
	private String registroSec;
	private String experiencia;
	
	public String getRegistroSec() {
		return registroSec;
	}
	public void setRegistroSec(String registroSec) {
		this.registroSec = registroSec;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	@Override
	public String toString() {
		return "Secretario [registroSec=" + registroSec + ", experiencia=" + experiencia + ", nome=" + nome + ", idade="
				+ idade + "]";
	}

	
	
}
