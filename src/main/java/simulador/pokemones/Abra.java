package simulador.pokemones;
import simulador.pokemon.Estados;
import simulador.pokemon.Pokemon;
import simulador.pokemon.TipoPokemon;

/**
 *
 
@author Dylan*/
public class Abra extends Pokemon {

    public Abra(String nombre, int bsalud, int batkFis, int batkEsp, int bdefEsp, int bdefFis, Estados estado, TipoPokemon tipo1, TipoPokemon tipo2) {
        super(nombre, bsalud, batkFis, batkEsp, bdefEsp, bdefFis, estado, tipo1, tipo2);
    }

    

     @Override
    public void subirNivel() {
        super.subirNivel(); 
        if (this.nivel==16) {
            setBsalud(30);
            setBatkFis(30);
            setBdefFis(30);
            setBatkEsp(120);
            setBdefEsp(70);
            setNombre("Kadabra");
            System.out.println("En hora buena, tu Abra ha evolucionado a "+this.nombre+"!");
        }
        if (this.nivel==36) {
           setBsalud(30);
            setBatkFis(30);
            setBdefFis(30);
            setBatkEsp(160);
            setBdefEsp(85);
            setNombre("Alakazam");
            System.out.println("En hora buena, tu Kadabra ha evolucionado a "+this.nombre+"!"); 
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