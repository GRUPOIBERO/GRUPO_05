package Clases;
/**
 *
 * @author 
 */
public enum Distritos {
    Miraflores(""),
    Barranco(""),
    San_Isidro(""),
    San_Borja(""),
    Surco(""),
    Pueblo_Libre(""), 
    Jesús_María(""),
    Lince(""), 
    Magdalena(""),
    San_Miguel("");
     private String nombre;

    private Distritos(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
