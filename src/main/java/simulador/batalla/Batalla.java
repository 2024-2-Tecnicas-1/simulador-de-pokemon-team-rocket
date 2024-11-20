package simulador.batalla;

import simulador.pokemon.Pokemon;

import java.util.Scanner;
import simulador.pokemon.Estados;

public class Batalla {
    public void iniciarBatalla(Pokemon p1, Pokemon p2) {
        Scanner scanner = new Scanner(System.in);
        boolean turnoDeP1 = true; // Determina si es el turno de p1 o p2

        System.out.println("¡Comienza la batalla entre " + p1.getNombre() + " y " + p2.getNombre() + "!");
        
        while (p1.getSalud() > 0 && p2.getSalud() > 0) {
            if (turnoDeP1){
                // Pokémon 1 ataca
                System.out.println(p1.getNombre() + " ataca a " + p2.getNombre());
                int daño = p1.atacar(); 
                aplicarEfectosDeEstado(p2);
                p2.recibirDaño(daño);
                System.out.println(p2.getNombre() + " tiene ahora " + p2.getSalud() + " puntos de salud.");

                // Aplicar efectos de estado (si existen)
                

            } else {
                // Pokémon 2 ataca
                System.out.println(p2.getNombre() + " ataca a " + p1.getNombre());
                int daño = p2.atacar();
                p1.recibirDaño(daño);
                System.out.println(p1.getNombre() + " tiene ahora " + p1.getSalud() + " puntos de salud.");

                // Aplicar efectos de estado (si existen)
                aplicarEfectosDeEstado(p1);
            }

            // Cambiar turno
            turnoDeP1 = !turnoDeP1;

            // Pausar para que el jugador presione Enter
            System.out.println("\nPresiona Enter para continuar con el siguiente turno...");
            scanner.nextLine();
        }

        // Determinar el ganador
        if (p1.getSalud() <= 0) {
            System.out.println(p1.getNombre() + " se debilitó. ¡" + p2.getNombre() + " ganó la batalla!");
        } else {
            System.out.println(p2.getNombre() + " se debilitó. ¡" + p1.getNombre() + " ganó la batalla!");
        }
    }

   private void aplicarEfectosDeEstado(Pokemon pokemon) {
    switch (pokemon.getEstado()) {
        case ENVENENADO:
            // Pierde 1/8 de su salud máxima cada turno
            int dañoPorVeneno = Math.max(1, pokemon.getSalud() / 8); // Mínimo daño de 1
            pokemon.recibirDaño(dañoPorVeneno);
            System.out.println(pokemon.getNombre() + " perdió " + dañoPorVeneno + " puntos de salud debido al veneno.");
            break;

        case QUEMADO:
            // Pierde 1/16 de su salud máxima cada turno y su ataque físico es reducido a la mitad
            int dañoPorQuemadura = Math.max(1, pokemon.getSalud() / 16); // Mínimo daño de 1
            pokemon.recibirDaño(dañoPorQuemadura);
            System.out.println(pokemon.getNombre() + " perdió " + dañoPorQuemadura + " puntos de salud debido a la quemadura.");
            pokemon.setPuntosAtaque(pokemon.getPuntosAtaque() / 2); // Reducir ataque
            System.out.println(pokemon.getNombre() + " tiene ahora su ataque físico reducido.");
            break;

        case CONGELADO:
            // 80% de posibilidad de seguir congelado y no poder atacar
            if (Math.random() < 0.8) {
                System.out.println(pokemon.getNombre() + " sigue congelado y no puede atacar.");
            } else {
                System.out.println(pokemon.getNombre() + " se descongeló y puede atacar nuevamente.");
                pokemon.setEstado(Estados.NORMAL); // Volver a estado normal
            }
            break;

        case DORMIDO:
            // Se duerme entre 1 y 3 turnos
            if (pokemon.getTurnosDormido() > 0) {
                System.out.println(pokemon.getNombre() + " está dormido y no puede atacar.");
                pokemon.reducirTurnosDormido();
            } else {
                System.out.println(pokemon.getNombre() + " se despertó y puede atacar nuevamente.");
                pokemon.setEstado(Estados.NORMAL); // Volver a estado normal
            }
            break;

        case PARALIZADO:
            // 25% de posibilidad de no atacar
            if (Math.random() < 0.25) {
                System.out.println(pokemon.getNombre() + " está paralizado y no puede atacar este turno.");
            } else {
                System.out.println(pokemon.getNombre() + " está paralizado, pero puede atacar.");
            }
            break;

        case DEBILITADO:
            // El Pokémon no puede realizar acciones
            System.out.println(pokemon.getNombre() + " esta debilitado y no puede continuar.");
            break;

        default:
            // Estado NORMAL no requiere acciones adicionales
            break;
    }
}
}
