package simulador.pokemon;

public class Magnemite extends Pokemon {
    public Magnemite(String nombre, Tipo tipoPrimario, Tipo tipoSecundario, int salud, int ataque, int exp, int level, int energia) {
        super("Magnemite", Tipo.ELECTRICO, Tipo.ACERO, 25, 35, 0, 0,0);  
    }

    @Override
    public void atacar(Pokemon pokemon) {
        System.out.println(this.getNombre() + " ataca a " + pokemon.getNombre() + " con un ataque de tipo " + this.getTipoPrimario());
    }
}
