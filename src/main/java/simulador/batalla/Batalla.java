package simulador.batalla;
import simulador.pokemon.Pokemon;
public class Batalla {
    
        private Pokemon pokemon1;
        private Pokemon pokemon2;
    
        public Batalla(Pokemon pokemon1, Pokemon pokemon2) {
            this.pokemon1 = pokemon1;
            this.pokemon2 = pokemon2;
        }
    
        public void iniciarBatalla() {
            while (pokemon1.getSalud() > 0 && pokemon2.getSalud() > 0) {
                pokemon1.atacar(pokemon2);
                if (pokemon2.getSalud() > 0) {
                    pokemon2.atacar(pokemon1);
                }
            }
    
            if (pokemon1.getSalud() <= 0) {
                System.out.println(pokemon2.getNombre() + " gana la batalla");
            } else {
                System.out.println(pokemon1.getNombre() + " gana la batalla");
            }
        }

}
