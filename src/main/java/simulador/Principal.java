package simulador;

import java.util.Scanner;
import simulador.batalla.GestorBatallas;
import simulador.entrenador.Entrenadores;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorBatallas gestorBatallas = new GestorBatallas(); 
        Entrenadores entrenadores = new Entrenadores(); 

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
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    // Gestionar batallas
                    System.out.println("Gestionando batallas...");
                    gestorBatallas.mostrarMenuPrincipal();
                    break;

                case 2:
                    // Gestionar entrenadores
                    System.out.println("Gestionando entrenadores...");
                    entrenadores.menuPrincipal(); 
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
