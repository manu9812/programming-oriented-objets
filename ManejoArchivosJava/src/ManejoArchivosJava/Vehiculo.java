/*
 *esta es la super clase del proyecto en esta, se crean algunos atributos 
como marca, modelo y color; ademas de  que se crea el respectivo constuctor para esta clase  
 */
package ManejoArchivosJava;

/**
 * 28 septiembre 2018
 * @author Manuela García Monsalve 
 */
public abstract class Vehiculo {
 
    String marca;
    String modelo;
    String color;
    // constructor de la clase vehiculo 
    public Vehiculo(String marca,String modelo,String color)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }
    abstract String VerDatos();
}
