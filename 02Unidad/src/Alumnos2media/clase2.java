package Alumnos2media;

public class clase2 {

	public String nombre;
	public int edad;
	
	
	public clase2(){
		this.nombre="";
		this.edad=0;
	}
		
	public clase2 (String nombre, int edad){
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

	


