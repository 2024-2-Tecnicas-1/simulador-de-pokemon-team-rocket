package simulador.pokemones;
import simulador.pokemon.Estados;
import simulador.pokemon.Pokemon;
import simulador.pokemon.TipoPokemon;

/**
 *
 
@author Dylan*/
public class charmander extends Pokemon {

    public charmander(String nombre, int bsalud, int batkFis, int batkEsp, int bdefEsp, int bdefFis, Estados estado, TipoPokemon tipo1, TipoPokemon tipo2) {
        super(nombre, bsalud, batkFis, batkEsp, bdefEsp, bdefFis, estado, tipo1, tipo2);
        
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
            System.out.println("En hora buena, tu Charmander ha evolucionado a "+this.nombre+"!");
        }
        if (this.nivel==36) {
           setBsalud(78);
            setBatkFis(84);
            setBdefFis(78);
            setBatkEsp(109);
            setBdefEsp(85);
            setTipo2(TipoPokemon.VOLADOR);
            setNombre("Charizard");
            System.out.println("En hora buena, tu Charmeleon ha evolucionado a "+this.nombre+"!"); 
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