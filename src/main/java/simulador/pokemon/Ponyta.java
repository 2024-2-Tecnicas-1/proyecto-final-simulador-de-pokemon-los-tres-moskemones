package simulador.pokemon;

import simulador.batalla.Batalla;

public class Ponyta extends Pokemon {
    
    public Ponyta(String nombre, Tipo tipoPrimario, Tipo tipoSecundario, int salud, int ataque, int exp, int level, int energia) {
        super("Ponyta", Tipo.FUEGO, null, 100, 50, 0, 0,0);  
    }

    @Override
    public void atacar(Pokemon TargetPokemon) {
        System.out.println(this.getNombre() + " ataca a " + TargetPokemon.getNombre() + " con un ataque de tipo " + this.getTipoPrimario());
        Batalla.HacerDaño(this, TargetPokemon);
    }
}
