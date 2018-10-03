/*
 *esta clase permite crear, leer y escribir en un archivo plano txt
mediante la ayuda de algunas de las librerias de java 
 */
package ManejoArchivosJava;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *18 septiembre 2018
 * @author Manuela García Monsalve 
 */
public class ArchivosMan {
    
    
    public ArchivosMan(){}
    /*
    este metodo permite crear un archivo pplano de texto 
    en caso de que todo este bien enviara un mensaje indicando 
    que si se ha creado el archivo; en caso de que no, tambien 
    se lo indicar al usuario 
    */
    public File crear() throws IOException 
    {
        File archivo = new File( "C:\\Users\\manuela garcia\\Downloads\\Herencia-Java-master\\src\\HerenciaJava\\archivo.txt" );
        BufferedWriter bw = new BufferedWriter(new FileWriter( archivo ));
        try
        {
            if ( archivo.exists() == true ) 
            {
                bw.close();
                JOptionPane.showMessageDialog(null, "si se creo el archivo");
            }
            else
            {
                archivo.createNewFile();
                JOptionPane.showMessageDialog(null, "no se pudo crear el archivo ");
                bw.close();
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return archivo;
    }
    
    
    /*
    este metodo permite leer el archivo 
    */
    public String leer() throws FileNotFoundException
    {
        File archivo = new File( "C:\\Users\\manuela garcia\\Downloads\\Herencia-Java-master\\src\\HerenciaJava\\archivo.txt");
        Scanner sc = new Scanner( archivo );
        String contenido = "";
        try
        {
            while( sc.hasNextLine() )
            {
                contenido += sc.nextLine() + "\n";
            }
            sc.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        
        return contenido;
    }
    
    /*
    este metodo permite escribir en el archivo la información de los 
    objetos creados 
    */
    public void escribir(String contenido)
    {
        try
        {
            File archivo = new File( "C:\\Users\\manuela garcia\\Downloads\\Herencia-Java-master\\src\\HerenciaJava\\archivo.txt" );
            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
