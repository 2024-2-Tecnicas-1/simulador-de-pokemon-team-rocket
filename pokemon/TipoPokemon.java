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
    }
}

