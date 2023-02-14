package E01_Astros;

public class Satelites extends Astros {
    private double distanciaAlPlaneta;

    private double orbitaPlanetaria;

    private final Planetas planetaPertenece;

    public Satelites(String nombre, double radioEcuatorial, double rotacionSobreSuEJE, double masa, double temperaturaMedia, double gravedad, double distanciaAlPlaneta, double orbitaPlanetaria, Planetas planetaPertenece) {
        super(nombre, radioEcuatorial, rotacionSobreSuEJE, masa, temperaturaMedia, gravedad);
        this.distanciaAlPlaneta = distanciaAlPlaneta;
        this.orbitaPlanetaria = orbitaPlanetaria;
        this.planetaPertenece = planetaPertenece;
    }

    public double getDistanciaAlPlaneta() {
        return distanciaAlPlaneta;
    }

    public void setDistanciaAlPlaneta(double distanciaAlPlaneta) {
        this.distanciaAlPlaneta = distanciaAlPlaneta;
    }

    public double getOrbitaPlanetaria() {
        return orbitaPlanetaria;
    }

    public void setOrbitaPlanetaria(double orbitaPlanetaria) {
        this.orbitaPlanetaria = orbitaPlanetaria;
    }

    public Planetas getPlanetaPertenece() {
        return planetaPertenece;
    }

    @Override
    public String mostrar() {
        String toReturn = String.format("Satelite { %s ,", super.mostrar().substring(8, super.mostrar().length() - 2));
        toReturn += ", distancia al planeta = " + distanciaAlPlaneta + ", orbitaPlanetaria =" + orbitaPlanetaria + ", Pertenece al planeta = " + planetaPertenece;
        return toReturn;
    }
}
