/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Informacion;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Maicol Pulido
 */
public class EnlazarFacturas {
    
   public String[] searchID(int ID) throws FileNotFoundException, IOException
    {
        Guardar guardar = new Guardar();
        
        String contenido = guardar.leer();
        
        String[] array = contenido.split("\n");
        
        String[] datos = array[ID-1].split(";");
        
        return datos;
        
    }
    
    public int contarFactura() throws FileNotFoundException, IOException
    {
        Guardar guardar = new Guardar();
        
        String contenido = guardar.leer();
        
        String[] array = contenido.split("\n");
        
        return array.length + 1;
    } 
    
    public String modificarFactura(int ID, int cantidad, String nombreCliente,String telefono, String direccion) throws FileNotFoundException, IOException
    {
        String[] contenido = searchID(ID);
        contenido[7] = cantidad + "";
        
        String datos = "";
        for (int i = 0; i < contenido.length ; i++)
            datos += contenido[i];
                
                
        return datos;
    }
    
}
