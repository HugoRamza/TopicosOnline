package parcial2.hilorunnable;

public class hilorunnable {

    public static void main(String args[]) {

        Hilo tareaHilo = new Hilo();
        Thread miHilo = new Thread(tareaHilo);

        miHilo.start();

        try { Thread.sleep(500); }
        catch(InterruptedException ex) { ex.printStackTrace(); }

        System.out.println ("Hilo Main");
    }
}

class Hilo implements Runnable {

    @Override
    public void run() {
        hazAlgo();
    }

    public void hazAlgo() {
        try { Thread.sleep(2000); }
        catch(InterruptedException ex) { ex.printStackTrace(); }
        hazAlgoMas();
    }

    public void hazAlgoMas() {
        System.out.println("Tarea Hilo");
    }

}



/*
 *  En este ejemplo en algunas ejecuciones:
 *  Primero terminara el Hilo Main y despues del Hilo Runnbale
 *
 *  En algunas otras ejecuciones:
 *  primero terminara el Hilo Runnable y despues el Hilo Main
 */
