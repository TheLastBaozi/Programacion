package E07_Monopoly;

public abstract class Propiedad extends Casilla {
    private int precio;
    private int hipoteca;
    private Jugador propietario;

    public Propiedad(String nombre, int precio, int hipoteca) {
        super(nombre);
        this.precio = precio;
        this.hipoteca = hipoteca;
        this.propietario = null;
    }

    public String getColorPropietario() {
        return propietario.getColor();
    }

    public String getNombrePropietario() {
        return propietario.getNombre();
    }

    public abstract int getAlquiler(int modificacion);


    protected int getPrecio() {
        return precio;
    }

    protected void setPrecio(int precio) {
        this.precio = precio;
    }

    protected int getHipoteca() {
        return hipoteca;
    }

    protected void setHipoteca(int hipoteca) {
        this.hipoteca = hipoteca;
    }

    protected Jugador getPropietario() {
        return propietario;
    }

    protected void setPropietario(Jugador propietario) {
        this.propietario = propietario;
    }
}
