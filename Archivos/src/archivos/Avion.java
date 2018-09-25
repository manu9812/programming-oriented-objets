
package archivos;

import javax.swing.JOptionPane;

/**
 *
 * @author BOG-A408-E-003
 */
public class Avion extends Vehiculos implements Cualidades{

 public Avion(String marca, String modelo, String color) {
  super(marca, modelo, color);
 }

 @Override
 public void prender() {
  JOptionPane.showMessageDialog(null,"me estoy prendiendo ");
 }

 @Override
 public void arrancar() {
  JOptionPane.showMessageDialog(null,"he arrancado");
 }

 @Override
 public void reversa() {
   JOptionPane.showMessageDialog(null,"no puedo dar reversa ");
 }

 @Override
 public void apagar() {
 JOptionPane.showMessageDialog(null,"estoy apagado ");
 }
 
  public void pedirDatos() {
		  marca=JOptionPane.showInputDialog("introduce tu marca, por favor");
		 JOptionPane.showConfirmDialog(null, "la marca es: "+ marca);
		  modelo=JOptionPane.showInputDialog("introduce tu modelo, por favor");
		 JOptionPane.showConfirmDialog(null, "el modelo es : "+ modelo);
		 color=JOptionPane.showInputDialog("introduce tu color, por favor");
		 JOptionPane.showConfirmDialog(null, "el color  es: "+ color );
	}
  
  public void mostrarDatos(){
	    JOptionPane.showMessageDialog(null,"Marca: " + marca + "\nModelo: " + modelo
	     + "\nColor: " + color , "Datos del Vehiculo", JOptionPane.INFORMATION_MESSAGE);
	    }

 
}
