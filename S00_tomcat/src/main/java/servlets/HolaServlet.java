package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;


@WebServlet (value="/hola")
public class HolaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.append("Hola desde: ").append(request.getContextPath());
		try {
			//Obtenemos una conexión
			Context ctx = new InitialContext();
			//Solamente en tomcat es necesario "java:comp/env"
			DataSource ds = (DataSource)  ctx.lookup("java:comp/env/jdbc/DATOS");
			try (Connection conexion = ds.getConnection();){
				ResultSet rs = conexion.createStatement().executeQuery("select * from clientes");
				while(rs.next()) {
					out.append(rs.getString("nombre")+"\n");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
