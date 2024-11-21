package simulador;

import java.util.Scanner;
import simulador.batalla.Batalla;
import simulador.entrenador.Entrenador;
import simulador.pokemon.*;
import simulador.pokemones.Charmander;
import simulador.pokemones.Squirtle;


public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Entrenador ash = new Entrenador("Ash");
        
      
        Pokemon Charmander = new Charmander("Paco");
        //ash.agregarPokemon(Charmander);
        //ash.agregarPokemon(Squirtle);
        int a=1;
        System.out.println("Escribir");
        while(a!=0){
            a=sc.nextInt();
            if (a==1) {
                Charmander.entrenarPokemon();
            }
            if (a==2) {
                Charmander.getAtkEsp();
                Charmander.getAtkFis();
                Charmander.getDefFis();
                Charmander.getDefEsp();
                Charmander.getSalud();
            }
        }
      
        //ash.mostrarPokemones();
        
          //Batalla batalla = new Batalla();
        //batalla.iniciarBatalla(Charmander, Squirtle);
    }
}
