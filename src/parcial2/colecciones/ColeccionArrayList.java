package parcial2.colecciones;

import java.util.*;

public class ColeccionArrayList {
    public static void main(String args[]){

        //Crear un ArrayList
        //------------------
        List<String> varLista = new ArrayList<String>();

        //Agregando elementos al ArrayList
        //--------------------------------
        varLista.add("Mauricio");
        varLista.add("Itzamara");
        varLista.add("Eduardo");
        varLista.add("Gabriela");

        //Recorriendo la lista usando un iterador
        //---------------------------------------
        System.out.println("Iterando con un iterador:");
        Iterator iteradorLista = varLista.iterator();
        while(iteradorLista.hasNext()) {
            System.out.println(iteradorLista.next());
        }

        //Recorriendo la lista usando un foreach
        //--------------------------------------
        System.out.println("Iterando con un bucle foreach:");
        for (String nombre : varLista) {
            System.out.println(nombre);
        }

        //Iterar la lista con un bucle for
        //----------------------------------
        System.out.println("Iterando con un bucle for:");
        for(int i=0;i<varLista.size();i++) {
         System.out.println(varLista.get(i));
        }

   }
}