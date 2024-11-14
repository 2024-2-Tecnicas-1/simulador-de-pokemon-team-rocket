/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokemon.TiposPokemon;

import com.mycompany.pokemon.Estados;
import com.mycompany.pokemon.Pokemon;
import com.mycompany.pokemon.TipoPokemon;

/**
 *
 * @author Dylan
 */
public class Agua extends Pokemon {

    public Agua(String Nombre, int Salud, int Puntosataque, TipoPokemon tipo, Estados estado) {
        super(Nombre, Salud, Puntosataque, tipo, estado);
    }


    


    @Override
    public int atacar() {
       
        return getPuntosataque();  
    }

    @Override
   public void recibirdaño (int daño) {
        this.Salud -= daño;
        if (this.Salud <= 0) {
            this.Salud = 0; 
            this.estado = Estados.Debilitado;
        }
    }

    @Override
    public String entrenar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
