import java.util.Scanner;

import javax.swing.JOptionPane;

public class Interfaces extends Empleado implements Enfermedades, Retardos {
	
	 Scanner entrada = new  Scanner (System.in);


	public Interfaces() {
		super(nombre,apellido,edad, fechaNa, sueldo, telefono, direccion, email, cargo);
		// TODO Auto-generated constructor stub
	}
	 
	 
	 public void pedirDatos() {
		 Scanner entrada = new Scanner(System.in);
		 Scanner entrada2= new Scanner(System.in);
		 
		 System.out.println("ingrese su nombre");
		 nombre=entrada.nextLine();
		 
		 System.out.println("ingrese su apellido");
		 apellido=entrada.nextLine();
		 
		 System.out.println("ingrese su edad");
		 edad=entrada.nextInt();
		 
		 System.out.println("ingrese su fecha de nacimiento");
		 fechaNa=entrada2.nextLine();
		 
		 
		 System.out.println("ingrese su sueldo");
		 sueldo=entrada.nextDouble();
		 
		 System.out.println("ingrese su telefono");
		 telefono=entrada.next();
		 
		 System.out.println("ingrese su direccion");
		 direccion=entrada2.nextLine();
		 
		 System.out.println("ingrese su email");
		 email=entrada2.nextLine();
		 
		 System.out.println("ingrese su cargo");
		 cargo=entrada2.nextLine();
	}
	 
	 
	 public void verDatos(){
		    JOptionPane.showMessageDialog(null,"Nombre: " + nombre+" "+apellido + "\nEdad: " + edad
		     + "\nFecha Nacimiento: " + fechaNa + "\nSueldo: "+ sueldo 
		     + "\nTelefono"+ telefono + "\ndireccion: "+ direccion
		     + "\nEmail: "+ email + "\nCargo: " + cargo, "Datos del empleado", JOptionPane.INFORMATION_MESSAGE);
		    }
		
	 
	 public static void main (String []args) {
		 
		 
		 Interfaces empleado1= new Interfaces();
		 empleado1.pedirDatos();
		 empleado1.verDatos();
		 empleado1.azucarEnLaSangre();
		 empleado1.HabiaTrancon();
		 
		 
		 Interfaces empleado2= new Interfaces();
		 empleado2.pedirDatos();
		 empleado2.verDatos();
		 empleado2.fiebre();
		 empleado2.HabiaTrancon();
		 
		 
		 Interfaces empleado3= new Interfaces();
		 empleado3.pedirDatos();
		 empleado3.verDatos();
		 empleado3.colicos();
		 empleado3.MeQuedeDormido();
		 
		 
		 Interfaces empleado4= new Interfaces();
		 empleado4.pedirDatos();
		 empleado4.verDatos();
		 empleado4.diabetes();
		 empleado4.MeRobaron();
		 
		 Interfaces empleado5= new Interfaces();
		 empleado5.pedirDatos();
		 empleado5.verDatos();
		 empleado5.Migraña();
		 empleado5.MeRobaron();
		 
		 
		 Interfaces empleado6= new Interfaces();
		 empleado6.pedirDatos();
		 empleado6.verDatos();
		 empleado6.gastritis();
		 empleado6.MeQuedeDormido();
		 
	 }
	

}
