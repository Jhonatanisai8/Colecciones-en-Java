package com.jhonatan.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicado2 {
    public static void main(String[] args) {
        System.out.println("===ELEMENTOS DUPLICADOS===");
        ejemploDuplicados();
    }

    public static void ejemploDuplicados() {
        // arreglo
        String peces[] = { "Corvinan", "Lenguado","Atun", "Pejerrey", "Robalo", "Atún", "Lenguado" ,"Corvinan"};
        Set<String> unicos = new HashSet<>();

        // para registrar los duplicados
        Set<String> duplicados = new HashSet<>();

        for (String pe : peces) {
            if (!unicos.add(pe)) {
                // verifacamos si esta duplicado
                duplicados.add(pe);
            }
        }

        // borrados de unicos los duplicados
        unicos.removeAll(duplicados);

        System.out.println(unicos.size() + " UNICOS: " + unicos);
        System.out.println(duplicados.size() + " DUPLICADOS: " + duplicados);
    }
}
