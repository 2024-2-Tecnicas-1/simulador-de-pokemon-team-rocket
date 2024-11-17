package simulador;

import simulador.batalla.Batalla;
import simulador.entrenador.Entrenador;
import simulador.pokemon.*;
import simulador.pokemones.charmander;


public class Principal {
    public static void main(String[] args) {
        
        Entrenador ash = new Entrenador("Ash");

      
        Pokemon Charmander = new charmander("Charmander", 39, 52, TipoPokemon.Fuego, Estados.Normal);
        Pokemon Squirtle = new charmander("Squirtle", 44, 48, TipoPokemon.Agua, Estados.Normal);
        ash.agregarPokemon(Charmander);
        ash.agregarPokemon(Squirtle);

      //
        ash.mostrarPokemones();
        
          Batalla batalla = new Batalla();
        batalla.iniciarBatalla(Charmander, Squirtle);
    }
}
