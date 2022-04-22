/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.g07_poo_ejercicio_01_03.Actor;

/**
 *
 * @author HP USER
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var actor=new Actor();
        actor.setNombre("will Smith");
        actor.setYearNacimiento(1968);
        actor.setListaPersonaje("Escuadron suicida");
       System.out.println("El  actor se llama:"+actor.getNombre());
        System.out.println("Su fecha de nacimiento es  :"+actor.getYearNacimiento());
        System.out.println("Los personajes que ah interpretado :"+actor.getListaPersonaje());
         System.out.println("Tiene:"+actor.calcularEdad()+"Años");
        
       
        var pelicula=new Pelicula();
        pelicula.setDuracion(2);
        pelicula.setGenero("terror");
        pelicula.setRestriccion("No");
       pelicula.setGenero("Accion y Infantil");
        System.out.println("la pelicula tiene  duracion de :"+ pelicula.getDuracion()+"horas");
        System.out.println("su genero es de :"+ pelicula.getGenero());
        System.out.println("tiene restriccion:" +pelicula.tieneRestriccion());
       
         var personaje=new Personaje();
         personaje.setNombrePersonaje("Heroe");
         personaje.setPapelDesarrolla("principal");
         System.out.println("----------------------");
        var actor1=new Actor();
        actor1.setNombre("jhonny Depp");
        actor1.setYearNacimiento(1963);
        actor1.setListaPersonaje("Piratas del caribe,fabrica de chocolates ");
        System.out.println("El  actor se llama:"+actor1.getNombre());
        System.out.println("Su fecha de nacimiento es  :"+actor1.getYearNacimiento());
        System.out.println("Los personajes que ah interpretado :"+actor1.getListaPersonaje());
         System.out.println("Tiene:"+actor1.calcularEdad()+"Años");
        var pelicula1=new Pelicula();
        pelicula1.setDuracion(3);
        pelicula1.setGenero("Accion y Infantil");
        System.out.println("la pelicula tiene  duracion de :"+ pelicula1.getDuracion()+"horas");
        System.out.println("su genero es de :"+ pelicula1.getGenero());
        System.out.println("tiene restriccion:" +pelicula1.tieneRestriccion());
       
         var personaje1=new Personaje();
         personaje1.setNombrePersonaje("Jack Sparrow");
         personaje1.setPapelDesarrolla("principal");
    }
    
}
