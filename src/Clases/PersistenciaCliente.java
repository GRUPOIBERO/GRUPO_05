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
public class PersistenciaCliente {
    public static void SaveData(ArrayList<Cliente> listaClientes) {
        try {
            FileOutputStream file = new FileOutputStream("Cliente");
            ObjectOutputStream stream = new ObjectOutputStream(file);
            stream.writeObject(listaClientes);
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static ArrayList<Cliente> LoadData() {
        ArrayList<Cliente> listaClientes = null;
        try {
            FileInputStream file = new FileInputStream("Paciente");
            ObjectInputStream stream = new ObjectInputStream(file);
            listaClientes = (ArrayList<Cliente>) stream.readObject();
            stream.close();
        } catch (Exception e) {
            e.printStackTrace();
            listaClientes = null;
        }        
        return (listaClientes!=null)? listaClientes : 
                                new ArrayList<Cliente>();             
    }
    
}
