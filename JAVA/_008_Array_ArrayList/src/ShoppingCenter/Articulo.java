package ShoppingCenter;

/**
 * Clase ‘Articulo’•
 * Un artículo tiene un identificador (número entero),
 * un nombre,
 * un precio deventa   a   cliente,
 * un   precio   de   compra   a   proveedor,
 * un   IVA   (%)   y
 * un   stock(representa la cantidad de ese artículo disponible en tienda).
 * <p>
 * El nombre y elidentificador de un artículo no pueden cambiar.
 * El identificador ha de establecese automáticamente y ser único,
 * podemos llevar un contador de los objetos creados y así el identificador será único.
 * El IVA es el mismo para todos los artículos (un 21%).
 * Tanto el precio de compra como el precio de venta han de ser valores superiores a cero.
 * El precio de venta ha de ser superior al precio de compra.
 * El stock ha de sersuperior o igual a cero.
 * <p>
 * • Deberá tener un único constructor así como todos los getters y setters que sea posible.
 * • Deberá tener al menos dos métodos públicos, uno para vender (a cliente) y otro para comprar (a proveedor).
 * <p>
 * En ambos casos deberá pasarse un único argumento con la cantidad de unidades a vender o comprar, y
 * se devolverá un valor indicandosi fue posible realizar la operación o no. Si la operación se puede realizar,
 * se deberá modificar el stock del artículo.
 * <p>
 * • Deberá tener un método público que devuelva una cadena de texto de una sola línea
 * con la información sobre dicho artículo: id, nombre, precios, IVA y stock.
 * <p>
 * •  En los casos en los que sea necesario, los métodos públicos mostrarán
 * un mensaje por System.err si no es posible realizar la operación solicitada.
 * <p>
 * • Pueden implementarse otros métodos si se considera necesario.
 * <p>
 * • Es obligatorio que esta clase no realice ningún tipo de entrada por teclado nisalida por pantalla (Excepto los mencionados mensajes de error).
 */
public class Articulo {
    private final int ID;
    private final String nombre;
    private double precioVentaCliente;
    private double precioCompraProveedor;
    private final int iva = 21;
    private int cantidad;

    private static int cantidadArticulo = 0;

    private Articulo(int ID, String nombre, double precioVentaCliente, double precioCompraProveedor, int cantidad) {
        this.ID = ID;
        this.nombre = nombre;
        this.precioVentaCliente = precioVentaCliente;
        this.precioCompraProveedor = precioCompraProveedor;
        this.cantidad = cantidad;
    }


    public static Articulo crearArticulo(String nombre, double precioVentaCliente, double precioCompraProveedor, int cantidad) {
        if (cantidad > 0 && precioVentaCliente > 0 && precioCompraProveedor > 0) {
            if (precioVentaCliente > precioCompraProveedor) {
                cantidadArticulo++;
                return new Articulo(cantidadArticulo, nombre, precioVentaCliente, precioCompraProveedor, cantidad);
            } else {
                System.err.println("ADVERTENCIA!!: Precio venta inferior al de compra... no se ha podido hacer la acción");
                return null;
            }
        } else {
            System.err.println("ADVERTENCIA!!: Cantidad o precios de productos inferiores a 1... no se ha podido hacer la acción");
            return null;
        }
    }

    public static boolean comprar(Articulo producto, int cantidad) {
        if (cantidad > 0) {
            int extraCheck = producto.cantidad +cantidad;
            if (extraCheck > 0){
                producto.setCantidad(producto.cantidad + cantidad);
                return true;
            }else {
                System.err.println("ADVERTENCIA: Avise al administrador del sistema que aumente el tamaño de la capacidad de almacenamiento");
                return false;
            }
        } else {
            System.err.println("ADVERTENCIA: Cantidad insuficiente a comprar... repita acción");
            return false;
        }
    }

    public static boolean vender(Articulo producto, int cantidad) {
        if (cantidad > 0) {
            if (producto.cantidad >= cantidad) {
                producto.setCantidad(producto.cantidad - cantidad);
                return true;
            } else {
                System.err.println("ADVERTENCIA: Cantidad insuficiente para " + producto.nombre + " : " + (cantidad - producto.cantidad) + " faltantes... no se ha podido realizar la acción");
                return false;
            }
        } else {
            System.err.println("ADVERTENCIA: Cantidad insuficiente a vender... repita acción");
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format(" %6d | %15s | %9.2f€ | %9.2f€ | %5d | %10d ", this.ID, this.nombre, this.precioVentaCliente, this.precioCompraProveedor, this.iva, this.cantidad);
    }

    public int getID() {
        return ID;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioVentaCliente() {
        return precioVentaCliente;
    }

    public boolean setPrecioVentaCliente(double precioVentaCliente) {
        if (precioVentaCliente < this.precioCompraProveedor) return false;
        this.precioVentaCliente = precioVentaCliente;
        return true;
    }

    public double getPrecioCompraProveedor() {
        return precioCompraProveedor;
    }

    public boolean setPrecioCompraProveedor(double precioCompraProveedor) {
        if (precioCompraProveedor > this.precioVentaCliente) return false;
        this.precioCompraProveedor = precioCompraProveedor;
        return true;
    }

    public int getIva() {
        return iva;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        // Hay un problema que hay que resolver
        this.cantidad = cantidad;
    }

    public static int getCantidadArticulo() {
        return cantidadArticulo;
    }

}

