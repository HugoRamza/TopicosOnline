package parcial2.hilorunnable;

/*
 * Ejemplo de uso del metodo setName() para darle  nombre al hilo
 * Metodo Thread.currentThread() para obtenr el hilo en ejecucion
 * Metodo getName() para Obtener nombre de un Hilo
 */

 class hilorunnablenombre {

    public static void main(String args[]) {

        HiloRun trabajoHilo = new HiloRun();

        Thread hiloAlfa = new Thread(trabajoHilo);
        Thread hiloBeta = new Thread(trabajoHilo);

        hiloAlfa.setName("HiloAlfa");
        hiloBeta.setName("HiloBeta");

        hiloAlfa.start();
        hiloBeta.start();

        System.out.println("Termina Hilo Main");
    }
}

class HiloRun implements Runnable {
    @Override
    public void run() {
        for (int x = 0; x < 10; x++) {

            String nombreHilo = Thread.currentThread().getName();
            System.out.println(nombreHilo);
        }
    }
}
