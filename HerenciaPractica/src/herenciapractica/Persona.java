/*
 en esta clase voy a crear los atributos
de nombre de nombre y edad de las personas
que son los empleados
 */
package herenciapractica;

/**
 *
 * @author  Manuela garcía Monsalve 
 * 21 de agosto del 2018
 */


/*
 * clase principal o clase padre del proyecto
 */
public class Persona {
    String nombre;
    String apellido;
    String fechaNac;
    int edad;
    
    
    /*
     * constructor de la clase persona
     * este constructor cuenta con los siguientes parametros:
     * nombre, apellido, edad, fecha de nacimiento
     */
    public Persona(String nom, String ape,  int ed, String fechaNa){
        this.nombre=nom;
        this.apellido=ape;
        this.edad=ed;
       this.fechaNac=fechaNa;
        
    }
    
 
  //setters y getters 
    // get de nombre 
	public String getNombre() {
		return nombre;
	}
	//set de nombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//get de apellido
	public String getApellido() {
		return apellido;
	}
	// set de apellido
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	//get de fecha de nacimiento 
	public String getFechaNac() {
		return fechaNac;
	}
	//set de fecha de nacimiento 
	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}
	//get de edad
	public int getEdad() {
		return edad;
	}
	// set de edad
	public void setEdad(int edad) {
		this.edad = edad;
	}

	

    
}