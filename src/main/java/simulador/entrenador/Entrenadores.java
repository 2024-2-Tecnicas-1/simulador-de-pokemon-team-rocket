/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulador.entrenador;

/**
 *
 * @author Dylan
 */
import java.util.HashMap;
import java.util.Scanner;
import simulador.pokemon.Estados;
import simulador.pokemon.Pokemon;
import simulador.pokemon.TipoPokemon;
import simulador.pokemones.Abra;
import simulador.pokemones.Bulbasaur;
import simulador.pokemones.charmander;
import simulador.pokemones.Geodude;
import simulador.pokemones.Grimer;
import simulador.pokemones.Jiglypuff;
import simulador.pokemones.Machop;
import simulador.pokemones.Pidgey;
import simulador.pokemones.Pikachu;
import simulador.pokemones.Squirtle;

public class Entrenadores {

    private static Scanner sc = new Scanner(System.in);
    private static HashMap<String, Entrenador> entrenadores = new HashMap<>();
    private static Entrenador entrenadorSeleccionado = null;

    public static void menuPrincipal() {
        while (entrenadorSeleccionado == null) {
            System.out.println("=== MENU PRINCIPAL ===");
            System.out.println("1. Crear nuevo entrenador");
            System.out.println("2. Seleccionar un entrenador existente");
            System.out.println("3. Ver entrenadores existentes");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");
            int opcion = sc.nextInt();
            sc.nextLine();  

            switch (opcion) {
                case 1:
                    crearEntrenador();
                    break;

                case 2:
                    seleccionarEntrenador();
                    break;

                case 3:
                    verEntrenadores();
                    break;

                case 4:
                    System.out.println("Hasta luego");
                    return;

                default:
                    System.out.println("Opcion no valida. Intenta de nuevo.");
            }
        }

        
        gestionarPokemones(entrenadorSeleccionado);
    }

    private static void crearEntrenador() {
        System.out.print("Ingresa el nombre de tu nuevo entrenador: ");
        String nombreNuevo = sc.nextLine();

        if (!entrenadores.containsKey(nombreNuevo)) {
            Entrenador nuevoEntrenador = new Entrenador(nombreNuevo);
            entrenadores.put(nombreNuevo, nuevoEntrenador);
            System.out.println("¡Entrenador " + nombreNuevo + " creado exitosamente!");
        } else {
            System.out.println("Ya existe un entrenador con ese nombre. Intenta con otro.");
        }
    }

    private static void seleccionarEntrenador() {
        if (entrenadores.isEmpty()) {
            System.out.println("No hay entrenadores creados aun. Por favor, crea uno primero.");
        } else {
            System.out.println("Entrenadores disponibles:");
            for (String nombre : entrenadores.keySet()) {
                System.out.println("- " + nombre);
            }
            System.out.print("Ingresa el nombre del entrenador que quieres seleccionar: ");
            String nombreSeleccionado = sc.nextLine().trim();

            if (entrenadores.containsKey(nombreSeleccionado)) {
                entrenadorSeleccionado = entrenadores.get(nombreSeleccionado);
                System.out.println("Has seleccionado al entrenador: " + entrenadorSeleccionado.getNombre());
            } else {
                System.out.println("No se encontro un entrenador con ese nombre.");
            }
        }
    }

    private static void verEntrenadores() {
        if (entrenadores.isEmpty()) {
            System.out.println("No hay entrenadores creados.");
        } else {
            System.out.println("Entrenadores existentes:");
            for (String nombre : entrenadores.keySet()) {
                System.out.println("- " + nombre);
            }
        }
    }

