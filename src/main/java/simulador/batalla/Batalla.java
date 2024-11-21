package simulador.batalla;

import simulador.pokemon.Pokemon;
import simulador.pokemon.Tipo;

public class Batalla {

    private Pokemon pokemon1;
    private Pokemon pokemon2;

    public Batalla(Pokemon pokemon1, Pokemon pokemon2) {
        this.pokemon1 = pokemon1;
        this.pokemon2 = pokemon2;
    }

    public void iniciarBatalla() {
        System.out.println("¡La batalla comienza entre " + pokemon1.getNombre() + " y " + pokemon2.getNombre() + "!");
        System.out.println(pokemon1.getNombre() + " tiene " + pokemon1.getSalud() + " de salud.");
        System.out.println(pokemon2.getNombre() + " tiene " + pokemon2.getSalud() + " de salud.");
        
        while (pokemon1.getSalud() > 0 && pokemon2.getSalud() > 0) {
            double multiplicador = Tipo.obtenerMultiplicadorDeDaño(pokemon1.getTipoPrimario(), pokemon2.getTipoPrimario());
            double danio = pokemon1.getAtaque() * multiplicador;
            pokemon2.setSalud((int) (pokemon2.getSalud() - danio));
            System.out.println(pokemon2.getNombre() + " ahora tiene " + pokemon2.getSalud() + " de salud.");

            if (pokemon2.getSalud() > 0) {
                multiplicador = Tipo.obtenerMultiplicadorDeDaño(pokemon2.getTipoPrimario(), pokemon1.getTipoPrimario());
                danio = pokemon2.getAtaque() * multiplicador;
                pokemon1.setSalud((int) (pokemon1.getSalud() - danio));
                System.out.println(pokemon1.getNombre() + " ahora tiene " + pokemon1.getSalud() + " de salud.");
            }
            if (pokemon1.getSalud() > 0 && pokemon2.getSalud() > 0) {
                System.out.println("El combate continúa...");
            }

        }

        if (pokemon1.getSalud() <= 0) {
            System.out.println(pokemon2.getNombre() + " gana la batalla");
        } else {
            System.out.println(pokemon1.getNombre() + " gana la batalla");
        }
    }

}

