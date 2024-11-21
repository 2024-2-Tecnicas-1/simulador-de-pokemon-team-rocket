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

    // Agregar un Pokémon al equipo
    public void agregarPokemon(Pokemon pokemon) {
        pokemones.put(pokemon.getNombre(), pokemon);
        System.out.println(pokemon.getNombre() + " ha sido añadido al equipo de " + nombre);
    }

    // Entrenar un Pokémon específico por nombre
    public void entrenarPokemon(String nombrePokemon) {
        Pokemon pokemon = pokemones.get(nombrePokemon);
        if (pokemon != null) {
            pokemon.entrenarPokemon(); // Llama al método de entrenamiento
            System.out.println(pokemon.entrenar()); // Mensaje personalizado
        } else {
            System.out.println("No se encontró a " + nombrePokemon + " en el equipo.");
        }
    }

    // Mostrar información de todos los Pokémon en el equipo
    public void mostrarPokemones() {
        System.out.println("Equipo de " + nombre + ":");
        for (Pokemon pokemon : pokemones.values()) {
            System.out.println("- " + pokemon.getNombre() + 
                " (Salud: " + pokemon.getSalud() + 
                ", Ataque: " + pokemon.getPuntosAtaque() + 
                ", Nivel: " + pokemon.getNivel() + 
                ", Experiencia: " + pokemon.getExperiencia() + 
                ", Estado: " + pokemon.getEstado() + ")");
        }
    }
}
