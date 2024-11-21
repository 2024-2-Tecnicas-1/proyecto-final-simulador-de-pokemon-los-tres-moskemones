package simulador.pokemon;


public class Ponyta extends Pokemon {
    
    public Ponyta(String nombre, Tipo tipoPrimario, Tipo tipoSecundario, int salud, int ataque, String estado) {
        super("Ponyta", Tipo.FUEGO, null, 100, 50, null);  
    }

    @Override
    public void atacar(Pokemon TargetPokemon) {
        System.out.println(this.getNombre() + " ataca a " + TargetPokemon.getNombre() + " con un ataque de tipo " + this.getTipoPrimario());
    }
}
