package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import agenda.CalendarioInterface;

public class E03_EjercicioContextoReferencias 
{
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("E03applicationContext.xml");
		//Calendario calendario = (Calendario) ctx.getBean("miCalendario");
		CalendarioInterface calendario = (CalendarioInterface) ctx.getBean(CalendarioInterface.class);
		System.out.println(calendario);
	}
	
	
}
