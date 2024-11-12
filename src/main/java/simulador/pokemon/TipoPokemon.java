package simulador.pokemon;

public class TipoPokemon {
        private String tipoPrimario;
        private String tipoSecundario;
    
        public TipoPokemon(String tipoPrimario, String tipoSecundario) {
            this.tipoPrimario = tipoPrimario;
            this.tipoSecundario = tipoSecundario;
        }

     
    public String getTipoPrimario() {
        return tipoPrimario;
    }

    public void setTipoPrimario(String tipoPrimario) {
        this.tipoPrimario = tipoPrimario;
    }

    public String getTipoSecundario() {
        return tipoSecundario;
    }

    public void setTipoSecundario(String tipoSecundario) {
        this.tiposecundario = tipoSecundario;
    }

}
