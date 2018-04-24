package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import agenda.PersonaInterface;

public class A09_FactoryMethod 
{
	public static void main(String[] args) 
	{
		ApplicationContext ctx = new 
			ClassPathXmlApplicationContext(
					"A09applicationContext.xml");
		PersonaInterface p = 
			(PersonaInterface) ctx.getBean("unaPersona");
		System.out.println("Clase: "+ p.getClass().getName());
		System.out.println(p);
	}
}
