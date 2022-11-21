/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author edurz
 */
public class Puntaje {
    private float puntajeActual;

    public Puntaje() {
        this.puntajeActual = 0;
    }
    
    public void addPuntaje(float puntaje) {
        this.puntajeActual += puntaje;
    }

    public float getPuntajeActual() {
        return puntajeActual;
    }

    public void setPuntajeActual(float puntajeActual) {
        this.puntajeActual = puntajeActual;
    }
    
    
}
