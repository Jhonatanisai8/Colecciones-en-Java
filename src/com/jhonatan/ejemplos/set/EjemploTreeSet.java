package com.jhonatan.ejemplos.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {
        // ejemplo();
        // ejemploInteger();
        ejemploOrdenar();
    }

    public static void ejemplo() {

        System.out.println("\t==Ejemplo TreeSet==");
        Set<String> ts = new TreeSet<>(); 
        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        ts.add("cuatro");
        ts.add("cinco");

        // mantiene el orden
        System.out.println(ts);

    }

    public static void ejemploInteger() {

        System.out.println("\t==Ejemplo TreeSet Integer==");
        Set<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(2);
        ts.add(1);
        ts.add(3);
        ts.add(9);

        // mantiene el orden
        System.out.println(ts);

    }

    public static void ejemploOrdenar() {

        System.out.println("\t==Ejemplo TreeSet==");
        // damos el vuelva al ordenamiento : descente
        // Set<String> ts = new TreeSet<>((a, b) -> b.compareTo(a));
        // otra forma
        Set<String> ts = new TreeSet<>(Comparator.reverseOrder());

        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        ts.add("cuatro");
        ts.add("cinco");

        // mantiene el orden
        System.out.println(ts);

    }
}
