package E07_Monopoly;

public class Estaciones extends Propiedad{

    private String nombre;
    public Estaciones(String nombre, int precio, int hipoteca) {
        super(nombre, precio, hipoteca);
    }

    @Override
    public int getAlquiler(int modificacion) {
        return super.getPrecio()/modificacion;
    }
}
