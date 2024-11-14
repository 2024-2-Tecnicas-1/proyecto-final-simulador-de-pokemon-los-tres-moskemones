package simulador.pokemon;

public class Magnemite extends Pokemon {
    public Magnemite(String nombre, Tipo tipoPrimario, Tipo tipoSecundario, int salud, int ataque, String estado) {
        super("Magnemite", Tipo.ELECTRICO, Tipo.ACERO, 25, 35, null);  
    }

    @Override
    public void atacar(Pokemon TargetPokemon) {
        System.out.println(this.getNombre() + " ataca a " + TargetPokemon.getNombre() + " con un ataque de tipo " + this.getTipoPrimario());
    }
}
