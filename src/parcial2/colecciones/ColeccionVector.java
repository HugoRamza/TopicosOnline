package parcial2.colecciones;

import java.util.*;

public class ColeccionVector {

     public static void main(String args[]){

           //Creando un vector
           //-----------------
           Vector<String> varVector = new Vector<String>();

           //Agrega elementos al vector
           //--------------------------
           varVector.add("Mauricio");
           varVector.add("Itzamara");
           varVector.add("Eduardo");
           varVector.add("Gabriela");

           //Recorrer el vector con un iterador
           //----------------------------------
           Iterator<String> varIterador = varVector.iterator();
           while(varIterador.hasNext()) {
               System.out.println(varIterador.next());

           //Recorrer el vector usando un foreach
           //---------------------------------------
           for (String nombre : varVector) {
               System.out.println(nombre);
           }

           }
    }

}