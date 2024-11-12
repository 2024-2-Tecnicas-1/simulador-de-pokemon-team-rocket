import java.util.EnumMap;
import java.util.Map;
public enum TipoPokemon  {
    Fuego, 
    Planta,
    Agua,
    Bicho,
    Dragón,
    Eléctrico,
    Hada,
    Hielo,
    Lucha,
    Normal,
    Roca,
    Siniestro,
    Veneno,
    Volador,
    Psiquico,
    Acero,
    Fantasma,
    Tierra  
}
public class EfectividadTipos {
    private static final Map<TipoPokemon, Map<TipoPokemon, Double>> efectividad;

    static {
        efectividad = new EnumMap<>(TipoPokemon.class);
        

        ///EFECTIVIDAD PARA CADA TIPO DE ATAQUE ///---
        
        efectividad.put(TipoPokemon.Acero, map.of(
            TipoPokemon.Hada, 2.0,
            TipoPokemon.Hielo, 2.0,
            TipoPokemon.Roca, 2.0,
            TipoPokemon.Acero, 0.5,
            TipoPokemon.Agua, 0.5,
            TipoPokemon.Electrico, 0.5,
            TipoPokemon.Fuego, 0.5
        ));
        efectividad.put(TipoPokemon.Agua, map.of(
            TipoPokemon.Fuego, 2.0,
            TipoPokemon.Roca, 2.0,
            TipoPokemon.Tierra, 2.0,
            TipoPokemon.Agua, 0.5,
            TipoPokemon.Planta, 0.5,
            TipoPokemon.Dragon, 0.5
        ));
        efectividad.put(TipoPokemon.Bicho, map.of(
            TipoPokemon.Planta, 2.0,
            TipoPokemon.Psiquico, 2.0,
            TipoPokemon.Siniestro, 2.0,
            TipoPokemon.Acero, 0.5,
            TipoPokemon.Fantasma, 0.5,
            TipoPokemon.Fuego, 0.5,
            TipoPokemon.Hada, 0.5,
            TipoPokemon.Lucha, 0.5,
            TipoPokemon.Volador, 0.5,
            TipoPokemon.Veneno, 0.5
        ));
        efectividad.put(TipoPokemon.Dragon, map.of(
            TipoPokemon.Dragon, 2.0,
            TipoPokemon.Acero, 0.5,
            TipoPokemon.Hada, 0.0
            
        ));
        efectividad.put(TipoPokemon.Electrico, map.of(
            TipoPokemon.Agua, 2.0,
            TipoPokemon.Volador, 2.0,
            TipoPokemon.Dragon, 0.5,
            TipoPokemon.Electrico, 0.5,
            TipoPokemon.Planta, 0.5,
            TipoPokemon.Tierra, 0.0
        ));
        efectividad.put(TipoPokemon.Fantasma, map.of(
            TipoPokemon.Fantasma, 2.0,
            TipoPokemon.Psiquico, 2.0,
            TipoPokemon.Siniestro, 0.5,
            TipoPokemon.Normal, 0.0
        ));
        efectividad.put(TipoPokemon.Fuego, map.of(
            TipoPokemon.Acero, 2.0,
            TipoPokemon.Bicho, 2.0,
            TipoPokemon.Hielo, 2.0,
            TipoPokemon.Planta, 2.0,
            TipoPokemon.Agua, 0.5,
            TipoPokemon.Dragon, 0.5,
            TipoPokemon.Fuego, 0.5,
            TipoPokemon.Roca, 0.5
        ));
        efectividad.put(TipoPokemon.Hada, map.of(
            TipoPokemon.Dragon, 2.0,
            TipoPokemon.Lucha, 2.0,
            TipoPokemon.Siniestro, 2.0,
            TipoPokemon.Acero, 0.5,
            TipoPokemon.Fuego, 0.5,
            TipoPokemon.Veneno, 0.5
        ));

        efectividad.put(TipoPokemon.Hielo, Map.of(
            TipoPokemon.Dragon, 2.0,
            TipoPokemon.Planta, 2.0,
            TipoPokemon.Tierra, 2.0,
            TipoPokemon.Volador, 2.0,
            TipoPokemon.Acero, 0.5,
            TipoPokemon.Agua, 0.5,
            TipoPokemon.Fuego, 0.5
        ));
        efectividad.put(TipoPokemon.Lucha, Map.of(
            TipoPokemon.Acero, 2.0,
            TipoPokemon.Hielo, 2.0,
            TipoPokemon.Normal, 2.0,
            TipoPokemon.Roca, 2.0,
            TipoPokemon.Siniestro, 2.0,
            TipoPokemon.Bicho, 0.5,
            TipoPokemon.Hada, 0.5,
            TipoPokemon.Psiquico, 0.5,
            TipoPokemon.Veneno, 0.5,
            TipoPokemon.Volador, 0.5,
            TipoPokemon.Fantasma, 0.0
         ));
        efectividad.put(TipoPokemon.Normal, Map.of(
            TipoPokemon.Acero, 0.5,
            TipoPokemon.Roca, 0.5,
            TipoPokemon.Fantasma, 0.0
         ));
         efectividad.put(TipoPokemon.Planta, Map.of(
            TipoPokemon.Agua, 2.0,
            TipoPokemon.Roca, 2.0,
            TipoPokemon.Tierra, 2.0,
            TipoPokemon.Acero, 0.5,
            TipoPokemon.Bicho, 0.5,
            TipoPokemon.Dragon, 0.5,
            TipoPokemon.Fuego, 0.5,
            TipoPokemon.Planta, 0.5,
            TipoPokemon.Veneno, 0.5,
            TipoPokemon.Volador, 0.5
        ));
        efectividad.put(TipoPokemon.Psíquico, Map.of(
            TipoPokemon.Lucha, 2.0,
            TipoPokemon.Veneno, 2.0,
            TipoPokemon.Acero, 0.5,
            TipoPokemon.Psiquico, 0.5,
            TipoPokemon.Siniestro, 0.0
        ));
        efectividad.put(TipoPokemon.Roca, Map.of(
            TipoPokemon.Bicho, 2.0,
            TipoPokemon.Fuego, 2.0,
            TipoPokemon.Hielo, 2.0,
            TipoPokemon.Volador, 2.0,
            TipoPokemon.Acero, 0.5,
            TipoPokemon.Lucha, 0.5,
            TipoPokemon.Tierra, 0.5
        ));
        efectividad.put(TipoPokemon.Siniestro, Map.of(
            TipoPokemon.Fantasma, 2.0,
            TipoPokemon.Psiquico, 2.0,
            TipoPokemon.Hada, 0.5,
            TipoPokemon.Lucha, 0.5,
            TipoPokemon.Siniestro, 0.5
        ));
        efectividad.put(TipoPokemon.Tierra, Map.of(
            TipoPokemon.Acero, 2.0,
            TipoPokemon.Eléctrico, 2.0,
            TipoPokemon.Fuego, 2.0,
            TipoPokemon.Roca, 2.0,
            TipoPokemon.Veneno, 2.0,
            TipoPokemon.Bicho, 0.5,
            TipoPokemon.Planta, 0.5,
            TipoPokemon.Volador, 0.0
        ));
        efectividad.put(TipoPokemon.Veneno, Map.of(
            TipoPokemon.Hada, 2.0,
            TipoPokemon.Planta, 2.0,
            TipoPokemon.Fantasma, 0.5,
            TipoPokemon.Roca, 0.5,
            TipoPokemon.Tierra, 0.5,
            TipoPokemon.Veneno, 0.5
        ));
        efectividad.put(TipoPokemon.Volador, Map.of(
            TipoPokemon.Bicho, 2.0,
            TipoPokemon.Lucha, 2.0,
            TipoPokemon.Planta, 2.0,
            TipoPokemon.Acero, 0.5,
            TipoPokemon.Electrico, 0.5,
            TipoPokemon.Roca, 0.5
        ));

    }
    public static double calcularEfectividad(TipoPokemon ataque, TipoPokemon defensa) {
        return efectividad.getOrDefault(ataque, Map.of()).getOrDefault(defensa, 1.0);
    }
}

