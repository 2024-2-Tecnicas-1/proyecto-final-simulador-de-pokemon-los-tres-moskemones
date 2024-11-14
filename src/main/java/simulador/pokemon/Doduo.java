package simulador.pokemon;

public class Doduo extends Pokemon {
    public Doduo(String nombre, Tipo tipoPrimario, Tipo tipoSecundario, int salud, int ataque, String estado) {
        super("Doduo", Tipo.NORMAL, null, 35, 85, null);  
    }

    @Override
    public void atacar(Pokemon pokemon) {
        System.out.println(this.getNombre() + " ataca a " + pokemon.getNombre() + " con un ataque de tipo " + this.getTipoPrimario());
    }
}
