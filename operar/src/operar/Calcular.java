/*
 *en esta clase vamos a crear nuestros metodos para calcular operaciones
 */
package operar;
import java.io.*;
import java.util.Scanner;


/**
 *
 * @author MANUELA GARCIA
 * 16/04/2018
 * CALCULAR CON ENTEROS
 * 
 */
public class Calcular {
    int a, b;
    
    /**
     * metodo para sumar dos numeros enteros 
     * @param a
     * @param b
     * @return 
     */
     int sumarNumeros(int a, int b)
     {
         return (a+b);
     }
     
     /**
      * metodo para restar dos numeros enteros
      * @param a
      * @param b
      * @return 
      */
     int  RestarNumeros( int a, int b)
     {
         return (a-b);
     }
     
     
     /**
      * metodo para encontar el area de un circulo
      * @param Radio
      * @return 
      */
     double areaCirculo(int Radio)
     {
         return (3.1416*Radio*Radio);
                 
     }
     
     
     /**
      * metodo para hallar el teorema de pitagoras
      * @param a
      * @param b
      * @param mult
      * @param radical
      * @return 
      */
     double TeoremaPitagoras(int a, int b,int mult, int radical)
     {
         mult=((a*a)+(b*b));
         
         radical= (int) Math.sqrt(mult);
         return radical;
     }
     
        
        
    /**
     * metodo para hallar los numeros primos desde un rango ingresado por consola
     * @return 
     */
    boolean Criba()      
    {
         System.out.println("Escriba el valor de n para los primos entre el rango 0 - n ");

	        Scanner scanner = new Scanner(System.in);
	        int N = scanner.nextInt();

	        long start, end;
	        start = System.currentTimeMillis();

	        int tope = (int) Math.floor(Math.sqrt(N));

	        boolean[] primos = new boolean[N + 1];

	        for (int i = 2; i <= tope; i++) {
	            if (primos[i] == false) {
	                for (int j = i; j <= N/ i; j++) {
	                    primos[j * i] = true;
	                }
	            }
	        }

	        int count = 1;
	        for (int i = 2; i < N; i++) {
	            if (primos[i] == false) {
	                count++;
	                System.out.printf("%10d", i);
	            }
	            if (count == 10) {
	                count = 1;
	                System.out.println("\n");
	            }
	        }
	        end = System.currentTimeMillis();
	        System.out.println("\n");
	        
        return true;
	    }
    }
    
	


