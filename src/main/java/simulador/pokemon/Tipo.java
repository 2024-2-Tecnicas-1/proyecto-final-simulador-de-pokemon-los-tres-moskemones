package simulador.pokemon;

public enum Tipo {
    FUEGO, AGUA, PLANTA, VENENO, ELECTRICO, ACERO, PSIQUICO, ROCA, TIERRA, NORMAL, VOLADOR, LUCHA;

    public static double obtenerMultiplicadorDeDaño(Tipo atacante, Tipo defensor) {
        double[][] Multiplicadores = {
            // FUEGO, AGUA, PLANTA, VENENO, ELECTRICO, ACERO, PSIQUICO, ROCA, TIERRA, NORMAL, VOLADOR, LUCHA
            {   1.0,   0.5,   2.0,    1.0,    1.0,      2.0,   1.0,      0.5,  1.0,    1.0,     1.0,    1.0 }, // FUEGO
            {   2.0,   1.0,   0.5,    1.0,    1.0,      1.0,   1.0,      2.0,  2.0,    1.0,     1.0,    1.0 }, // AGUA
            {   0.5,   2.0,   1.0,    0.5,    1.0,      0.5,   1.0,      2.0,  2.0,    1.0,     0.5,    1.0 }, // PLANTA
            {   1.0,   1.0,   2.0,    1.0,    1.0,      0.0,   1.0,      0.5,  1.0,    1.0,     1.0,    0.5 }, // VENENO
            {   1.0,   2.0,   0.5,    1.0,    1.0,      1.0,   1.0,      1.0,  0.0,    1.0,     2.0,    1.0 }, // ELECTRICO
            {   2.0,   1.0,   2.0,    1.0,    0.5,      1.0,   1.0,      2.0,  1.0,    1.0,     0.5,    2.0 }, // ACERO
            {   1.0,   1.0,   1.0,    2.0,    1.0,      0.5,   1.0,      1.0,  1.0,    1.0,     1.0,    0.5 }, // PSIQUICO
            {   2.0,   1.0,   1.0,    1.0,    1.0,      0.5,   1.0,      1.0,  0.5,    1.0,     0.5,    2.0 }, // ROCA
            {   2.0,   1.0,   0.5,    2.0,    2.0,      2.0,   1.0,      2.0,  1.0,    1.0,     1.0,    1.0 }, // TIERRA
            {   1.0,   1.0,   1.0,    1.0,    1.0,      0.5,   1.0,      1.0,  1.0,    1.0,     1.0,    1.0 }, // NORMAL
            {   1.0,   1.0,   2.0,    1.0,    0.5,      1.0,   1.0,      2.0,  0.5,    1.0,     1.0,    0.5 }, // VOLADOR
            {   1.0,   1.0,   1.0,    2.0,    1.0,      0.5,   2.0,      0.5,  1.0,    2.0,     2.0,    1.0 }, // LUCHA
        };
        //convierte los enums a indices para poder acceder a la matriz
        int indexAtacante = atacante.ordinal();
        int indexDefensor = defensor.ordinal();
        return Multiplicadores[indexAtacante][indexDefensor];
    }
}
