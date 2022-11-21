/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;

import clases.*;
import javax.swing.JTextField;

/**
 *
 * @author joseb
 */
public class Gestion 
{
    private Pregunta[] arreglo;
    
    private int conta;
    
    public Gestion()
    {
        arreglo = new Pregunta[50];
        conta = 0;
    }

    public Pregunta[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(Pregunta[] arreglo) {
        this.arreglo = arreglo;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }
    
    public void InsertarPregunta(Pregunta ref)
    {
        if(conta<arreglo.length)
        {
            arreglo[conta]=ref;
            conta++;
        }
        else
        {
            System.out.println("\nNo hay espacio para más preguntas.");
        }
     
    }
    
    //Eliminar una pregunta dado su indice
    public void EliminarPregunta(int pregunta_idx) {
        if(pregunta_idx < 0 || conta <= pregunta_idx) {
            System.out.println("\nParametro pregunta_idx fuera de rango");
            return;
        }
        
        //Si se quiere eliminar la última pregunta
        if (pregunta_idx == conta - 1) {
            arreglo[conta - 1] = null;
            conta--;
            return;
        }
        
        for(int i = pregunta_idx; i < conta; i++) {
            arreglo[i] = arreglo[i+1];
        }
        
        conta--;
    }
    
      public void ModificarPregunta(String Pregunta, String pregnueva)
    {
        for(int i=0;i<conta;i++)
        {  
              if(arreglo[i].getPregunta().equalsIgnoreCase(Pregunta))
                {
                     Pregunta aux = (Pregunta)arreglo[i];
                     aux.setPregunta(pregnueva);
                  
                }
            
        }
    }
    
    public String VerInfo()
    {
        String cad="";
        for(int i=0;i<conta;i++)
        {
            cad = cad + arreglo[i].VerInfo() + "\n";
        }
        return cad;
    }

    public void InsertarPregunta(JTextField jTextField5) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
