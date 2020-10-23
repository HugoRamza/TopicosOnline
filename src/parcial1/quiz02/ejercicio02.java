/*
Error en la sentencia if 
*/

package parcial1.quiz02;

public class ejercicio02 {
	public static void main(String[] args) {
	int x=5;

	for (int y=1; y<=7; y++) {
	  //if (y=x) {              //INCORRECTO
		if (y==x) {             //CORRECTO
			
		    break;
		}
		System.out.println(y);
	}
		
	}
}
