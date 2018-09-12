//Super Clase
/**
 * voy a usar esta super clase y creare otras mas 
 * 4 septiembre 2018
 *
 * @author Manuela Garcia Monsalve 
 */
public abstract class Persona {
	static String nombre;
    static String apellido;
    static String fechaNa;
    static  int edad;
    
    /*
     * constructor de la clase persona
     * este constructor cuenta con los siguientes parametros:
     * nombre, apellido, edad, fecha de nacimiento
     */
    public Persona(String nom, String ape,  int ed, String fechaNa){
        this.nombre=nom;
        this.apellido=ape;
        this.edad=ed;
       this.fechaNa=fechaNa;
   
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
		return fechaNa;
	}
	//set de fecha de nacimiento 
	public void setFechaNac(String fechaNac) {
		this.fechaNa = fechaNac;
	}
	//get de edad
	public int getEdad() {
		return edad;
	}
	// set de edad
	public void setEdad(int edad) {
		this.edad = edad;
	}

	
    // metodo abstracto que sera necesario sobre escribir en las demas clases 
    abstract public void verDatos();
 
}
