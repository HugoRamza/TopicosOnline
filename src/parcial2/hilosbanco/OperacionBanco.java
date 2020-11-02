package parcial2.hilosbanco;

public class OperacionBanco implements Runnable {

    // Solo se crea una instancia de la cuenta de banco
    // que será compartia por diferentes hilos
    private CuentaBanco varCuenta = new CuentaBanco();

    @Override
    public void run() {

        //Con un ciclo for "simulamos" 10 retiros
        for (int x=0; x<10; x++) {

            // Retirar 10 pesos
            hacerRetiro(10);

            // Si saldo de cuenta es negativo imprimir un mensaje
            if (varCuenta.Saldo() < 0) {
                System.out.println("Sobregiro");
            }
        }
    }

    private void hacerRetiro(int cantidad) {

        // Revisamos si el saldo de la cuenta es suficiente
        // -------------------------------------------------
        if (varCuenta.Saldo() >= cantidad) {
           System.out.println(Thread.currentThread().getName()+" inicia retiro");

           // Simulamos un retardo
           // ---------------------
           try { System.out.println(Thread.currentThread().getName()+" se duerme");
                 Thread.sleep(500);
            } catch (InterruptedException e) { e.printStackTrace(); }
            System.out.println(Thread.currentThread().getName()+" se despierta");

            // Hacemos el retiro
            // ------------------
            varCuenta.Retiro(cantidad);
            System.out.println(Thread.currentThread().getName()+" finaliza retiro, saldo="+varCuenta.Saldo());

        } else {
            // Si no hay saldo mostar mensaje
            // ------------------------------
            System.out.println(Thread.currentThread().getName()+" Fondos insuficientes");
        }

    }

}
