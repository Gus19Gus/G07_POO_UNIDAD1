/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.g07_poo_ejercicio_01_03.Actor;

/**
 *
 * @author HP USER
 */
public class Pelicula {
    private int duracion;
    private String genero;
    private String   restriccion;
    
     public boolean tieneRestriccion(){
        var retorno=false;
        if(this.restriccion == "Si")
            return true;
        if (this.restriccion == "No")
            return  false;
      return retorno;
        
     
     }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRestriccion() {
        return restriccion;
    }

    public void setRestriccion(String restriccion) {
        this.restriccion = restriccion;
    }
}
