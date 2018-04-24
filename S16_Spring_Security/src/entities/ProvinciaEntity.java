package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="PROVINCIAS")
public class ProvinciaEntity implements Serializable 
{
	@Id
	@Column(name="ID_PROVINCIA")
	private int idProvincia;
	@Column(name="PROVINCIA")
	private String nomProvincia;
	
	public ProvinciaEntity() {
		
	}
	
	public ProvinciaEntity(int idProvincia, String nomProvincia) {
		this.idProvincia = idProvincia;
		this.nomProvincia = nomProvincia;
	}

	@Override
	public String toString() {
		return idProvincia	+ ".-" + nomProvincia;
	}
	// ------------- GETTERS Y SETTERS ---------------
	public int getIdProvincia() {
		return idProvincia;
	}
	public void setIdProvincia(int idProvincia) {
		this.idProvincia = idProvincia;
	}
	public String getNomProvincia() {
		return nomProvincia;
	}
	public void setNomProvincia(String nomProvincia) {
		this.nomProvincia = nomProvincia;
	}

	
	
}








