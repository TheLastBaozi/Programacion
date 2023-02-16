package E07_Monopoly;

public class Terreno extends Propiedad{
    private int precioAlquiler;

    private String color;

    public Terreno(String nombre, int precio, int hipoteca, int precioAlquiler) {
        super(nombre, precio, hipoteca);
        this.precioAlquiler = super.getPrecio();
        this.color = super.getColorPropietario();
    }


    protected int getPrecioAlquiler() {
        return precioAlquiler;
    }

    protected void setPrecioAlquiler(int precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    protected String getColor() {
        return color;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    @Override
    public int getAlquiler(int modificacion) {
        if (modificacion>4){
            return super.getPrecio()*10;
        }else {
            return super.getPrecio();
        }
    }
}
