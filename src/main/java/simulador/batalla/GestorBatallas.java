package simulador.batalla;

import simulador.entrenador.Entrenador;
import simulador.pokemon.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GestorBatallas {
    private ArrayList<Entrenador> entrenadores;
    private Entrenador entrenador1;
    private Entrenador entrenador2;

    public GestorBatallas() {
        entrenadores = new ArrayList<>();
    }

    public void mostrarMenuBatalla() {
        Scanner scanner = new Scanner(System.in);
        Batalla batalla = new Batalla();
        Pokemon entrenador1Pokemon = null;
        Pokemon entrenador2Pokemon = null;
        boolean salir = false;

        while (!salir) {
            System.out.println("Menu Principal:");
            System.out.println("1. Crear Entrenador");
            System.out.println("2. Iniciar Batalla");
            System.out.println("3. Volver al menu principal");
            System.out.print("Elige una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    // Crear un nuevo entrenador
                    System.out.print("Ingresa el nombre del nuevo entrenador: ");
                    String nombreEntrenador = scanner.nextLine();
                    Entrenador nuevoEntrenador = new Entrenador(nombreEntrenador);
                    entrenadores.add(nuevoEntrenador);
                    System.out.println("Entrenador " + nombreEntrenador + " ha sido creado.");
                    break;

                case 2:
                    System.out.println("Selecciona el Entrenador 1:");
                    Entrenador entrenador1 = elegirEntrenador(scanner);
                    System.out.println("Selecciona el Entrenador 2:");
                    Entrenador entrenador2 = elegirEntrenador(scanner);

                    boolean iniciarBatalla = true;
                    while (iniciarBatalla) {
                        System.out.println("\nSubmenu: Iniciar Batalla");
                        System.out.println("1. Mostrar Pokemon de Entrenador 1");
                        System.out.println("2. Mostrar Pokemon de Entrenador 2");
                        System.out.println("3. Seleccionar Pokemon para Entrenador 1");
                        System.out.println("4. Seleccionar Pokemon para Entrenador 2");
                        System.out.println("5. Comenzar batalla");
                        System.out.println("6. Volver al menu principal");
                        System.out.print("Elige una opcion: ");
                        int opcionSubmenu = scanner.nextInt();
                        scanner.nextLine();

                        switch (opcionSubmenu) {
                            case 1:
                                entrenador1.mostrarPokemones();
                                break;
                            case 2:
                                entrenador2.mostrarPokemones();
                                break;
                            case 3:
                                System.out.println("Selecciona Pokemon para Entrenador 1:");
                                entrenador1.mostrarPokemones();
                                System.out.print("Elige un Pokemon por nombre: ");
                                String nombrePokemon1 = scanner.nextLine();
                                entrenador1Pokemon = entrenador1.getPokemones().get(nombrePokemon1);
                                if (entrenador1Pokemon != null) {
                                    System.out.println(entrenador1.getNombre() + " eligió a " + entrenador1Pokemon.getNombre());
                                } else {
                                    System.out.println("Pokemon no encontrado.");
                                }
                                break;
                            case 4:
                                System.out.println("Selecciona Pokemon para Entrenador 2:");
                                entrenador2.mostrarPokemones();
                                System.out.print("Elige un Pokemon por nombre: ");
                                String nombrePokemon2 = scanner.nextLine();
                                entrenador2Pokemon = entrenador2.getPokemones().get(nombrePokemon2);
                                if (entrenador2Pokemon != null) {
                                    System.out.println(entrenador2.getNombre() + " eligio a " + entrenador2Pokemon.getNombre());
                                } else {
                                    System.out.println("Pokemon no encontrado.");
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

                case 3:
                    salir = true;
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }
        }

        System.out.println("¡Gracias por jugar! " + " TINMARINDEDOPINGUE");
    }

    // Método para elegir un entrenador de la lista
    private Entrenador elegirEntrenador(Scanner scanner) {
        System.out.println("Elige un entrenador:");
        for (int i = 0; i < entrenadores.size(); i++) {
            System.out.println((i + 1) + ". " + entrenadores.get(i).getNombre());
        }
        int opcionEntrenador = scanner.nextInt();
        scanner.nextLine();  

        if (opcionEntrenador >= 1 && opcionEntrenador <= entrenadores.size()) {
            return entrenadores.get(opcionEntrenador - 1); 
        } else {
            System.out.println("Opcion no valida. Seleccionando al primer entrenador por defecto.");
            return entrenadores.get(0); 
        }
    }
}
