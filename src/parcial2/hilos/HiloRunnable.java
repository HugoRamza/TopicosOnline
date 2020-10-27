package parcial2.hilos;

class HiloRunnable implements Runnable {   // La clase HiloRunnable implementa la interfaz Runnable
  String nombreHilo;                       //
                                           // Como la clase HiloRunnable implementa Runnable
                                           // se la podemos pasar al constructor Thread
                                           //
                                           // Cada objeto HiloRunnable se ejecutará en su propio Hilo
HiloRunnable (String parNombre) {
      nombreHilo = parNombre;
}

@Override                           // La interfaz Runnable solo define el método run
public void run() {                 // que es el punto de entrada del hilo, ("como si fuera el main")

      System.out.println(nombreHilo+" (INICIO)");
      try {

          for (int x=0; x<=10; x++){
              Thread.sleep(2000);      //Simulamos un "proceso" introduciendo una demora
                                       //Las llamadas al método sleep deben estar dentro
                                       //de un bloque try-cyatch

              System.out.println(nombreHilo+" (CORRIENDO) " + " x = " + x);

          }

      } catch (InterruptedException exc) {
          System.out.println(nombreHilo+" (INTERRUPCION)");
      }

      System.out.println(nombreHilo+" (FINAL)");
}

}