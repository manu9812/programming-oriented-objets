/*
 *esta es la clase Barco que hereda de la clase vehiculo y ademas tambien 
posee los metodos de la clase cualidades
 */
package ManejoArchivosJava;

import ManejoArchivosJava.Vehiculo;
import javax.swing.JOptionPane;

/**
 * 28 de septiembre del 2018
 * @author Manuela García Monsalve 
 */
public class Barco extends Vehiculo implements Cualidades{
    
    String medio;
    
    
    //constructor de la clase Barco
    public Barco(String marca, String modelo, String color, String medio)
    {
        super(marca,modelo,color);
        this.medio = medio;
    }
    
    //sobrescribir los metodos de la clase barco
    @Override
    public void Prender()
    {
        JOptionPane.showMessageDialog(null, "me he prendido ");
    }
    @Override
    public void Arrancar()
    {
        JOptionPane.showMessageDialog(null, "he arrancado ");
    }
    @Override
    public void Apagar()
    {
        JOptionPane.showMessageDialog(null, "me he apagado ");
    }
    
    @Override
    public void Reversa()
    {
        JOptionPane.showMessageDialog(null, "no Puede dar Reversa");
    }
    
        @Override
    public String VerDatos()
    {
        return  "Marca: " + this.marca 
            + "\nModelo: " + this.modelo + "\nColor: " + this.color
            + "\nMedio: " + this.medio;
    }
}
