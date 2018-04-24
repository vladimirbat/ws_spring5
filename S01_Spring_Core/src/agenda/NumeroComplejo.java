package agenda;

public class NumeroComplejo {
	private double x;
	private double y;

	public NumeroComplejo(double x, double y) 
	{
		System.out.println("Numero complejo double, double");
		this.x = x;
		this.y = y;
	}
	public double getModulo()
	{
		return Math.sqrt(x*x+y*y);
	}
	public String toString() 
	{
		return "[" + x + "," + y + "]";
	}
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

}
