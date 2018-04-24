package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import agenda.PersonaInterface;

public class A03_CrearBeanFactory 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
//		BeanFactory ctx = new 
//			XmlBeanFactory(
//				new FileSystemResource(
//						"src/A03applicationContext.xml"));
		BeanFactory ctx = new FileSystemXmlApplicationContext(
							"src/A03applicationContext.xml");
		PersonaInterface p = 
			(PersonaInterface) ctx.getBean("unaPersona");
		p.setNombre("Pepe");
		p.setTelefono("663744832");
		System.out.println("p: " + p);
		PersonaInterface z =
			(PersonaInterface) ctx.getBean("unaPersona");
		System.out.println("z: " + z);
		// Por defecto getBean implementa el patrón
		// Singleton, siempre retorna para una clave
		// el mismo objeto. O lo que es lo mismo, 
		// crea una sola vez el objeto para una id.
	}
}
