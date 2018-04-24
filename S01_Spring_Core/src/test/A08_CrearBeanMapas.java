package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import agenda.FamiliaMapeada;

public class A08_CrearBeanMapas 
{
	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext ctx =
			new ClassPathXmlApplicationContext("A08applicationContext.xml");
		FamiliaMapeada familia = (FamiliaMapeada) ctx.getBean("unaFamilia");
		System.out.println("Miembros de la familia");
		System.out.println("Padre:" + familia.getPadre());
		System.out.println("Madre:" + familia.getMadre());
		System.out.println("Hijos:");
		System.out.println("\tMayor:" + familia.getHijos().get("mayor"));
		System.out.println("\tMenor:" + familia.getHijos().get("menor"));
		System.out.println("Tipo mapa: " + 
				familia.getHijos().getClass().getName());

	}
}
