package simulador.pokemon;

public class Staryu extends Pokemon {
    public Staryu(String nombre, Tipo tipoPrimario, Tipo tipoSecundario, int salud, int ataque, String estado) {
        super("Staryu", Tipo.AGUA, null, 30, 45,null);  
    }

    @Override
    public void atacar(Pokemon pokemon) {
        System.out.println(this.getNombre() + " ataca a " + pokemon.getNombre() + " con un ataque de tipo " + this.getTipoPrimario());
    }
}
