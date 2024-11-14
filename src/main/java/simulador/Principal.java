package simulador;

import simulador.pokemon.Pokemon;
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
import java.util.Scanner;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        ArrayList<Pokemon> seleccionados = new ArrayList<>();
        
        for (int i = 0; i < 3; ) { 
            System.out.println("Selecciona tu Pokémon (" + (i + 1) + "/3):");
            System.out.println("1. Ponyta");
            System.out.println("2. Staryu");
            System.out.println("3. Bellsprout");
            System.out.println("4. Magnemite");
            System.out.println("5. Abra");
            System.out.println("6. Onix");
            System.out.println("7. Doduo");
            System.out.println("8. Meowth");
            System.out.println("9. Machop");
            System.out.println("10. Ekans");
            System.out.println("0. Finalizar selección");

            int opcion = lector.nextInt();

            if (opcion == 0) {
                break; 
            }
            Pokemon pokemonSeleccionado = null;
            switch (opcion) {
                case 1:
                    pokemonSeleccionado = new Ponyta("Ponyta", Tipo.FUEGO, null, 100, 50, null);
                    break;
                case 2:
                    pokemonSeleccionado = new Staryu("Staryu", Tipo.AGUA, null, 80, 40, null);
                    break;
                case 3:
                    pokemonSeleccionado = new Bellsprout("Bellsprout", Tipo.PLANTA, Tipo.VENENO, 50, 75, null);
                    break;
                case 4:
                    pokemonSeleccionado = new Magnemite("Magnemite", Tipo.ELECTRICO, Tipo.ACERO, 25, 35,null);
                    break;
                case 5:
                    pokemonSeleccionado = new Abra("Abra", Tipo.PSIQUICO, null, 25, 20, null);
                    break;
                case 6:
                    pokemonSeleccionado = new Onix("Onix", Tipo.ROCA, Tipo.TIERRA, 35, 45, null);
                    break;
                case 7:
                    pokemonSeleccionado = new Doduo("Doduo", Tipo.NORMAL, Tipo.VOLADOR, 35, 85, null);
                    break;
                case 8:
                    pokemonSeleccionado = new Meowth("Meowth", Tipo.NORMAL, null, 40, 45, null);
                    break;
                case 9:
                    pokemonSeleccionado = new Machop("Machop", Tipo.LUCHA, null, 70, 80, null);
                    break;
                case 10:
                    pokemonSeleccionado = new Ekans("Ekans", Tipo.VENENO, null, 365, 60, null);
                    break;
                default:
                    System.out.println("Selección no válida.");
                    continue;
            }

            boolean yaSeleccionado = false;
            for (Pokemon p : seleccionados) {
                if (p.getNombre().equals(pokemonSeleccionado.getNombre())) {
                    yaSeleccionado = true;
                    break;
                }
            }

            if (yaSeleccionado) {
                System.out.println("Ya se eligió a " + pokemonSeleccionado.getNombre() + ", elige otro.");
            } else {
                seleccionados.add(pokemonSeleccionado); 
                System.out.println("Has elegido a " + pokemonSeleccionado.getNombre());
                i++;  
            }
        }
        lector.close();
        System.out.println("\nPokémon seleccionados:");
        for (Pokemon p : seleccionados) {
            System.out.println(p.getNombre());
        }
    }
}