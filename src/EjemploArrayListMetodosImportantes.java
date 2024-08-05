import java.util.ArrayList;
import java.util.List;

import com.jhonatan.ejemplos.modelo.Alumno;

public class EjemploArrayListMetodosImportantes {
    public static void main(String[] args) throws Exception {
        System.out.println("\n\t==EJEMPLOS ArrayList==");
        ejemplo();
    }

    public static void ejemplo() {
        System.out.println("\n\t==ArrayList de Alumnos==");
        List<Alumno> listaAlumnos = new ArrayList<>();

        System.out.println(listaAlumnos + ", sise = " + listaAlumnos.size());
        System.out.println("esta vacia ? = " + listaAlumnos.isEmpty());

        listaAlumnos.add(new Alumno("Pato", 5));
        listaAlumnos.add(new Alumno("Cata", 6));
        listaAlumnos.add(new Alumno("Luci", 4));
        /* agregamos un elemento en un posicin lo cual corre un elemento asi adelante */
        listaAlumnos.add(2, new Alumno("Jano", 7));

        /* ejemplo con set lo cual modifica */
        listaAlumnos.set(3, new Alumno("Jhonatan", 18));

        // mostamos la lista
        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno.getNombre() + ", Nota " + alumno.getNota());
        }
        System.out.println("sise = " + listaAlumnos.size());

        System.out.println("\n\t=Lista modificada=");
        /* para eliminar un objeto del arrayslits */
        listaAlumnos.remove(new Alumno("Jano", 7));
        
        System.out.println();

        /* mostramos de nuevo la lista */
        listaAlumnos.forEach(a -> System.out.println(a.getNombre() + ", Nota: " + a.getNota()));
        System.out.println("nuevo sise = " + listaAlumnos.size());

    }

}
