package simulador.entrenador;

import java.util.ArrayList;

import simulador.pokemon.Pokemon;

public class Entrenador {
    public String nombre;
    private ArrayList<Pokemon> equipo;

    public Entrenador(String nombre) {
        this.nombre = nombre;
        this.equipo = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarPokemon(Pokemon pokemon) {
        this.equipo.add(pokemon);
    }

    public ArrayList<Pokemon> getEquipo() {
        return equipo;
    }
}
