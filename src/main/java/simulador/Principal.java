package simulador;

import simulador.pokemon.Pokemon;
import simulador.pokemon.TipoPokemon;

public class Principal {
    public static void main(String[] args) {
        TipoPokemon tipoFuego = new TipoPokemon("Fuego",null);
        TipoPokemon tipoAgua = new TipoPokemon("Agua", null);
        TipoPokemon tipoPlantaVeneno = new TipoPokemon("Planta", "Veneno");
        TipoPokemon tipoElectricoAcero = new TipoPokemon("Eléctrico", "Acero");
        TipoPokemon tipoPsiquico = new TipoPokemon("Psíquico", null);
        TipoPokemon tipoRocaTierra = new TipoPokemon("Roca", "Tierra");
        TipoPokemon tipoNormalVolador = new TipoPokemon("Normal", "Volador");
        TipoPokemon tipoNormal = new TipoPokemon("Normal", null);
        TipoPokemon tipoLucha = new TipoPokemon("Lucha", null);
        TipoPokemon tipoVeneno = new TipoPokemon("Veneno", null);

        Pokemon ponyta = new Pokemon("Ponyta", tipoFuego, 50, 85);
        Pokemon staryu = new Pokemon("Staryu", tipoAgua, 30, 45);
        Pokemon bellsprout = new Pokemon("Bellsprout", tipoPlantaVeneno, 50, 75);
        Pokemon magnemite = new Pokemon("Magnemite", tipoElectricoAcero, 25, 35);
        Pokemon abra = new Pokemon("Abra", tipoPsiquico, 25, 20);
        Pokemon onix = new Pokemon("Onix", tipoRocaTierra, 35, 45);
        Pokemon doduo = new Pokemon("Doduo", tipoNormalVolador, 35, 85);
        Pokemon meowth = new Pokemon("Meowth", tipoNormal, 40, 45);
        Pokemon machop = new Pokemon("Machop", tipoLucha, 70, 80);
        Pokemon ekans = new Pokemon("Ekans", tipoVeneno, 35, 60);

        System.out.println(ponyta.getNombre());
        System.out.println(ponyta.getAtaque());
        System.out.println(ponyta.getSalud());
        System.out.println(ponyta.getTipo());
        System.out.println(ponyta.getTipoSecundario());
        System.out.println(ponyta.getTipoPrimario());

    }
}
