/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Informacion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Maicol Pulido
 */
public class Guardar {

    public String leer() throws FileNotFoundException, IOException
    {
        String contenido = "";
	FileReader lector = new FileReader("C:\\Users\\Maicol Pulido\\Documents\\NetBeansProjects\\Cucos1\\src\\java\\archivo\\Facturas.txt");
	BufferedReader br = new BufferedReader( lector );
	String linea;
        for(int i = 0;(linea = br.readLine()) != null; i++)
        	if(linea.equals("") != true)
                    contenido += linea + "\n";
        
        return contenido;
    }
    
    public void escribir(String contenido) throws IOException
    {
        FileWriter fichero = new FileWriter("C:\\Users\\Maicol Pulido\\Documents\\NetBeansProjects\\Cucos1\\src\\java\\archivo\\Facturas.txt");
	BufferedWriter bw = new BufferedWriter(fichero); 
	
	fichero.write(contenido + "\r\n");
	bw.newLine();
	
        fichero.close();
    }

  
}

