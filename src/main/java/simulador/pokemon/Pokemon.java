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
  
}
