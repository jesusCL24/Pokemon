public class Bulbasaur extends pokemon implements IPlanta{

    public Bulbasaur(int nroPokeDex, String nombre, double peso, String sexo, int temporada) {
        super(nroPokeDex, nombre, peso, sexo, temporada);
    }

    @Override
    public void placaje() {
        System.out.println("Ataque placaje de Bulbasaur");
    }

    @Override
    public void arañazo() {
        System.out.println("Ataque arañazo de Bulbasaur");
    }

    @Override
    public void mordisco() {
        System.out.println("Ataque mordisco de Bulbasaur");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Ataque Latigo Cepa");
        System.out.println("Se golpea al enemigo mediante azotes y latigazos con finas ramas");
    }

    @Override
    public void atacarHojaAguda() {
        System.out.println("Ataque Hoja Aguda");
        System.out.println("El usuario maneja una hoja afilada como una espada para acuchillar al contrario");
    }

    public void mostrar() {
        System.out.println("nroPokeDex=" + nroPokeDex +
                "\nnombre=" + nombre +
                "\npeso=" + peso +
                "\nsexo=" + sexo +
                "\ntemporada=" + temporada);
    }
}
