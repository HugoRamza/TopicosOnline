package parcial2.hilos;

class EjecutaHiloThread {

    public static void main(String[] args) {

        System.out.println("Hilo main (INICIO)");

        HiloThread varHilo = new HiloThread("Hilo thread");

        varHilo.start();           // Iniciamos ejecución del hilo

         for (int i=0;i<50;i++) {
             System.out.print(".");

             try {

                 Thread.sleep(200); //sleep debe estar en un try-catch

             } catch (InterruptedException exc) {
                 System.out.println("Hilo main (INTERRUPCION)");
             }

         }

         System.out.println("Hilo main (FINAL)");
     }
 }