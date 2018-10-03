/*
 * esta es la clase Carro que hereda de la clase vehiculo y ademas tambien 
posee los metodos de la clase cualidades
 */
package ManejoArchivosJava;

import ManejoArchivosJava.Vehiculo;
import javax.swing.JOptionPane;

/**
 * 28 septiembre 2018
 * @author Manuela García Monsalve 
 */
public class Carro extends Vehiculo implements Cualidades {
    
    String medio;
    
    
    // constructor de la clase Carro
    public Carro(String marca,String modelo, String color, String medio)
    {
        super(marca,modelo,color);
        this.medio = medio;
    }
    
   // sobrescritura de los metodos de la interface cualidades 
    @Override
    public void Prender()
    {
        JOptionPane.showMessageDialog(null, "me he prendido");
    }
    @Override
    public void Arrancar()
    {
        JOptionPane.showMessageDialog(null, "he arrancado ");
    }
    @Override
    public void Apagar()
    {
        JOptionPane.showMessageDialog(null, "me he apagado");
    }
    
    @Override
    public void Reversa()
    {
        JOptionPane.showMessageDialog(null, "Puede dar reversa");
    }
    
    @Override
    public String VerDatos()
    {
        return  "\nCarro\nMarca: " + this.marca 
            + "\nModelo: " + this.modelo + "\nColor: " + this.color
            + "\nMedio: " + this.medio + "\n";
    }
}
