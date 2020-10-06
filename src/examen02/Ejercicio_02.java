package examen02;

public class Ejercicio_02{

    public static void main(String[] args) {
    int x=5;

    for (int y=1; y<=7; y++) {
        if (y==x) continue;
        else {
            System.out.println(y);
        }
    }
}
}
