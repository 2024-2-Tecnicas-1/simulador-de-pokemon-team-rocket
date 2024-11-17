/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulador.pokemones;

import simulador.pokemon.Estados;
import simulador.pokemon.Pokemon;
import simulador.pokemon.TipoPokemon;

/**
 *
 * @author ml408
 */
public class charmander extends Pokemon { 
 
    public charmander(String Nombre, int Salud, int Puntosataque, TipoPokemon tipo, Estados estado) { 
        super(Nombre, Salud, Puntosataque, tipo, estado); 
    } 
// 
    @Override 
     public int atacar() { 
         
        return getPuntosataque();   
    } 
 
    @Override 
    public void recibirdaño (int dmg) { 
        this.Salud -= dmg; 
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

