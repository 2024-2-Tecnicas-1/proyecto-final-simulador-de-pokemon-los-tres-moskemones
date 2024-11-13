package simulador.batalla;
import simulador.pokemon.Tipo;
import simulador.pokemon.Pokemon;
public class Batalla {
    
    public static double obtenerMultiplicador(Tipo tipoAtacante, Tipo tipoDefensor) {
        // Ejemplo de condiciones para algunos tipos. Puedes ampliar estos casos según sea necesario.
        if (tipoAtacante == Tipo.FUEGO) {
            if (tipoDefensor == Tipo.PLANTA) return 2.0;
            if (tipoDefensor == Tipo.AGUA) return 0.5;
            if (tipoDefensor == Tipo.FUEGO) return 0.5;
        } else if (tipoAtacante == Tipo.AGUA) {
            if (tipoDefensor == Tipo.FUEGO) return 2.0;
            if (tipoDefensor == Tipo.PLANTA) return 0.5;
            if (tipoDefensor == Tipo.AGUA) return 0.5;
        } else if (tipoAtacante == Tipo.PLANTA) {
            if (tipoDefensor == Tipo.AGUA) return 2.0;
            if (tipoDefensor == Tipo.FUEGO) return 0.5;
            if (tipoDefensor == Tipo.PLANTA) return 0.5;
        }
        return 1.0;
    }
    
    public static void HacerDaño(Pokemon atacante, Pokemon defensor) {
        double multiplicador = obtenerMultiplicador(atacante.getTipoPrimario(), defensor.getTipoPrimario());
        int daño = (int) (atacante.getAtaque() * multiplicador);
        defensor.setSalud(defensor.getSalud() - daño);
        System.out.println("Daño causado: " + daño);
        System.out.println("Salud restante de " + defensor.getNombre() + ": " + defensor.getSalud());
    }
}
