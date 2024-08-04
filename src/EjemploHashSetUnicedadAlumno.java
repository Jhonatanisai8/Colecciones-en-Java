import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.jhonatan.ejemplos.modelo.Alumno;

public class EjemploHashSetUnicedadAlumno {
    public static void main(String[] args) throws Exception {
        ejemploAlumnosHashSet();
        // ejemploAlumnosTreeSetComparto();
    }

    public static void ejemploAlumnosHashSet() {
        System.out.println("\t==HashSet de Alumnos==");
        Set<Alumno> sa = new HashSet<>();

        // agregamos alumnos
        // objetos para que se puedan agregar deben implementar la interface comparable
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andrez", 3));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Zeus2", 3));

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
            System.out.println(a.getNombre()+" => Nota: "+a.getNota());

        }

    }

}
