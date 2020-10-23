package parcial2.hilos;

public class EjecutaTresHilos {

    public static void main(String[] args) {
        System.out.println("Hilo main (INICIO)");

        // Instanciamos Tres objetos Hilo.
        HiloRunnable objHilo1 = new HiloRunnable("Hilo run1");
        HiloRunnable objHilo2 = new HiloRunnable("Hilo run2");
        HiloRunnable objHilo3 = new HiloRunnable("Hilo run3");

        // Pasamos los Hilos a objetos Thread y los instanciamos
        Thread varHilo1 = new Thread(objHilo1);
        Thread varHilo2 = new Thread(objHilo2);
        Thread varHilo3 = new Thread(objHilo3);

        // Ejecutamos los hilos
        varHilo1.start();
        varHilo2.start();
        varHilo3.start();

        for (int i=0; i<30; i++) {
            System.out.print(".");

            try {

            Thread.sleep(800);   //Todas las llamadas a sleep deben estar en un try-catch

            } catch (InterruptedException exc){
                System.out.println("Hilo main (INTERRUPCION)");
            }
        }

        System.out.println("Hilo main (FINAL)");
    }
}