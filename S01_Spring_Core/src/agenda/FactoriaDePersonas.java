package agenda;

public class FactoriaDePersonas 
{
	// Metodo Factoria
	public static PersonaInterface createPepe(String tel)
	{
		System.out.println("Ejecutando metodo Factoria");
		return new Persona(300,"Pepe de Factoria",tel);
	}
}
