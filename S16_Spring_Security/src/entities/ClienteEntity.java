package entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity //Los objetos de esta clase se pueden enviar a la bbdd mediante jpa.
@Table (name="CLIENTES") //Indica que los objetos de esta clase se guardan en la tabla CLIENTES.
@SuppressWarnings("serial")
public class ClienteEntity implements Serializable
{
	// ---------- JAVA BEANS --------------
	// 1.- Atributos privados con métodos get y set.
	// 2.- Constructor sin argumentos.
	// 3.- Implementan la interface Serializable.
	
	// ----- Atributos de la clase -------------
	@Id
	private long dni;
	@Column(name="NOMBRE")
	private String nombre;
	@Column
	private String apellidos;
	@Column
	private double saldo;
	@ManyToOne(fetch=FetchType.EAGER) //Relación Na1(EAGER es la opción por defecto para Na1)
	@JoinColumn(name="ID_PROVINCIA")//Campo de CLIENTES que apunta a la PK de PROVINCIAS
	//@JoinFetch()//Trae en la misma consulta de los clientes, la provincia de cada uno.
	private ProvinciaEntity provincia;
	@OneToMany(fetch=FetchType.LAZY) //Relación 1aN (LAZY es la opción por defecto para 1aN)
	@JoinColumn(name="DNI_TITULAR")//Campo de TARJETAS que apunta a la PK de CLIENTES
	//@JoinFetch(JoinFetchType.OUTER)//Trae en la misma consulta de los clientes, sus tarjetas. 
	private Set<TarjetaEntity> tarjetas;
	@ManyToMany
	@JoinTable(name="CUENTAS_CLIENTES", // Tabla intermedia
		joinColumns={@JoinColumn(name="DNI")}, //Campo de la tabla intermedia que apunta a la pk de CLIENTES
		inverseJoinColumns={@JoinColumn(name="ID_CUENTA")})//Campo de la tabla intermedia que apunta a la pk de CUENTAS
	Set<CuentaEntity> cuentas;
	
	// ----------- CONSTRUCTORES -------------------------
	public ClienteEntity() {
	}
	public ClienteEntity(long dni, String nombre, String apellidos, double saldo) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		String s =  "[dni=" + dni + ", nombre=" + nombre
				+ ", apellidos=" + apellidos + ", saldo=" + saldo ;
		if(this.getProvincia()!=null)
			s += ", provincia = " + getProvincia().getNomProvincia();
		return s + "]";
	}
	public String imprimirTarjetas()
	{
		String s = "";
		for (TarjetaEntity t : tarjetas) {
			s += "\t" + t.getNumTarjeta() + " - " + t.getTipo() + "\n";
		}
		return s;
	}
	public String imprimirCuentas()
	{
		String s = "";
		for (CuentaEntity cu : cuentas) {
			s += "\t" + cu + "\n";
		}
		return s;
	}
	// método equals
	@Override
	public boolean equals(Object obj) {
		ClienteEntity c = (ClienteEntity) obj;
		return this.dni==c.getDni() && this.nombre.equals(c.getNombre()) 
					&& this.apellidos.equals(c.getApellidos()) && this.saldo == c.getSaldo(); 
	}
	// ----------- GETTERS Y SETTERS -------------------
	public long getDni() {
		return dni;
	}
	public void setDni(long dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public ProvinciaEntity getProvincia() {
		return provincia;
	}
	public void setProvincia(ProvinciaEntity provincia) {
		this.provincia = provincia;
	}
	public Set<TarjetaEntity> getTarjetas() {
		return tarjetas;
	}
	public void setTarjetas(Set<TarjetaEntity> tarjetas) {
		this.tarjetas = tarjetas;
	}
	public Set<CuentaEntity> getCuentas() {
		return cuentas;
	}
	public void setCuentas(Set<CuentaEntity> cuentas) {
		this.cuentas = cuentas;
	}
	
	
}












