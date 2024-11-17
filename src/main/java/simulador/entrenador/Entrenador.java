package simulador.entrenador;

import java.util.HashMap;
import simulador.pokemon.Pokemon;

 
public class Entrenador { 
     private String nombre; 
    private HashMap<String, Pokemon> pokemones; 
     
     public Entrenador(String nombre) { 
        this.nombre = nombre; 
        this.pokemones = new HashMap<>(); 
 
    } 
     public void entrenarPokemon(String nombrePokemon) { 
        Pokemon pokemon = pokemones.get(nombrePokemon); 
        if (pokemon != null) { 
            pokemon.entrenar(); 
            System.out.println(nombrePokemon + " ha sido entrenado."); 
        } else { 
            System.out.println("No se encontró a " + nombrePokemon + " en el equipo."); 
        } 
    } 
        public void agregarPokemon(Pokemon pokemon) { 
        pokemones.put(pokemon.getNombre(), pokemon); 
        System.out.println(pokemon.getNombre() + " ha sido anadido al equipo de " + nombre); 
    } 
       
 public void mostrarPokemones() { 
        System.out.println("Equipo de " + nombre + ":"); 
        for (Pokemon pokemon : pokemones.values()) { 
            System.out.println("- " + pokemon.getNombre() + " (Salud: " + pokemon.getSalud() + ", Ataque: " + pokemon.getPuntosataque() + " Estado , " + pokemon.getEstado() + ")"); 
        } 
    } 
} 