    // Metodo para gestionar los Pokemon del entrenador
    private static void gestionarPokemones(Entrenador entrenador) {
        while (true) {
            System.out.println("=== MENU DE GESTION DE POKEMONES ===");
            System.out.println("1. Ver equipo de Pokemon");
            System.out.println("2. Agregar Pokemon al equipo");
            System.out.println("3. Entrenar Pokemon");
            System.out.println("4. Volver a gestionar entrenadores");
            System.out.print("Elige una opcion: ");
            int opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    entrenador.mostrarPokemones();
                    break;

                case 2:
                    agregarPokemon(entrenador);
                    break;

                case 3:
                    entrenarPokemon(entrenador);
                    break;

                case 4:
                    System.out.println("Volviendo al menu principal de entrenadores.");
                    return; // Volver al menu principal

                default:
                    System.out.println("Opcion no valida. Intenta de nuevo.");
            }
        }
    }

    private static void agregarPokemon(Entrenador entrenador) {
        System.out.println("¿Que tipo de Pokemon deseas agregar?");
         System.out.println("1. Charmander");
                    System.out.println("2. Squirtle");
                    System.out.println("3. Abra");
                    System.out.println("4. Bulbasaur");
                    System.out.println("5. Geodude");
                    System.out.println("6. Grimer");
                    System.out.println("7. Jiglypuff");
                    System.out.println("8. Machop");
                    System.out.println("9. Pidgey");
                    System.out.println("10. Pikachu");
        System.out.print("Ingresa el numero de la opcion: ");
        int opcionPokemon = sc.nextInt();
        sc.nextLine(); 
        Pokemon nuevoPokemon = null;

                      switch (opcionPokemon) {
                      case 1:
                      nuevoPokemon = new charmander("Charmander", 39, 52, 60, 50, 43, Estados.NORMAL, TipoPokemon.FUEGO, TipoPokemon.NINGUNO);
                      break;
                       case 2:
                       nuevoPokemon = new Squirtle("Squirtle", 44, 48, 50, 64, 65, Estados.NORMAL, TipoPokemon.AGUA, TipoPokemon.NINGUNO);
                          break;
                         case 3:
                        nuevoPokemon = new Abra("Abra", 25, 20, 105, 55, 15, Estados.NORMAL, TipoPokemon.PSIQUICO, TipoPokemon.NINGUNO);
                           break;
                        case 4:
                             nuevoPokemon = new Bulbasaur("Bulbasaur", 45, 49, 65, 49, 49, Estados.NORMAL, TipoPokemon.PLANTA, TipoPokemon.VENENO);
                            break;
                            case 5:
                             nuevoPokemon =  new Geodude("Geodude",39,52,60,50,43,Estados.NORMAL,TipoPokemon.PLANTA,TipoPokemon.VENENO);
                            break;
                             case 6:
                             nuevoPokemon =  new Grimer("Grimer",80,80,40,50,50,Estados.NORMAL,TipoPokemon.VENENO,TipoPokemon.NINGUNO);
                            break;
                             case 7:
                             nuevoPokemon =  new Jiglypuff("Jiglypuff",115,45,45,25,20,Estados.NORMAL,TipoPokemon.NORMAL,TipoPokemon.HADA);
                            break;
                              case 8:
                             nuevoPokemon =   new Machop("Machop",70,80,35,35,50,Estados.NORMAL,TipoPokemon.LUCHA,TipoPokemon.NINGUNO);
                            break;
                            case 9:
                             nuevoPokemon =    new Pidgey("Pidgey",40,45,35,35,40,Estados.NORMAL,TipoPokemon.NORMAL,TipoPokemon.VOLADOR);
                            break;
                            case 10:
                             nuevoPokemon =  new Pikachu("Pikachu",45,80,75,60,50,Estados.NORMAL,TipoPokemon.ELECTRICO,TipoPokemon.NINGUNO);
                            break;
            default:
                System.out.println("Opcion no valida.");
                break;
        }

        if (nuevoPokemon != null) {
            entrenador.agregarPokemon(nuevoPokemon);
            System.out.println(nuevoPokemon.getNombre() + " ha sido agregado al equipo de " + entrenador.getNombre());
        }
    }

    private static void entrenarPokemon(Entrenador entrenador) {
        System.out.print("Ingresa el nombre del Pokemon a entrenar: ");
        String nombrePokemonEntrenar = sc.nextLine();
        entrenador.entrenarPokemon(nombrePokemonEntrenar);
    }
}
