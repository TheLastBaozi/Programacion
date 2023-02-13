package E01_Astros;

public class Satelites extends Astros{
    private double distanciaAlPlaneta;

    private double orbitaPlanetaria;

    private final Planetas planetaPertenece;

    public Satelites(double radioEcuatorial, double rotacionSobreSuEJE, double masa, double temperaturaMedia, double gravedad, double distanciaAlPlaneta, double orbitaPlanetaria, Planetas planetaPertenece) {
        super(radioEcuatorial, rotacionSobreSuEJE, masa, temperaturaMedia, gravedad);
        this.distanciaAlPlaneta = distanciaAlPlaneta;
        this.orbitaPlanetaria = orbitaPlanetaria;
        this.planetaPertenece = planetaPertenece;
    }
}
