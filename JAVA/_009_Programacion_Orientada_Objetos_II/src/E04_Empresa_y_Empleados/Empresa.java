package E04_Empresa_y_Empleados;

import java.util.ArrayList;

public class Empresa {
    private final String NOMBRE_EMPRESA;

    private final String CIF;

    private String telefono;

    private String direccion;

    ArrayList<Empleado> listaDeEmpleados;

    Empresa(String NOMBRE_EMPRESA, String CIF, String telefono, String direccion) {
        this.NOMBRE_EMPRESA = NOMBRE_EMPRESA;
        this.CIF = CIF;
        this.telefono = telefono;
        this.direccion = direccion;
        listaDeEmpleados = new ArrayList<>();
    }

    boolean addEmpleado(Empleado empleado) {
        if (empleado != null) {
            this.listaDeEmpleados.add(empleado);
            return true;
        }
        return false;
    }

    boolean removeEmpleado(Empleado empleado) {
        for (int position = 0; position < listaDeEmpleados.size(); position++) {
            if (listaDeEmpleados.get(position) == empleado) {
                listaDeEmpleados.remove(position);
                return true;
            }
        }
        return false;
    }

    void mostrarEmpleados() {

        System.out.println("LISTA DE EMPLEADOS DE " + NOMBRE_EMPRESA.toUpperCase() +
                "\n-------------------------------------------------\n");
        for (Empleado listaDeEmpleado : listaDeEmpleados) {
            listaDeEmpleado.imprimir();
        }
        System.out.println("-------------------------------------------------\n");
    }

    void mostrarInfoRelevantEmpleados() {
        System.out.println("LISTA DE EMPLEADOS DE " + NOMBRE_EMPRESA.toUpperCase() +
                "\n-------------------------------------------------\n");
        for (Empleado empleado : listaDeEmpleados) {
            System.out.println("Nombre empleado : " + empleado.getNOMBRE_EMPLEADO() +
                    " // DNI empleado : " + empleado.getDNI() +
                    " // Sueldo neto : " + empleado.calcularSueldoNeto());
        }
        System.out.println("-------------------------------------------------\n");
    }

    double totalBruto() {
        double totalBruto = 0;
        for (Empleado empleado : listaDeEmpleados) {
            totalBruto += empleado.getSueldoBruto();
        }
        return totalBruto;
    }

    double totalNeto(){
        double totalNeto = 0;
        for (Empleado empleado : listaDeEmpleados) {
            totalNeto += empleado.calcularSueldoNeto();
        }
        return totalNeto;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "NOMBRE_EMPRESA='" + NOMBRE_EMPRESA + '\'' +
                ", CIF='" + CIF + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", listaDeEmpleados=" + listaDeEmpleados +
                '}';
    }
}



