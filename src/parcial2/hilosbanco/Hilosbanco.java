package parcial2.hilosbanco;

public class Hilosbanco {

public static void main(String args[]) {

    //Instanciamos la clase Runnable
    OperacionBanco varObjHilo = new OperacionBanco();


    // Creamos dos hilos y les damos el mismo (trabajo) Runnable
    Thread varHilo1 = new Thread(varObjHilo);
    Thread varHilo2 = new Thread(varObjHilo);


    //Le damos nombre a los dos "usuarios" de la cuenta
    varHilo1.setName("Pineda");
    varHilo2.setName("Zapata");

    varHilo1.start();
    varHilo2.start();
}
}
