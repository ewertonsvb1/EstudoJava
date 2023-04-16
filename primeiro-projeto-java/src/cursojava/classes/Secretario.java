package cursojava.classes;

import cursojava.interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso{
	
	private String registroSec;
	private String experiencia;
	
	private String login;
	private String senha;
	
	public Secretario(String login, String senha) {
		
	}
	public Secretario() {
		this.login = login;
		this.senha = senha;
	}
	
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
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return  3000;
	}
	
	
	@Override
	public boolean autenticar(String login, String senha) {
		this.login = login;
		this.senha = senha;
		return autenticar();
		
	
	}
	@Override
	public boolean autenticar() {
		return login.equals("sec") && senha.equals("123");
	}

	
	
}
