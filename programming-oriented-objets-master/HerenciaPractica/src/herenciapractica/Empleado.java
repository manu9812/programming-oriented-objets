/*
* esta clase carga los valores del empleado 
asi como hereda de la clase persona los atributos
 */
package herenciapractica;

import javax.swing.JOptionPane;

/**
 *
 * @author Manuela garcía Monsalve 
 * 21 de agosto del 2018
 */
public class Empleado extends Persona{
    double sueldo;
    String telefono, direccion;
    String email;
    String cargo;
   
    
    /*
     * constructor de la clase empleado
     */
    public Empleado(String nom, String ape, int ed, double fc, double sueldo, String telefono, String direccion, String email, String cargo) {
		super(nom, ape, ed, fc);
		this.edad=ed;
		this.sueldo = sueldo;
		this.telefono = telefono;
		this.direccion = direccion;
		this.email= email;
		this.cargo=cargo;
	}
    
	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	
	
	/*
	 * ver datos de los empleados 
	 */
	public void verDatos(){
        JOptionPane.showMessageDialog(null, "Nombre:"+ nombre+ "\nEdad"+ edad
        + "\nDireccion:" + direccion+ "\nSueldo:"+ sueldo,
                "Datos del empleado", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
