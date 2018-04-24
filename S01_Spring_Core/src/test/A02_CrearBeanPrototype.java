package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import agenda.PersonaInterface;

public class A02_CrearBeanPrototype 
{

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		ApplicationContext ctx = new 
			ClassPathXmlApplicationContext(
					"A02applicationContext.xml");
		System.out.println("------ Obtención del objeto -----");
		PersonaInterface p = 
			(PersonaInterface) ctx.getBean("unaPersona");
		p.setNombre("Pepe");
		p.setTelefono("663744832");
		System.out.println("p:" + p);
		PersonaInterface z =
			(PersonaInterface) ctx.getBean("unaPersona");
		System.out.println("z:" + z);
		// Por defecto getBean implementa el patrón
		// Singleton, siempre retorna para una clave
		// el mismo objeto. O lo que es lo mismo, 
		// crea una sola vez el objeto para una id.
	}
}
