package simulador.pokemon;

public class Onix extends Pokemon {
    public Onix(String nombre, Tipo tipoPrimario, Tipo tipoSecundario, int salud, int ataque, int exp, int level, int energia) {
        super("Onix", Tipo.ROCA, Tipo.TIERRA, 35, 45, 0, 0,0);  
    }

    @Override
    public void atacar(Pokemon pokemon) {
        System.out.println(this.getNombre() + " ataca a " + pokemon.getNombre() + " con un ataque de tipo " + this.getTipoPrimario());
    }
}
