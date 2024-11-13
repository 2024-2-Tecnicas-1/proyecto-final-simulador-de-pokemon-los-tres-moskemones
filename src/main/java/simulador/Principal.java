package simulador;

import simulador.pokemon.Ponyta;
import simulador.pokemon.Staryu;
import simulador.pokemon.Tipo;

public class Principal {
    public static void main(String[] args) {
       Ponyta ponyta = new Ponyta("Ponyta", Tipo.FUEGO, null, 100, 50, 0, 0,0);
       Staryu staryu = new Staryu("Staryu", Tipo.AGUA, null, 80, 40, 0, 0, 0);
       
        ponyta.atacar(staryu);
    }
}
