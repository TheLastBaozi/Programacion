package E01_Astros;

import java.util.ArrayList;

public class Planetas extends Astros{

    private double distanciaAlSol;
    private boolean tieneSatelites;

    private ArrayList<Satelites> listaSatelites = new ArrayList<>();

    public Planetas(double radioEcuatorial, double rotacionSobreSuEJE, double masa, double temperaturaMedia,
                    double gravedad, double distanciaAlSol, boolean tieneSatelites, ArrayList<Satelites> listaSatelites) {
        super(radioEcuatorial, rotacionSobreSuEJE, masa, temperaturaMedia, gravedad);
        this.distanciaAlSol = distanciaAlSol;
        this.tieneSatelites = tieneSatelites;
        this.listaSatelites = listaSatelites;
    }
}
