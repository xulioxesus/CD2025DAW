package com.example;

import java.util.ArrayList;
import java.util.List;

public class AlumnoManager {
    private List<Alumno> alumnos = new ArrayList<>();

    public void agregarAlumno(Alumno a) {
        if (a != null) {
            alumnos.add(a);
        }
    }

    public Alumno buscarAlumnoPorNombre(String nombre) {
        for (Alumno a : alumnos) {
            if (a.getNombre().equals(nombre)) {
                return a;
            }
        }
        return null;
    }

    public double calcularMedia() {
        double suma = 0;
        for (Alumno a : alumnos) {
            suma = suma + a.getNotaMedia();
        }
        if (alumnos.size() == 0) {
            return 0;
        }
        return suma / alumnos.size();
    }

    public String clasificarAlumno(Alumno a) {
        if (a == null) {
            return "Alumno nulo";
        }

        if (a.getNotaMedia() >= 9 && a.getEdad() >= 18) {
            return "Sobresaliente adulto";
        } else if (a.getNotaMedia() >= 9 && a.getEdad() < 18) {
            return "Sobresaliente menor";
        } else if (a.getNotaMedia() >= 7 && a.getEdad() >= 18) {
            return "Notable adulto";
        } else if (a.getNotaMedia() >= 7 && a.getEdad() < 18) {
            return "Notable menor";
        } else if (a.getNotaMedia() >= 5 && a.getEdad() >= 18) {
            return "Aprobado adulto";
        } else if (a.getNotaMedia() >= 5 && a.getEdad() < 18) {
            return "Aprobado menor";
        } else if (a.getEdad() >= 18) {
            return "Suspenso adulto";
        } else {
            return "Suspenso menor";
        }
    }

    public void mostrarAlumnosAprobados() {
        for (Alumno a : alumnos) {
            if (a.getNotaMedia() >= 5) {
                System.out.println("Alumno aprobado: " + a.getNombre());
            }
        }
    }

    public void mostrarAlumnosSuspensos() {
        for (Alumno a : alumnos) {
            if (a.getNotaMedia() < 5) {
                System.out.println("Alumno suspenso: " + a.getNombre());
            }
        }
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
}