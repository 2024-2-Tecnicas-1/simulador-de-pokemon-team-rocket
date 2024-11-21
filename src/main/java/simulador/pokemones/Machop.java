package simulador.pokemones;
import simulador.pokemon.Estados;
import simulador.pokemon.Pokemon;
import simulador.pokemon.TipoPokemon;

/**
 *
 
@author Dylan*/
public class Machop extends Pokemon {

    public Machop(String nombre, int bsalud, int batkFis, int batkEsp, int bdefEsp, int bdefFis, Estados estado, TipoPokemon tipo1, TipoPokemon tipo2) {
        super(nombre, bsalud, batkFis, batkEsp, bdefEsp, bdefFis, estado, tipo1, tipo2);
    }

    
@Override
    public void subirNivel() {
        super.subirNivel(); 
        if (this.nivel==28) {
            setBsalud(80);
            setBatkFis(100);
            setBdefFis(70);
            setBatkEsp(50);
            setBdefEsp(60);
            setNombre("Machoke");
            System.out.println("En hora buena, tu machop ha evolucionado a "+this.nombre+"!");
        }
        if (this.nivel==40) {
           setBsalud(90);
            setBatkFis(140);
            setBdefFis(80);
            setBatkEsp(66);
            setBdefEsp(85);
            setNombre("Machamp");
            System.out.println("En hora buena, tu Machoke ha evolucionado a "+this.nombre+"!"); 
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