/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.g07_poo_ejercicio_01_03.Partido;

/**
 *
 * @author HP USER
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var partido=new Partido();
        var equipo=new Equipo();
        
        equipo.setNombre("Deportivo Cuenca");
        equipo.setNumeroJugadoresConvocados(22);
        equipo.setGolesPartido(2);
        equipo.setPartidosJugados(12);
        System.out.println("El nombre del equipo es:" + equipo.getNombre());
        System.out.println("Los jugadores comvocados son:" + equipo.getNumeroJugadoresConvocados());
        System.out.println("El total de partidos jugados son: " + equipo.getPartidosJugados());
        System.out.println("Los goles anotados por partido son: " + equipo.getGolesPartido());
        
        System.out.println("El total de goles por esta temporada fue: " +equipo.calcularTotalGoles()+" de goles por partido" );
        var equipo1=new Equipo();
        equipo1.setNombre("Deportivo Quito");
        equipo1.setNumeroJugadoresConvocados(22);
        equipo1.setGolesPartido(1);
        equipo1.setPartidosJugados(12);
        System.out.println("El nombre del equipo es:" + equipo1.getNombre());
        System.out.println("Los jugadores comvocados son:" + equipo1.getNumeroJugadoresConvocados());
        System.out.println("El total de partidos jugados son: " + equipo1.getPartidosJugados());
        System.out.println("Los goles anotados por partido son: " + equipo1.getGolesPartido());
        
        System.out.println("El total de goles por esta temporada fue: " +equipo1.calcularTotalGoles()+" de goles por partido" );
        System.out.println("--------------------------------------------------------------------------------");
        partido.setNombreContrincantes("Deportivo Cuenca vs Barcelona");
        partido.setTipo("Futbol");
        partido.setPartidosJugados(12);
        partido.setIngresosGenerados(6.250);
       
        System.out.println("El partido que se jugara es: "+partido.getTipo());
        System.out.println("Los equipos que jugaran el partido de "+partido.getTipo()+" sera entre " +partido.getNombreContrincantes());
        System.out.println("Los ingresos anuales generados por partidos son:"+partido.calcularIngresos());
        
        var partido1=new Partido();
        partido1.setNombreContrincantes("Deportivo Quito vs Emelec");
        partido1.setTipo("Futbol");
        partido1.setPartidosJugados(12);
        partido1.setIngresosGenerados(2.320);
       
        System.out.println("El partido que se jugara es: "+partido1.getTipo());
        System.out.println("Los equipos que jugaran el partido de "+partido1.getTipo()+" sera entre " +partido1.getNombreContrincantes());
        System.out.println("Los ingresos anuales generados por partidos son:"+partido1.calcularIngresos());
        
        System.out.println("--------------------------------------------------------------------------------");
        
        var jugador =new Jugador();
        jugador.setNombre("Juan");
        jugador.setCedula("0107196156");
        jugador.setYearNacimiento(2002);
        
        System.out.println("El jugador se llama " + jugador.getNombre());
        System.out.println("El numero de cedula es: " + jugador.getCedula());
        System.out.println("El numero de cedula es valido: " + jugador.esCedulaValida());
        System.out.println("El año de nacio es : " + jugador.getYearNacimiento());
        
        var jugador1 =new Jugador();
        jugador1.setNombre("Pedro");
        jugador1.setCedula("036248527");
        jugador1.setYearNacimiento(1999);
        
        System.out.println("El jugador se llama: " + jugador1.getNombre());
        System.out.println("El numero de cedula es: " + jugador1.getCedula());
        System.out.println("El numero de cedula es valido: " + jugador1.esCedulaValida());
        System.out.println("El año de nacio es : " + jugador1.getYearNacimiento());

    }
        
        
    
}
