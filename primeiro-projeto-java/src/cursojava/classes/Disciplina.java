package cursojava.classes;

import java.util.Objects;

public class Disciplina {
	
	private String disciplina;
	private double nota;

	
	public double getN1() {
		return nota;
	}
	public void setN1(double nota) {
		this.nota = nota;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	@Override
	public String toString() {
		return "Disciplina: " + disciplina + " Nota: " + nota;
	}
	@Override
	public int hashCode() {
		return Objects.hash(disciplina, nota);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return Objects.equals(disciplina, other.disciplina)
				&& Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota);
	}
	
	
	

}
