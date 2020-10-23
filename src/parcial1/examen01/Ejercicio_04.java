package parcial1.examen01;

public class Ejercicio_04 {

    public static void main(String[] args) {
    String cadena="0";
        
    for (int x=1; x<=5; x++) {
        if (x==4) { cadena+="4";
                    break; }
        cadena+="42";
        }
    System.out.print(cadena);
    }
}
