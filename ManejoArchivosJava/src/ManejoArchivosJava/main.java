package ManejoArchivosJava;

import ManejoArchivosJava.Avion;
import ManejoArchivosJava.Barco;
import ManejoArchivosJava.Carro;
import ManejoArchivosJava.Moto;
import javax.swing.JOptionPane;
import java.io.IOException;

/*
 * esta es la clase main, en esta clase se crean arreglos de 
objetos que permiten guardar la información de los mismos
 */

/**
 * 28 septiembre 2018
 * @author Manuela García Monsalve 
 */


public class main {

    /**
     * se crean los objetos 
     */
    public static void main(String[] args) throws IOException 
    {
        ManejoArchivosJava.ArchivosMan ac = new ManejoArchivosJava.ArchivosMan();
        String[] dato;
        String contenido = ac.leer();
        
        JOptionPane.showMessageDialog(null, "Carro: ");
        dato = PeticionDatos();
        Carro carro = new Carro(dato[0],dato[1],dato[2],dato[3]);
        contenido += carro.VerDatos();
        ac.escribir( contenido );
        
    }
    
    public static String[] PeticionDatosMoto()
    {
        String[] datos = new String[5];
        JOptionPane.showMessageDialog(null, "ingresar datos para motos");
        datos[0] = JOptionPane.showInputDialog("Ingrese el modelo:");
        datos[1] = JOptionPane.showInputDialog("Ingrese el marca:");
        datos[2] = JOptionPane.showInputDialog("Ingrese el color:");
        datos[3] = JOptionPane.showInputDialog("Ingrese el medio:");
        datos[4] = JOptionPane.showInputDialog("Ingrese las ruedas:");
        return datos;
    }
    
    public static String[] PeticionDatos()
    {
        String[] datos = new String[4];
        JOptionPane.showMessageDialog(null, "Ingresar Datos ");
        datos[0] = JOptionPane.showInputDialog("Ingrese el modelo:");
        datos[1] = JOptionPane.showInputDialog("Ingrese el marca:");
        datos[2] = JOptionPane.showInputDialog("Ingrese el color:");
        datos[3] = JOptionPane.showInputDialog("Ingrese el medio:");
        return datos;
    }
}
