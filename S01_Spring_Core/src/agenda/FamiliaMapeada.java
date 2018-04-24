package agenda;

import java.util.Map;

public class FamiliaMapeada 
{
	private PersonaInterface padre;
	private PersonaInterface madre;
	private Map<String,PersonaInterface> hijos;
	
	
	public PersonaInterface getPadre() {
		return padre;
	}
	public void setPadre(PersonaInterface padre) {
		this.padre = padre;
	}
	public PersonaInterface getMadre() {
		return madre;
	}
	public void setMadre(PersonaInterface madre) {
		this.madre = madre;
	}
	public Map<String, PersonaInterface> getHijos() {
		return hijos;
	}
	public void setHijos(Map<String, PersonaInterface> hijos) {
		this.hijos = hijos;
	}
	
	
	
	
}
