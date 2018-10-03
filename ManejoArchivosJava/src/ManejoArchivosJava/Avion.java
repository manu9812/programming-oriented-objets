/*
esta es la clase avion que hereda de la clase vehiculo y ademas tambien 
posee los metodos de la clase cualidades 
 */
package ManejoArchivosJava;

import ManejoArchivosJava.Vehiculo;
import javax.swing.JOptionPane;

/**
 *28 de septiembre 2018
 * @author Manuela García Monsalve 
 */
public class Avion extends Vehiculo implements Cualidades {
    
    String medio;
    // constrcutor de la clase avion
    public Avion(String marca, String modelo, String color,String medio)
    {
        super(marca,modelo,color);
        this.medio = medio;
    }
    // sobrescribir los metodos de la clase cualidades 
    @Override
    public void Prender()
    {
        JOptionPane.showMessageDialog(null, "me he Prendido");
    }
    @Override
    public void Arrancar()
    {
        JOptionPane.showMessageDialog(null, "he arrancado");
    }
    @Override
    public void Apagar()
    {
        JOptionPane.showMessageDialog(null, "me he pagado ");
    }
    
    @Override
    public void Reversa()
    {
        JOptionPane.showMessageDialog(null, " no Puede dar reversa");
    }
    
        @Override
    public String VerDatos()
    {
        return  "Marca: " + this.marca 
            + "\nModelo: " + this.modelo + "\nColor: " + this.color
            + "\nMedio: " + this.medio;
    }
}
