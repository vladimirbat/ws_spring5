package agenda;

import java.util.List;
import java.util.Vector;

public class ListaComplejos 
{
	private List<NumeroComplejo> numeros;
	public ListaComplejos() 
	{
		numeros = new Vector<NumeroComplejo>();
	}
	public NumeroComplejo sumaTodos()
	{
		NumeroComplejo total= new NumeroComplejo(0,0);
		for (int i = 0; i < numeros.size(); i++) 
		{
			total.setX(total.getX() + numeros.get(i).getX());
			total.setY(total.getY() + numeros.get(i).getY());
		}
		return total;
	}
	public List<NumeroComplejo> getNumeros() {
		return numeros;
	}
	public void setNumeros(List<NumeroComplejo> numeros) {
		this.numeros = numeros;
	}
	
}
