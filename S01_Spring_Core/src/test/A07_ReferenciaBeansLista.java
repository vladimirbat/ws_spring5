package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import agenda.Familia;

public class A07_ReferenciaBeansLista
{
	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext ctx =
			new ClassPathXmlApplicationContext(
					"A07applicationContext.xml");
		Familia familia = 
			(Familia) ctx.getBean("unaFamilia");
		System.out.println(familia);
		System.out.println("Tipo Lista: " + 
				familia.getHijos().getClass().getName());
		for(String x : familia.getDias())
		{
			System.out.println(x);
		}
	}
}
