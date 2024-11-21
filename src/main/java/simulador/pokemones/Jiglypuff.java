package simulador.pokemones;
import simulador.pokemon.Estados;
import simulador.pokemon.Pokemon;
import simulador.pokemon.TipoPokemon;

/**
 *
 
@author Dylan*/
public class Jiglypuff extends Pokemon {

    public Jiglypuff(String nombre, int bsalud, int batkFis, int batkEsp, int bdefEsp, int bdefFis, Estados estado, TipoPokemon tipo1, TipoPokemon tipo2) {
        super(nombre, bsalud, batkFis, batkEsp, bdefEsp, bdefFis, estado, tipo1, tipo2);
    }

    

       @Override
    public void subirNivel() {
        super.subirNivel(); 
        if (this.nivel==30) {
            setBsalud(140);
            setBatkFis(40);
            setBdefFis(105);
            setBatkEsp(420);
            setBdefEsp(105);
            setNombre("Wigglytuff");
            System.out.println("En hora buena, tu Jiglypuff ha evolucionado a "+this.nombre+"!");
        }
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