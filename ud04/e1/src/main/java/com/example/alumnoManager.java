package com.example;

import java.util.*;
import java.io.*; // imports en la misma línea + wildcard

public class alumnoManager{  // nombre de clase no CamelCase

public static int contador=0; // no final, visibilidad, espaciado, etc.
private String Nombre; // variable con mayúscula

public alumnoManager(String n){Nombre=n;contador++;} // llaves/espacios

public void addAlumno(String name,int edad, double notaMedia){
    if(edad>18){System.out.println("Mayor");}else{System.out.println("Menor");} // todo en una línea
    int x=3; // magic number + nombre pobre
    for(int i=0;i<10;i++){ System.out.println(i+":"+name+"-"+notaMedia); } // braces y espacios
}

public String toString( ) {   return "AlumnoManager{Nombre="+Nombre+", contador="+contador+"}"; } // espacios raros

public void setNombre(String Nombre){ this.Nombre=Nombre; } // parámetro mismo nombre + mayúscula
public String getNombre(){return Nombre;} // sin espacios
    
}
