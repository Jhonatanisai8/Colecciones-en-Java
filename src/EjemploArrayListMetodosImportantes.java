import java.util.ArrayList;
import java.util.List;

import com.jhonatan.ejemplos.modelo.Alumno;

public class EjemploArrayListMetodosImportantes {
    public static void main(String[] args) throws Exception {
        System.out.println("\n\t==EJEMPLOS ArrayList==");
        // ejemplo();
        convetirListaEnArreglo();
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
        // listaAlumnos.remove(new Alumno("Jano", 79));
        listaAlumnos.remove(2);

        System.out.println();

        /* mostramos de nuevo la lista */
        listaAlumnos.forEach(a -> System.out.println(a.getNombre() + ", Nota: " + a.getNota()));

        /* metodo para ver si un objeto esta en la lista */
        boolean estaJano = listaAlumnos.contains(new Alumno("Jano", 7));
        Alumno cata = new Alumno("Cata", 12);
        // Alumno cata = new Alumno("Cata", 6);

        boolean estaCata = listaAlumnos.contains(cata);

        System.out.println("La lista contiene a Jano => " + estaJano);
        System.out.println("La lista contiene a " + cata.toString() + " => " + estaCata);
        System.out.println("nuevo sise = " + listaAlumnos.size());

    }

    public static void convetirListaEnArreglo() {
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

        System.out.println("Convertiendo la lista en un arreglo: ");
        Object arregloAlumnos[] = listaAlumnos.toArray();
        for (Object object : arregloAlumnos) {
            System.out.println(object.toString());
        }

        System.out.println("arregloAlumnos.length " + arregloAlumnos.length);
    }
}
