package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import agenda.PersonaInterface;

public class A01_CrearBeanBasico 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		System.out.println("------ Creación del contexto ----");
		BeanFactory ctx = 	new ClassPathXmlApplicationContext(
				"A01applicationContext.xml");
		System.out.println("------ Obtención del objeto -----");
		PersonaInterface p = 
			(PersonaInterface) ctx.getBean("unaPersona");
		System.out.println("Clase: "+ p.getClass().getName());
		p.setNombre("Pepe");
		p.setTelefono("663744832");
		System.out.println("p:" + p);//toString
		// ¿Que pasa si al contexto le pido el objeto 
		// con la misma clave?
		PersonaInterface z =
			(PersonaInterface) ctx.getBean("unaPersona");
		System.out.println("z:" + z);// toString
		// Por defecto getBean implementa el patrón
		// Singleton, siempre retorna para una clave
		// el mismo objeto. O lo que es lo mismo, 
		// crea una sola vez el objeto para una id.
		
	}
}
