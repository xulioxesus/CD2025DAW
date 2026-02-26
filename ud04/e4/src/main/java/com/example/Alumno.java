package com.example;

/**
 * Clase que representa a un alumno dentro del sistema.
 * 
 * Un alumno es una especialización de la clase Persona que incluye
 * información académica adicional como la nota media.
 */
public class Alumno extends Persona {

    /**
     * Nota media del alumno.
     */
    private float notaMedia;

    /**
     * Constructor de la clase Alumno.
     * 
     * @param notaMedia Nota media del alumno.
     * @param nombre Nombre del alumno.
     * @param direccion Dirección del alumno.
     * @param telefono Teléfono de contacto.
     * @param alias Alias o nombre de usuario.
     * @param correoElectronico Correo electrónico del alumno.
     */
    public Alumno(float notaMedia, String nombre, String direccion, String telefono, String alias, String correoElectronico) {
        super(nombre, direccion, telefono, alias, correoElectronico);
        this.notaMedia = notaMedia;
    }

    /**
     * Obtiene la nota media del alumno.
     * 
     * @return Nota media.
     */
    public float getNotaMedia() {
        return notaMedia;
    }

    /**
     * Establece la nota media del alumno.
     * 
     * @param notaMedia Nueva nota media.
     */
    public void setNotaMedia(float notaMedia) {
        this.notaMedia = notaMedia;
    } 
}