import java.util.HashSet;
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
        sa.add(new Alumno("Zeus", 2));

        /* no permite repetidos */
        for (Alumno alumno : sa) {
            System.out.println(alumno.toString());
        }
    }

}
