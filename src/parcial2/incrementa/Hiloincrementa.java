package parcial2.incrementa;


public class Hiloincrementa {
    public static void main(String args[]) {

        Hiloi varWork     = new Hiloi();

        Thread  varWorker1 = new Thread(varWork);
        Thread  varWorker2 = new Thread(varWork);

        varWorker1.setName("Pedro");
        varWorker2.setName("Jose");

        varWorker1.start();
        varWorker2.start();
    }
}

class Hiloi implements Runnable {

    private int saldo=0;

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" Empieza");

        for (int x=1; x<=20; x++) {
            incrementar();
        }

        System.out.println(Thread.currentThread().getName()+" Finaliza");
    }

    public void incrementar() {
        int i = saldo;
        saldo = i + 1;
        System.out.println(Thread.currentThread().getName()+" incrementarsaldo = "+ saldo);
    }
}
