package E02_Mascotas;

public abstract class Mascotas {
    private String nombre;
    private int edad;
    private String estado;

    private String fechaNacimiento;

    public Mascotas(String nombre, int edad, String estado, String fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
    }

    public void muestra(){

    }

    public void birthday(){

    }

    public void morir(){

    }

    public void hablar(){

    }

}
