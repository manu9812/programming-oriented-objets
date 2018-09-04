//Sub clase
package abstraer;

import javax.swing.JOptionPane;

/**
 *
 * @author Manuela Garcia Monsalve 
 */
public class Empleado extends Persona {
	 double sueldo;
	    String telefono, direccion;
	    String email;
	    String cargo;
	   
	    
	    /*
	     * constructor de la clase empleado
	     * que cuenTa con los parametros siguientes:
	     * nombre, apellido, edad, fecha de nacimiento, sueldo, telefono, direccion, email, cargo
	     */
	    public Empleado(String nom, String ape, int ed, String fechaNa, double sueldo, String telefono, String direccion, String email, String cargo) {
			super(nom, ape, ed, fechaNa);
			this.edad=ed;
			this.sueldo = sueldo;
			this.telefono = telefono;
			this.direccion = direccion;
			this.email= email;
			this.cargo=cargo;
		}
	    
	    //get de sueldo 
		public double getSueldo() {
			return sueldo;
		}
	     // set de sueldo
		public void setSueldo(double sueldo) {
			this.sueldo = sueldo;
		}
		// get de telefono
		public String getTelefono() {
			return telefono;
		}
	    // set de telefono
		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}
		//get de direccion
		public String getDireccion() {
			return direccion;
		}
		// set de direccion
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		// get de email
		public String getEmail() {
			return email;
		}
		// set de email
		public void setEmail(String email) {
			this.email = email;
		}
		// get de cargo
		public String getCargo() {
			return cargo;
		}
		// set de cargo
		public void setCargo(String cargo) {
			this.cargo = cargo;
		}

    @Override
    public void verDatos(){
    JOptionPane.showMessageDialog(null,"Nombre: " + nombre + "\nEdad: " + edad
     + "\nSueldo: " + sueldo + "\nTelefono: " + telefono +
            "\nDireccion: " + direccion, "Datos del Empleado", JOptionPane.INFORMATION_MESSAGE);
    }
}
