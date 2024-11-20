package simulador.pokemon;


public enum Estados {
     NORMAL,//
    ENVENENADO,//-1/8 parte de la salud cada turno
    QUEMADO, //-1/16 parte de la salud cada turno y mitad de ataque fisico
    CONGELADO, //posibilidad de seguir congelado cada turno 80%
    DORMIDO, //Entre 1 y 3 turnos dormido
    PARALIZADO,//25% no atacar y mitad de velocidad 
    DEBILITADO   
}

