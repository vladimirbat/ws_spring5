package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import agenda.PersonaInterface;

public class A05_CrearBeanConstructor 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext ctx =
			new ClassPathXmlApplicationContext(
					"A05applicationContext.xml");
		PersonaInterface p = 
			(PersonaInterface) ctx.getBean("unaPersona");
		System.out.println(p);
		System.out.println(p.getId());
	}
}
