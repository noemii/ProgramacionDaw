package Alumnos_2;


public class clase {

	public String nombre;
	public int edad;
	
	
	public clase(){
		this.nombre="";
		this.edad=0;
	}
		
	public clase (String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public String getNombre(){
		return nombre;
		
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public void setEdad(int edad){
		this.edad = edad;
	}
	
	public int getEdad(){
		return edad;
	}
	
	
	}

	

