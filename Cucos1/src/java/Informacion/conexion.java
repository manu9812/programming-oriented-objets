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
public class conexion {
    
    private EnlazarFacturas ef = new EnlazarFacturas();
    
    public conexion(){}
    
    public void guardarFactura(String articulo,int cantidad,int valorUnitario,String nombreCliente,String telefono, String direccion) throws FileNotFoundException, IOException
    {
        Guardar guardar = new Guardar();
        String contenido = guardar.leer();
        int id = ef.contarFactura();
        int valorTotal = buscarPrecioArticulo(articulo)*cantidad;
        contenido = contenido + nombreCliente + ";" + telefono + ";" + direccion + ";" + id + ";" 
                + valorUnitario + ";" + valorTotal + ";" + articulo + ";" + cantidad + "\n";
        
        guardar.escribir(contenido);
    }
    
    public int buscarPrecioArticulo(String articulo)
    {
        Articulos articulos = new Articulos();
        int precio = 0;
        
        if( articulo.equals("Tanga") )
        {
            precio = articulos.Tanga();
        }
        else if( articulo.equals("Encaje") )
        {
            precio = articulos.Encaje();
        }
        else if( articulo.equals("Cucos") )
        {
            precio = articulos.Cucos();
        }
        
        return precio;
    }
}
