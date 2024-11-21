package simulador.pokemon;

import simulador.pokemon.Estados;

public abstract class Pokemon {
    protected String nombre;
    protected int salud;
    protected int atkFis;
    protected int atkEsp;
    protected int defEsp;
    protected int defFis;
    protected int bsalud;
    protected int batkFis;
    protected int batkEsp;
    protected int bdefEsp;
    protected int bdefFis;
    protected Estados estado;
    protected TipoPokemon tipo1;
    protected TipoPokemon tipo2;
    protected int nivel = 1;
    protected int experiencia = 0;
    protected static final int ExpXLvl = 100;

    public Pokemon(String nombre, int bsalud, int batkFis, int batkEsp, int bdefEsp, int bdefFis, Estados estado, TipoPokemon tipo1, TipoPokemon tipo2) {
        this.nombre = nombre;
        this.bsalud = bsalud;
        this.batkFis = batkFis;
        this.batkEsp = batkEsp;
        this.bdefEsp = bdefEsp;
        this.bdefFis = bdefFis;
        this.estado = estado;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
        setAtkEsp();
        setDefEsp();
        setDefFis();
        setAtkFis();
        setSalud();
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
        setAtkEsp();
        setDefEsp();
        setDefFis();
        setAtkFis();
        setSalud();
        System.out.println(this.nombre + " ha subido al nivel " + nivel + "! sus estadisticas han subido.");
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
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAtkEsp() {
        int ataqueE = (int)(5+((this.nivel*((this.batkEsp*2)+31+63))/100));
        this.atkEsp = ataqueE;
    }

    public void setDefEsp() {
        int defensaE = (int)(5+((this.nivel*((this.bdefEsp*2)+31+63))/100));
        this.defEsp = defensaE;
    }

    public void setDefFis() {
        int defF = (int)(5+((this.nivel*((this.bdefFis*2)+31+63))/100));
        this.defFis = defF;
    }
    public void setAtkFis() {
         int ataqueF = (int)(5+((this.nivel*((this.batkFis*2)+31+63))/100));
        this.atkFis = ataqueF;
    }

    public void setSalud() {
        int hp=(int)(this.nivel+10+((this.nivel*((this.bsalud*2)+31+63))/100));
        this.salud = hp;
    }
    

    public void setBsalud(int bsalud) {
        this.bsalud = bsalud;
    }

    public void setBatkFis(int batkFis) {
        this.batkFis = batkFis;
    }

    public void setBatkEsp(int batkEsp) {
        this.batkEsp = batkEsp;
    }

    public void setBdefEsp(int bdefEsp) {
        this.bdefEsp = bdefEsp;
    }

    public void setBdefFis(int bdefFis) {
        this.bdefFis = bdefFis;
    }

    public void setTipo1(TipoPokemon tipo1) {
        this.tipo1 = tipo1;
    }

    public void setTipo2(TipoPokemon tipo2) {
        this.tipo2 = tipo2;
    }
    
    
    public int getSalud() {
        System.out.println(salud);
        return salud;
    }   
    public String getNombre() {
        return nombre;
    }

    public int getAtkFis() {
        System.out.println(atkFis);
        return atkFis;
    }

    public int getAtkEsp() {
        System.out.println(atkEsp);
        System.out.println("E"+batkEsp);
        return atkEsp;
    }

    public int getDefEsp() {
        System.out.println(defEsp);
        System.out.println("E"+bdefEsp);
        return defEsp;
    }

    public int getDefFis() {
        System.out.println(defFis);
        return defFis;
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
