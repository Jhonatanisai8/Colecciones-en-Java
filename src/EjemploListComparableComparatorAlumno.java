import java.util.ArrayList;
import java.util.Collections;
import static java.util.Comparator.comparing;
import java.util.List;

import com.jhonatan.ejemplos.modelo.Alumno;

public class EjemploListComparableComparatorAlumno {
    public static void main(String[] args) throws Exception {
        System.out.println("==EJEMPLOS LIST==");
        // ejemploOrdenandoPorNombre();
        // ejemploOrdenandoPorNota();
        ejemploOrdenarPorNombreComparable();
    }

    public static void ejemploOrdenandoPorNombre() {
        System.out.println("\n\t==ArrayList de Alumnos==");
        List<Alumno> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(new Alumno("Pato", 5));
        listaAlumnos.add(new Alumno("Cata", 6));
        listaAlumnos.add(new Alumno("Luci", 4));
        listaAlumnos.add(new Alumno("Jano", 7));
        listaAlumnos.add(new Alumno("Andrez", 3));
        listaAlumnos.add(new Alumno("Zeus2", 2));
        listaAlumnos.add(new Alumno("Zeus", 2));
        listaAlumnos.add(new Alumno("Lucas", 2));
        listaAlumnos.add(new Alumno("Lucas", 3));

        System.out.println("\n\t=Mostrando la lista normal=");
        System.out.println(listaAlumnos);

        // para ordenar la lista
        Collections.sort(listaAlumnos);
        System.out.println("\n\t=Iterando usando Stream Foreach=");
        // sa.forEach(a -> System.out.println(a));
        // sa.forEach(a -> System.out.println(a.getNombre()));
        listaAlumnos.forEach(System.out::println);
    }

    public static void ejemploOrdenandoPorNota() {
        System.out.println("\n\t==ArrayList de Alumnos==");
        List<Alumno> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(new Alumno("Pato", 5));
        listaAlumnos.add(new Alumno("Cata", 6));
        listaAlumnos.add(new Alumno("Luci", 4));
        listaAlumnos.add(new Alumno("Jano", 7));
        listaAlumnos.add(new Alumno("Andrez", 3));
        listaAlumnos.add(new Alumno("Zeus2", 2));
        listaAlumnos.add(new Alumno("Zeus", 2));
        listaAlumnos.add(new Alumno("Lucas", 2));
        listaAlumnos.add(new Alumno("Lucas", 3));

        System.out.println("\n\t=Mostrando la lista normal=");
        System.out.println(listaAlumnos);

        // para ordenar la lista
        Collections.sort(listaAlumnos, (a, b) -> a.getNota().compareTo(b.getNota()));

        System.out.println("\n\t=Lista ordenada por Nombre=");
        // sa.forEach(a -> System.out.println(a));
        listaAlumnos.forEach(a -> System.out.println(a.getNombre() + ", Nota: " + a.getNota()));
        // listaAlumnos.forEach(System.out::println);

    }

    public static void ejemploOrdenarPorNombreComparable() {
        System.out.println("\n\t==ArrayList de Alumnos==");
        List<Alumno> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(new Alumno("Pato", 5));
        listaAlumnos.add(new Alumno("Cata", 6));
        listaAlumnos.add(new Alumno("Luci", 4));
        listaAlumnos.add(new Alumno("Jano", 7));
        listaAlumnos.add(new Alumno("Andrez", 3));
        listaAlumnos.add(new Alumno("Zeus2", 2));
        listaAlumnos.add(new Alumno("Zeus", 2));
        listaAlumnos.add(new Alumno("Lucas", 2));
        listaAlumnos.add(new Alumno("Lucas", 3));

        System.out.println("\n\t=Mostrando la lista normal=");
        System.out.println(listaAlumnos);

        // listaAlumnos.forEach(System.out::println);

        /* Collections.sort(listaAlumnos, (a, b) ->  a.getNombre().compareTo(b.getNombre()));*/

        /* listaAlumnos.sort((a, b) -> a.getNombre().compareTo(b.getNombre())); */
        /* listaAlumnos.sort(Comparator.comparing((Alumno a) -> a.getNombre())); */
        
        /* ordena por nota */
        /* listaAlumnos.sort(Comparator.comparing((Alumno a) -> a.getNota())); */

        /*listaAlumnos.sort(Comparator.comparing((Alumno a) -> a.getNombre()).reversed()); */

        /*listaAlumnos.sort(Comparator.comparing(Alumno::getNota).reversed());  */
        listaAlumnos.sort(comparing((Alumno a) -> a.getNombre()).reversed());
        System.out.println("\n\t=Lista ordenada por Nombre=");
        // sa.forEach(a -> System.out.println(a));
        listaAlumnos.forEach(a -> System.out.println(a.getNombre() + " - Nota: " + a.getNota()));
    }
}
 