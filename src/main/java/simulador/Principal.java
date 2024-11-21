package simulador;

import java.util.Scanner;
import simulador.batalla.Batalla;
import simulador.entrenador.Entrenador;
import simulador.pokemon.*;
import simulador.pokemones.*;


public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Entrenador ash = new Entrenador("Ash");
        
      //nombre salud ataqueF ataqueE defensaE defensaF estado tipo1 tipo2
        Pokemon Charmander = new charmander("Charmander",39,52,60,50,43,Estados.NORMAL,TipoPokemon.FUEGO,TipoPokemon.NINGUNO);
        Pokemon Abra = new Abra("Abra",25,20,105,55,15,Estados.NORMAL,TipoPokemon.PSIQUICO,TipoPokemon.NINGUNO);
        Pokemon Bulbasaur = new Bulbasaur("Bulbasaur",45,49,65,65,49,Estados.NORMAL,TipoPokemon.FUEGO,TipoPokemon.NINGUNO);
        Pokemon Geodude = new Geodude("Geodude",39,52,60,50,43,Estados.NORMAL,TipoPokemon.PLANTA,TipoPokemon.VENENO);
        Pokemon Grimer = new Grimer("Grimer",80,80,40,50,50,Estados.NORMAL,TipoPokemon.VENENO,TipoPokemon.NINGUNO);
        Pokemon Jiglypuff = new Jiglypuff("Jiglypuff",115,45,45,25,20,Estados.NORMAL,TipoPokemon.NORMAL,TipoPokemon.HADA);
        Pokemon Machop = new Machop("Machop",70,80,35,35,50,Estados.NORMAL,TipoPokemon.LUCHA,TipoPokemon.NINGUNO);
        Pokemon Pidgey = new Pidgey("Pidgey",40,45,35,35,40,Estados.NORMAL,TipoPokemon.NORMAL,TipoPokemon.VOLADOR);
        Pokemon Pikachu = new Pikachu("Pikachu",45,80,75,60,50,Estados.NORMAL,TipoPokemon.ELECTRICO,TipoPokemon.NINGUNO);
        Pokemon Squirtle = new Squirtle("Squirtle",44,48,50,64,65,Estados.NORMAL,TipoPokemon.AGUA,TipoPokemon.NINGUNO);
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
        boolean salir = false;
        while (!salir) {
            // Menú principal
            System.out.println("Simulador de Batallas Pokémon");
            System.out.println("1. Gestionar Batallas");
            System.out.println("2. Gestionar Entrenadores");
            System.out.println("3. Iniciar Batalla");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();  // Consumir el salto de línea después del entero

            switch (opcion) {
                case 1:
                    // Gestionar batallas
                    System.out.println("Gestionando batallas...");
                    break;

                case 2:
                    // Gestionar entrenadores
                    System.out.println("Gestionando entrenadores...");
                    break;

                case 3:
                    // Iniciar batalla
                    System.out.println("Iniciando batalla...");
                    break;

                case 4:
                    // Salir
                    System.out.println("¡Gracias por usar el simulador de batallas Pokémon!");
                    salir = true;
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, elige una opción válida.");
            }
        }
    }
}

