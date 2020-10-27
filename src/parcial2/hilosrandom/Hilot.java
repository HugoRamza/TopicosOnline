package parcial2.hilosrandom;

public class Hilot extends Thread {
    private String nombre;

    public Hilot(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run ( ) {
        try {
            for (int x=1; x<=10; x++) {
                int espera = (int)(Math.random()*5000);
                System.out.println(nombre + " " +  x + " " + espera);
                Thread.sleep(espera);
            }
        } catch (Exception exc) {
              System.out.println("Excepcion");
        }
    }

    public static void main(String[] args) {

        Hilot h1 = new Hilot("Hilo1");
        Hilot h2 = new Hilot("Hilo2");
        Hilot h3 = new Hilot("Hilo3");

        h1.start();
        h2.start();
        h3.start();

        System.out.println("Termina Main");
    }

}
