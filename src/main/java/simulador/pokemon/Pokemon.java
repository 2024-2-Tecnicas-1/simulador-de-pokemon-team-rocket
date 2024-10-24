package simulador.pokemon;

public class Pokemon {
    protected String Nombre;
    protected int salud;
    protected int ataqueF;
    protected int defensaF;
    protected int ataqueE;
    protected int defensaE;
    protected int velocidad;
    protected TipoPokemon tipo1;
    protected TipoPokemon tipo2;
    protected Estados estado;

    public Pokemon(String Nombre, int salud, int ataqueF, int defensaF, int ataqueE, int defensaE, int velocidad, TipoPokemon tipo1, TipoPokemon tipo2, Estados estado) {
        this.Nombre = Nombre;
        this.salud = salud;
        this.ataqueF = ataqueF;
        this.defensaF = defensaF;
        this.ataqueE = ataqueE;
        this.defensaE = defensaE;
        this.velocidad = velocidad;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
        this.estado = estado;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getSalud() {
        return salud;
    }

    public int getAtaqueF() {
        return ataqueF;
    }

    public int getDefensaF() {
        return defensaF;
    }

    public int getAtaqueE() {
        return ataqueE;
    }

    public int getDefensaE() {
        return defensaE;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public TipoPokemon getTipo1() {
        return tipo1;
    }

    public TipoPokemon getTipo2() {
        return tipo2;
    }

    public Estados getEstado() {
        return estado;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public void setAtaqueF(int ataqueF) {
        this.ataqueF = ataqueF;
    }

    public void setDefensaF(int defensaF) {
        this.defensaF = defensaF;
    }

    public void setAtaqueE(int ataqueE) {
        this.ataqueE = ataqueE;
    }

    public void setDefensaE(int defensaE) {
        this.defensaE = defensaE;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setTipo1(TipoPokemon tipo1) {
        this.tipo1 = tipo1;
    }

    public void setTipo2(TipoPokemon tipo2) {
        this.tipo2 = tipo2;
    }
    public void setEstado(Estados estado) {
        this.estado = estado;
    }
    
    
}
