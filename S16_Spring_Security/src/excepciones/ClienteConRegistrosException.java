package excepciones;

import entities.ClienteEntity;



@SuppressWarnings("serial")
public class ClienteConRegistrosException extends RuntimeException 
{
	ClienteEntity cliente;
	public ClienteConRegistrosException(String msg) 
	{
		super(msg);
	}
	public ClienteConRegistrosException(ClienteEntity cliente) 
	{
		this.cliente= cliente;
	}
	public ClienteConRegistrosException(Exception e,ClienteEntity cliente) 
	{
		super(cliente.getDni() + "");
		this.cliente= cliente;
	}
	public ClienteConRegistrosException(long dni) {
		super("" + dni);
	}
	public ClienteEntity getCliente() {
		return cliente;
	}
	public void setCliente(ClienteEntity cliente) {
		this.cliente = cliente;
	}
}
