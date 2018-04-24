package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import agenda.PersonaInterface;

public class E01_Genealogico 
{
	public static void main(String[] args) 
	{
		BeanFactory ctx = 
			new	ClassPathXmlApplicationContext(
					"E01applicationContext.xml");
		PersonaInterface p = 
			(PersonaInterface) ctx.getBean("yo");
		System.out.println(p.imprimirArbol(""));
	}
}
