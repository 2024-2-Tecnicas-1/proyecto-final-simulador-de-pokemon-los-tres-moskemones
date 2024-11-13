package simulador.pokemon;

public class Ekans extends Pokemon {
    public Ekans(String nombre, Tipo tipoPrimario, Tipo tipoSecundario, int salud, int ataque, int exp, int level, int energia) {
        super("Ekans", Tipo.VENENO, null, 35, 60, 0, 0,0);  
    }

    @Override
    public void atacar(Pokemon pokemon) {
        System.out.println(this.getNombre() + " ataca a " + pokemon.getNombre() + " con un ataque de tipo " + this.getTipoPrimario());
    }
}
