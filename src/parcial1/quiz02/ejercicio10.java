
/* 
 * Error en a sentencia for
*/

package quiz02;

public class ejercicio10 {

	public static void main(String[] args) {
	String materia="Topicos";
		
  //for(Int x=1; x<=10; x++) {         //INCORRECTO
	for(int x=1; x<=10; x++) {         //CORRECTO
		if (x==5) { break; }
		System.out.println(materia);
	}
	}
}


