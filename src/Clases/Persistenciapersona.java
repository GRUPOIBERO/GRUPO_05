 package Clases;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
/**
 *
 * @author RAUL
 */
public class Persistenciapersona {
    public static void SaveData(ArrayList<Persona> listaP) {
        try {
            FileOutputStream file = new FileOutputStream("lista de personas");
            ObjectOutputStream stream = new ObjectOutputStream(file);
            stream.writeObject(listaP);
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static ArrayList<Persona> LoadData() {
        ArrayList<Persona> listaP = null;
        try {
            FileInputStream file = new FileInputStream("Paciente");
            ObjectInputStream stream = new ObjectInputStream(file);
            listaP = (ArrayList<Persona>) stream.readObject();
            stream.close();
        } catch (Exception e) {
            e.printStackTrace();
            listaP = null;
        }        
        return (listaP!=null)? listaP : 
                                new ArrayList<Persona>();             
    }
    
}
