package simulador.pokemon;

public class Machop extends Pokemon {
    public Machop(String nombre, Tipo tipoPrimario, Tipo tipoSecundario, int salud, int ataque, String estado) {
        super("Machop", Tipo.LUCHA, null, 70, 80, null);  
    }

    @Override
    public void atacar(Pokemon pokemon) {
        System.out.println(this.getNombre() + " ataca a " + pokemon.getNombre() + " con un ataque de tipo " + this.getTipoPrimario());
    }
}
