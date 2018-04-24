package test;

import java.util.Date;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class E06_CrearBeanDate 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("------ Creación del contexto ----");
		BeanFactory ctx = 	new ClassPathXmlApplicationContext(
				"E06applicationContext.xml");
		System.out.println("------ Obtención del objeto -----");
		Date a = (Date) ctx.getBean("ahora");
		System.out.println("Ahora: " + a);
		Thread.sleep(2000);
		Date b = (Date) ctx.getBean("ahora");
		System.out.println("Ahora: " + b);
	}
}
