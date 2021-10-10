/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca1;

/**
 *
 * @author A21pablogo
 */
public class Revista extends Publicacion{
    private int numero;

    public Revista(String ISBN, String titulo, int AnoPublicacion, int numero) {
        super(ISBN,titulo,AnoPublicacion);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
    
    
}
