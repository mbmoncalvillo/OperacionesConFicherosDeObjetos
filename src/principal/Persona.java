package principal;

import java.io.Serializable;

public  class Persona implements Serializable{ 

    /**
	 * serialVersionUID - se almacena en la posicion 33 (empezando en 1)
	 */
	private static final long serialVersionUID = 1L;



	public Persona(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}





	private String nombre; 
    private String apellido; 

    private int edad; 

  

       public String getNombre() {
		return nombre;
	}





	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}





	public void setEdad(int edad) {
		this.edad = edad;
	}



	public void haz()
	{
		System.out.println("Perosna");
	}

	public Persona(String nombre, int edad) { 

        this.nombre = nombre; 

        this.edad = edad; 

    } 

  

     

    public String toString() { 

        return "Nombre: " + nombre + ", Edad: " + edad; 

    } 

} 