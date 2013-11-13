package actividad_objetos;

public class Ejercicio {

	public static void main(String[] args) {
		Alumno alu1, alu2;
		alu1 = new Alumno();
		alu2 = new Alumno();
		
		System.out.println("Indique el nombre de 3 alumnos y la edad de uno de ellos");
		alu1.setNombre("Angel"); //paso el nombre y me lo guarda en el objeto alu1
		System.out.println(alu1.getNombre());
		alu2.setNombre("Juan");
		alu2.setEdad(25);
		System.out.println(alu2.getNombre()+ " "+ alu2.getEdad());
	}

}
