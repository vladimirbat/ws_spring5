package entities;

public class MiCliente 
{
	public static long DNI = 1000;
	public static String NOMBRE = "Vladimir";
	public static String APELLIDOS = "Bataller";
	public static double SALDO = 100.0;
	
	public static ClienteEntity getMiCliente()
	{
		return new ClienteEntity(DNI, NOMBRE, APELLIDOS, SALDO);
	}
	public static long generar(long max)
	{
		return (long)(Math.random() * max);
	}
	public static long generar(long min ,long max)
	{
		return min + (long)(Math.random() * (max-min));
	}
	
}
