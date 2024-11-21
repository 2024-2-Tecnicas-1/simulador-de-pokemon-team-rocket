package simulador.pokemones;
import simulador.pokemon.Estados;
import simulador.pokemon.Pokemon;
import simulador.pokemon.TipoPokemon;

/**
 *
 
@author Dylan*/
public class Pidgey extends Pokemon {

    public Pidgey(String nombre, int salud, int atkFis, int atkEsp, int defEsp, int defFis, int bsalud, int batkFis, int batkEsp, int bdefEsp, int bdefFis, Estados estado, TipoPokemon tipo1, TipoPokemon tipo2, String mote) {
        super(nombre, salud, atkFis, atkEsp, defEsp, defFis, bsalud, batkFis, batkEsp, bdefEsp, bdefFis, estado, tipo1, tipo2, mote);
    }

    public Pidgey(String mote) {
        super(mote);
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
         return this.atkFis;
    }

    @Override
    public String entrenar() {
        return null;
    }
}