package entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="CUENTAS")
public class CuentaEntity implements Serializable 
{
	@Id
	@Column(name="ID_CUENTA")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCuenta;
	@Column
	private double saldo;
	@ManyToMany
	@JoinTable(name="CUENTAS_CLIENTES", // Tabla intermedia
		joinColumns={@JoinColumn(name="ID_CUENTA")}, 
		inverseJoinColumns={@JoinColumn(name="DNI")})
	Set<ClienteEntity> clientes;
	
	
	public CuentaEntity() {
		
	}
	public CuentaEntity(double saldo) {
		this.saldo = saldo;
	}
	public String imprimirTitularesDeLaCuenta()
	{
		String s ="";
		for (ClienteEntity c : clientes) {
			s += "\t" + c + "\n";
		}
		return s;
	}

	@Override
	public String toString() {
		return "Num. cuenta: " + idCuenta + "--->" + saldo + " EUR";
	}
	// ------------- GETTERS Y SETTERS ---------------
	public int getIdCuenta() {
		return idCuenta;
	}
	public void setIdCuenta(int idCuenta) {
		this.idCuenta = idCuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Set<ClienteEntity> getClientes() {
		return clientes;
	}
	public void setClientes(Set<ClienteEntity> clientes) {
		this.clientes = clientes;
	}
	
	
}








