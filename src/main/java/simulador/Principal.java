package simulador;

import simulador.pokemon.*;

public class Principal {
    public static void main(String[] args) {
      //Nombre HP Atk Def SP.Atk Sp.Def Vel Tipo1 Tipo2 Estado
      //Pokemon Charmander = new Pokemon("Nombre",HP,Atk,Def,SP.Atk,Sp.Def,Vel,Tipo1,Tipo2,Estado);
        Pokemon Charmander = new Pokemon("Charmander",39,52,43,60,50,65,TipoPokemon.Fuego,TipoPokemon.Ninguno,Estados.Ninguno);
    }
}
