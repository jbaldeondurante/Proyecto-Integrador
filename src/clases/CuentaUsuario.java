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
public class CuentaUsuario {
    
    private String nombre;
    private int cod;
    private int edad;
    private Prueba [] pruebas = new Prueba [50];
    private int conta;

    public CuentaUsuario(String nombre, int cod, int edad) {
        this.nombre = nombre;
        this.cod = cod;
        this.edad = edad;
        this.conta=0;
       
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Prueba[] getPruebas() {
        return pruebas;
    }

    public void setPruebas(Prueba[] pruebas) {
        this.pruebas = pruebas;
    }
    
     public void InsertarPruebas(Prueba ref)
    {
        if(conta<pruebas.length)
        {
            pruebas[conta]=ref;
            conta++;
        }
        else
        {
            System.out.println("\nNo hay espacio para más preguntas.");
        }
     
    }
    
    public void EliminarPruebas(int prueba_idx) {
        if(prueba_idx < 0 || conta <= prueba_idx) {
            System.out.println("\nParametro prueba_idx fuera de rango");
            return;
        }
        
        //Si se quiere eliminar la última pregunta
        if (prueba_idx == conta - 1) {
            pruebas[conta - 1] = null;
            conta--;
            return;
        }
        
        for(int i = prueba_idx; i < conta; i++) {
            pruebas[i] = pruebas[i+1];
        }
        
        conta--;
    }
    
    
}
