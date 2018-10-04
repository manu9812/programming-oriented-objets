/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contabilidad;

import javax.swing.JOptionPane;

/**
 *
 * @author manuela garcia
 */
public  class AuxContable extends Contabilidad{

  

    public void Datos(String nom, String ape){
   JOptionPane.showMessageDialog(null, "los datos del auxiliar contable son: "
          + " \n Nombre: " + nom + "\n  apellidos: "+ ape+ "\n "
	 );
 }
  public void sueldo(int horas, double pagos) {
        JOptionPane.showMessageDialog(null, "el pago del auxiliar contable es: " + (horas*pagos));
    }
  
   public void Labores( String crear, String especializacion){
    JOptionPane.showMessageDialog(null, "el auxiliar contable  hace: " + crear +
    "\n y la especializacion es: "+ especializacion );

   
   }
}
