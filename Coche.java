package com.primero;

public class Coche {
	//atributos
	private int id;
	private String marca;
	private float precio;
	//constructor
	public Coche(int id, String marca, float precio) {
		super();
		this.id = id;
		this.marca = marca;
		this.precio = precio;
	}
	//getter y setter : encapsulamiento
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	//genéricos
}//cierra la clase
