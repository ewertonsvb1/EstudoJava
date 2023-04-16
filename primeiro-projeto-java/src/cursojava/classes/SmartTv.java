package cursojava.classes;

public class SmartTv {
	public Boolean ligada=false;
	public int canal=1 ;
	public int volume=21;
	
	public Boolean ligarTv() {
		return ligada=true;
		
	}
	public Boolean desligarTv() {
		return ligada;
		
	}
	
	public int mudarCanalCima() {
		return canal++;
		
	}
	
	public int mudarCanalbaixo() {
		return canal--;
		
	}
	
	public int aumentarVolume() {
		return volume++;
	}
	
	public int diminuirVolume() {
		return volume--;
	}

}
