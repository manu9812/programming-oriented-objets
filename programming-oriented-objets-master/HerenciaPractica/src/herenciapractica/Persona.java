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
    double fechaNac;
    int edad;
    
    
    /*
     * constructor de la clase persona
     */
    public Persona(String nom, String ape,  int ed, double fc){
        this.nombre=nom;
        this.apellido=ape;
        this.edad=ed;
        this.fechaNac=fc;
        
    }
    
 
  //setters y getters 
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public double getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(double fechaNac) {
		this.fechaNac = fechaNac;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void VerDatos(){
        
    }

    
}
