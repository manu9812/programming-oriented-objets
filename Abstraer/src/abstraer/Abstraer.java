/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraer;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 *
 * @author Manuela Garcia Monsalve 
 */
public class Abstraer {

	 /**
     * @param args the command line arguments
     */
	
	
	/*
	 * este metodo sirvr para validar datos cuando el usuario los ingresa por consola 
	 * en caso de que un dato pedido por el usuario no sea ingresado el programa no continua 
	 * su ejecucion hasta que el mismo sea ingresado.
	 */
	public static String validarString (String text){
		String temporal="";
		Scanner entrada = new Scanner (System.in);
		while (temporal.isEmpty() || temporal.trim().equals(""))
		{
			System.out.println(text);
			temporal = entrada.nextLine();
		}
		return temporal;		
	}
	
	/**
	 * este metodo permite leer los datos de cada uno de los empleados que sean creados 
	 * los parametros son los mismos que contiene el constructor 
	 * @return
	 */
	public static Empleado leerDatos() {
	Scanner entrada= new Scanner(System.in);
	Empleado obj;
	String nombre;
	String apellido;
	int edad;
	String fechaNa;
	double sueldo;
	String telefono;
	String direccion;
	String email;
	String cargo;
	
	
	 nombre = validarString("Ingrese sus nombres");
	 apellido = validarString("Ingrese sus apellidos");
	 System.out.println("ingrese su edad");
	 edad= entrada.nextInt();
	 fechaNa = validarString("Ingrese su fecha de nacimiento");
	 System.out.println("ingrese su sueldo");
	 sueldo=entrada.nextDouble();
	 telefono= validarString("Ingrese su telefono");
	 direccion= validarString("Ingrese su direccion");
	 email = validarString("Ingrese su email");
	 cargo = validarString("Ingrese su cargo");
	
	 
	 
	obj= new Empleado(nombre,apellido,edad, fechaNa,sueldo, telefono, direccion, email,cargo);//se inicializa un empleado de tipo obj 
	
	
	return obj; // se retorna el objeto 
	}

	
	
	/**
	 * eset metodo sirve para guardar la información de todos los empleados que sean creados 
	 * para esto se crea un arrayList de tipo empleado 
	 * @param arreglo
	 * @return
	 */
	public static ArrayList<Empleado> guardarDatos (ArrayList <Empleado> arreglo)
	{
		arreglo.add(leerDatos());
		return arreglo;
	}
	

	/**]
	 * este metodo sirve para mostrar todos los datos de los empleados creados 
	 * en estecaso los datos estan guardados en un arrayList 
	 * @param arreglo
	 */
	public static void verDatos (ArrayList<Empleado> arreglo)
	{
		Empleado obj;
		
		for (int i = 0; i < arreglo.size(); i++)
		{
			
			
			
			  obj= arreglo.get(i);
			 JOptionPane.showMessageDialog(null,"Nombre: " + obj.getNombre() +" "+ obj.getApellido()+"\nEdad: " + obj.getEdad()
			 + "\nFecha de nacimiento: "+ obj.getFechaNac()
			 + "\nSueldo: " + obj.getSueldo() + "\nTelefono: " + obj.telefono +
			 	"\nDireccion: " + obj.getDireccion()+ 
				"\nEmail: "+ obj.getEmail()+ "\nCargo: "+ obj.getCargo(), "DATOS DEL EMPLEADO ", JOptionPane.INFORMATION_MESSAGE);
			 
			 
		}
	}
	/**
	 * este es el metodo main donde se invoca la clase menu que 
	 * determina y muestra la información que ingreso el usuario; 
	 * asi como tambien la opcion que escogio según el caso.
	 * @param args
	 */
    public static void main(String[] args) {
       
    	
    	
    	int opcion = 0;
		do
		{
			opcion = Menu.opcion();
			Menu.eleccionOpcion(opcion);
				
		}while(opcion != 3); 
    }
   
    
}
