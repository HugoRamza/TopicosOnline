/*
 * RunTime Error array fuera de índice
 */

package quiz02;

public class ejercicio04 {

	public static void main(String[] args) {
        int    suma    = 0;
		int[]  vector  = new int[3];
		double promedio= 0;

		vector[0]=85;
		vector[1]=90;
		vector[2]=95;
	    
	    for(int x=0; x<=3; x++) {   //Los elemento del array van del 0 al 2
	    	suma = suma + vector[x];
	    }
	    promedio = suma / 3;
		
	    System.out.println("La suma es:     "+suma);
		System.out.println("El promedio es: "+promedio);
	}
}
