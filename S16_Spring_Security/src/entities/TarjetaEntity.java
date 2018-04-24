package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TARJETAS")
public class TarjetaEntity {
	@Id
	@Column(name="NUM_TARJETA")
	@GeneratedValue(strategy=GenerationType.IDENTITY)//Indica que el campo lo genera la bbdd.
	private long numTarjeta;
	@Column
	private String tipo;
	@Column(name="DNI_TITULAR")
	private long dniTitular;
	
	public TarjetaEntity() {
		
	}
	public TarjetaEntity(String tipo, long dniTitular) {
		this.tipo = tipo;
		this.dniTitular = dniTitular;
	}
	@Override
	public String toString() {
		return "TarjetaEntity [numTarjeta=" + numTarjeta + ", tipo=" + tipo
				+ ", dniTitular=" + dniTitular + "]";
	}
	// ------------- GETTERS Y SETTERS ------------------
	public long getNumTarjeta() {
		return numTarjeta;
	}
	public void setNumTarjeta(long numTarjeta) {
		this.numTarjeta = numTarjeta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public long getDniTitular() {
		return dniTitular;
	}
	public void setDniTitular(long dniTitular) {
		this.dniTitular = dniTitular;
	}
	
}












