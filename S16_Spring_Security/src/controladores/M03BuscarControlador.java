package controladores;

import java.util.List;
import java.util.Map;

import modelo.CalculadoraModelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import persistencia.BancoDaoInterface;
import entities.ClienteEntity;
import excepciones.OperacionDesconocidaException;

@Controller
public class M03BuscarControlador {
	@Autowired
	BancoDaoInterface bancoDao;
	@RequestMapping(value={"/buscar"}, method=RequestMethod.GET)
	public String entradaABuscar()
	{
		return "M03_buscar";
	}
	@RequestMapping(value={"/buscar"}, method=RequestMethod.POST)
	public String realizarBusqueda(
			@RequestParam("apellidos") String ape,
			Map<String,Object> modelo){
		// Validación de los datos de entrada
		if(ape==null || ape.trim().length()==0)
		{
			modelo.put("ERR", "Debe indicarse un apellido");
			return "M03_buscar";
		}
		// Ejecutar la lógica de negocio
		try
		{
			List<ClienteEntity> clientes = bancoDao.buscarPorApellidos(ape);
			modelo.put("CLIENTES", clientes);
			return "M03_buscar";
		}
		catch(DataAccessException e)
		{
			modelo.put("ERR", "La bbdd no está operativa");
			return "M03_buscar";
		}
	}
		
}
