package simulador.pokemon;

public class Pokemon {
    private String nombre;
    private TipoPokemon tipo;
    private int salud;
    private int ataque;
  public Pokemon(String nombre, TipoPokemon tipo, int salud,int ataque) {
    this.nombre = nombre;
    this.tipo = tipo;
    this.salud = salud;
    this.ataque = ataque;
  }

  
  public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public TipoPokemon getTipo() {
    return tipo;
}

public void setTipo(TipoPokemon tipo) {
    this.tipo = tipo;
}

public int getSalud() {
    return salud;
}

public void setSalud(int salud) {
    this.salud = salud;
}

public int getAtaque() {
    return ataque;
}

public void setAtaque(int ataque) {
    this.ataque = ataque;
}
}
