package com.mycompany.pokemon;

import com.mycompany.pokemon.TiposPokemon.Agua;
import com.mycompany.pokemon.TiposPokemon.Fuego;



public class Principal {
    public static void main(String[] args) {
        
        Entrenador ash = new Entrenador("Ash");

      
        Pokemon Charmander = new Fuego("Charmander", 39, 52, TipoPokemon.Fuego, Estados.Normal);
        Pokemon Squirtle = new Agua("Squirtle", 44, 48, TipoPokemon.Agua, Estados.Normal);
        ash.agregarPokemon(Charmander);
        ash.agregarPokemon(Squirtle);

      //
        ash.mostrarPokemones();
        
          Batalla batalla = new Batalla();
        batalla.iniciarBatalla(Charmander, Squirtle);
    }
}

