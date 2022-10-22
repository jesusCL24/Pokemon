public class Charmander extends pokemon implements IFuego{

    public Charmander(int nroPokeDex, String nombre, double peso, String sexo, int temporada) {
        super(nroPokeDex, nombre, peso, sexo, temporada);
    }

    @Override
    public void placaje() {
        System.out.println("Ataque placaje de Charmander");
    }

    @Override
    public void arañazo() {
        System.out.println("Ataque arañazo de Charmander");
    }

    @Override
    public void mordisco() {
        System.out.println("Ataque mordisco de Charmander");
    }

    @Override
    public void atacarPirotecnia() {
        System.out.println("Ataque Pirotecnia");
        System.out.println("Consiste en golpear al adversario con una intensa llamarada que afecta a todos los pokemons de alrededor");
    }

    @Override
    public void atacarNitroCarga() {
        System.out.println("Ataque Nitro Carga");
        System.out.println("Lanzamiento de llamas para golpear al contrincante a la vez que incrementa la velocidad de ataque del pokemon que realiza el movimiento");
    }
    public void mostrar() {
        System.out.println("nroPokeDex=" + nroPokeDex +
                "\nnombre=" + nombre +
                "\npeso=" + peso +
                "\nsexo=" + sexo +
                "\ntemporada=" + temporada);
    }
}
