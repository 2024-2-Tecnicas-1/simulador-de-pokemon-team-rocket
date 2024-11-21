package simulador.pokemon;

import simulador.pokemon.Estados;

public abstract class Pokemon {
  public String nombre;
    public  int salud;
    public int puntosAtaque;
    public Estados estado;
    public TipoPokemon tipo;
    public int nivel = 1;
    public int experiencia = 0;
    public static final int ExpXLvl = 100;



    public Pokemon(String nombre, int salud, int puntosAtaque, Estados estado, TipoPokemon tipo) {
        this.nombre = nombre;
        this.salud = salud;
        this.puntosAtaque = puntosAtaque;
        this.estado = estado;
        this.tipo = tipo;
    }
    private int turnosDormido = 0;

    // Getter del estado
    public Estados getEstado() {
        return estado;
    }
    public int getNivel() {
        return nivel;
    }
    public int getExperiencia(){
        return experiencia;
    }
    public void entrenarPokemon(){
        experiencia += 20;
        System.out.println(nombre + " ha ganado 20 puntos de experiencia");
        if ( experiencia >= ExpXLvl) {
            subirNivel();
        }
    }
    public void subirNivel () {
        experiencia -= ExpXLvl;
        nivel++;
        salud += 10; // Mejora básica por nivel
        puntosAtaque += 5; // Mejora básica por nivel
        System.out.println(nombre + " ha subido al nivel " + nivel + "! Salud y ataque mejorados.");
    }

    // Setter del estado
    public void setEstado(Estados nuevoEstado) {
        if (this.estado == Estados.DEBILITADO) {
            System.out.println(this.nombre + " ya está debilitado y no puede cambiar de estado.");
            return; // No permite cambios si el Pokémon está debilitado
        }

        this.estado = nuevoEstado;
        System.out.println(this.nombre + " ahora está en estado: " + nuevoEstado);
    }

    // Otros getters y setters
    public String getNombre() {
        return nombre;
    }

    public int getSalud() {
        return salud;
    }

    public int getPuntosAtaque() {
        return puntosAtaque;
    }
     public void setPuntosAtaque(int puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }

    public void recibirDaño(int daño) {
        salud -= daño;
        if (salud <= 0) {
            salud = 0;
            setEstado(Estados.DEBILITADO);
        }
        
        // LOGICA TURNOS DORMIDO//
    }
    public int getTurnosDormido() {
    return turnosDormido;
}
    public void setTurnosDormido(int turnos) {
    this.turnosDormido = turnos;
}

    public void reducirTurnosDormido() {
    if (turnosDormido > 0) {
        turnosDormido--;
    }
}

   
     
    
    //  METODOS ABSTRACTOS
    public abstract int atacar();
    public abstract String entrenar();
}
