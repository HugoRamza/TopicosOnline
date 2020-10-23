package parcial2.hilos;

class HiloThread extends Thread {    // Declaramos que la clase extiende Thread


HiloThread(String parNombre) {        // Construye un nuevo hilo.
       super(parNombre);             // super llama al constructor de Thread
}


@Override
public void run() {                              // Punto de entrada del hilo
     System.out.println(getName()+" (INICIO)");  // Al extender Thread podemos usar sus métodos
                                                 // en este caso getName()
     try {
         for (int x=0;x<10;x++){
             Thread.sleep(400);    // Simulamos un "proceso" introduciendo una demora
                                   // Sleep debe estar dentro
                                   // de un bloque try-catch
             System.out.println(getName()+" (CORRIENDO)" + ", x= " + x);

         }

     } catch (InterruptedException exc) {
         System.out.println(getName()+" (INTERRUPCION)");
     }

     System.out.println(getName()+" (FINAL)");
}

}