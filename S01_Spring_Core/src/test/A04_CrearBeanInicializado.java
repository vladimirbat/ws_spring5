package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import agenda.PersonaInterface;

public class A04_CrearBeanInicializado 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
//		BeanFactory ctx = new ClassPathXmlApplicationContext(
//					"A04applicationContext.xml");
		BeanFactory ctx = new FileSystemXmlApplicationContext(
			"src/A04applicationContext.xml");
		PersonaInterface p = 
			(PersonaInterface) ctx.getBean("unaPersona");
		System.out.println(p);
		System.out.println(p.getId());
	}
}
