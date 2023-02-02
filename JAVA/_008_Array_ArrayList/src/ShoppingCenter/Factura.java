package ShoppingCenter;

import java.time.LocalDate;
import java.util.ArrayList;

public class Factura {
    private static ArrayList<Factura> facturaDB = new ArrayList<>();

    private int ID;
    private LocalDate facturaDate;
    private final int IVA = 21;
    private int client;
    private ArrayList<LineaProducto> lineaDeLaFactura = new ArrayList<>();
    private double importe = 0;



    Factura(int clientCode) {
        ID = facturaDB.size() + 1;
        facturaDate = LocalDate.now();
        client = clientCode;
    }

    private void addPrice(LineaProducto producto){
        importe+=producto.getTotalPrecioLinea();
    }

    private void removePrice(LineaProducto producto){
        importe-=producto.getTotalPrecioLinea();
    }
    public boolean addProducto(Articulo producto, int amount) {
        lineaDeLaFactura.add(new LineaProducto(producto, amount));
        addPrice(lineaDeLaFactura.get(lineaDeLaFactura.size()-1));
        return true;
    }

    public boolean removeProducto( int linea){

        if (linea >= lineaDeLaFactura.size() || linea < 0) return false;
        removePrice(lineaDeLaFactura.get(linea));
        lineaDeLaFactura.remove(linea);
        return true;
    }

    public void imprimirFactura() {

        System.out.println("""
                                
                                
                ▒█▀▀█ ░█▀▀█ ▀█▀ ▒█▄░▒█
                ▒█▄▄█ ▒█▄▄█ ▒█░ ▒█▒█▒█
                ▒█░░░ ▒█░▒█ ▄█▄ ▒█░░▀█
                                
                ---------------------------------------------------------------------------------------------
                                
                Pain Dolores y Sufrimiento con este ejercicio S.L.
                Calle TrabajosDeJava Nº Escondido en un Array
                XXXXX Sufrimiento, Interno
                                
                ---------------------------------------------------------------------------------------------
                """);
        System.out.println("Número de la factura : " + ID);
        System.out.println("Número del Cliente : " + client);
        System.out.println("Fecha de factura : " + facturaDate);
        System.out.println("\n---------------------------------------------------------------------------------------------\n");
        System.out.printf("Linea | %20S | %12S  | %12S | %13S  | %13S |\n", "Nombre", "Precio", "Cantidad", "Descuento", "Total Línea");
        for (int position = 0; position < lineaDeLaFactura.size(); position++) {
            System.out.printf("%5d ", position);
            System.out.println(lineaDeLaFactura.get(position).toString());
        }
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("Importe: " + importe);
        System.out.println("Importe con IVA: " + (importe + (importe * IVA) / 100));

    }
}
