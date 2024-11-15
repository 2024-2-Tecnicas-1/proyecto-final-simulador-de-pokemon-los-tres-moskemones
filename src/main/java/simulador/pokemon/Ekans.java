package simulador.pokemon;

public class Ekans extends Pokemon {
    public Ekans(String nombre, Tipo tipoPrimario, Tipo tipoSecundario, int salud, int ataque, String estado) {
        super("Ekans", Tipo.VENENO, null, 35, 60, null);  
    }

    @Override
    public void atacar(Pokemon TargetPokemon) {
        System.out.println(this.getNombre() + " ataca a " + TargetPokemon.getNombre() + " con un ataque de tipo " + this.getTipoPrimario());
    }
}
