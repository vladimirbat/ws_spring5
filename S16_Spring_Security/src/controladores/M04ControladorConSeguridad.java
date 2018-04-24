package controladores;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import persistencia.BancoDaoInterface;
import entities.ClienteEntity;
import excepciones.BbddException;

@Controller
public class M04ControladorConSeguridad {
	@Autowired
	BancoDaoInterface bancoDaoSeguro;
	
	@RequestMapping(value={"/buscar_seguridad"}, method=RequestMethod.GET)
	public String entradaABuscar()
	{
		return "M04_buscar_seguridad";
	}
	@RequestMapping(value={"/buscar_seguridad"}, method=RequestMethod.POST)
	public String realizarBusqueda(
			@RequestParam("apellidos") String ape,
			Map<String,Object> modelo){
		// Validación de los datos de entrada
		if(ape==null || ape.trim().length()==0)
		{
			modelo.put("ERR", "Debe indicarse un apellido");
			return "M04_buscar_seguridad";
		}
		// Ejecutar la lógica de negocio
		try
		{
			List<ClienteEntity> clientes = bancoDaoSeguro.buscarPorApellidos(ape);
			modelo.put("CLIENTES", clientes);
			return "M04_buscar_seguridad";
		}
		catch(DataAccessException e)
		{
			modelo.put("ERR", "La bbdd no está operativa");
			return "M04_buscar_seguridad";
		}
	}
	

	
}
