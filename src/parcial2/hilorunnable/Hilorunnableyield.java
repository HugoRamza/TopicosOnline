package parcial2.hilorunnable;

/*
 *  Ejemplo de uso del metodo yield para ceder el control a otro hilo
 *
 */
public class Hilorunnableyield implements Runnable {

    Thread hilo;

    public static void main(String[] args) {
          new Hilorunnableyield("Hilo_1");
          new Hilorunnableyield("Hilo_2");
          new Hilorunnableyield("hilo_3");

          System.out.println(Thread.currentThread().getName() + " Termino");
    }


     Hilorunnableyield(String str) {
          hilo = new Thread(this, str);
          hilo.start();
     }


     @Override
     public void run() {
          for (int i = 0; i < 10; i++) {
              if (i == 5) {
                 System.out.println(Thread.currentThread().getName() + " x="+ i+ " Yield ceder control...");
                 Thread.yield();
              } else {
                  System.out.println(Thread.currentThread().getName() +" x="+ i);
              }
          }
          System.out.println(Thread.currentThread().getName() + " Termino");
     }

}