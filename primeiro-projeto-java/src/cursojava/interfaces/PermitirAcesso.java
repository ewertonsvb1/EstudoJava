package cursojava.interfaces;

// essa interface vai ser o contrato de autenticacao
public interface PermitirAcesso {

	
	
	public boolean autenticar(String login, String senha);
	public boolean autenticar();
	
}
