package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import agenda.PersonaInterface;

public class A11_VariosContextosImport 
{
	public static void main(String[] args) 
	{
		
		ApplicationContext ctx =
			new ClassPathXmlApplicationContext(
					"A11applicationContext.xml");
		PersonaInterface p = (PersonaInterface) ctx.getBean(
						"unaPersona");
		System.out.println("De los dos xml a igualda de id" +
				" prevalece el del último xml");
		System.out.println("unaPersona->" +p);
		PersonaInterface q = (PersonaInterface) ctx.getBean("segundaPersona");
		System.out.println("Bean que está en uno de los dos xml");
		System.out.println("segundaPersona->" +q);
		PersonaInterface r = (PersonaInterface) ctx.getBean("terceraPersona");
		System.out.println("Bean que está en uno de los dos xml");
		System.out.println("terceraPersona->" +r);
	}
}
