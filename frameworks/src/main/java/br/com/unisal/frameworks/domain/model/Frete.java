package br.com.unisal.frameworks.domain.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Frete implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private double geocodigoA;
	private double geocodigoB;
	private int distanciaAproximada;
	
	private BigDecimal valor = new BigDecimal(0);
	
	public double getGeocodigoA() {
		return geocodigoA;
	}
	public void setGeocodigoA(double geocodigoA) {
		this.geocodigoA = geocodigoA;
	}
	public double getGeocodigoB() {
		return geocodigoB;
	}
	public void setGeocodigoB(double geocodigoB) {
		this.geocodigoB = geocodigoB;
	}
	public int getDistanciaAproximada() {
		return distanciaAproximada;
	}
	public void setDistanciaAproximada(int distanciaAproximada) {
		this.distanciaAproximada = distanciaAproximada;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	
	
	
}
