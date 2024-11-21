package simulador.pokemones;
import simulador.pokemon.Estados;
import simulador.pokemon.Pokemon;
import simulador.pokemon.TipoPokemon;

/**
 *
 
@author Dylan*/
public class Bulbasaur extends Pokemon {

    public Bulbasaur(String nombre, int bsalud, int batkFis, int batkEsp, int bdefEsp, int bdefFis, Estados estado, TipoPokemon tipo1, TipoPokemon tipo2) {
        super(nombre, bsalud, batkFis, batkEsp, bdefEsp, bdefFis, estado, tipo1, tipo2);
    }

    
@Override
    public void subirNivel() {
        super.subirNivel(); 
        if (this.nivel==16) {
            setBsalud(60);
            setBatkFis(62);
            setBdefFis(63);
            setBatkEsp(80);
            setBdefEsp(80);
            setNombre("Ivysaur");
            System.out.println("En hora buena, tu Bulbasaur ha evolucionado a "+this.nombre+"!");
        }
        if (this.nivel==32) {
           setBsalud(80);
            setBatkFis(83);
            setBdefFis(84);
            setBatkEsp(100);
            setBdefEsp(105);
            setNombre("Venusaur");
            System.out.println("En hora buena, tu Ivysaur ha evolucionado a "+this.nombre+"!"); 
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