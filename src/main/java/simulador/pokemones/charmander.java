package simulador.pokemones;
import simulador.pokemon.Estados;
import simulador.pokemon.Pokemon;
import simulador.pokemon.TipoPokemon;

/**
 *
 
@author Dylan*/
public class Charmander extends Pokemon {

    String nombre = "Charmander";
    int bsalud=32;
    int batkFis=52;
    int batkEsp=60;
    int bdefEsp=50;
    int bdefFis=43;
    Estados estado= Estados.NORMAL;
    TipoPokemon tipo1= TipoPokemon.FUEGO;
    TipoPokemon tipo2= TipoPokemon.NINGUNO;    

    public Charmander(String nombre, int salud, int atkFis, int atkEsp, int defEsp, int defFis, int bsalud, int batkFis, int batkEsp, int bdefEsp, int bdefFis, Estados estado, TipoPokemon tipo1, TipoPokemon tipo2, String mote) {
        super(nombre, salud, atkFis, atkEsp, defEsp, defFis, bsalud, batkFis, batkEsp, bdefEsp, bdefFis, estado, tipo1, tipo2, mote);
    }

    public Charmander(String mote) {
        super(mote);
    }
    

    @Override
    public void subirNivel() {
        super.subirNivel(); 
        if (this.nivel==16) {
            setBsalud(58);
            setBatkFis(64);
            setBdefFis(58);
            setBatkEsp(80);
            setBdefEsp(65);
            setNombre("Charmeleon");
            System.out.println("En hora buena, tu "+this.mote+" ha evolucionado a "+this.nombre+"!");
        }
        if (this.nivel==36) {
           setBsalud(58);
            setBatkFis(64);
            setBdefFis(58);
            setBatkEsp(80);
            setBdefEsp(65);
            setTipo2(TipoPokemon.VOLADOR);
            setNombre("Charizard");
            System.out.println("En hora buena, tu "+this.mote+" ha evolucionado a "+this.nombre+"!"); 
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