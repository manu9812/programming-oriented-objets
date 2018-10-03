/*
 esta es la clase Moto que hereda de la clase vehiculo y ademas tambien 
posee los metodos de la clase cualidades
 */
package ManejoArchivosJava;

import ManejoArchivosJava.Vehiculo;
import javax.swing.JOptionPane;

/**
 * 28 septiembre 2018
 * @author Manuela García Monsalve 
 */
public class Moto extends Vehiculo implements Cualidades{
    
    String medio;
    String rueda;
    
    //constructor de la clase Moto
    
    public Moto(String marca, String modelo, String color, String medio,String rueda)
    {
        super(marca,modelo,color);
        this.medio = medio;
        this.rueda = rueda;
    }
     //sobrescritura de  los metodo de la interface cualidades
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
        JOptionPane.showMessageDialog(null, "me he apagado");
    }
    
    public void Picar()
    {
        Prender();
        Arrancar();
        JOptionPane.showMessageDialog(null, "me puedo picar");
        Apagar();
    }
    
    @Override
    public void Reversa()
    {
        JOptionPane.showMessageDialog(null, "No puede dar reversa");
    }
    
        @Override
    public String VerDatos()
    {
        return  "Marca: " + this.marca 
            + "\nModelo: " + this.modelo + "\nColor: " + this.color
            + "\nMedio: " + this.medio;
    }
}
