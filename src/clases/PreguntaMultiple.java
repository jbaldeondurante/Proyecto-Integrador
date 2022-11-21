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
public class PreguntaMultiple extends Pregunta <Integer> {
    
    private String [] listaopciones;
    private int RespuestaCorrecta;

    public PreguntaMultiple(String[] listaopciones, int RespuestaCorrecta, float puntaje, String pregunta) {
        super(puntaje, pregunta);
        this.listaopciones = listaopciones;
        this.RespuestaCorrecta = RespuestaCorrecta;
    }

   
    public String[] getListaopciones() {
        return listaopciones;
    }

    public void setListaopciones(String[] listaopciones) {
        this.listaopciones = listaopciones;
    }

    public void setRespuestaCorrecta(int RespuestaCorrecta) {
        this.RespuestaCorrecta = RespuestaCorrecta;
    }

    @Override
    public boolean comprobarResultado(Integer respuesta_jugador) {
        if(this.RespuestaCorrecta == respuesta_jugador ) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public float puntosobtenidos(Integer respuesta_jugador) {
        
       if(this.RespuestaCorrecta == respuesta_jugador ){
            
            return puntaje;
        }
        else{
            return 0;
        }
        
    }

    @Override
    public String VerInfo() {
        return super.VerInfo() + "\nEsta era la respuesta correcta: " + this.RespuestaCorrecta; 
    }

    @Override
    public String getRespuestaCorrecta() {
        return listaopciones[RespuestaCorrecta];
    }
}
