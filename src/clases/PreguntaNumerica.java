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
public class PreguntaNumerica extends Pregunta <Float>  {

    private float rptac;

    public PreguntaNumerica(float rptac, float puntaje, String pregunta) {
        super(puntaje, pregunta);
        this.rptac = rptac;
    }

    public float getRptac() {
        return rptac;
    }

    public void setRptac(float rptac) {
        this.rptac = rptac;
    }
   
    @Override
    public boolean comprobarResultado(Float respuesta_jugador) {
        if(this.rptac == respuesta_jugador){
            return true;
        }
        else {
            return false;
        }
    }
    @Override
    public float puntosobtenidos(Float respuesta_jugador) {
       
        if(this.rptac == respuesta_jugador){
     
        return puntaje;
        
          
        }
        else{
        return 0;
        }
    }

    @Override
    public String getRespuestaCorrecta() {
        return "" + rptac;
    }
}   

    
 
    
  

