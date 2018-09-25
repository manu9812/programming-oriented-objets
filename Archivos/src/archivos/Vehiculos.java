/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import javax.swing.JOptionPane;

/**
 *
 * @author Manuela García Monsalve 
 */
public abstract class Vehiculos {

static String marca;
	 static String modelo;
	 static String color;
	public Vehiculos(String marca, String modelo, String color) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	abstract public void pedirDatos();
	abstract public void mostrarDatos();
	
 
}
