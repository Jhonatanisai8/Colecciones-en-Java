import java.util.LinkedList;
import java.util.ListIterator;

import com.jhonatan.ejemplos.modelo.Alumno;

public class EjemploLinkedList {
    public static void main(String[] args) {
        System.out.println("\n\t==METODOS DE UNA LinkedList==");
        // ejemploLinkedList();
        ejemploListIterator();

    }

    public static void ejemploLinkedList() {
        LinkedList<Alumno> listAlumnos = new LinkedList<>();
        System.out.println("Tamño inicial: " + listAlumnos.size());
        System.out.println("¿Esta vacia? " + listAlumnos.isEmpty());
        listAlumnos.add(new Alumno("Pato", 5));
        listAlumnos.add(new Alumno("Cata", 6));
        listAlumnos.add(new Alumno("Luci", 4));
        listAlumnos.add(new Alumno("Jano", 7));
        listAlumnos.add(new Alumno("Andres", 3));

        System.out.println("\n\t==MOSTRANDO LOS PRIMEROS ALUMNOS==");
        for (Alumno alumno : listAlumnos) {
            System.out.println(alumno.toString());
        }
        System.out.println("Tamaño = " + listAlumnos.size());

        System.out.println("\n\t==MOSTRANDO  NUEVOS ALUMNOS==");

        // agregando al inicio y al final
        listAlumnos.addFirst(new Alumno("Zeus", 5));
        listAlumnos.addLast(new Alumno("Atenea", 6));
        System.out.println("=====================================");

        for (Alumno alumno : listAlumnos) {
            System.out.println(alumno.toString());
        }
        System.out.println("=====================================");

        // ultiene el primero y el ultimo
        System.out.println("Primer elemento : " + listAlumnos.getFirst());
        System.out.println("Ultimo elemento : " + listAlumnos.getLast());

        int posicin = 2;
        System.out.println("=====================================");

        System.out.println("Elemento en la posicion " + posicin + ": " + listAlumnos.get(posicin));

        System.out.println("Primer elemento : " + listAlumnos.peekFirst());
        System.out.println("Ultimo elemento : " + listAlumnos.peekLast());

        System.out.println("=====================================");

        // metodo para eliminar
        listAlumnos.removeFirst();
        /*
         * OTRA FORMA:
         * Alunmo zeus = listAlumnos.removeFirst();
         * Alunmo zeus = listAlumnos.pop();
         * Alunmo zeus = listAlumnos.removeFirst();
         */
        listAlumnos.removeLast();
        System.out.println("=====================================");
        System.out.println("\n\t=Mostrando la lista despues de eliminar el primero y el ultimo=");

        // eliminamos por instancia
        listAlumnos.remove(new Alumno("Jano", 7));

        for (Alumno alumno : listAlumnos) {
            System.out.println(alumno.toString());
        }

        System.out.println("Tamaño: " + listAlumnos.size());
        System.out.println("=====================================");

        // agreamos un elemento
        Alumno lucas = new Alumno("Lucas", 9);
        listAlumnos.addLast(lucas);
        System.out.println("Indice de " + lucas.getNombre() + " es : " + listAlumnos.indexOf(lucas));
        System.out.println("Tamaño: " + listAlumnos.size());

        System.out.println("=====================================");

        System.out.println("Eliminando por indice");
        listAlumnos.remove(2);
        System.out.println("Tamaño: " + listAlumnos.size());
        System.out.println("Nuevo indice de lucas: " + listAlumnos.indexOf(lucas));

        System.out.println("=====================================");
        listAlumnos.forEach(a -> System.out.println(a.getNombre() + ", Nota: " + a.getNota()));

        System.out.println("=====================================");
        System.out.println("\n\t=Modificando un elemento=");
        listAlumnos.set(3, new Alumno("Lalo", 4));
        listAlumnos.forEach(a -> System.out.println(a.getNombre() + ", Nota: " + a.getNota()));

        System.out.println("=====================================");

    }

    public static void ejemploListIterator() {
        LinkedList<Alumno> listAlumnos = new LinkedList<>();
        System.out.println("Tamño inicial: " + listAlumnos.size());
        System.out.println("¿Esta vacia? " + listAlumnos.isEmpty());
        listAlumnos.add(new Alumno("Pato", 5));
        listAlumnos.add(new Alumno("Cata", 6));
        listAlumnos.add(new Alumno("Luci", 4));
        listAlumnos.add(new Alumno("Jano", 7));
        listAlumnos.add(new Alumno("Andres", 3));

        listAlumnos.forEach(a -> System.out.println(a.getNombre() + ", Nota: " + a.getNota()));

        System.out.println("Tamño : " + listAlumnos.size());

        System.out.println("\n\t=Iterando con listIterator=");

        ListIterator<Alumno> enlaAlumnos = listAlumnos.listIterator();

        while (enlaAlumnos.hasNext()) {
            Alumno li = enlaAlumnos.next();
            System.out.println(li);
        }
        System.out.println("====================================");
        System.out.println("\n\t=En forma invertida=");
        while (enlaAlumnos.hasPrevious()) {
            Alumno alumno = enlaAlumnos.previous();
            System.out.println(alumno);
        }

    }
}
