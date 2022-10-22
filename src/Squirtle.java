public class Squirtle extends pokemon implements IAgua{

    public Squirtle(int nroPokeDex, String nombre, double peso, String sexo, int temporada) {
        super(nroPokeDex, nombre, peso, sexo, temporada);
    }

    @Override
    public void placaje() {
        System.out.println("Ataque placaje de Squirtle");
    }

    @Override
    public void arañazo() {
        System.out.println("Ataque arañazo de Squirtle");
    }

    @Override
    public void mordisco() {
        System.out.println("Ataque mordisco de Squirtle");
    }

    @Override
    public void atacarHidroPulso() {
        System.out.println("Ataque Hidro Pulpo");
        System.out.println("Potente y abundante chorro de agua para desconcertar al oponente");
    }

    @Override
    public void atacarRayoBurbuja() {
        System.out.println("Ataque Rayo Burbuja");
        System.out.println("Chorro de burbujas enérgicamente lanzado contra el rival");
    }

    public void mostrar() {
        System.out.println("nroPokeDex=" + nroPokeDex +
                "\nnombre=" + nombre +
                "\npeso=" + peso +
                "\nsexo=" + sexo +
                "\ntemporada=" + temporada);
    }
}
