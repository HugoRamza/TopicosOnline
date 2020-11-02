package parcial2.hilosrandom;

public class Hilor implements Runnable {
    private String nombre;

    public Hilor(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        try {
            for (int x=1; x<=10; x++) {

                //espera un lapso de tiempo aleatorio
                int espera = (int)(Math.random()*2000);
                System.out.println(nombre + " " +  x + " " + espera);
                Thread.sleep(espera);
            }
        } catch (Exception exc) {
              System.out.println("Excepcion");
        }
    }

    public static void main(String[] args) {

        Hilor h1 = new Hilor("Hilo1");
        Hilor h2 = new Hilor("Hilo2");
        Hilor h3 = new Hilor("Hilo3");

        Thread t1 = new Thread(h1);
        Thread t2 = new Thread(h2);
        Thread t3 = new Thread(h3);

        t1.start();
        t2.start();
        t3.start();

        System.out.println("Termina Main");
    }

}
