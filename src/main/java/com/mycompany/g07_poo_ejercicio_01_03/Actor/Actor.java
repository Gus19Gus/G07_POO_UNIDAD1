    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.g07_poo_ejercicio_01_03.Actor;

import java.time.LocalDate;

/**
 *
 * @author HP USER
 */
public class Actor {
    private String nombre;
    private String listaPersonaje;
    private int yearNacimiento;
    
       public int calcularEdad(){
        return LocalDate.now().getYear()-this.yearNacimiento;

    
    
    
    
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getListaPersonaje() {
        return listaPersonaje;
    }

    public void setListaPersonaje(String listaPersonaje) {
        this.listaPersonaje = listaPersonaje;
    }

    public int getYearNacimiento() {
        return yearNacimiento;
    }

    public void setYearNacimiento(int yearNacimiento) {
        this.yearNacimiento = yearNacimiento;
    }
}
