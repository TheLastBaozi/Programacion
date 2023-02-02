package ShoppingCenter;

public class LineaProducto {

    private String nombre;
    private double precio;
    private int amount;
    private int descuento;
    private double totalPrecioLinea;

    LineaProducto(Articulo producto, int cantidad) {

        nombre = producto.getNombre();
        precio = producto.getPrecioVentaCliente();
        amount = cantidad;
        descuento = amount > 10 ? 5 : 0;
        totalPrecioLinea = (precio * amount) * (1 - (descuento / 100.0));
    }

    @Override
    public String toString() {
        return String.format("| %20S | %12.2f€ | %12d | %13d%% | %12.2f€ |", nombre, precio, amount, descuento, totalPrecioLinea);
    }

    public double getTotalPrecioLinea() {
        return totalPrecioLinea;
    }
}

