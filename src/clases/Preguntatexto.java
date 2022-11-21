/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author O16127
 */
public class Preguntatexto extends Pregunta<String>
{

    private String RespuestaCorrecta;

    public Preguntatexto(String RespuestaCorrecta, float puntaje, String pregunta) {
        super(puntaje, pregunta);
        this.RespuestaCorrecta = RespuestaCorrecta;
    }

    public String getRespuestaCorrecta() {
        return RespuestaCorrecta;
    }

    public void setRespuestaCorrecta(String RespuestaCorrecta) {
        this.RespuestaCorrecta = RespuestaCorrecta;
    }

    @Override
    public boolean comprobarResultado(String respuesta_jugador) {
        
        if(this.RespuestaCorrecta== respuesta_jugador)
        {
        return true;
        }
        else
            return false;
    }

    @Override
    public float puntosobtenidos(String respuesta_jugador) {
       
        if(this.comprobarResultado(respuesta_jugador)==true){
      
        return puntaje;
        }
        else{
        return 0;
        }
    }

    @Override
    public String VerInfo() {
        return super.VerInfo()+ "\n Respuesta Correcta: "+ this.RespuestaCorrecta; 
    }

    
  
    
    
 }
    
   
        
        
        
    
    
    
    

