package simulador;

import simulador.entrenador.Entrenador;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import simulador.batalla.Batalla;
import simulador.pokemon.*;

public class Principal {

    private static ArrayList<Entrenador> entrenadores = new ArrayList<>();
    private static ArrayList<Pokemon> pokemones = new ArrayList<>();
    private static List<Pokemon> pokemonesDisponibles = new ArrayList<>();

    private static Scanner scanner = new Scanner(System.in);

    private static Entrenador entrenador1;
    private static Entrenador entrenador2;
    private static Pokemon pokemon1;
    private static Pokemon pokemon2;

static {
    pokemonesDisponibles.add(new Ponyta("Ponyta", Tipo.FUEGO, null, 50, 85, null));
    pokemonesDisponibles.add(new Staryu("Staryu", Tipo.AGUA, null, 30, 45, null));
    pokemonesDisponibles.add(new Bellsprout("Bellsprout", Tipo.PLANTA, Tipo.VENENO, 50, 75, null));
    pokemonesDisponibles.add(new Magnemite("Magnemite", Tipo.ELECTRICO, Tipo.ACERO, 25, 35, null));
    pokemonesDisponibles.add(new Abra("Abra", Tipo.PSIQUICO, null, 25, 20, null));
    pokemonesDisponibles.add(new Onix("Onix", Tipo.ROCA, Tipo.TIERRA, 35, 45, null));
    pokemonesDisponibles.add(new Doduo("Doduo", Tipo.NORMAL, Tipo.VOLADOR, 35, 85, null));
    pokemonesDisponibles.add(new Meowth("Meowth",Tipo.NORMAL,null,40,45,null));
    pokemonesDisponibles.add(new Machop("Machop", Tipo.LUCHA, null, 70, 80, null));
    pokemonesDisponibles.add(new Ekans("Ekans", Tipo.VENENO, null, 35, 60, null));
}
    public static void main(String[] args) {
      int opcion;
        do {
            mostrarMenuPrincipal();
            opcion = leerEntero("Elige una opción: ");
            switch (opcion) {
                case 1 -> gestionarEntrenadores();
                case 2 -> gestionarPokemones();
                case 3 -> iniciarBatalla();
                case 4 -> System.out.println("¡Gracias por jugar!");
                default -> System.out.println("Opción inválida. Inténtalo de nuevo.");
            }
        } while (opcion != 4);
    }
    private static void mostrarMenuPrincipal() {
        System.out.println("\nSimulador de Batallas Pokémon");
        System.out.println("1. Gestionar Entrenadores");
        System.out.println("2. Gestionar Pokémones");
        System.out.println("3. Iniciar Batalla");
        System.out.println("4. Salir");
    }
    private static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextInt()) {
            System.out.print("Por favor, ingresa un número válido: ");
            scanner.next();
        }
        return scanner.nextInt();
    }
    private static void gestionarEntrenadores() {
        int opcion;
        do {
            System.out.println("\nGestionar Entrenadores");
            System.out.println("1. Registrar nuevo entrenador");
            System.out.println("2. Ver lista de entrenadores");
            System.out.println("3. Seleccionar un entrenador");
            System.out.println("4. Volver al menú principal");
            opcion = leerEntero("Elige una opción: ");
            switch (opcion) {
                case 1 -> registrarEntrenador();
                case 2 -> verListaEntrenadores();
                case 3 -> seleccionarEntrenador();
                case 4 -> System.out.println("Regresando al menú principal...");
                default -> System.out.println("Opción inválida. Inténtalo de nuevo.");
            }
        } while (opcion != 4);
    }
    private static void registrarEntrenador() {
        System.out.print("Ingresa el nombre del nuevo entrenador: ");
        scanner.nextLine(); 
        String nombre = scanner.nextLine();
        entrenadores.add(new Entrenador(nombre));
        System.out.println("Entrenador registrado exitosamente.");
    }

    private static void seleccionarEntrenador() {
        verListaEntrenadores();
        if (!entrenadores.isEmpty()) {
            int indice = leerEntero("Selecciona un entrenador (número): ") - 1;
            if (indice >= 0 && indice < entrenadores.size()) {
                Entrenador entrenador = entrenadores.get(indice);
                gestionarEntrenadorIndividual(entrenador);
            } else {
                System.out.println("Índice inválido.");
            }
        }
    }

    private static void verListaEntrenadores() {
        if (entrenadores.isEmpty()) {
            System.out.println("No hay entrenadores registrados.");
        } else {
            System.out.println("\nLista de entrenadores:");
            for (int i = 0; i < entrenadores.size(); i++) {
                System.out.println((i + 1) + ". " + entrenadores.get(i).getNombre());
            }
        }
    }
    private static void gestionarEntrenadorIndividual(Entrenador entrenador) {
        int opcion;
        do {
            System.out.println("\n" + entrenador.getNombre());
            System.out.println("1. Ver equipo de Pokémones");
            System.out.println("2. Agregar Pokémon al equipo");
            System.out.println("3. Entrenar Pokémon");
            System.out.println("4. Volver a Gestionar Entrenadores");
            opcion = leerEntero("Elige una opción: ");
            scanner.nextLine();
            switch (opcion) {
                case 1 -> verEquipo(entrenador);
                case 2 -> agregarPokemonAlEquipo(entrenador);
                case 3 -> entrenarPokemon(entrenador);
                case 4 -> System.out.println("Regresando...");
                default -> System.out.println("Opción inválida. Inténtalo de nuevo.");
            }
        } while (opcion != 4);
    }

    private static void verEquipo(Entrenador entrenador) {
        if (entrenador.getEquipo().isEmpty()) {
            System.out.println("El equipo está vacío.");
        } else {
            System.out.println("\nEquipo de Pokémon:");
            for (int i = 0; i < entrenador.getEquipo().size(); i++) {
                Pokemon p = entrenador.getEquipo().get(i);
                System.out.println((i + 1) + ". " + p.getNombre() + " (Salud: " + p.getSalud() + ")");
            }
        }
    }
    private static void agregarPokemonAlEquipo(Entrenador entrenador) {
        scanner.nextLine(); 
        if (pokemones.isEmpty()) {
            System.out.println("No hay Pokémones registrados.");
        } else {
            System.out.println("Elige un Pokémon para el entrenador:");
            for (int i = 0; i < pokemones.size(); i++) {
                System.out.println((i + 1) + ". " + pokemones.get(i).getNombre());
            }
            System.out.print("Elige un Pokémon (1-" + pokemones.size() + "): ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); 
        
            if (opcion < 1 || opcion > pokemones.size()) {
                System.out.println("Opción no válida.");
                return;
            }
        
            Pokemon pokemonSeleccionado = pokemones.get(opcion - 1);
        
            System.out.println("Pokémon registrado exitosamente: " + pokemonSeleccionado.getNombre());
            entrenador.agregarPokemon(pokemonSeleccionado);
            pokemones.remove(pokemonSeleccionado);
        }
    }
    private static void entrenarPokemon(Entrenador entrenador) {
        if (entrenador.getEquipo().isEmpty()) {
            System.out.println("El equipo está vacío.");
            return;
        }
        System.out.println("Elige un Pokémon para entrenar:");
        for (int i = 0; i < entrenador.getEquipo().size(); i++) {
            System.out.println((i + 1) + ". " + entrenador.getEquipo().get(i).getNombre());
        }
        System.out.print("Elige un Pokémon (1-" + entrenador.getEquipo().size() + "): ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); 
            if (opcion < 1 || opcion > entrenador.getEquipo().size()) {
            System.out.println("Opción no válida.");
            return;
        }
        Pokemon elegido = entrenador.getEquipo().get(opcion - 1);
        elegido.Entrenar();
    }
    

    private static void gestionarPokemones() {
        int opcion;
        do {
            System.out.println("\nGestionar Pokémones");
            System.out.println("1. Ver todos los Pokémones registrados");
            System.out.println("2. Registrar nuevo Pokémon");
            System.out.println("3. Volver al menú principal");
            opcion = leerEntero("Elige una opción: ");
            scanner.nextLine();
            switch (opcion) {
                case 1 -> verPokemones();
                case 2 -> registrarPokemon();
                case 3 -> System.out.println("Regresando al menú principal...");
                default -> System.out.println("Opción inválida. Inténtalo de nuevo.");
            }
        } while (opcion != 3);
    }

    private static void verPokemones() {
        if (pokemones.isEmpty()) {
            System.out.println("No hay Pokémones registrados.");
        } else {
            System.out.println("\nLista de Pokémones:");
            for (int i = 0; i < pokemones.size(); i++) {
                Pokemon p = pokemones.get(i);
                System.out.println((i + 1) + ". " + p.getNombre() + " (Tipo: " + p.getTipoPrimario() + ")");
            }
        }
    }


    private static void registrarPokemon() {
        System.out.println("Elige un Pokémon para registrar:");
        for (int i = 0; i < pokemonesDisponibles.size(); i++) {
            System.out.println((i + 1) + ". " + pokemonesDisponibles.get(i).getNombre());
        }
        System.out.print("Elige un Pokémon (1-" + pokemonesDisponibles.size() + "): ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); 
    
        if (opcion < 1 || opcion > pokemonesDisponibles.size()) {
            System.out.println("Opción no válida.");
            return;
        }
    
        Pokemon pokemonSeleccionado = pokemonesDisponibles.get(opcion - 1);
    
        System.out.println("Pokémon registrado exitosamente: " + pokemonSeleccionado.getNombre());
    
        pokemones.add(pokemonSeleccionado);
        pokemonesDisponibles.remove(opcion - 1);
    }
    


    private static void iniciarBatalla() {
        if (entrenadores.size() < 2) {
            System.out.println("No hay suficientes entrenadores para comenzar una batalla");
            return;
        }
        for (int i = 0; i < entrenadores.size(); i++) {
            if (entrenadores.get(i).getEquipo().size() < 1) {
                System.out.println("No hay Pokémon registrados en el equipo del entrenador " + entrenadores.get(i).getNombre());
                return;
            }
        }
    
        int opcion;
        do {
            System.out.println("\nIniciar Batalla");
            System.out.println("1. Elegir entrenador 1");
            System.out.println("2. Elegir entrenador 2");
            System.out.println("3. Seleccionar Pokémon de entrenador 1");
            System.out.println("4. Seleccionar Pokémon de entrenador 2");
            System.out.println("5. Comenzar batalla");
            System.out.println("6. Volver al menú principal");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 
    
            switch (opcion) {
                case 1:
                    seleccionarEntrenador1();
                    break;
                case 2:
                    seleccionarEntrenador2();
                    break;
                case 3:
                    if (entrenador1 == null) {
                        System.out.println("Tienes que seleccionar el entrenador 1 antes de elegir un Pokémon.");
                    } else {
                        seleccionarPokemon(entrenador1);
                    }
                    break;
                case 4:
                    if (entrenador2 == null) {
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
                    System.out.println("Volviendo al menú principal...");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (true); 
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
        for (int i = 0; i < entrenador.getEquipo().size(); i++) {
            System.out.println((i + 1) + ". " + entrenador.getEquipo().get(i).getNombre());
        }
        int seleccion = scanner.nextInt();
        scanner.nextLine();

        Pokemon pokemonSeleccionado = entrenador.getEquipo().get(seleccion - 1);
        System.out.println("Se ha seleccionado el Pokémon " + pokemonSeleccionado.getNombre() + " para el entrenador " + entrenador.getNombre());


        if (entrenador == entrenador1) {
            pokemon1 = pokemonSeleccionado;
        } else if (entrenador == entrenador2) {
            pokemon2 = pokemonSeleccionado;
        }
    }
}
