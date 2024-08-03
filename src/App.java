import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.jhonatan.ejemplos.modelo.Alumno;

public class App {
    public static void main(String[] args) throws Exception {
        ejemploAlumnosTreeSet();
    }

    public static void ejemploAlumnosTreeSet() {
        System.out.println("\t==TreeSet de Alumnos==");
        Set<Alumno> sa = new TreeSet<>();
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
