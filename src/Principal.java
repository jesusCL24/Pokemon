public class Principal {
    public static void main(String[] args) {
        Pikachu p1=new Pikachu(25,"pikachu",6,"indefino",1);
        p1.mostrar();
        p1.atacarCargaParabola();
        p1.mordisco();
        System.out.println("-----------------------------------------");
        Bulbasaur b1=new Bulbasaur(1,"bulbasaur",6.90,"macho",1);
        b1.mostrar();
        b1.arañazo();
        b1.atacarLatigoCepa();
        System.out.println("--------------------------------------------");
        Charmander ch1=new Charmander(4,"charmander",8.50,"macho",1);
        ch1.mostrar();
        ch1.placaje();
        ch1.atacarPirotecnia();
        System.out.println("-------------------------------------------");
        Squirtle s1=new Squirtle(7,"squitle",9,"macho",1);
        s1.mostrar();
        s1.mordisco();
        s1.atacarRayoBurbuja();
        System.out.println("---------------------------------------------");
        Blitzle bl1=new Blitzle(522,"blitzle",29.80,"indefinido",5);
        bl1.mostrar();
        bl1.atacarImpacTrueno();
        bl1.arañazo();
    }
}
