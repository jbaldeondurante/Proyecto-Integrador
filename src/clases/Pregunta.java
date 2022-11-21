/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author O16127
 * @param <T>
 */
public abstract class Pregunta<T> {
    
    protected float puntaje;
    protected String pregunta;
    
    

    public Pregunta(float puntaje, String pregunta) {
        this.puntaje = puntaje;
        this.pregunta = pregunta;
        
    }

    public float getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(float puntaje) {
        this.puntaje = puntaje;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

   
   

   
    public abstract String getRespuestaCorrecta();
    public abstract boolean comprobarResultado (T respuesta_jugador);
    public abstract float puntosobtenidos(T respuesta_jugador);
   
    public String VerInfo() {
        return "Puntaje de la Pregunta: " + puntaje + "\nPregunta: " + pregunta  ;
    }
    
    
    
}
