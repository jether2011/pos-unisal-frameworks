package br.com.unisal.frameworks.domain.model;


import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name=Cidade.TABLE_NAME)
public class Cidade implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3861146837174742793L;
	
	public static final String TABLE_NAME = "TB_CIDADE";

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String nome;

	private double geocodigo;

	private double latitude;

	private double longitude;

	public Cidade() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getGeocodigo() {
		return geocodigo;
	}

	public void setGeocodigo(double geocodigo) {
		this.geocodigo = geocodigo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj instanceof Cidade) {
			Cidade other = (Cidade) obj;
			return Objects.equals(id, other.id);
		}
		return false;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", nome=" + nome + ", geocodigo=" + geocodigo + ", latitude=" + latitude
				+ ", longitude=" + longitude + "]";
	}
	
}