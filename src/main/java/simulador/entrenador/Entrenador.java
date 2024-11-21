package simulador.entrenador;

import java.util.ArrayList;

import simulador.pokemon.Pokemon;

public class Entrenador {
    public String nombre;
    private ArrayList<Pokemon> equipo;
    private Pokemon pokemonActivo;

    public Entrenador(String nombre) {
        this.nombre = nombre;
        this.equipo = new ArrayList<>();
        this.pokemonActivo = null;


    }

    public String getNombre() {
        return nombre;
    }

    public void agregarPokemon(Pokemon pokemon) {
        this.equipo.add(pokemon);
    }
    public void entrenarPokemon(Pokemon pokemon) {
        if (this.equipo.contains(pokemon)) {
            pokemon.setSalud(pokemon.getSalud()+3); 
            pokemon.setAtaque(pokemon.getAtaque()+1); 
        } else {
            System.out.println("El Pokémon no está en el equipo");
        }
    }
    public ArrayList<Pokemon> getEquipo() {
        return equipo;
    }

    public void prepararBatalla(Pokemon pokemon) {
        if (this.equipo.contains(pokemon)) {
            this.pokemonActivo = pokemon;
            System.out.println(pokemon.getNombre() + " está listo para la batalla.");
        } else {
            System.out.println("El Pokémon no está en el equipo.");
        }
    }
    public Pokemon getPokemonActivo() {
        return this.pokemonActivo;
    }

}
