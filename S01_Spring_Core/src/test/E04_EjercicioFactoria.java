package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import agenda.CalendarioInterface;

public class E04_EjercicioFactoria 
{
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("E04applicationContext.xml");
		CalendarioInterface calendario = (CalendarioInterface) ctx.getBean(CalendarioInterface.class);
		System.out.println(calendario);
	}
	
	
}
