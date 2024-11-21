package simulador.pokemon;


public class Meowth extends Pokemon {

    public Meowth(String nombre, Tipo tipoPrimario, Tipo tipoSecundario, int salud, int ataque, String estado) {
        super("Meowth", Tipo.NORMAL, null, 40, 45, null);
    }

 @Override
public void atacar(Pokemon TargetPokemon) {
    System.out.println(this.getNombre() + " ataca a " + TargetPokemon.getNombre() + " con un ataque de tipo " + this.getTipoPrimario());
}

}
