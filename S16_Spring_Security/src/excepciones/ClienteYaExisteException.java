package excepciones;

import entities.ClienteEntity;



@SuppressWarnings("serial")
public class ClienteYaExisteException extends RuntimeException 
{
	ClienteEntity cliente;
	public ClienteYaExisteException(ClienteEntity cliente) 
	{
		this.cliente= cliente;
	}
	public ClienteYaExisteException(Exception e,ClienteEntity cliente) 
	{
		super(cliente.getDni() + "");
		this.cliente= cliente;
	}
	public ClienteEntity getCliente() {
		return cliente;
	}
	public void setCliente(ClienteEntity cliente) {
		this.cliente = cliente;
	}
}
