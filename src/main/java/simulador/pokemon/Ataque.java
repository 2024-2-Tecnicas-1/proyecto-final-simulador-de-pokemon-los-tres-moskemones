package simulador.pokemon;

public class Ataque {
    private String nombre;
    private int dano;
    
    public Ataque(String nombre, int dano) {
        this.nombre = nombre;
        this.dano = dano;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDano() {
        return dano;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    
}
