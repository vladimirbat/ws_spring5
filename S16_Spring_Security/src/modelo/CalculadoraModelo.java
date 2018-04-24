package modelo;

import java.io.Serializable;

import excepciones.OperacionDesconocidaException;
@SuppressWarnings("serial")
public class CalculadoraModelo implements Serializable
{
	public CalculadoraModelo(String txta, String txtb, String operacion) {
		this.txta = txta;
		this.txtb = txtb;
		this.operacion = operacion;
	}
	public CalculadoraModelo() {

	}
	private String txta;
	private String txtb;
	private double resultado;
	private String operacion;
	
	public void calcular()
	{
		double a = Double.parseDouble(txta);//NumberFormatException
		double b = Double.parseDouble(txtb);
		if(operacion.trim().equals("+"))
		{
			resultado = a + b;
		}
		else if(operacion.trim().equals("-"))
		{
			resultado = a - b;
		}
		else if(operacion.trim().equals("x"))
		{
			resultado = a * b;
		}
		else if(operacion.trim().equals("/"))
		{
			resultado = a / b;
		}
		else 
		{
			throw new OperacionDesconocidaException();
		}
		
		if(Double.isInfinite(resultado) || Double.isNaN(resultado))
			throw new ArithmeticException();
	}
	
	public String toString() 
	{
		return txta  + " " + operacion + " " + txtb + " = "
			+ resultado;
	}
	
	public String getTxta() {
		return txta;
	}
	public void setTxta(String txta) {
		this.txta = txta;
	}
	public String getTxtb() {
		return txtb;
	}
	public void setTxtb(String txtb) {
		this.txtb = txtb;
	}
	public double getResultado() {
		return resultado;
	}
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	public String getOperacion() {
		return operacion;
	}
	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}
	
	
	
}
