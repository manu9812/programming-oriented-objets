/*
 * calcular dentro de los metodos diferentes tipos de operaciones, con diferentes tipos de datos
 */
package operar;

import java.util.Scanner;

/**
 *
 * @author Mnuela García
 */
public class Operar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in); // SE importa la libreria scanner 
      
      // se crean algunas variables para ser utilizadas por los metodos 
        int total;
        int r=7;
        int a=10;
        int b=5;
        int N = 0;
     
       
        Calcular Operar= new Calcular(); // se crea el objeto calcular 
        // se invoca el metodo sumarNumeros que retorna la suma de dos numeros enteros 
        total=Operar.sumarNumeros(54, 77);
        System.out.println(" SUMA ");
        System.out.println(" la suma de los numeros es: " + total);
        System.out.println(" \n");
        
         // se invoca el metodo restarNumeros que retorna la resta de dos numeros enteros 
        System.out.println("RESTA");
        System.out.println(" la resta total es: " + Operar.RestarNumeros(45, 88));
        System.out.println(" \n");
            
        
        
        // se invoca el metodo area del circulo que retorna el area de un circulo mutiplicando dos veces su radio por 3.1416
        System.out.println(" AREA DEL CIRCULO ");
        System.out.println(" el area del ciculo de radio : " + r + " es: " + Operar.areaCirculo(r) );
        System.out.println("\n");
        
        // se invoca el metodo teorema de pitagoras que retorna el producto de multiplicar dos veces los parametros ingresados
        // y luego sumarlos, y al final encontrar el radical de la suma de dichos numeros
        System.out.println(" TEOREMA DE PITAGORAS");
        System.out.println(" el resultado del teorema de pitagoras: " + "\n" +" el cateto opuesto con valor:" + a + "\n"+ "el cateto adyacente con valor: " + b + " que da como resultado " + Operar.TeoremaPitagoras(a, b, b, total));
        System.out.println("\n");
        // se invica el metodo criba que retorna todos los numeros de un rango especifico que el usuario elige por consola 
        System.out.println(" CRIBA DE ERASTOSTENES ");
        
        Operar.Criba();
    }
    
}
