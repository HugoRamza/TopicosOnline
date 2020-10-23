/*
 Error en la declaracion de variables
 */

package quiz02;

public class ejercicio08 {

	public static void main(String[] args) {
	  //int a=1;b=2;           //INCORRECTO
        int a=1,b=2;           //CORRECTO

		for(int x=1; x<=5; x++) {
				System.out.println(x+a+b);
		}
	}
}
