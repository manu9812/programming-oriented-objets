/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author BOG-A408-E-003
 */
public abstract class Main  extends Vehiculos implements Cualidades {

 public Main(String marca, String modelo, String color) {
  super(marca, modelo, color);
 }
 
 
 public void pedirDatos() {
		  marca=JOptionPane.showInputDialog("introduce tu marca, por favor");
		 JOptionPane.showConfirmDialog(null, "la marca es: "+ marca);
		  modelo=JOptionPane.showInputDialog("introduce tu modelo, por favor");
		 JOptionPane.showConfirmDialog(null, "el modelo es : "+ modelo);
		 color=JOptionPane.showInputDialog("introduce tu color, por favor");
		 JOptionPane.showConfirmDialog(null, "el color  es: "+ color );
	}
	
	public void verDatos(){
	    JOptionPane.showMessageDialog(null,"Marca: " + marca + "\nModelo: " + modelo
	     + "\nColor: " + color , "Datos del Vehiculo", JOptionPane.INFORMATION_MESSAGE);
	    }
	
	
		public static void crearArchivo(ArrayList lista) {
		FileWriter flwriter = null;
		try {
			//crea el flujo para escribir en el archivo
			flwriter = new FileWriter("C:\\Users\\BOG-A408-E-003\\Documents\\NetBeansProjects\\Archivos\\src\\archivos");
			//crea un buffer o flujo intermedio antes de escribir directamente en el archivo
			BufferedWriter bfwriter = new BufferedWriter(flwriter);
			for (Vehiculos vehiculo : lista) {
				//escribe los datos en el archivo
				bfwriter.write();
			}
			//cierra el buffer intermedio
			bfwriter.close();
			System.out.println("Archivo creado satisfactoriamente..");
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (flwriter != null) {
				try {//cierra el flujo principal
					flwriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public static void main(String []args ) {
	
		
	
	
	}
}
