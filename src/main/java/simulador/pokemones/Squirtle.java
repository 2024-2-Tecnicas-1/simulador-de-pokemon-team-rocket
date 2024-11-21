package simulador.pokemones;
import simulador.pokemon.Estados;
import simulador.pokemon.Pokemon;
import simulador.pokemon.TipoPokemon;

/**
 *
 
@author Dylan*/
public class Squirtle extends Pokemon {

    public Squirtle(String nombre, int bsalud, int batkFis, int batkEsp, int bdefEsp, int bdefFis, Estados estado, TipoPokemon tipo1, TipoPokemon tipo2) {
        super(nombre, bsalud, batkFis, batkEsp, bdefEsp, bdefFis, estado, tipo1, tipo2);
    }

    

    @Override
    public void subirNivel() {
        super.subirNivel(); 
        if (this.nivel==16) {
            setBsalud(59);
            setBatkFis(63);
            setBdefFis(80);
            setBatkEsp(65);
            setBdefEsp(80);
            setNombre("Wartortle");
            System.out.println("En hora buena, tu Squirtle ha evolucionado a "+this.nombre+"!");
        }
        if (this.nivel==36) {
           setBsalud(79);
            setBatkFis(83);
            setBdefFis(100);
            setBatkEsp(85);
            setBdefEsp(105);
            setNombre("Blastoise");
            System.out.println("En hora buena, tu Wartortle ha evolucionado a "+this.nombre+"!"); 
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