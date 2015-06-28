/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencias;

import Clases.Animal;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author YESSENIA MONTALVO
 */
public class PersistenciaAnimal {
    
    public static void SaveData(ArrayList<Animal> lista) {
        try {
            FileOutputStream file = new FileOutputStream("animal.ser");
            ObjectOutputStream stream = new ObjectOutputStream(file);
            stream.writeObject(lista);
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
     public static ArrayList<Animal> LoadData() {
        ArrayList<Animal> lista = null;
        try {
            FileInputStream file = new FileInputStream("Animal.ser");
            ObjectInputStream stream = new ObjectInputStream(file);
            lista = (ArrayList<Animal>) stream.readObject();
            stream.close();
        } catch (Exception e) {
            e.printStackTrace();
            lista = null;
        }        
        return (lista!=null)? lista : 
                                new ArrayList<Animal>();             
    }
}
