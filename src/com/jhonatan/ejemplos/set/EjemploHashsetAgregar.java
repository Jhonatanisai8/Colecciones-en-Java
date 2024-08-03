package com.jhonatan.ejemplos.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EjemploHashsetAgregar {
    public static void main(String[] args) {
        System.out.println("================HashSet================");
        ejemploHashSetSet();
        // ejemploArrayList();
    }

    public static void ejemploHashSet() {
        HashSet<String> hs = new HashSet<>();
    }

    public static void ejemploHashSetSet() {

        // esta estructura de datos no permite elementos duplicados
        System.out.println("==HashSet==");
        Set<String> hs = new HashSet<>();
        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("adm");
        hs.add("cuatro");
        hs.add("cinco");
        hs.add("seis");
        boolean repetido = hs.add("seis");

        System.out.println("permite elementos duplicados : " + repetido);
        System.out.println(hs);

        // convertimos set a un arraylist
        List<String> lista = new ArrayList<>(hs);
        System.out.println("\t==HashSet ordenado==");
        // ordenamos la lista
        Collections.sort(lista);
        System.out.println(lista);
    }

    public static void ejemploArrayList() {

        // permite elementos duplicados
        System.out.println("\t==ArrayList==");
        List<String> hs = new ArrayList<>();
        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");
        hs.add("seis");

        boolean repetido = hs.add("seis");
        System.out.println("permite elementos duplicados : " + repetido);
        System.out.println(hs);

        System.out.println("\t==ArrayList ordenado==");
        // ordenamos la lista
        Collections.sort(hs);
        System.out.println(hs);
    }
}
