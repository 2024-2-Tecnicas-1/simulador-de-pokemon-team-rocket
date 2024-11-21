package simulador.pokemones;
import simulador.pokemon.Estados;
import simulador.pokemon.Pokemon;
import simulador.pokemon.TipoPokemon;

/**
 *
 
@author Dylan*/
public class Pidgey extends Pokemon {

    public Pidgey(String nombre, int bsalud, int batkFis, int batkEsp, int bdefEsp, int bdefFis, Estados estado, TipoPokemon tipo1, TipoPokemon tipo2) {
        super(nombre, bsalud, batkFis, batkEsp, bdefEsp, bdefFis, estado, tipo1, tipo2);
    }

    
@Override
    public void subirNivel() {
        super.subirNivel(); 
        if (this.nivel==18) {
            setBsalud(63);
            setBatkFis(60);
            setBdefFis(55);
            setBatkEsp(50);
            setBdefEsp(50);
            setNombre("Pidgeotto");
            System.out.println("En hora buena, tu Pidgey ha evolucionado a "+this.nombre+"!");
        }
        if (this.nivel==36) {
           setBsalud(110);
            setBatkFis(80);
            setBdefFis(75);
            setBatkEsp(70);
            setBdefEsp(70);
            setNombre("Pidgeot");
            System.out.println("En hora buena, tu Pidgeotto ha evolucionado a "+this.nombre+"!"); 
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