/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokemon;

/**
 *
 * @author Dylan
 */
public class Batalla {
   public void iniciarBatalla(Pokemon pokemon1, Pokemon pokemon2) {
        System.out.println("Comienza la batalla entre " + pokemon1.getNombre() + " y " + pokemon2.getNombre() + "!");
        
        while (pokemon1.getSalud() > 0 && pokemon2.getSalud() > 0) {
       
            int damage1 = pokemon1.atacar();
            pokemon2.recibirdaño(damage1);
            System.out.println(pokemon1.getNombre() + " ataca a " + pokemon2.getNombre() + " con " + damage1 + " puntos de daño.");

            if (pokemon2.getSalud() <= 0) {
                System.out.println(pokemon2.getNombre() + " ha sido debilitado.");
                break;
            }

            
            int damage2 = pokemon2.atacar();
            pokemon1.recibirdaño(damage2);
            System.out.println(pokemon2.getNombre() + " ataca a " + pokemon1.getNombre() + " con " + damage2 + " puntos de daño.");

            if (pokemon1.getSalud() <= 0) {
                System.out.println(pokemon1.getNombre() + " ha sido debilitado.");
                break;
            }
        }

        
        if (pokemon1.getSalud() > 0) {
            System.out.println( pokemon1.getNombre() + " ha ganado la batalla!");
        } else if (pokemon2.getSalud() > 0) {
            System.out.println(  pokemon2.getNombre() + " ha ganado la batalla!");
        } else {
            System.out.println("La batalla termino en empate.");
        }
    }
}   

