package ec.ups.sistemas.negocio.en;

import java.io.Serializable;

public class Vehiculo implements Serializable{
	private int id;
	private String placa;
	private String marca;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
}
