package E04_Empresa_y_Empleados;

public class ShowTime {
    public static void main(String[] args) {
        Empresa susanaOrias  = new Empresa("Susana Oria S.L.", "B12345678","960130457","Avenida de las Zanahorias 4");
        Empresa rival = new Empresa("No Sana Horia S.L.", "A12345679","910601655", "Avenida de las Zanahorias 6" );

        System.out.println(susanaOrias);
        System.out.println(rival);

        Empleado laExtraterrestre = new Empleado("Marcia Ana","12345678Z",123.67);
        Empleado abogada = new Empleado("Dolores Delano","13213322Y", 345.21);

        Empleado random = Empleado.nuevoEmpleado();

        susanaOrias.addEmpleado(laExtraterrestre);
        susanaOrias.addEmpleado(random);

        rival.addEmpleado(abogada);

        susanaOrias.mostrarEmpleados();
        susanaOrias.mostrarInfoRelevantEmpleados();
        susanaOrias.totalBruto();

    }
}
