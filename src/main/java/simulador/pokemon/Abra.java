package simulador.pokemon;

public class Abra extends Pokemon {

    public Abra() {
        super(" Abra", Tipo.PSIQUICO, null, 25, 20, null, new Ataque[]{
    
}
    @Override

    public void atacar(Pokemon TargetPokemon) {
        System.out.println(this.getNombre() + " ataca a " + TargetPokemon.getNombre() + " con un ataque de tipo " + this.getTipoPrimario());
    }
}
