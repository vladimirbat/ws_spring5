package test;

import java.sql.Connection;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class E02_CrearConexion 
{
	public static void main(String[] args) throws Exception 
	{
		BeanFactory ctx = 
			new ClassPathXmlApplicationContext(
					"E02applicationContext.xml");
		DataSource dataSource= (DataSource) ctx.getBean("dataSource");
		String sql = "SELECT nombre FROM clientes " +
				"where dni < 11";
		Connection conexion = dataSource.getConnection();
		ResultSet rs = 
			conexion.createStatement().executeQuery(sql);
		while(rs.next())
			System.out.println("->" + rs.getString(1));
		conexion.close();
	}
}
