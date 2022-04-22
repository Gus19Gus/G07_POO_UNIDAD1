/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.g07_poo_ejercicio_01_03.Partido;

/**
 *
 * @author HP USER
 */
public class Partido {
    private String nombreContrincantes;
    private String tipo;
    private double ingresosGenerados;
    private int partidosJugados;
   
    public double calcularIngresos(){
        var ingreso = 1000d;
            ingreso= ingresosGenerados*partidosJugados;
        return ingreso;
    }

    public String getNombreContrincantes() {
        return nombreContrincantes;
    }

    public void setNombreContrincantes(String nombreContrincantes) {
        this.nombreContrincantes = nombreContrincantes;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getIngresosGenerados() {
        return ingresosGenerados;
    }

    public void setIngresosGenerados(double ingresosGenerados) {
        this.ingresosGenerados = ingresosGenerados;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }
    
}
