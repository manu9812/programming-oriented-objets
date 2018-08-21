/*
* esta clase carga los valores del empleado 
asi como hereda de la clase persona los atributos
 */
package herenciapractica;

import javax.swing.JOptionPane;

/**
 *
 * @author Manuela garcía Monsalve 
 * 21 de agosto del 2018
 */
public class Empleado extends Persona{
    double sueldo;
    String telefono, direccion;
    public Empleado(String nom, int ed, String tel, String dir, double suel) {
        super(nom, ed);
        this.telefono=tel;
        this.direccion=dir;
        this.sueldo=suel;
        
    }
    public void verDatos(){
        JOptionPane.showMessageDialog(null, "Nombre:"+ nombre+ "\nEdad"+ edad
        + "\nDireccion:" + direccion+ "\nSueldo:"+ sueldo,
                "Datos del empleado", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
