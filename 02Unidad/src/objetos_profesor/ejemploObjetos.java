package objetos_profesor;

public class ejemploObjetos {

	public static void main(String[] args) {
		clase1 objeto, objeto2;
		
		objeto = new clase1();
		objeto2 = new clase1();
		
		objeto.mensaje();
		
		alumno juan,noemi;
		
		juan = new alumno();
		noemi = new alumno();
		
		juan.nombre="Juan";
		noemi.nombre="Noemi";
		
		noemi.mensaje();
		juan.mensaje();
	}
	

}
