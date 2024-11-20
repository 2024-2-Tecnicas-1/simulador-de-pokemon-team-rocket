/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulador.pokemon;
import java.util.EnumMap; 
import java.util.Map; 

public class EfectividadTipos { 
    private static final Map<TipoPokemon, Map<TipoPokemon, Double>> efectividad; 
 
    static { 
        efectividad = new EnumMap<>(TipoPokemon.class); 
         
        // EFECTIVIDAD PARA CADA TIPO DE ATAQUE
        efectividad.put(TipoPokemon.ACERO, Map.of( 
            TipoPokemon.HADA, 2.0, 
            TipoPokemon.HIELO, 2.0, 
            TipoPokemon.ROCA, 2.0, 
            TipoPokemon.ACERO, 0.5, 
            TipoPokemon.AGUA, 0.5, 
            TipoPokemon.ELECTRICO, 0.5, 
            TipoPokemon.FUEGO, 0.5 
        )); 
        efectividad.put(TipoPokemon.AGUA, Map.of( 
            TipoPokemon.FUEGO, 2.0, 
            TipoPokemon.ROCA, 2.0, 
            TipoPokemon.TIERRA, 2.0, 
            TipoPokemon.AGUA, 0.5, 
            TipoPokemon.PLANTA, 0.5, 
            TipoPokemon.DRAGON, 0.5 
        )); 
        efectividad.put(TipoPokemon.BICHO, Map.of( 
            TipoPokemon.PLANTA, 2.0, 
            TipoPokemon.PSIQUICO, 2.0, 
            TipoPokemon.SINIESTRO, 2.0, 
            TipoPokemon.ACERO, 0.5, 
            TipoPokemon.FANTASMA, 0.5, 
            TipoPokemon.FUEGO, 0.5, 
            TipoPokemon.HADA, 0.5, 
            TipoPokemon.LUCHA, 0.5, 
            TipoPokemon.VOLADOR, 0.5, 
            TipoPokemon.VENENO, 0.5 
        )); 
        efectividad.put(TipoPokemon.DRAGON, Map.of( 
            TipoPokemon.DRAGON, 2.0, 
            TipoPokemon.ACERO, 0.5, 
            TipoPokemon.HADA, 0.0 
        )); 
        efectividad.put(TipoPokemon.ELECTRICO, Map.of( 
            TipoPokemon.AGUA, 2.0, 
            TipoPokemon.VOLADOR, 2.0, 
            TipoPokemon.DRAGON, 0.5, 
            TipoPokemon.ELECTRICO, 0.5, 
            TipoPokemon.PLANTA, 0.5, 
            TipoPokemon.TIERRA, 0.0 
        )); 
        efectividad.put(TipoPokemon.FANTASMA, Map.of( 
            TipoPokemon.FANTASMA, 2.0, 
            TipoPokemon.PSIQUICO, 2.0, 
            TipoPokemon.SINIESTRO, 0.5, 
            TipoPokemon.NORMAL, 0.0 
        )); 
        efectividad.put(TipoPokemon.FUEGO, Map.of( 
            TipoPokemon.ACERO, 2.0, 
            TipoPokemon.BICHO, 2.0, 
            TipoPokemon.HIELO, 2.0, 
            TipoPokemon.PLANTA, 2.0, 
            TipoPokemon.AGUA, 0.5, 
            TipoPokemon.DRAGON, 0.5, 
            TipoPokemon.FUEGO, 0.5, 
            TipoPokemon.ROCA, 0.5 
        )); 
        efectividad.put(TipoPokemon.HADA, Map.of( 
            TipoPokemon.DRAGON, 2.0, 
            TipoPokemon.LUCHA, 2.0, 
            TipoPokemon.SINIESTRO, 2.0, 
            TipoPokemon.ACERO, 0.5, 
            TipoPokemon.FUEGO, 0.5, 
            TipoPokemon.VENENO, 0.5 
        )); 
        efectividad.put(TipoPokemon.HIELO, Map.of( 
            TipoPokemon.DRAGON, 2.0, 
            TipoPokemon.PLANTA, 2.0, 
            TipoPokemon.TIERRA, 2.0, 
            TipoPokemon.VOLADOR, 2.0, 
            TipoPokemon.ACERO, 0.5, 
            TipoPokemon.AGUA, 0.5, 
            TipoPokemon.FUEGO, 0.5 
        )); 
        efectividad.put(TipoPokemon.LUCHA, Map.of(  
            TipoPokemon.HIELO, 2.0, 
            TipoPokemon.NORMAL, 2.0, 
            TipoPokemon.ROCA, 2.0, 
            TipoPokemon.SINIESTRO, 2.0, 
            TipoPokemon.BICHO, 0.5, 
            TipoPokemon.HADA, 0.5, 
            TipoPokemon.PSIQUICO, 0.5, 
            TipoPokemon.VENENO, 0.5, 
            TipoPokemon.VOLADOR, 0.5, 
            TipoPokemon.FANTASMA, 0.0  
        )); 
        efectividad.put(TipoPokemon.NORMAL, Map.of( 
            TipoPokemon.ACERO, 0.5, 
            TipoPokemon.ROCA, 0.5, 
            TipoPokemon.FANTASMA, 0.0 
        )); 
        efectividad.put(TipoPokemon.PLANTA, Map.of( 
            TipoPokemon.AGUA, 2.0, 
            TipoPokemon.ROCA, 2.0, 
            TipoPokemon.TIERRA, 2.0, 
            TipoPokemon.ACERO, 0.5, 
            TipoPokemon.BICHO, 0.5, 
            TipoPokemon.DRAGON, 0.5, 
            TipoPokemon.FUEGO, 0.5, 
            TipoPokemon.PLANTA, 0.5, 
            TipoPokemon.VENENO, 0.5, 
            TipoPokemon.VOLADOR, 0.5 
        )); 
        efectividad.put(TipoPokemon.PSIQUICO, Map.of( 
            TipoPokemon.LUCHA, 2.0, 
            TipoPokemon.VENENO, 2.0, 
            TipoPokemon.ACERO, 0.5, 
            TipoPokemon.PSIQUICO, 0.5, 
            TipoPokemon.SINIESTRO, 0.0 
        )); 
        efectividad.put(TipoPokemon.ROCA, Map.of( 
            TipoPokemon.BICHO, 2.0, 
            TipoPokemon.FUEGO, 2.0, 
            TipoPokemon.HIELO, 2.0, 
            TipoPokemon.VOLADOR, 2.0, 
            TipoPokemon.ACERO, 0.5, 
            TipoPokemon.LUCHA, 0.5, 
            TipoPokemon.TIERRA, 0.5 
        )); 
        efectividad.put(TipoPokemon.SINIESTRO, Map.of( 
            TipoPokemon.FANTASMA, 2.0, 
            TipoPokemon.PSIQUICO, 2.0, 
            TipoPokemon.HADA, 0.5, 
            TipoPokemon.LUCHA, 0.5, 
            TipoPokemon.SINIESTRO, 0.5 
        )); 
        efectividad.put(TipoPokemon.TIERRA, Map.of( 
            TipoPokemon.ACERO, 2.0, 
            TipoPokemon.ELECTRICO, 2.0, 
            TipoPokemon.FUEGO, 2.0, 
            TipoPokemon.ROCA, 2.0, 
            TipoPokemon.VENENO, 2.0, 
            TipoPokemon.BICHO, 0.5, 
            TipoPokemon.PLANTA, 0.5, 
            TipoPokemon.VOLADOR, 0.0 
        )); 
        efectividad.put(TipoPokemon.VENENO, Map.of( 
            TipoPokemon.HADA, 2.0, 
            TipoPokemon.PLANTA, 2.0, 
            TipoPokemon.FANTASMA, 0.5, 
            TipoPokemon.ROCA, 0.5, 
            TipoPokemon.TIERRA, 0.5, 
            TipoPokemon.VENENO, 0.5 
        )); 
        efectividad.put(TipoPokemon.VOLADOR, Map.of( 
            TipoPokemon.BICHO, 2.0, 
            TipoPokemon.LUCHA, 2.0, 
            TipoPokemon.PLANTA, 2.0, 
            TipoPokemon.ACERO, 0.5, 
            TipoPokemon.ELECTRICO, 0.5, 
            TipoPokemon.ROCA, 0.5 
        )); 
    } 
 
    public static double ObtenerMultiplicadorDeDano(TipoPokemon ataque, TipoPokemon defensa) { 
        return efectividad.getOrDefault(ataque, Map.of()).getOrDefault(defensa, 1.0); 
    } 
}

