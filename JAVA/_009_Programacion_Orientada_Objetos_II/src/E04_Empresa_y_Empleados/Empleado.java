package E04_Empresa_y_Empleados;

import java.util.Scanner;

public class Empleado {

    private final String NOMBRE_EMPLEADO;
    private final String DNI;
    private double sueldoBruto;
    private int edad;
    private String phoneNumber;
    private String direccion;

    Empleado(String nombre, String dni, double sueldoBruto) {
        this.NOMBRE_EMPLEADO = nombre;
        this.DNI = dni;
        this.sueldoBruto = sueldoBruto;
    }

    static Empleado nuevoEmpleado() {
        Scanner input = new Scanner(System.in);
        System.out.println("CONTRATACIÓN DE EMPLEADO");
        System.out.print("Dime el nombre del Empleado: ");
        String nombre = input.nextLine();

        String toCheck;
        do {
            // System.out.println("DNI de ejemplo : 12345678Z");
            System.out.println("Dime el DNI de " + nombre + " : ");
            toCheck = input.nextLine();
        } while (!checkDNI(toCheck));
        String dni = toCheck;

        do {
            System.out.println("Dime el saldo bruto de " + nombre);
            toCheck = input.nextLine();
        } while (!toCheck.matches("\\d+([.]\\d)?") || Double.parseDouble(toCheck) <= 0);

        Empleado empleadoTemporal = new Empleado(nombre, dni, Double.parseDouble(toCheck));


        if (keepGoing()) {
            do {
                System.out.println("Dime la edad de " + nombre);
                toCheck = input.nextLine();
            } while (!isAnInteger(toCheck) || Integer.parseInt(toCheck) < 16);
            empleadoTemporal.setEdad(Integer.parseInt(toCheck));
        } else
            return empleadoTemporal;

        if (keepGoing()) {
            do {
                System.out.println("Dime el número de teléfono de " + nombre);
                toCheck = input.nextLine();
            } while (!toCheck.matches("\\d+"));
            empleadoTemporal.setPhoneNumber(toCheck);
        } else
            return empleadoTemporal;

        if (keepGoing()) {
            System.out.println("Dime la dirección de " + nombre);
            empleadoTemporal.setDireccion(input.nextLine());
        }
        return empleadoTemporal;
    }

    String getNOMBRE_EMPLEADO() {
        return NOMBRE_EMPLEADO;
    }

    String getDNI() {
        return DNI;
    }

    double getSueldoBruto() {
        return sueldoBruto;
    }

    void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    int getEdad() {
        return edad;
    }

    void setEdad(int edad) {
        this.edad = edad;
    }

    String getPhoneNumber() {
        return phoneNumber;
    }

    void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    double calcularSueldoNeto() {

        double anualPayment = this.getSueldoBruto() * 12;

        if (anualPayment < 12000){
            return this.sueldoBruto*0.80;
        } else if (anualPayment <=25000) {
            return this.sueldoBruto*0.70;
        }else {
            return this.sueldoBruto*0.60;
        }
    }

    void imprimir() {
        System.out.println("CONTRARO DE EMPLEADO" +
                "\nNombre: " + NOMBRE_EMPLEADO +
                "\nDNI: " + DNI +
                "\nSueldo Bruto: " + sueldoBruto);
    }

    private static boolean checkDNI(String possible) {

        possible = possible.toUpperCase();

        if (!possible.matches("\\d{8}[TRWAGMYFPDXBNJZSQVHLCKE]")) return false;

        final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";

        return possible.charAt(8) == LETRAS.charAt(Integer.parseInt(possible.substring(0, 8)) / 23);

    }

    private static boolean keepGoing() {
        Scanner input = new Scanner(System.in);
        System.out.println("""
                Quieres seguir añadiendo datos?
                Y/y para seguir
                Cualquier otra cosa --> Abortar""");
        return input.nextLine().toUpperCase().matches("Y(ES)?");
    }

    private static boolean isAnInteger(String numbaToCheck) {

        if (numbaToCheck.matches("\\d+")) {
            numbaToCheck = deleteInitialZERO(numbaToCheck);
            if (numbaToCheck.length() >= 10) {
                return numbaToCheck.compareTo("2147483647") <= 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    private static String deleteInitialZERO(String numbaToCheck) {
        for (int position = 0; position < numbaToCheck.length(); position++) {
            if (numbaToCheck.charAt(position) == '0') {
                numbaToCheck = numbaToCheck.substring(1);
                position--;
            } else {
                break;
            }
        }
        return numbaToCheck;
    }

}























