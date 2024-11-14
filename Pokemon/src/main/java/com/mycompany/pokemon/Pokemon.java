/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokemon;

/**
 *///
 
public abstract class Pokemon {
    public String Nombre;
    public int Salud;
    public int Puntosataque;
    public TipoPokemon tipo;
    public Estados estado;

    public Pokemon(String Nombre, int Salud, int Puntosataque, TipoPokemon tipo, Estados estado) {
        this.Nombre = Nombre;
        this.Salud = Salud;
        this.Puntosataque = Puntosataque;
        this.tipo = tipo;
        this.estado = estado;
    }
    
    
    
    public abstract int atacar();
     public void recibirdaño (int dmg) {
        this.Salud -= dmg;
        if (this.Salud <= 0) {
            this.Salud = 0; 
            this.estado = Estados.Debilitado;
        }
    }
      public abstract String entrenar();

    public String getNombre() {
        return Nombre;
    }

    public int getSalud() {
        return Salud;
    }

    public int getPuntosataque() {
        return Puntosataque;
    }

    public TipoPokemon getTipo() {
        return tipo;
    }

    public Estados getEstado() {
        return estado;
    }

   

    
}
