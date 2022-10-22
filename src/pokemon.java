public abstract class pokemon {
    protected int nroPokeDex;
    protected String nombre;
    protected double peso;
    protected String sexo;
    protected int temporada;

    public pokemon(int nroPokeDex, String nombre, double peso, String sexo, int temporada) {
        this.nroPokeDex = nroPokeDex;
        this.nombre = nombre;
        this.peso = peso;
        this.sexo = sexo;
        this.temporada = temporada;
    }

    public abstract void placaje();
    public abstract void arañazo();
    public abstract void mordisco();
}
