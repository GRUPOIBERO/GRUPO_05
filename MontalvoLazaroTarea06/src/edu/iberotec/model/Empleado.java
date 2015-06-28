package edu.iberotec.model;

/**
 *
 * @author RAUL
 */
public class Empleado {
    String nombre ,apellido;

    public Empleado(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
     public String getInfo()
    {
        return this.nombre + this.apellido;
    }
}
