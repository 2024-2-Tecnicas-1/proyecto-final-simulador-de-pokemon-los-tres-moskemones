package simulador.batalla;
import simulador.pokemon.Tipo;
import simulador.pokemon.Pokemon;
public class Batalla {
    
        private Pokemon pokemon1;
        private Pokemon pokemon2;
    
        public Batalla(Pokemon pokemon1, Pokemon pokemon2) {
            this.pokemon1 = pokemon1;
            this.pokemon2 = pokemon2;
        }
    
        public void iniciarBatalla() {
            while (pokemon1.getSalud() > 0 && pokemon2.getSalud() > 0) {
                pokemon1.atacar(pokemon2);
                if (pokemon2.getSalud() > 0) {
                    pokemon2.atacar(pokemon1);
                }
            }
    
            if (pokemon1.getSalud() <= 0) {
                System.out.println(pokemon2.getNombre() + " gana la batalla");
            } else {
                System.out.println(pokemon1.getNombre() + " gana la batalla");
            }
        }
    
        public static double obtenerMultiplicadorDeDaño(Tipo tipoAtacantePrimario, Tipo tipoAtacanteSecundario, Tipo tipoDefensorPrimario, Tipo tipoDefensorSecundario) {
            double multiplicador = 1.0;
            
            multiplicador *= obtenerMultiplicadorPorTipo(tipoAtacantePrimario, tipoDefensorPrimario);
            multiplicador *= obtenerMultiplicadorPorTipo(tipoAtacantePrimario, tipoDefensorSecundario);
            multiplicador *= obtenerMultiplicadorPorTipo(tipoAtacanteSecundario, tipoDefensorPrimario);
            multiplicador *= obtenerMultiplicadorPorTipo(tipoAtacanteSecundario, tipoDefensorSecundario);
        
            return multiplicador;
        }
        
        private static double obtenerMultiplicadorPorTipo(Tipo tipoAtacante, Tipo tipoDefensor) {
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
            // Considerar los tipos primarios y secundarios para ambos Pokémon
            double multiplicador = obtenerMultiplicadorDeDaño(
                atacante.getTipoPrimario(), 
                atacante.getTipoSecundario(), 
                defensor.getTipoPrimario(), 
                defensor.getTipoSecundario()
            );
            
            // Calcular el daño usando el multiplicador
            int daño = (int) (atacante.getAtaque() * multiplicador);
            
            // Verificar si el defensor tiene suficiente salud
            if(defensor.getSalud() > daño){
                defensor.setSalud(defensor.getSalud() - daño);
                System.out.println("Daño causado: " + daño);
                System.out.println("Salud restante de " + defensor.getNombre() + ": " + defensor.getSalud());
            } else {
                defensor.setSalud(0);
                System.out.println(defensor.getNombre() + " ha muerto.");
            }
        }

}
