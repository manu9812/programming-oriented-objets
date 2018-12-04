//Sub clase
//recibira las interfaces creadas  por el sistema y las pasara al metodo main 


import javax.swing.JOptionPane;

/**
 *
 * @author Manuela Garcia Monsalve 
 
 */
public class Empleado extends Persona implements Enfermedades, Retardos{
   static  double sueldo;
   static String telefono;
    static String direccion;
    static String email;
    static String cargo;
    static String nombre;
    static String apellido;
    static String fechaNa;
    static int  edad;
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
    @Override
    public void Gripa() {
    	JOptionPane.showMessageDialog(null, "hola estoy enfermo de gripa ");
    }
    
    
    @Override
    public void Migraña() {
    	JOptionPane.showMessageDialog(null, "hola estoy enfermo de migraña ");
    }
    
    

	@Override
	public void gastritis() {
		JOptionPane.showMessageDialog(null, "hola estoy enfermo de gastritis ");
		
	}
	@Override
	public void fiebre() {
		JOptionPane.showMessageDialog(null, "hola estoy enfermo de fiebre  ");
		
	}
	@Override
	public void colicos() {
		JOptionPane.showMessageDialog(null, "hola estoy enfermo de colicos ");
		
	}
	@Override
	public void diabetes() {
		JOptionPane.showMessageDialog(null, "hola estoy enfermo de diabetes ");
		
	}
	@Override
	public void azucarEnLaSangre() {
		JOptionPane.showMessageDialog(null, "hola estoy enfermo de azucar en la sangre ");
		
	}
	@Override
	public void MeQuedeDormido() {
		JOptionPane.showMessageDialog(null, "LLEGUE TARDE, porque me quede dormido");
		
	}
	@Override
	public void HabiaTrancon() {
		JOptionPane.showMessageDialog(null, "LLEGUE TARDE, porque habia mucho trancón ");
		
	}
	@Override
	public void MeRobaron() {
		JOptionPane.showMessageDialog(null, "LLEGUE TARDE, porque me robarón  ");
		
	}
}
