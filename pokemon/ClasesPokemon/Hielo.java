public class Hielo extends Pokemon{
    public Hielo(String Nombre, int Salud, int puntosataque, TipoPokemon tipo, Estados estado) {
        super(Nombre, Salud, puntosataque, tipo, estado);
    }


    double atacar() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }


    int recibirdaño(int daño) {
        int valoradisminuir= (int)(daño);
        System.out.println(this.Nombre + " restó " + valoradisminuir + " puntos de vida");
        this.Salud -=valoradisminuir;
        return Salud;

    }

    int entrenar() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
} 

