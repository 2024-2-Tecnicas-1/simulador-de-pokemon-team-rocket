package simulador.pokemones;
import simulador.pokemon.Estados;
import simulador.pokemon.Pokemon;
import simulador.pokemon.TipoPokemon;

/**
 *
 
@author Dylan*/
public class Pikachu extends Pokemon {

    public Pikachu(String nombre, int salud, int puntosAtaque, Estados estado, TipoPokemon tipo) {
        super(nombre, salud, puntosAtaque, estado, tipo);
    }



    @Override
    public void recibirDaño(int daño) {
        salud -= daño;
        if (salud <= 0) {
            salud = 0;
            setEstado(Estados.DEBILITADO);
        }
    }

    @Override
    public int atacar() {
         return this.puntosAtaque;
    }

    @Override
    public String entrenar() {
        return null;
    }
}