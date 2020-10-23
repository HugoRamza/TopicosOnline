package colecciones;

import java.util.*;

class Alumno {
    int    numControl;
    String nombre;
    int    calificacion;

    public Alumno(int numControl, String nombre, int calificacion) {
        this.numControl   = numControl;
        this.nombre       = nombre;
        this.calificacion = calificacion;
    }
}

public class ColeccionArrayListObj {

    public static void main(String[] args) {

    Alumno a1 = new Alumno(93100095,"Gerardo Pineda Zapata",100);
    Alumno a2 = new Alumno(93100096,"Juan Perez Perez",100);

    List<Alumno> listaAlumnos=new ArrayList<Alumno>();

    listaAlumnos.add(a1);
    listaAlumnos.add(a2);


    for(Alumno varAlumno:listaAlumnos) {
        System.out.println(varAlumno.numControl+" "+varAlumno.nombre+" "+varAlumno.calificacion);
    }
}

}