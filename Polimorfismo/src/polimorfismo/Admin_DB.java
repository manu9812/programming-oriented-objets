/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import javax.swing.JOptionPane;

/**
 *
 * @author Manuela García Monsalve 
 * 28 septiembre 2018
 */
public class Admin_DB extends Sistemas {
 
 
 public void sueldo(int horas, double pagos, double bonificacion ){
  JOptionPane.showMessageDialog(null, "el pago del administrador de bases de datos  es: " + (horas*pagos+ bonificacion ));
  
 }
 public void Datos(String nom, String ape, String TBD){
  JOptionPane.showMessageDialog(null, "los datos del administrador de bases de datos son:"
          + " \n Nombre " + nom + "\n  apellidos: "+ ape+ "\n "
	  + "y el tipo de bases de datos en la que esta especializado es: "+ TBD);
 }
 public void Labores( String crear, String especializacion){
    JOptionPane.showMessageDialog(null, "el administrador de bases de datos hace: " + crear +
    "\n y la especializacion es: "+ especializacion );
  
 }
 
 
}
