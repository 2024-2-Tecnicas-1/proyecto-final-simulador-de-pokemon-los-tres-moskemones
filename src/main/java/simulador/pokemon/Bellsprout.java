package simulador.pokemon;

public class Bellsprout extends Pokemon {
    public Bellsprout(String nombre, Tipo tipoPrimario, Tipo tipoSecundario, int salud, int ataque, String estado) {
        super("Bellsprout", Tipo.PLANTA, Tipo.VENENO, 50, 75, null);  
    }

    @Override
    public void atacar(Pokemon pokemon) {
        System.out.println(this.getNombre() + " ataca a " + pokemon.getNombre() + " con un ataque de tipo " + this.getTipoPrimario());
    }
}
