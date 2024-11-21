package simulador.batalla;

import simulador.pokemon.*;
import simulador.entrenador.Entrenador;
import simulador.pokemones.*;

import java.util.Scanner;

public class GestorBatallas {

    public void mostrarMenuPrincipal() {
        Scanner scanner = new Scanner(System.in);
        Batalla batalla = new Batalla();
        Pokemon entrenador1Pokemon = null;
        Pokemon entrenador2Pokemon = null;

        // Crear los Pokémon predefinidos
        Pokemon Charmander = new charmander("Charmander", 39, 52, 60, 50, 43, Estados.NORMAL, TipoPokemon.FUEGO, TipoPokemon.NINGUNO);
        Pokemon Abra = new Abra("Abra", 25, 20, 105, 55, 15, Estados.NORMAL, TipoPokemon.PSIQUICO, TipoPokemon.NINGUNO);
        Pokemon Bulbasaur = new Bulbasaur("Bulbasaur", 45, 49, 65, 65, 49, Estados.NORMAL, TipoPokemon.FUEGO, TipoPokemon.NINGUNO);
        Pokemon Geodude = new Geodude("Geodude", 39, 52, 60, 50, 43, Estados.NORMAL, TipoPokemon.PLANTA, TipoPokemon.VENENO);
        Pokemon Grimer = new Grimer("Grimer", 80, 80, 40, 50, 50, Estados.NORMAL, TipoPokemon.VENENO, TipoPokemon.NINGUNO);
        Pokemon Jiglypuff = new Jiglypuff("Jiglypuff", 115, 45, 45, 25, 20, Estados.NORMAL, TipoPokemon.NORMAL, TipoPokemon.HADA);
        Pokemon Machop = new Machop("Machop", 70, 80, 35, 35, 50, Estados.NORMAL, TipoPokemon.LUCHA, TipoPokemon.NINGUNO);
        Pokemon Pidgey = new Pidgey("Pidgey", 40, 45, 35, 35, 40, Estados.NORMAL, TipoPokemon.NORMAL, TipoPokemon.VOLADOR);
        Pokemon Pikachu = new Pikachu("Pikachu", 45, 80, 75, 60, 50, Estados.NORMAL, TipoPokemon.ELECTRICO, TipoPokemon.NINGUNO);
        Pokemon Squirtle = new Squirtle("Squirtle", 44, 48, 50, 64, 65, Estados.NORMAL, TipoPokemon.AGUA, TipoPokemon.NINGUNO);

        // Aquí se agregan los Pokémon a una lista para su selección
        Pokemon[] pokemones = {Charmander, Abra, Bulbasaur, Geodude, Grimer, Jiglypuff, Machop, Pidgey, Pikachu, Squirtle};

        int a = 1;
        boolean salir = false;
        Entrenador entrenador1 = new Entrenador("Ash");  // Solo ejemplo, puedes agregar funcionalidad para elegir entrenadores
        Entrenador entrenador2 = new Entrenador("Gary"); // Otro ejemplo de entrenador

        while (!salir) {
            System.out.println("Menú Principal:");
            System.out.println("1. Iniciar Batalla");
            System.out.println("2. Registrar Nuevo Entrenador");
            System.out.println("3. Volver al menú principal");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    boolean iniciarBatalla = true;
                    while (iniciarBatalla) {
                        System.out.println("\nSubmenu: Iniciar Batalla");
                        System.out.println("1. Elegir entrenador 1");
                        System.out.println("2. Elegir entrenador 2");
                        System.out.println("3. Seleccionar Pokémon para Entrenador 1");
                        System.out.println("4. Seleccionar Pokémon para Entrenador 2");
                        System.out.println("5. Comenzar batalla");
                        System.out.println("6. Volver al menu principal");
                        System.out.print("Elige una opcion: ");
                        int opcionSubmenu = scanner.nextInt();
                        scanner.nextLine();

                        switch (opcionSubmenu) {
                            case 1:
                                System.out.println("Funcionalidad para elegir entrenador 1 aun no implementada.");
                                break;
                            case 2:
                                System.out.println("Funcionalidad para elegir entrenador 2 aun no implementada.");
                                break;
                            case 3:
                                System.out.println("Selecciona Pokemon para Entrenador 1:");
                                for (int i = 0; i < pokemones.length; i++) {
                                    System.out.println((i + 1) + ". " + pokemones[i].getNombre());
                                }
                                System.out.print("Elige un Pokemon (1-" + pokemones.length + "): ");
                                int opcionPokemon1 = scanner.nextInt();
                                scanner.nextLine();
                                if (opcionPokemon1 >= 1 && opcionPokemon1 <= pokemones.length) {
                                    entrenador1Pokemon = pokemones[opcionPokemon1 - 1];
                                    System.out.println(entrenador1.getNombre() + " eligio a " + entrenador1Pokemon.getNombre());
                                } else {
                                    System.out.println("Opcion no valida.");
                                }
                                break;
                            case 4:
                                System.out.println("Selecciona Pokemon para Entrenador 2:");
                                for (int i = 0; i < pokemones.length; i++) {
                                    System.out.println((i + 1) + ". " + pokemones[i].getNombre());
                                }
                                System.out.print("Elige un Pokemon (1-" + pokemones.length + "): ");
                                int opcionPokemon2 = scanner.nextInt();
                                scanner.nextLine();
                                if (opcionPokemon2 >= 1 && opcionPokemon2 <= pokemones.length) {
                                    entrenador2Pokemon = pokemones[opcionPokemon2 - 1];
                                    System.out.println(entrenador2.getNombre() + " eligio a " + entrenador2Pokemon.getNombre());
                                } else {
                                    System.out.println("Opcion no valida.");
                                }
                                break;
                            case 5:
                                if (entrenador1Pokemon != null && entrenador2Pokemon != null) {
                                    batalla.iniciarBatalla(entrenador1Pokemon, entrenador2Pokemon);
                                } else {
                                    System.out.println("Debes seleccionar Pokemon para ambos entrenadores antes de comenzar.");
                                }
                                break;
                            case 6:
                                iniciarBatalla = false;
                                break;
                            default:
                                System.out.println("Opcion no valida.");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Funcionalidad para registrar nuevo entrenador aun no implementada.");
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        }

        System.out.println("TINMARINDEDOPINGUE");
    }
}
