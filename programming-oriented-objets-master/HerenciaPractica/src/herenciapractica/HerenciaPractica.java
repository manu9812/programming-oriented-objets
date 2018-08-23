/*

 */
package herenciapractica;

import java.util.Scanner;





/**
 *
 * @author Manuela garcía Monsalve 
 * 21 de agosto del 2018
 */
public class HerenciaPractica {

    /**
     * @param args the command line arguments
     */
	
	
	
	public static String validarString (String text)
	{
		String temporal="";
		Scanner entrada = new Scanner (System.in);
		while (temporal.isEmpty() || temporal.trim().equals(""))
		{
			System.out.println(text);
			temporal = entrada.nextLine();
		}
		return temporal;		
	}
	
	
	public static Empleado leerDatos() {
		Scanner entrada= new Scanner(System.in);}
	Empleado obj;
	String nombre;
	String apellido;
	int edad;
	double fechaNa;
    
	
	
	
	}


    public static void main(String[] args) {
       
    }
   
    
}
