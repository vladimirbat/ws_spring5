package agenda;

public class Calendario implements CalendarioInterface
{
	private Dia primero;
	private Dia ultimo;
	public Calendario() {
		
	}
	public String toString() {
		return primero.getDia() + " - " + ultimo.getDia() + " de " + primero.getMes();  
	}
	public Dia getPrimero() {
		return primero;
	}
	public void setPrimero(Dia primero) {
		this.primero = primero;
	}
	public Dia getUltimo() {
		return ultimo;
	}
	public void setUltimo(Dia ultimo) {
		this.ultimo = ultimo;
	}
	
}
