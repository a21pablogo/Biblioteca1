/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca1;

/**
 *
 * @author A21pablogo
 */
public class Libro extends Publicacion implements Prestable {
    private boolean Prestado;
    private boolean devolver;
    private String estaDevuelto;

//Desde la clase Libro llamas a la clase Publicaccion
    public Libro(String ISBN, String titulo, int AnoPublicacion,boolean Prestado, boolean devolver, String estaDevuelto) {
        super(ISBN,titulo,AnoPublicacion);
        this.Prestado = Prestado;
        this.devolver = devolver;
        this.estaDevuelto = estaDevuelto;
    }
    boolean lib= false;
    public boolean getPresta() {
        return Prestado;
    }

    public void setPresta(boolean Prestado) {
        this.Prestado = Prestado;
    }

    public boolean getDevuelve() {
        return devolver;
    }

    public void setDevuelve(boolean devolver) {
        this.devolver = devolver;
    }

    public String getEstaDevuelto() {
        return estaDevuelto;
    }

    public void setEstaDevuelto(String estaDevuelto) {
        this.estaDevuelto = estaDevuelto;
    }
    @Override
    public void presta(){
        this.Prestado = true;   
    }
    @Override
    public void devolver(){
        this.devolver = false;
    }
    @Override
    public void estaPrestado(String estaPrestado){
        if (devolver==false)
            estaPrestado = "No";
        else
            estaPrestado="Si";
    }
   
    
    
}
