package simulador.pokemon;

public class Machop extends Pokemon {
    public Machop(String nombre, Tipo tipoPrimario, Tipo tipoSecundario, int salud, int ataque, int exp, int level, int energia) {
        super("Machop", Tipo.LUCHA, null, 70, 80, 0, 0,0);  
    }

    @Override
    public void atacar(Pokemon pokemon) {
        System.out.println(this.getNombre() + " ataca a " + pokemon.getNombre() + " con un ataque de tipo " + this.getTipoPrimario());
    }
}
