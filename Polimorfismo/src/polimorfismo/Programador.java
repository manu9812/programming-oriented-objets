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
public class Programador extends Sistemas {
 
 public void sueldo(int horas, double pagos, int horasExtra){
  JOptionPane.showMessageDialog(null, "el pago del programador  es:" + (horas*pagos)+ horasExtra);
  
 }
 public void Datos(String nom, String ape, String  direccion){
  JOptionPane.showMessageDialog(null, "los datos del programador  son:\n Nombre"
          + " " + nom + "\n  apellidos: "+ ape + "\n dirección:" +direccion );
 }
 public void Labores( String crear, String lenguaje){
    JOptionPane.showMessageDialog(null, "el progrmador hace: " 
            + crear + "\n lenguaje de programación" + lenguaje);
  
 }
 
 
}
