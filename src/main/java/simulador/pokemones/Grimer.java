package simulador.pokemones;
import simulador.pokemon.Estados;
import simulador.pokemon.Pokemon;
import simulador.pokemon.TipoPokemon;

/**
 *
 
@author Dylan*/
public class Grimer extends Pokemon {

    public Grimer(String nombre, int bsalud, int batkFis, int batkEsp, int bdefEsp, int bdefFis, Estados estado, TipoPokemon tipo1, TipoPokemon tipo2) {
        super(nombre, bsalud, batkFis, batkEsp, bdefEsp, bdefFis, estado, tipo1, tipo2);
    }

    

@Override
    public void subirNivel() {
        super.subirNivel(); 
        if (this.nivel==38) {
            setBsalud(105);
            setBatkFis(105);
            setBdefFis(70);
            setBatkEsp(65);
            setBdefEsp(100);
            setNombre("Muk");
            System.out.println("En hora buena, tu Grimer ha evolucionado a "+this.nombre+"!");
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