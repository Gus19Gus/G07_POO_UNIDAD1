/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.g07_poo_ejercicio_01_03.Partido;

/**
 *
 * @author HP USER
 */
public class Equipo {
    private String nombre;
    private int numeroJugadoresConvocados;
    private int golesPartido;
    private int partidosJugados;
    
    public int calcularTotalGoles(){
        var goles=this.partidosJugados + this.golesPartido; 
    return  goles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroJugadoresConvocados() {
        return numeroJugadoresConvocados;
    }

    public void setNumeroJugadoresConvocados(int numeroJugadoresConvocados) {
        this.numeroJugadoresConvocados = numeroJugadoresConvocados;
    }

    public int getGolesPartido() {
        return golesPartido;
    }

    public void setGolesPartido(int golesPartido) {
        this.golesPartido = golesPartido;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }
    
}
