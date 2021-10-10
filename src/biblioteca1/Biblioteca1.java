/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;
import java.util.ArrayList;

public class Biblioteca1{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
         String ficheroR= "C:\\Users\\Pablo\\Documents\\Revistas.txt";
         String ficheroL= "C:\\Users\\Pablo\\Documents\\Libros.dat";
        ArrayList <Libro> Libros=new ArrayList<>();
        ArrayList <Revista> Revistas=new ArrayList<>();
        Libro libro1 = new Libro("A12354B","La isla del tesoro",2000,false,true,"Si");
        Revista resvista1 = new Revista("R784325B","cosmopolitan",2021,187);
        Libro libro2 = new Libro("A14634B","Tres mil leguas submarinas",2000,false,true,"Si");
        Revista resvista2 = new Revista("R7248575B","Platboy",2021,187);
        
        /*Libros.add(libro2);
        Revistas.add(resvista1);
        Revistas.add(resvista2);
        */
        Scanner sc = new Scanner(System.in);
        // IMPORTANTE PARA LECTURA DE LOS FICHEROS .TXT (instanceof)
        
        
     /*   libro1.setPresta(false);
        libro1.estaPrestado(valor.estaPrestado);
        libro1.setDevuelve(true);*/
        Libros.add(libro1);
        Libros.add(libro2);
        Revistas.add(resvista1);
        Revistas.add(resvista2);
        
        
 //Guardar registros de Libros en un fichero
    try {
        File FicheroLibros=new File(ficheroL);
        
        ObjectOutputStream ficheroSalida = new ObjectOutputStream
                (new FileOutputStream(ficheroL));
        ficheroSalida.writeObject(libro1);
        ficheroSalida.flush();
        ficheroSalida.close();
        System.out.println("registro de libros guardos correctamente...");
 
        } catch (FileNotFoundException fnfe) {
            System.out.println("Error: El fichero no existe. ");
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
 
        try {
        ObjectOutputStream ficheroSalida = new ObjectOutputStream
                (new FileOutputStream(ficheroR));
        ficheroSalida.writeObject(Revistas);
        ficheroSalida.flush();
        ficheroSalida.close();
        System.out.println("Registro de revista guardado correctamente...");
 
        } catch (FileNotFoundException fnfe) {
            System.out.println("Error: El fichero no existe. ");
        } catch (IOException ioe) {
            System.out.println("Error: Fallo en la escritura en el fichero. ");
        }
        }
    
    
}
