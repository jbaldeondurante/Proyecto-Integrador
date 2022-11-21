/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author adria
 */
public class Prueba {
    
    private String nombrep;
    private String instrucciones;
    private int cantpreg;

    public Prueba(String nombrep, String instrucciones, int cantpreg) {
        this.nombrep = nombrep;
        this.instrucciones = instrucciones;
        this.cantpreg = cantpreg;
    }

    public String getNombre() {
        return nombrep;
    }

    public void setNombre(String nombre) {
        this.nombrep = nombre;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public int getCantpreg() {
        return cantpreg;
    }

    public void setCantpreg(int cantpreg) {
        this.cantpreg = cantpreg;
    }

   
    public String Verinfo() {
        return "Nombre de la prueba: " + nombrep + "\nInstrucciones: " + instrucciones + "\nCantidad de preguntas: " + cantpreg ;
    }
    
    
    
}
