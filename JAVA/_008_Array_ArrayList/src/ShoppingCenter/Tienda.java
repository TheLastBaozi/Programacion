package ShoppingCenter;

import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {

    private static ArrayList<Articulo> articulosStock = new ArrayList<>();

    private static ArrayList<Factura> facturasDB = new ArrayList<>();

    private static ArrayList<String[]> clientID = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        preSetArtículos();

        String option, subOption;
        do {
            option = menuShop();
            switch (option) {
                case "A":
                    articulosMostrar();
                    presionaParaContinuar();
                    break;
                case "B":
                    ventaCliente();
                    break;
                case "C":
                    compraProveedor();
                    break;
                case "D":
                    do {
                        subOption = menuArticulos();
                        switch (subOption) {
                            case "A":
                                articulosMostrar();
                                presionaParaContinuar();
                                break;
                            case "B":
                                addArticle();
                                break;
                            case "C":
                                removeArticle();
                                break;
                            case "D":
                                cambiarPrecioArticulo();
                                break;
                            default:
                                subOption = "X";
                        }
                    } while (!subOption.equals("X"));
                    break;
                case "E":
                    System.out.println("UNDER MAINTENACE");
                    do {
                        subOption = menuFactura();
                        switch (subOption) {
                            case "A":
                                break;
                            case "B":
                                break;
                            case "C":
                                break;
                            case "D":
                                break;
                            case "E":
                                break;
                            case "F":
                                break;
                            default:
                                subOption = "X";
                        }
                    } while (!subOption.equals("X"));
                    break;
                default:
                    option = "X";
            }
        } while (!option.equals("X"));
    }

    public static String menuShop() {
        System.out.println("""
                                
                █▀▀█ █▀▀█ ░▀░ █▀▀▄ 　 █▀▀ █░░█ █▀▀█ █▀▀█ 　 █▀▄▀█ █▀▀ █▀▀▄ █░░█
                █░░█ █▄▄█ ▀█▀ █░░█ 　 ▀▀█ █▀▀█ █░░█ █░░█ 　 █░▀░█ █▀▀ █░░█ █░░█
                █▀▀▀ ▀░░▀ ▀▀▀ ▀░░▀ 　 ▀▀▀ ▀░░▀ ▀▀▀▀ █▀▀▀ 　 ▀░░░▀ ▀▀▀ ▀░░▀ ░▀▀▀
                                
                ---------------------------
                                
                Opciones:
                                
                A/a --> Mostrar Articulos
                                
                B/b --> Venta a cliente
                C/c --> Compra a proveedor
                                
                D/d --> Gestionar Artículos
                E/e --> Facturas
                                
                Otra opción : Salir
                                
                --------------------------
                                
                Seleccione una opción:""");
        String toCheck = input.nextLine();

        return (toCheck.matches("[AaBbCcDdEe]") ? toCheck.toUpperCase() : "X");
    }

    public static String menuArticulos() {
        System.out.println("""
                                

                █▀▀█ █▀▀█ █▀▀█ █▀▀▄ █░░█ █▀▀ ▀▀█▀▀ █▀▀█ █▀▀
                █░░█ █▄▄▀ █░░█ █░░█ █░░█ █░░ ░░█░░ █░░█ ▀▀█
                █▀▀▀ ▀░▀▀ ▀▀▀▀ ▀▀▀░ ░▀▀▀ ▀▀▀ ░░▀░░ ▀▀▀▀ ▀▀▀
                                
                ---------------------------
                                
                Opciones:
                                
                A/a --> Mostrar lista Articulo
                B/b --> Añadir Articulo
                C/c --> Eliminar Articulo
                                
                D/d --> Cambiar precio Articulo
                                
                Otra opción : Volver
                                
                --------------------------
                                
                Seleccione una opción:""");
        String toCheck = input.nextLine();

        return (toCheck.matches("[AaBbCcDd]") ? toCheck : "x").toUpperCase();
    }

    public static String menuFactura() {
        System.out.println("""

                █▀▀ █▀▀█ █▀▀ ▀▀█▀▀ █░░█ █▀▀█ █▀▀█
                █▀▀ █▄▄█ █░░ ░░█░░ █░░█ █▄▄▀ █▄▄█
                ▀░░ ▀░░▀ ▀▀▀ ░░▀░░ ░▀▀▀ ▀░▀▀ ▀░░▀
                                
                ---------------------------
                                
                Opciones:
                                
                A/a --> Consultar todas la facturas
                B/b --> Nueva Factura
                C/c --> Añadir Linea
                D/d --> Eliminar linea
                E/e --> Eliminar factura
                F/f --> Dar de alta Cliente
                                
                Otra opción : Volver
                                
                --------------------------
                                
                Seleccione una opción:""");

        // A - Factura.imprimir
        // B - Factura = new Factura(int ClientID)
        // C - Factura.addProducto
        // D - Factura.removeProducto
        // E - Make the Method...
        // F - Database for client??????

        String toCheck = input.nextLine();

        return (toCheck.matches("[AaBbCcDdEeFf]") ? toCheck : "x").toUpperCase();
    }

    private static void articulosMostrar() {
        System.out.print("""
                                
                                  
                ▒█▀▄▀█ █▀▀ █▀▀▄ █░░█ 　 █▀▀█ █▀▀█ ▀▀█▀▀ ░▀░ █▀▀ █░░█ █░░ █▀▀█ █▀▀
                ▒█▒█▒█ █▀▀ █░░█ █░░█ 　 █▄▄█ █▄▄▀ ░░█░░ ▀█▀ █░░ █░░█ █░░ █░░█ ▀▀█
                ▒█░░▒█ ▀▀▀ ▀░░▀ ░▀▀▀ 　 ▀░░▀ ▀░▀▀ ░░▀░░ ▀▀▀ ▀▀▀ ░▀▀▀ ▀▀▀ ▀▀▀▀ ▀▀▀
                                
                ------------------------------------------------------------------------
                     ID | Nombre Articulo |  P.cliente | P.Vendedor |  IVA  | Cantidad
                ------------------------------------------------------------------------
                """);
        for (int position = 0; position < articulosStock.size(); position++) {
            System.out.println(articulosStock.get(position));
        }
        System.out.println("\n\n");
    }

    private static void ventaCliente() {
        articulosMostrar();
        String toCheck;
        boolean keepIn;
        int cantidad;
        do {
            System.out.println("Seleccione un producto de la lista (ID):");
            toCheck = input.nextLine();
            keepIn = (!isAnInteger(toCheck) || Integer.parseInt(toCheck) > articulosStock.size() || Integer.parseInt(toCheck) <= 0);
            if (keepIn) System.out.println("Número fuera de rango o no número... repita acción");
        } while (keepIn);
        int articuloIndex = Integer.parseInt(toCheck);
        do {
            do {
                System.out.println("Cantidad de " + articulosStock.get(articuloIndex - 1).getNombre() + " que quiera comprar :");
                toCheck = input.nextLine();
                keepIn = (!isAnInteger(toCheck));
                if (keepIn) System.out.println("No número... repita acción");
            } while (keepIn);
            cantidad = Integer.parseInt(toCheck);
        } while (!Articulo.vender(articulosStock.get(articuloIndex - 1), cantidad));
// FIXME: MAKE FACTURA METHOD FIRST... PROBABLY USE THE NEW FACTURA... PUT ALL THE ELEMENT IN THE LINE
//        ArrayList<Integer> listaDeCompra = new ArrayList<Integer>();
//        articulosMostrar();
//        String toCheck;
//        boolean keepIn;
//        int cantidad;
//            System.out.println("Eres ya cliente? Y");
//            toCheck = input.nextLine().toUpperCase();
//            if (toCheck.matches("Y(ES)?")){
//                System.out.println("Dime el ID de cliente :");
//                toCheck = input.nextLine();
//                // Check ID existence
//            } else {
//                System.out.println("Quieres ser cliente? ");
//                toCheck = input.nextLine().toUpperCase();
//                if (toCheck.matches("Y(ES)?")){
//                    System.out.println("Dime tu nombre :");
//                    toCheck = input.nextLine();
//                } else {
//                    System.out.println("Quieres ser cliente? ");
//                    toCheck = input.nextLine().toUpperCase();
//                }
//            }
//        do {
//            do {
//                System.out.println("Seleccione un producto de la lista (ID):");
//                toCheck = input.nextLine();
//                keepIn = (!isAnInteger(toCheck) || Integer.parseInt(toCheck) > articulosStock.size() || Integer.parseInt(toCheck) <= 0);
//                if (keepIn) System.out.println("Número fuera de rango o no número... repita acción");
//            } while (keepIn);
//            int articuloIndex = Integer.parseInt(toCheck);
//            do {
//                do {
//                    System.out.println("Cantidad de " + articulosStock.get(articuloIndex - 1).getNombre() + " que quiera comprar :");
//                    toCheck = input.nextLine();
//                    keepIn = (!isAnInteger(toCheck));
//                    if (keepIn) System.out.println("No número... repita acción");
//                } while (keepIn);
//                cantidad = Integer.parseInt(toCheck);
//            } while (!Articulo.vender(articulosStock.get(articuloIndex - 1), cantidad));
//            listaDeCompra.add(articulosStock.get(articuloIndex -1).getID());
//            System.out.println("Lista actual: ");
//            for (int position = 0; position < listaDeCompra.size(); position++) {
//                System.out.println();
//            }
//            System.out.println("¿Quieres seguir comprando? Y");
//            toCheck = input.nextLine().toUpperCase();
//            keepIn = toCheck.matches("Y(ES)?");
//        }while (keepIn);
//
    }

    private static void compraProveedor() {
        articulosMostrar();
        String toCheck;
        boolean keepIn;
        int cantidad;
        do {
            System.out.println("Seleccione un producto de la lista (ID):");
            toCheck = input.nextLine();
            keepIn = (!isAnInteger(toCheck) || Integer.parseInt(toCheck) > articulosStock.size() || Integer.parseInt(toCheck) <= 0);
            if (keepIn) System.out.println("Número fuera de rango o no número... repita acción");
        } while (keepIn);
        int articuloIndex = Integer.parseInt(toCheck);
        do {
            do {
                System.out.println("Cantidad de " + articulosStock.get(articuloIndex - 1).getNombre() + " que quiera comprar al Proveedor :");
                toCheck = input.nextLine();
                keepIn = (!isAnInteger(toCheck));
                if (keepIn) System.out.println("No número... repita acción");
            } while (keepIn);
            cantidad = Integer.parseInt(toCheck);
        } while (!Articulo.comprar(articulosStock.get(articuloIndex - 1), cantidad));
    }


    // Menu ARTICULOS METHOD

    private static void addArticle() {
        boolean isOkay;
        String toCheck;
        double clientPrice, proveedorPrice;
        System.out.println("Nombre para el Articulo :");
        String name = input.nextLine();
        do {
            do {
                System.out.println("Dime el precio Unitario de compra al Proveedor de : " + name);
                toCheck = input.nextLine();
                if (!toCheck.matches("\\d+([.]\\d+)?"))
                    System.out.println("No es un número válido (Mayor a 0 ) o demasiado caro?");
            } while (!toCheck.matches("\\d+([.]\\d+)?"));
            proveedorPrice = Double.parseDouble(toCheck);
            do {
                System.out.println("Dime el precio Unitario de venta a los clientes de " + name + "... tiene que ser mayor a +" + proveedorPrice);
                toCheck = input.nextLine();
                if (!toCheck.matches("\\d+([.]\\d+)?"))
                    System.out.println("No es un número válido (Mayor a 0 ) o demasiado caro?");
            } while (!toCheck.matches("\\d+([.]\\d+)?"));
            clientPrice = Double.parseDouble(toCheck);
            isOkay = (proveedorPrice - clientPrice) < 0;
            if (!isOkay)
                System.out.println("El precio del proveedor tiene que ser mayor a 1 ... actual precio : " + (proveedorPrice - clientPrice));
        } while (!isOkay);
        do {
            System.out.println("Dime la cantidad disponibles de : " + name);
            toCheck = input.nextLine();
            if (toCheck.matches("\\d+")) {
                if (toCheck.length() >= 10) {
                    if (toCheck.compareTo("2147483647") <= 0) {
                        if (Integer.parseInt(toCheck) > 0) {
                            isOkay = true;
                        } else {
                            System.out.println("No se ha podido realizar la acción... repita");
                            isOkay = false;
                        }
                    } else {
                        System.out.println("Demasiada cantidad... avise al administrador de cambiar la cantidad MAXIMA permitida");
                    }
                } else {
                    if (Integer.parseInt(toCheck) > 0) {
                        isOkay = true;
                    } else {
                        System.out.println("No se ha podido realizar la acción... repita");
                        isOkay = false;
                    }
                }
            } else {
                System.out.println("Repita acción... no un número");
                isOkay = false;
            }
        } while (!isOkay);
        articulosStock.add(Articulo.crearArticulo(name, clientPrice, proveedorPrice, Integer.parseInt(toCheck)));
    }

    private static void removeArticle() {
        articulosMostrar();
        String toCheck;
        boolean keepIn;
        do {
            System.out.println("Seleccione un producto de la lista (ID):");
            toCheck = input.nextLine();
            keepIn = (!isAnInteger(toCheck) || Integer.parseInt(toCheck) > articulosStock.size() || Integer.parseInt(toCheck) <= 0);
            if (keepIn) System.out.println("Número fuera de rango o no número... repita acción");
        } while (keepIn);
        articulosStock.remove(Integer.parseInt(toCheck) - 1);
        System.out.println("Acción realizada correctamente...");
        presionaParaContinuar();
    }

    private static void cambiarPrecioArticulo() {
        articulosMostrar();
        String toCheck;
        boolean keepIn;
        do {
            System.out.println("Seleccione un producto de la lista (ID):");
            toCheck = input.nextLine();
            keepIn = (!isAnInteger(toCheck) || Integer.parseInt(toCheck) > articulosStock.size() || Integer.parseInt(toCheck) <= 0);
            if (keepIn) System.out.println("Número fuera de rango o no número... repita acción");
        } while (keepIn);
        int articuloIndex = Integer.parseInt(toCheck);
        double clientPrice;
        do {
            do {
                System.out.println("Dime el precio Unitario de venta a los clientes de " + articulosStock.get(articuloIndex).getNombre() + "... tiene que ser mayor a +" + articulosStock.get(articuloIndex).getPrecioCompraProveedor());
                toCheck = input.nextLine();
                if (!toCheck.matches("\\d+([.]\\d+)?"))
                    System.out.println("No es un número válido (Mayor a 0 ) o demasiado caro?");
            } while (!toCheck.matches("\\d+([.]\\d+)?"));
            clientPrice = Double.parseDouble(toCheck);
            keepIn = (articulosStock.get(articuloIndex).getPrecioCompraProveedor() - clientPrice) < 0;
            if (!keepIn)
                System.out.println("El precio del proveedor tiene que ser mayor a 1 ... actual precio : " + (articulosStock.get(articuloIndex).getPrecioCompraProveedor() - clientPrice));
        } while (!keepIn);
        articulosStock.get(articuloIndex).setPrecioVentaCliente(Double.parseDouble(toCheck));
    }

    private static void preSetArtículos() {

        Articulo manzanasRoja = Articulo.crearArticulo("Manzanas Rojas", 0.54, 0.40, 100);
        Articulo manzanasVerde = Articulo.crearArticulo("Manzanas Verdes", 0.50, 0.40, 100);
        Articulo zanahorias = Articulo.crearArticulo("Zanahorias", 0.60, 0.43, 200);
        Articulo sandia = Articulo.crearArticulo("Sandia", 1, 0.63, 10);

        articulosStock.add(zanahorias); // 3
        articulosStock.add(manzanasRoja); // 1
        articulosStock.add(sandia); // 4
        articulosStock.add(manzanasVerde); // 2

        // Check by ID articulo
    }

    private static void presionaParaContinuar() {
        System.out.println("Pulsa algún botón para continuar...");
        input.nextLine();
    }

    private static boolean isAnInteger(String numbaToCheck) {
        if (numbaToCheck.matches("\\d+")) {
            if (numbaToCheck.length() >= 10) {
                return numbaToCheck.compareTo("2147483647") <= 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }




    // Factura : Not make much sense... but may the client ca be want to do it...
    private static void mostrarFactura(){
        // Call from Factura Method... made correctly the DataBase for Factura
    }
    private static Factura crearFactura(int clienteID){
        return new Factura(clienteID);
    }


//    private static int createClient(){
//        clientID.add(clientID.size()+1);
//        return clientID.size();
//    }



}
