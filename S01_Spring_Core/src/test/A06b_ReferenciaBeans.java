package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import agenda.Familia;

public class A06b_ReferenciaBeans
{
	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext ctx =
			new ClassPathXmlApplicationContext(
					"A06bapplicationContext.xml");
		Familia familia = 
			(Familia) ctx.getBean("unaFamilia");
		System.out.println(familia);
	}
}
