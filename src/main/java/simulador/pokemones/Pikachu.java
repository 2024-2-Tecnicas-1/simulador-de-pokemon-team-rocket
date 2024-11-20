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
 * @author Dylan
 */
public class Pikachu extends Pokemon {

    public Pikachu(String Nombre, int Salud, int Puntosataque, TipoPokemon tipo, Estados estado) {
        super(Nombre, Salud, Puntosataque, tipo, estado);
    }

    @Override
    public int atacar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  @Override
     public int recibirdaño(int dmg) {
          this.Salud -= dmg; 
        if (this.Salud <= 0) { 
            this.Salud = 0;  
            this.estado = Estados.DEBILITADO; 
        } 
        return Salud;
    }
    @Override
    public String entrenar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
