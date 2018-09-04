package abstraer;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	public static ArrayList<Empleado> arreglo;
	public static int counter = 0;
	
	
	/*
	 * metodo para determinar la opcion que el usuario escoja dependiendo de las opciones que este metodo
	 * le permite escoger 
	 */
	public static int opcion ()
	{
		Scanner entrada = new Scanner (System.in);
		int option = 0;
		System.out.println("¿Que desea hacer?: \n1. Nuevo empleado \n2.lista de empleados \n3Salir");
		option = entrada.nextInt();
		return option;
	}
	
	/*
	 * metodo que sirve para que capturar y mostrar la infomación segun 
	 * sea la opcion que se ha escogido por el usuario 
	 */
	public static void eleccionOpcion (int opcion)
	{	
			
		switch (opcion)
		{
			case 1:
			{
				if(counter == 0)
					arreglo = new ArrayList <Empleado>();
				
				counter += 1;
				arreglo = Abstraer.guardarDatos(arreglo);
			}
			break;
			
			case 2:
			{	
				if(counter == 0)
					arreglo = new ArrayList <Empleado>();
				
				counter += 1;
				Abstraer.verDatos(arreglo);
			}
			
			break;
			
			case 3:
			{
				System.exit(0);
			}	
			break;
		}
		
	}

	

}
