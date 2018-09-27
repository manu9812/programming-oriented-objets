/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import javax.swing.JOptionPane;

/**
 *
 * @author BOG-A408-E-003
 */
public class Arquitecto  extends Sistemas {
 
 public void sueldo(int horas, double pagos){
  JOptionPane.showMessageDialog(null, "el pago del arquitecto es:" + (horas*pagos));
  
 }
 public void Datos(String nom, String ape){
  JOptionPane.showMessageDialog(null, "los datos del arquitecto son:\n Nombre " + nom + "\n  apellidos: "+ ape);
 }
 public void Labores( String crear){
    JOptionPane.showMessageDialog(null, "el arquitecto hace: " + crear);
  
 }
 
}
