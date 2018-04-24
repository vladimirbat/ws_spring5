package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import agenda.PersonaInterface;

public class A12_ContextosJerarquicos 
{
	public static void main(String[] args) 
	{
		System.out.println("---- Creacion del contexto padre -----");
		ApplicationContext ctxPadre = 
			new ClassPathXmlApplicationContext(
				"A10A_applicationContext.xml");
		System.out.println("---- Creacion del contexto hijo -----");
		ApplicationContext ctxHijo = 
			new ClassPathXmlApplicationContext(
				new String[]{"A10B_applicationContext.xml"}
				,ctxPadre);
		PersonaInterface p = (PersonaInterface) ctxHijo.getBean("unaPersona");
		System.out.println("De los dos xml a igualda de id" +
				" prevalece el del contexto hijo");
		System.out.println("unaPersona->" +p);
		PersonaInterface q = (PersonaInterface) ctxHijo.getBean("segundaPersona");
		System.out.println("Bean que está en uno de los dos xml");
		System.out.println("segundaPersona->" +q);
		PersonaInterface r = (PersonaInterface) ctxHijo.getBean("terceraPersona");
		System.out.println("Bean que está en uno de los dos xml");
		System.out.println("terceraPersona->" +r);
		System.out.println("-------Tambien puedo acceder solamente al contexto padre ------");
		PersonaInterface pp = (PersonaInterface) 
			ctxPadre.getBean("unaPersona");
		System.out.println("unaPersona del ctxPadre->" +pp);
		pp = (PersonaInterface) 
			ctxHijo.getParent().getBean("unaPersona");
		System.out.println("unaPersona del ctx Parent->" +pp);
	
		
		
	}
}
