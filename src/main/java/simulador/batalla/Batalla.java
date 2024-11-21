package simulador.batalla;

import simulador.pokemon.Pokemon;
import simulador.pokemon.Tipo;
import java.util.Scanner;

public class Batalla {

    private Pokemon pokemon1;
    private Pokemon pokemon2;
    private Scanner scanner;

    public Batalla(Pokemon pokemon1, Pokemon pokemon2) {
        this.pokemon1 = pokemon1;
        this.pokemon2 = pokemon2;
        this.scanner = new Scanner(System.in);
    }

    public void iniciarBatalla() {
        System.out.println("¡La batalla comienza entre " + pokemon1.getNombre() + " y " + pokemon2.getNombre() + "!");
        System.out.println(pokemon1.getNombre() + " tiene " + pokemon1.getSalud() + " de salud.");
        System.out.println(pokemon2.getNombre() + " tiene " + pokemon2.getSalud() + " de salud.");

        while (pokemon1.getSalud() > 0 && pokemon2.getSalud() > 0) {

            System.out.println("\nEs el turno de " + pokemon1.getNombre() + "!");
            esperarAccion();
            realizarAccion(pokemon1, pokemon2);

            if (pokemon2.getSalud() > 0) {

                System.out.println("\nEs el turno de " + pokemon2.getNombre() + "!");
                esperarAccion();
                realizarAccion(pokemon2, pokemon1);
            }


            mostrarEstado();
        }

        if (pokemon1.getSalud() <= 0) {
            System.out.println(pokemon2.getNombre() + " gana la batalla!");
        } else {
            System.out.println(pokemon1.getNombre() + " gana la batalla!");
        }
    }

    private void esperarAccion() {
        System.out.println("Presiona Enter para continuar con el ataque...");
        scanner.nextLine(); 
    }

    private void realizarAccion(Pokemon atacante, Pokemon defensor) {
        double multiplicador = Tipo.obtenerMultiplicadorDeDaño(atacante.getTipoPrimario(), defensor.getTipoPrimario());
        double danio = atacante.getAtaque() * multiplicador;
        defensor.setSalud((int) (defensor.getSalud() - danio));
        System.out.println(atacante.getNombre() + " ataca a " + defensor.getNombre() + " con un daño de " + danio);
        System.out.println(defensor.getNombre() + " ahora tiene " + defensor.getSalud() + " de salud.");

        if (defensor.getSalud() > 0) {
            multiplicador = Tipo.obtenerMultiplicadorDeDaño(defensor.getTipoPrimario(), atacante.getTipoPrimario());
            danio = defensor.getAtaque() * multiplicador;
            atacante.setSalud((int) (atacante.getSalud() - danio));
            System.out.println(defensor.getNombre() + " ataca a " + atacante.getNombre() + " con un daño de " + danio);
            System.out.println(atacante.getNombre() + " ahora tiene " + atacante.getSalud() + " de salud.");
        }
    }

    private void mostrarEstado() {
        System.out.println("\nEstado actual:");
        System.out.println(pokemon1.getNombre() + " tiene " + pokemon1.getSalud() + " de salud.");
        System.out.println(pokemon2.getNombre() + " tiene " + pokemon2.getSalud() + " de salud.");
    }
}

