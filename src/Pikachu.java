public class Pikachu extends pokemon implements IElectrico{

    public Pikachu(int nroPokeDex, String nombre, double peso, String sexo, int temporada) {
        super(nroPokeDex, nombre, peso, sexo, temporada);
    }

    @Override
    public void atacarCargaParabola() {
        System.out.println("Ataque Carga Parabola");
        System.out.println("El Pokémon ataca a todo a lo que hay en su alrededor con daño de tipo eléctrico mediante la liberación de rayos");
    }

    @Override
    public void atacarImpacTrueno() {
        System.out.println("Ataque Impac Trueno");
        System.out.println("Descargas de electricidad para intentar atacar y paralizar al contrincante");
    }

    @Override
    public void placaje() {
        System.out.println("Ataque placaje de Pikachu");
    }

    @Override
    public void arañazo() {
        System.out.println("Ataque arañazo de Pikachu");
    }

    @Override
    public void mordisco() {
        System.out.println("Ataque mordisco de Pikachu");
    }

    public void mostrar() {
        System.out.println("nroPokeDex=" + nroPokeDex +
                "\nnombre=" + nombre +
                "\npeso=" + peso +
                "\nsexo=" + sexo +
                "\ntemporada=" + temporada);
    }
}
