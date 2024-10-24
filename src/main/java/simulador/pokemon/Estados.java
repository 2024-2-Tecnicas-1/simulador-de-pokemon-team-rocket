package simulador.pokemon;
public enum Estados { //Quiero agregar Estados alterados:(Enamorado 50%, Confundido 33%, Drenado 1/8)
    Ninguno,
    Envenenado,//-1/8 parte de la salud cada turno
    Quemado, //-1/16 parte de la salud cada turno y mitad de ataque fisico
    Congelado, //posibilidad de seguir congelado cada turno 80%
    Dormido, //Entre 1 y 3 turnos dormido
    Paralizado //25% no atacar y mitad de velocidad  
}
