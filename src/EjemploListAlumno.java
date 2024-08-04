import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.jhonatan.ejemplos.modelo.Alumno;

public class EjemploListAlumno {
    public static void main(String[] args) throws Exception {
        System.out.println("==EJEMPLOS LIST==");
        ejemploIterarList();
    }

    public static void ejemploIterarList() {
        System.out.println("\t==TreeSet de Alumnos==");
        List<Alumno> sa = new ArrayList<>();

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
        System.out.println("\n\t=Iterando con foreach=");
        for (Alumno alumno : sa) {
            // System.out.println(alumno.toString());
            System.out.println(alumno.getNombre());
        }

        System.out.println("\n\t=Iterando while y un iterator=");
        Iterator<Alumno> iterator = sa.iterator();

        while (iterator.hasNext()) {
            Alumno a = iterator.next();
            // System.out.println(a);
            System.out.println(a.getNombre() + " => Nota: " + a.getNota());

        }

        System.out.println("\n\t=Iterando usando Stream Foreach=");
        // sa.forEach(a -> System.out.println(a));
        // sa.forEach(a -> System.out.println(a.getNombre()));

        sa.forEach(System.out::println);

        System.out.println("\n\t=Iterando con for normal=");
        for (int i = 0; i < sa.size(); i++) {
            System.out.println(sa.get(i));
        }

        System.out.println("\n\t=Iterando con for normal=");
        for (int i = 0; i < sa.size(); i++) {
            Alumno a = sa.get(i);
            System.out.println(i + ": " + a.getNombre());
        }
    }

}
