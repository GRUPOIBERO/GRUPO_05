package Clases;
import java.util.ArrayList;
/**
 *
 * @author RAUL
 */
public class Cliente {
     private ArrayList<String> nombre = new ArrayList<String>();
    private ArrayList<String> apellido = new ArrayList<String>();
    private ArrayList<Integer> edad= new ArrayList<Integer>();
    private ArrayList<String> direccion = new ArrayList<String>();

    public Cliente() {
    }

    public ArrayList<String> getNombre() {
        return nombre;
    }

    public void setNombre(ArrayList<String> nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getApellido() {
        return apellido;
    }

    public void setApellido(ArrayList<String> apellido) {
        this.apellido = apellido;
    }

    public ArrayList<Integer> getEdad() {
        return edad;
    }

    public void setEdad(ArrayList<Integer> edad) {
        this.edad = edad;
    }

    public ArrayList<String> getDireccion() {
        return direccion;
    }

    public void setDireccion(ArrayList<String> direccion) {
        this.direccion = direccion;
    }
   
    
}
