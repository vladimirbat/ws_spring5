package agenda;

public class Dia {
	private int dia;
	private String mes;
	
	
	
	
	public Dia(int dia, String mes) {
		super();
		this.dia = dia;
		this.mes = mes;
	}
	public Dia() 
	{
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
}
