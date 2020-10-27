package parcial2.hilos;

class EjecutaHiloRunnable {

    public static void main(String[] args) {

        System.out.println("Hilo main (INICIO)");

        HiloRunnable objHilo = new HiloRunnable("Hilo Secundario");    // Instanciamos objeto Hilo.

        Thread varHilo = new Thread(objHilo);               // Le pasamos el objeto Hilo a el objeto Thread
                                                            // instanciamos Thread

        varHilo.start();                                    // Iniciamos ejecución del hilo


        for (int i=0; i<30; i++) {
            System.out.print(".");

            try {

            Thread.sleep(1000);   //Llamadas a sleep deben estar en un try-catch

            } catch (InterruptedException exc){
                System.out.println("Hilo main (INTERRUPCION)");
            }
        }


        System.out.println("Hilo main (FINAL)");
    }
}