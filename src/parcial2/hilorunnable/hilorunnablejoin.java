package parcial2.hilorunnable;

/*
 *  Ejemplo de uso del metodo join() para que el metodo main "espere"
 *  a que termine el hilo Runnbale y pueda terminar despues de este
 */

public class hilorunnablejoin {

    public static void main(String args[]) {

        // Creamos un "trabajo" para que lo ejecute un hilo
        // "trabajo" = Una clase que implemente Runnable
        HiloRunJoin tareaHilo = new HiloRunJoin();

        // Creamos una instancia de la clase Thread y "le pasamos" el trabajo
        Thread miHilo = new Thread(tareaHilo);

        miHilo.start();

        // Hilo main esperara 1/2 segundo
        try { Thread.sleep(500); }
        catch(InterruptedException ex) { ex.printStackTrace(); }

        // main "esperara" a que termine miHilo para poder continuar
        try { miHilo.join(); }
        catch (InterruptedException ex) {ex.printStackTrace();}

        // Hilo Main imrpime mensaje en consola
        System.out.println ("Hilo Main");
    }
}

// Esta clase implementa Runnable es decir tiene la capacidad de correr concurrentemente
class HiloRunJoin implements Runnable {

    @Override
    public void run() {
        // Llamar al metodo hazAlgo()
        hazAlgo();
    }

    public void hazAlgo() {
        // Esperar 1/2 segundo y despues llamar al metodo harAlgoMas()
        try { Thread.sleep(500); }
        catch(InterruptedException ex) { ex.printStackTrace(); }
        hazAlgoMas();
    }

    // Metodo hazAlgoMas() imprime mensaje en consola
    public void hazAlgoMas() {
        System.out.println("Tarea Hilo");
    }

}
