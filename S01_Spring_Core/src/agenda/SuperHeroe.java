package agenda;

public class SuperHeroe extends Persona
{
	String superpoder;
	public SuperHeroe() 
	{
		superpoder="volar";
	}
	@Override
	public String toString() 
	{
		return "Super heroe que puede " + superpoder 
			 +"->" + super.toString();
	}
	public String getSuperpoder() 
	{
		return superpoder;
	}

	public void setSuperpoder(String superpoder) {
		this.superpoder = superpoder;
	}
	
}
