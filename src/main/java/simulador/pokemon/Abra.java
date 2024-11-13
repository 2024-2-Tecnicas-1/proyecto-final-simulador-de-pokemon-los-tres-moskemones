package simulador.pokemon;

public class Abra extends Pokemon {
    public Abra(String nombre, Tipo tipoPrimario, Tipo tipoSecundario, int salud, int ataque, int exp, int level, int energia) {
        super("Abra", Tipo.PSIQUICO, null, 25, 20, 0, 0,0);  
    }

    @Override
    public void atacar(Pokemon pokemon) {
        System.out.println(this.getNombre() + " ataca a " + pokemon.getNombre() + " con un ataque de tipo " + this.getTipoPrimario());
    }
}