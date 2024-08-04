package com.jhonatan.ejemplos.modelo;

public class Alumno implements Comparable<Alumno> {
    private String nombre;
    private Integer nota;

    public Alumno() {
    }

    public Alumno(String nombre, Integer nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumno: Nombre: " + nombre + ", Nota: " + nota;
    }

    @Override
    public int compareTo(Alumno o) {
        // if (this.nombre == null) {
        // return 0;
        // }
        // // ordena por nombre
        // return this.nombre.compareTo(o.nombre);

        // ordena por nota
        // if (this.nota == o.nota) {
        // return 0;
        // }
        // if (this.nota > o.nota) {
        // return 1;
        // } else {
        // return -1;
        // }
        if (this.nota.equals(null)) {
            return 0;
        }
        return this.nota.compareTo(o.nota);
    }
}
