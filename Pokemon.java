/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokemon;

/**
 *
 * @author Dylan
 */
public abstract class Pokemon {
    private String Nombre;
    private double Salud;
    private double puntosataque;
    private String tipo;
    private String estado;

    public Pokemon(String Nombre, int Salud, int puntosataque, TipoPokemon tipo, Estados estado) {
        this.Nombre = Nombre;
        this.Salud = Salud;
        this.puntosataque = puntosataque;
        this.tipo = tipo;
        this.estado = estado;
    }
   abstract double atacar();
   abstract int recibirdaño();
   abstract int entrenar();
}
