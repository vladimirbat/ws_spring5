package excepciones;

@SuppressWarnings("serial")
public class BbddException extends RuntimeException
{
	public String msg;
	public BbddException(String msg) 
	{
		this.msg= msg;
	}
	public BbddException() 
	{
		msg = "Error de conexion con la bbdd";
	}
	public BbddException(Exception e) 
	{
		super();
		msg = e.getMessage();
	}
	public BbddException(ClassNotFoundException e) 
	{
		super(e.getMessage());
		msg = "No se encuentra el driver de la bbdd";
	}
	@Override
	public String getMessage() 
	{
		return msg;
	}
}
