package Clases;
import java.util.ArrayList;
/** * * @author RAUL */
public class Animal {
     private ArrayList<String> nombre = new ArrayList<String>();
    private ArrayList<String> apellido = new ArrayList<String>();
    private ArrayList<Integer> edad= new ArrayList<Integer>();
    private ArrayList<String> direccion = new ArrayList<String>();

    public Animal() {
    }

    public ArrayList<String> getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(ArrayList<String> nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public ArrayList<String> getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(ArrayList<String> apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the edad
     */
    public ArrayList<Integer> getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(ArrayList<Integer> edad) {
        this.edad = edad;
    }

    /**
     * @return the direccion
     */
    public ArrayList<String> getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(ArrayList<String> direccion) {
        this.direccion = direccion;
    }
    
    
}
