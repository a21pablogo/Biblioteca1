/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca1;

/**
 *
 * @author A21pablogo
 */
public class Publicacion {
    private String ISBN;
    private String Titulo;
    private int AnoPublicacion;

    public Publicacion(String ISBN, String Titulo, int AnoPublicacion) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.AnoPublicacion = AnoPublicacion;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getAnoPublicacion() {
        return AnoPublicacion;
    }

    public void setAnoPublicacion(int AnoPublicacion) {
        this.AnoPublicacion = AnoPublicacion;
    }
   
   @Override
    public String toString() {
        return "Publicacion{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", A\u00f1oPublicacion=" + AnoPublicacion + '}';
    }

    
    
}
