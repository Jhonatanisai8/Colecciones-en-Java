package com.jhonatan.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicado {
    public static void main(String[] args) {
        System.out.println("===ELEMENTOS DUPLICADOS===");
        ejemploDuplicados();
    }

    public static void ejemploDuplicados() {
        String peces[] = { "Corvinan", "Lenguado", "Pejerrey", "Robalo", "Atún", "Lenguado" };
        Set<String> unicos = new HashSet<>();

        for (String pe : peces) {
            if (!unicos.add(pe)) {
                System.out.println("Elemento Duplicado: " + pe);
            }
        }

        System.out.println(unicos.size() + " elementos no duplicados: " + unicos);
    }
}
