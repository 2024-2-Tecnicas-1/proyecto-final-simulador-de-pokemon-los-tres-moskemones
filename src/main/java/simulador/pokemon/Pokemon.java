package simulador.pokemon;


public abstract class Pokemon {
    private String nombre;
    private Tipo tipoPrimario;
    private Tipo tipoSecundario;
    private int salud;
    private int ataque;
    private String estado;
 

    public Pokemon(String nombre, Tipo tipoPrimario, Tipo tipoSecundario, int salud, int ataque, String estado) {
        this.nombre = nombre;
        this.tipoPrimario = tipoPrimario;
        this.tipoSecundario = tipoSecundario;
        this.salud = salud;
        this.ataque = ataque;
        this.estado = estado;
 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public abstract void atacar(Pokemon TargetPokemon);
    
    public void RecibirDano(int Dano){
        if (this.salud > Dano){
        this.salud -= Dano;
        }
        else{
            System.out.println(this.nombre+" ha muerto.");
        }
    }
    public void Entrenar(){
        System.out.println(this.nombre+" Ha sido entrenado, +3 salud y +1 ataque.");
        this.salud += 3;
        this.ataque += 1;
    }

}
