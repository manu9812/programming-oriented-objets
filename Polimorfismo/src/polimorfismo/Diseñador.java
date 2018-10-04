package polimorfismo;

import javax.swing.JOptionPane;


/**
 *
 * @author Manuela García Monsalve
 * 28 septiembre 2018
 */
public class Diseñador extends Sistemas{
 public void sueldo(int horas, double pagos, int dias ){
  JOptionPane.showMessageDialog(null, "el pago del diseñador  es: " + (horas*pagos)*dias);
  
 }
 public void Datos(String nom, String ape, int edad ){
  JOptionPane.showMessageDialog(null, "los datos del diseñador son:\n Nombre "
          + nom + "\n  apellidos: "+ ape + "\n edad: " + edad );
 }
 public void Labores( String crear,  int cantDisenios){
    JOptionPane.showMessageDialog(null, "el diseñador  hace: " 
            + crear + "\n y la cantidad de diseños que realiza:"+ cantDisenios);
  
 }
 
}
