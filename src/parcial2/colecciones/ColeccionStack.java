package colecciones;

import java.util.*;

public class ColeccionStack {
    public static void main(String args[]){

        //Creando una pila
        //----------------
        Stack<String> varPila = new Stack<String>();

        //Introduce 4 elementos y saca uno
        //--------------------------------
        varPila.push("Mauricio");
        varPila.push("Itzamara");
        varPila.push("Eduardo");
        varPila.push("Gabriela");
        varPila.push("Angel");
        varPila.pop();

        //Recorrer pila con iterador
        //--------------------------
        Iterator<String> varIterador=varPila.iterator();
        while(varIterador.hasNext()){
            System.out.println(varIterador.next());
        }

        //Recorriendo la pilar usando un foreach
        //--------------------------------------
        for (String nombre : varPila) {
            System.out.println(nombre);
        }

}

}