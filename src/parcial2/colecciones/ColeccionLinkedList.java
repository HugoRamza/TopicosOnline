package parcial2.colecciones;

import java.util.*;

public class ColeccionLinkedList {

    public static void main(String args[]){

        //Crear un LinkedList
        //-------------------
        LinkedList<String> varLista = new LinkedList<String>();
        varLista.add("Mauricio");
        varLista.add("Itzamara");
        varLista.add("Eduardo");
        varLista.add("Gabriela");

        //Recorrer la lista usando un iterador
        //------------------------------------
        Iterator<String> varIterador = varLista.iterator();
        while(varIterador.hasNext()){
            System.out.println(varIterador.next());
        }

        //Recorriendo la lista usando un foreach
        //--------------------------------------
        for (String nombre : varLista) {
            System.out.println(nombre);
        }

    }
}