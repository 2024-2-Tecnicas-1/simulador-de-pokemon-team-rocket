/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokemon;

/**
 *
 * @author Dylan
 */
public enum Estados {
     Normal,//
    Envenenado,//-1/8 parte de la salud cada turno
    Quemado, //-1/16 parte de la salud cada turno y mitad de ataque fisico
    Congelado, //posibilidad de seguir congelado cada turno 80%
    Dormido, //Entre 1 y 3 turnos dormido
    Paralizado,//25% no atacar y mitad de velocidad 
    Debilitado 
}
