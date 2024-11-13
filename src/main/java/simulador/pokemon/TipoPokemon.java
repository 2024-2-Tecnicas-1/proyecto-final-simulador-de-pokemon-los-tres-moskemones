package simulador.pokemon;

public class TipoPokemon {
    private Tipo tipoPrimario;
    private Tipo tipoSecundario;

    public TipoPokemon(Tipo tipoPrimario, Tipo tipoSecundario) {
        this.tipoPrimario = tipoPrimario;
        this.tipoSecundario = tipoSecundario;
    }

    public TipoPokemon(Tipo tipoPrimario) {
        this(tipoPrimario, null);
    }

    public Tipo getTipoPrimario() {
        return tipoPrimario;
    }

    public void setTipoPrimario(Tipo tipoPrimario) {
        this.tipoPrimario = tipoPrimario;
    }

    public Tipo getTipoSecundario() {
        return tipoSecundario;
    }

    public void setTipoSecundario(Tipo tipoSecundario) {
        this.tipoSecundario = tipoSecundario;
    }
}
