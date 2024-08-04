import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.jhonatan.ejemplos.modelo.Alumno;

public class EjemploTreeSetComparableAlumno {
    public static void main(String[] args) throws Exception {
        ejemploAlumnosTreeSet();
        // ejemploAlumnosTreeSetComparto();
    }

    public static void ejemploAlumnosTreeSet() {
        System.out.println("\t==TreeSet de Alumnos==");
        Set<Alumno> sa = new TreeSet<>();

        // agregamos alumnos
        // objetos para que se puedan agregar deben implementar la interface comparable
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andrez", 3));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Zeus", 2));

        /*no permite repetidos */
        for (Alumno alumno : sa) {
            System.out.println(alumno.toString());
        }
    }

    public static void ejemploAlumnosTreeSetComparto() {
        System.out.println("\t==TreeSet de Alumnos==");

        // se pude cambiar el orden en que queremos ordenar
        // Set<Alumno> sa = new TreeSet<>((a, b) ->
        // (b.getNombre().compareTo(a.getNombre())));
        Set<Alumno> sa = new TreeSet<>((a, b) -> (b.getNota().compareTo(a.getNota())));

        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andrez", 3));
        sa.add(new Alumno("Zeus", 2));

        System.out.println(sa);
    }

    public static void ejemploAlumnosHashSet() {
        System.out.println("\t==HashSet de Alumnos==");
        Set<Alumno> sa = new HashSet<>();
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andrez", 3));
        sa.add(new Alumno("Zeus", 2));

        System.out.println(sa);
    }
}
