package E07_Monopoly;

public class Casilla {
    private final String nombre;
    private int codigo;
    private static int casilla = 0;
    protected Casilla(String nombre){
        this.nombre = nombre;
        this.codigo = casilla+1;
        casilla++;
    }
}
