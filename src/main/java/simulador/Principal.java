package simulador;

import simulador.batalla.Batalla;
import simulador.entrenador.Entrenador;
import simulador.pokemon.*;
import simulador.pokemones.Charmander;
import simulador.pokemones.Squirtle;


public class Principal {
    public static void main(String[] args) {
        
        Entrenador ash = new Entrenador("Ash");

      
        Pokemon Charmander = new Charmander("Charmander", 39, 52, Estados.NORMAL, TipoPokemon.FUEGO);
        Pokemon Squirtle = new Squirtle("Squirtle", 44, 48, Estados.NORMAL, TipoPokemon.AGUA);
        ash.agregarPokemon(Charmander);
        ash.agregarPokemon(Squirtle);

      //
        ash.mostrarPokemones();
        
          Batalla batalla = new Batalla();
        batalla.iniciarBatalla(Charmander, Squirtle);
    }
}
