package simulador;

import simulador.pokemon.Ponyta;
import simulador.pokemon.Staryu;
import simulador.pokemon.Bellsprout;
import simulador.pokemon.Magnemite;
import simulador.pokemon.Abra;
import simulador.pokemon.Onix;
import simulador.pokemon.Doduo;
import simulador.pokemon.Meowth;
import simulador.pokemon.Machop;
import simulador.pokemon.Ekans;
import simulador.pokemon.Tipo;

public class Principal {
    public static void main(String[] args) {
       Ponyta ponyta = new Ponyta("Ponyta", Tipo.FUEGO, null, 100, 50, 0, 0,0);
       Staryu staryu = new Staryu("Staryu", Tipo.AGUA, null, 80, 40, 0, 0, 0);
       Bellsprout bellsprout = new Bellsprout("Bellsprout", Tipo.PLANTA, Tipo.VENENO, 50, 75, 0, 0,0);
       Magnemite magnemite = new Magnemite("Magnemite", Tipo.ELECTRICO, Tipo.ACERO, 25, 35, 0, 0, 0);
       Abra abra = new Abra("Abra", Tipo.PSIQUICO, null, 25, 20, 0, 0,0);
       Onix onix = new Onix("Onix", Tipo.ROCA, Tipo.TIERRA, 35, 45, 0, 0, 0);
       Doduo doduo = new Doduo("Doduo", Tipo.NORMAL, Tipo.VOLADOR, 35, 85, 0, 0,0);
       Meowth meowth = new Meowth("Meowth", Tipo.NORMAL, null, 40, 45, 0, 0, 0);
       Machop machop = new Machop("Machop", Tipo.LUCHA, null, 70, 80, 0, 0,0);
       Ekans ekans = new Ekans("Ekans", Tipo.VENENO, null, 365, 60, 0, 0, 0);
        ponyta.atacar(staryu);

        System.out.println(abra.getTipoPrimario());
        System.out.println(abra.getTipoSecundario());
    }
}
