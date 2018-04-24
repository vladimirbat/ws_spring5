package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import agenda.Familia;

public class A06_ReferenciaBeans
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		System.out.println("---- Cargar contexto ----");
		ClassPathXmlApplicationContext ctx =
			new ClassPathXmlApplicationContext(
					"A06applicationContext.xml");
		System.out.println("---- Obtener Familia ----");
		Familia familia = 
			(Familia) ctx.getBean("unaFamilia");
		System.out.println("---- Imprimir Familia ----");
		System.out.println(familia);
//		PersonaInterface padre = (PersonaInterface)ctx.getBean("unPadre");
//		System.out.println("Otro Padre: " + padre);
//		System.out.println("Iguales: " + (familia.getPadre()==padre));
	}
}
