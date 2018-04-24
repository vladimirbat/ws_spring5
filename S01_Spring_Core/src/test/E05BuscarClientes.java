package test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class E05BuscarClientes 
{
	public static void main(String[] args) 
			throws ClassNotFoundException, SQLException 
	{
		String sql = "select dni,nombre,apellidos,saldo from clientes where dni>=1000";
		ApplicationContext ctx = new ClassPathXmlApplicationContext("E05applicationContext.xml");
		Connection con = (Connection) ctx.getBean("conexion");
		Statement sentencia = con.createStatement();
		ResultSet rs = sentencia.executeQuery(sql);
		while(rs.next())
		{
			System.out.print(rs.getInt("dni"));
			System.out.print(".- " + rs.getString(2));
			System.out.print(" " + rs.getString("apellidos"));
			System.out.println("-> " + rs.getDouble("saldo"));
		}
		con.close();
	}
}











