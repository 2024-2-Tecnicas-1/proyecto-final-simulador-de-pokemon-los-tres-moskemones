package simulador.pokemon;

public class Onix extends Pokemon {
    public Onix(String nombre, Tipo tipoPrimario, Tipo tipoSecundario, int salud, int ataque, String estado) {
        super("Onix", Tipo.ROCA, Tipo.TIERRA, 35, 45, null);  
    }

    @Override
    public void atacar(Pokemon pokemon) {
        System.out.println(this.getNombre() + " ataca a " + pokemon.getNombre() + " con un ataque de tipo " + this.getTipoPrimario());
    }
}
