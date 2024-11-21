package simulador.entrenador;

import java.util.ArrayList;
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
    if (pokemones.containsKey(pokemon.getNombre())) {
        System.out.println(pokemon.getNombre() + " ya está en el equipo.");
    } else {
        pokemones.put(pokemon.getNombre(), pokemon);
        System.out.println(pokemon.getNombre() + " ha sido añadido al equipo de " + nombre);
    }
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
        if (pokemones.isEmpty()) {
            System.out.println("El equipo de " + nombre + " está vacío.");
        } else {
            System.out.println("Pokemon del equipo de " + nombre + ":");
            // Ahora recorremos el HashMap para obtener los valores (Pokémon)
            for (Pokemon pokemon : pokemones.values()) {
                System.out.println("Nombre: " + pokemon.getNombre() + ", Nivel: " + pokemon.getNivel() + ", Salud: " + pokemon.getSalud() + "Ataque" + pokemon.getAtkFis());
            }
        }
    }
    public String getNombre() {
        return nombre;
    }

    public HashMap<String, Pokemon> getPokemones() {
    return pokemones;
}

}
