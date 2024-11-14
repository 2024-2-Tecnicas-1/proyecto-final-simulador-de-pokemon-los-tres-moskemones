package simulador.pokemon;

import simulador.batalla.Batalla;

public class Meowth extends Pokemon {


    public Meowth() {
        super("Meowth", Tipo.NORMAL, null, 40, 45, null, new Ataque[] {
            new Ataque("Arañazo", 10),
            new Ataque("Gruñido", 2)
        });  
    }

    public void atacar(Pokemon TargetPokemon, int indiceAtaque) {
        System.out.println(this.getNombre() + " ataca a " + TargetPokemon.getNombre() + " con un ataque de tipo " + this.getTipoPrimario());
        Batalla.HacerDaño(this, TargetPokemon, indiceAtaque);
    }
}
