package simulador;

import simulador.pokemon.Pokemon;
import simulador.pokemon.Ponyta;
import simulador.pokemon.Staryu;
import simulador.pokemon.Bellsprout;
import simulador.pokemon.Magnemite;
import simulador.entrenador.Entrenador;
import simulador.pokemon.Abra;
import simulador.pokemon.Onix;
import simulador.pokemon.Doduo;
import simulador.pokemon.Meowth;
import simulador.pokemon.Machop;
import simulador.pokemon.Ekans;
import simulador.pokemon.Tipo;
import java.util.Scanner;
import java.util.ArrayList;
import simulador.batalla.Batalla;
import simulador.pokemon.*;

public class Principal {
    private static ArrayList<Entrenador> entrenadores = new ArrayList<>();
    private static ArrayList<Pokemon> pokemones = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    private static Entrenador entrenador1;
    private static Entrenador entrenador2;
    private static Pokemon pokemon1;
    private static Pokemon pokemon2;

    public static void main(String[] args) {
        while (true) {
            System.out.println("Bienvenido al Simulador de Pokémon.");
            System.out.println("\nMenú Principal");
            System.out.println("1. Gestionar Entrenadores");
            System.out.println("2. Gestionar Pokémones");
            System.out.println("3. Iniciar Batalla");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    gestionarEntrenadores();
                    break;
                case 2:
                    gestionarPokemones();
                    break;
                case 3:
                    iniciarBatalla();
                    break;
                case 4:
                    System.out.println("Bye");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private static void gestionarEntrenadores() {
        while (true) {
            System.out.println("\nGestionar Entrenadores");
            System.out.println("1. Registrar nuevo entrenador");
            System.out.println("2. Ver lista de entrenadores");
            System.out.println("3. Seleccionar un entrenador");
            System.out.println("4. Volver al menú principal");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    registrarEntrenador();
                    break;
                case 2:
                    verEntrenadores();
                    break;
                case 3:
                    seleccionarEntrenador();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private static void gestionarPokemones() {
        while (true) {
            System.out.println("\nGestionar Pokémones");
            System.out.println("1. Ver todos los Pokémones registrados");
            System.out.println("2. Registrar nuevo Pokémon");
            System.out.println("3. Volver al menú principal");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    verPokemones();
                    break;
                case 2:
                    registrarPokemon();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private static void iniciarBatalla() {
        if (entrenadores.size() < 2) {
            System.out.println("No hay suficientes entrenadores para comenzar una batalla");
            return;
        }

        System.out.println("\nIniciar Batalla");
        System.out.println("1. Elegir entrenador 1");
        System.out.println("2. Elegir entrenador 2");
        System.out.println("3. Seleccionar Pokémon de entrenador 1");
        System.out.println("4. Seleccionar Pokémon de entrenador 2");
        System.out.println("5. Comenzar batalla");
        System.out.println("6. Volver al menú principal");
        System.out.print("Elige una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1:
                seleccionarEntrenador1();
                break;
            case 2:
                seleccionarEntrenador2();
                break;
            case 3:
                if (entrenador1 == null){
                    System.out.println("Tienes que seleccionar el entrenador 1 antes de elegir un Pokémon.");
                } else {
                    seleccionarPokemon(entrenador1);
                }
                break;
            case 4:
                if (entrenador2 == null){
                    System.out.println("Tienes que seleccionar el entrenador 2 antes de elegir un Pokémon.");
                } else {
                    seleccionarPokemon(entrenador2);
                }
                break;
            case 5:
                if (entrenador1 != null && entrenador2 != null && pokemon1 != null && pokemon2 != null) {
                Batalla batalla = new Batalla(pokemon1, pokemon2);
                batalla.iniciarBatalla();
                } else {
                    System.out.println("Debes seleccionar ambos entrenadores y sus Pokémon antes de iniciar la batalla.");
                }   
                break;
            case 6:
                return;
            default:
                System.out.println("Opción no válida.");
        }
    }

    private static void registrarEntrenador() {
        System.out.print("Nombre del Entrenador: ");
        String nombre = scanner.nextLine();
        entrenadores.add(new Entrenador(nombre));
        System.out.println("Entrenador registrado con éxito.");
    }

    private static void verEntrenadores() {
        System.out.println("\nLista de Entrenadores:");
        for (Entrenador entrenador : entrenadores) {
            System.out.println(entrenador.getNombre());
        }
    }

    private static void seleccionarEntrenador() {
        System.out.println("\nSelecciona un Entrenador:");
        for (int i = 0; i < entrenadores.size(); i++) {
            System.out.println((i + 1) + ". " + entrenadores.get(i).getNombre());
        }
        int seleccion = scanner.nextInt();
        scanner.nextLine();
    }

    private static void verPokemones() {
        System.out.println("\nLista de Pokémones registrados:");
        for (Pokemon pokemon : pokemones) {
            System.out.println(pokemon.getNombre());
        }
    }

    private static void seleccionarEntrenador1() {
        System.out.println("Selecciona el Entrenador #1:");
        for (int i = 0; i < entrenadores.size(); i++) {
            System.out.println((i + 1) + ". " + entrenadores.get(i).getNombre());
        }
        int seleccion = scanner.nextInt();
        scanner.nextLine();
        entrenador1 = entrenadores.get(seleccion - 1);
        System.out.println("Has seleccionado el Entrenador 1: " + entrenador1.getNombre());
    }

    private static void seleccionarEntrenador2() {
        System.out.println("Selecciona el Entrenador #2:");
        for (int i = 0; i < entrenadores.size(); i++) {
            System.out.println((i + 1) + ". " + entrenadores.get(i).getNombre());
        }
        int seleccion = scanner.nextInt();
        scanner.nextLine();
        entrenador2 = entrenadores.get(seleccion - 1);
        System.out.println("Has seleccionado el Entrenador 2: " + entrenador2.getNombre());
    }

    private static void seleccionarPokemon(Entrenador entrenador) {
        System.out.println("\nSelecciona un Pokémon para " + entrenador.getNombre() + ":");
        for (int i = 0; i < pokemones.size(); i++) {
            System.out.println((i + 1) + ". " + pokemones.get(i).getNombre());
        }
        int seleccion = scanner.nextInt();
        scanner.nextLine();

        Pokemon pokemonSeleccionado = pokemones.get(seleccion - 1);
        System.out.println("Se ha seleccionado el Pokémon " + pokemonSeleccionado.getNombre() + " para el entrenador " + entrenador.getNombre());

        // Obtener los atques:
        Ataque[] ataques = pokemonSeleccionado.getTipoAtaques();
        // Imprime ataques con sus nombres
        // El usuario lo selecciona

        if (entrenador == entrenador1) {
            pokemon1 = pokemonSeleccionado;
        } else if (entrenador == entrenador2) {
            pokemon2 = pokemonSeleccionado;
        }
    }

    private static void registrarPokemon() {
        System.out.print("Nombre del Pokémon: ");
        String nombre = scanner.nextLine();

        Pokemon pokemon = null;


        if (nombre.equalsIgnoreCase("Ponyta")) {
            pokemon = new Ponyta(nombre, Tipo.FUEGO, null, 50, 85, null);
        } else if (nombre.equalsIgnoreCase("Staryu")) {
            pokemon = new Staryu(nombre, Tipo.AGUA, null, 30, 45, null);
        } else if (nombre.equalsIgnoreCase("Bellsprout")) {
            pokemon = new Bellsprout(nombre, Tipo.PLANTA, Tipo.VENENO, 50, 75, null);
        } else if (nombre.equalsIgnoreCase("Magnemite")) {
            pokemon = new Magnemite(nombre, Tipo.ELECTRICO, Tipo.ACERO, 25, 35, null);
        } else if (nombre.equalsIgnoreCase("Abra")) {
            pokemon = new Abra(nombre, Tipo.PSIQUICO, null, 25, 20, null);
        } else if (nombre.equalsIgnoreCase("Onix")) {
            pokemon = new Onix(nombre, Tipo.ROCA, Tipo.TIERRA, 35, 45  , null);
        } else if (nombre.equalsIgnoreCase("Doduo")) {
            pokemon = new Doduo(nombre, Tipo.NORMAL, Tipo.VOLADOR, 35, 85, null);
        } else if (nombre.equalsIgnoreCase("Meowth")) {
            pokemon = new Meowth(nombre, Tipo.NORMAL, null, 40, 45, null);
        } else if (nombre.equalsIgnoreCase("Machop")) {
            pokemon = new Machop(nombre, Tipo.LUCHA, null, 70, 80, null);
        } else if (nombre.equalsIgnoreCase("Ekans")) {
            pokemon = new Ekans(nombre, Tipo.VENENO, null, 35, 60, null);
        }

        if (pokemon != null) {
            pokemones.add(pokemon);
            System.out.println("Pokémon registrado con éxito: " + pokemon.getNombre());
        } else {
            System.out.println("No se ha encontrado un Pokémon con ese nombre.");
        }
    }
}
