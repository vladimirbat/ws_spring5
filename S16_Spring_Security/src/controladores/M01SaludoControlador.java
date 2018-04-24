package controladores;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class M01SaludoControlador {
	@RequestMapping(value={"/saludar"},method=RequestMethod.GET)
	public String saludo(Map<String,Object> modelo){
		modelo.put("mensaje", "Hola desde Spring");
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
		modelo.put("hora", sdf.format(new Date()));
		return "M01_saludo_ok";//Redireccionamos al "WEB-INF/jsp/M01_saludo_ok.jsp"
	}
}
