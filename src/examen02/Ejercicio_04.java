package examen02;

public class Ejercicio_04 {

    public static void main(String[] args) {
    String cadena="1";
        
    for (int x=1; x<=5; x++) {
        if (x==4) { cadena+="0";
                    break; }
        cadena+="10";
        }
    System.out.print(cadena);
    }
}

