package simulador.batalla;

import simulador.batalla.Batalla;
import simulador.pokemon.Pokemon;

import java.util.Scanner;

public class GestorBatallas {
    public void mostrarMenuPrincipal() {
        Scanner scanner = new Scanner(System.in);
        Batalla batalla = new Batalla();
        Pokemon entrenador1Pokemon = null;
        Pokemon entrenador2Pokemon = null;
        
        boolean salir = false;

        while (!salir) {
            System.out.println("Menu Principal:");
            System.out.println("1. Iniciar Batalla");
            System.out.println("2. Registrar Nuevo Entrenador");
            System.out.println("3. Volver al menu principal");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                   
                    boolean iniciarBatalla = true;
                    while (iniciarBatalla) {
                        System.out.println("\nSubmenú: Iniciar Batalla");
                        System.out.println("1. Elegir entrenador 1");
                        System.out.println("2. Elegir entrenador 2");
                        System.out.println("3. Seleccionar Pokémon de entrenador 1");
                        System.out.println("4. Seleccionar Pokémon de entrenador 2");
                        System.out.println("5. Comenzar batalla");
                        System.out.println("6. Volver al menú principal");
                        System.out.print("Elige una opción: ");
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
                                System.out.println("Selecciona Pokémon para Entrenador 1:");
                                // AYUDA AQUI
                                entrenador1Pokemon = new Pokemon("Pikachu", 100, ...); 
                                break;
                            case 4:
                                System.out.println("Selecciona Pokémon para Entrenador 2:");
                                // AYUDA AQUI
                                entrenador2Pokemon = new Pokemon("Charmander", 100, ...); 
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
                                System.out.println("OpciOn no valida.");
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
