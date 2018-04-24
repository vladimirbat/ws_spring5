package controladores;

import java.util.Map;

import modelo.CalculadoraModelo;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import excepciones.OperacionDesconocidaException;

@Controller
@RequestMapping(value={"/calcular"}) //Toda la clase atiende a la petición /calcular
public class M02CalculadoraControlador {
	@RequestMapping(method=RequestMethod.GET)
	public String entradaCalculadora()
	{
		return "M02_calculadora_frm";
	}
	@RequestMapping(method=RequestMethod.POST)
	public String realizarOperacion(
			@RequestParam("txta") String txta,
			@RequestParam("txtb") String txtb,
			@RequestParam("operacion") String op,
			Map<String,Object> modelo){
		// Creación de un objeto del modelo
		CalculadoraModelo calc = new CalculadoraModelo(txta, txtb, op);
		// Ejecutar la lógica de negocio
		try
		{
			calc.calcular();
			modelo.put("CALC", calc);
			String usuario = SecurityContextHolder.getContext().getAuthentication().getName();
			System.out.println("El usuaro " + usuario + " ha realizado la operción correctamente");
			return "M02_calculadora_ok";
		}
		catch(NumberFormatException e)
		{
			modelo.put("ERR", "a y b deben ser números");
			return "M02_calculadora_frm";
		}
		catch(OperacionDesconocidaException e)
		{
			modelo.put("ERR", "Operación desconocida");
			return "M02_calculadora_frm";
		}
		catch(ArithmeticException e)
		{
			modelo.put("ERR", "Resultado demasiado grande o pequeño");
			return "M02_calculadora_frm";
		}
	}
		
}
