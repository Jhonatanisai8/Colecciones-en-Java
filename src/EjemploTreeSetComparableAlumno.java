import static java.util.Comparator.comparing;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.jhonatan.ejemplos.modelo.Alumno;

public class EjemploTreeSetComparableAlumno {
    public static void main(String[] args) throws Exception {
        // ejemploAlumnosTreeSet();
        // ejemploAlumnosTreeSetComparto();
        // iterarTreeSetConExpresionesLamda();
        ejemploOrdenarTreset();
    }

    public static void iterarTreeSetConExpresionesLamda() {
        System.out.println("\t==TreeSet de Alumnos==");
        Set<Alumno> sa = new TreeSet<>();
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andrez", 3));
        sa.add(new Alumno("Zeus2", 2));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Lucas", 2));
        sa.add(new Alumno("Lucas", 3));

        System.out.println("=Iterando usando Stream Foreach=");
        // sa.forEach(a -> System.out.println(a));
        // sa.forEach(a -> System.out.println(a.getNombre()));

        sa.forEach(System.out::println);

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
        sa.add(new Alumno("Zeus2", 2));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Lucas", 2));
        sa.add(new Alumno("Lucas", 3));

        /* no permite repetidos */
        System.out.println("=Iterando con foreach=");
        for (Alumno alumno : sa) {
            // System.out.println(alumno.toString());
            System.out.println(alumno.getNombre());
        }

        System.out.println("=Iterando while y un iterator=");
        Iterator<Alumno> iterator = sa.iterator();

        while (iterator.hasNext()) {
            Alumno a = iterator.next();
            // System.out.println(a);
            System.out.println(a.getNombre() + " => Nota: " + a.getNota());

        }
    }

    public static void ejemploAlumnosTreeSetComparto() {
        System.out.println("\t==TreeSet de Alumnos==");

        // se pude cambiar el orden en que queremos ordenar
        // Set<Alumno> sa = new TreeSet<>((a, b) ->
        // (b.getNombre().compareTo(a.getNombre())));

        /* no muestra repetidos de acuerdo al parametro del comparTo */
        Set<Alumno> sa = new TreeSet<>((a, b) -> (b.getNombre().compareTo(a.getNombre())));

        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andrez", 3));
        sa.add(new Alumno("Zeus2", 2));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Lucas", 2));
        sa.add(new Alumno("Lucas", 3));

        /* no permite repetidos */
        System.out.println("=Iterando con foreach=");
        for (Alumno alumno : sa) {
            // System.out.println(alumno.toString());
            System.out.println(alumno.getNombre());
        }

        System.out.println("=Iterando while y un iterator=");
        Iterator<Alumno> iterator = sa.iterator();

        while (iterator.hasNext()) {
            Alumno a = iterator.next();
            // System.out.println(a);
            System.out.println(a.getNombre() + " => Nota: " + a.getNota());

        }
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

    public static void ejemploOrdenarTreset() {
        System.out.println("\t==TreeSet de Alumnos==");
        // Set<Alumno> sa = new TreeSet<>();
        /*
         * ordenamos de forma descente
         * se quita el reserve para la forma ascendente
         */
        Set<Alumno> sa = new TreeSet<>(comparing(Alumno::getNombre).reversed());

        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andrez", 3));
        sa.add(new Alumno("Zeus2", 2));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Lucas", 2));
        sa.add(new Alumno("Lucas", 3));

        System.out.println("=Iterando usando Stream Foreach=");
        // sa.forEach(a -> System.out.println(a));
        // sa.forEach(a -> System.out.println(a.getNombre()));

        sa.forEach(System.out::println);
    }
}
