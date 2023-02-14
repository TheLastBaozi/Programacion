package E02_Mascotas;

public class Perro extends Mascotas{

    private String raza;
    private int pulgas;

    public Perro(String nombre, int edad, String estado, String fechaNacimiento, String raza, int pulgas) {
        super(nombre, edad, estado, fechaNacimiento);
        this.raza = raza;
        this.pulgas = pulgas;
    }
}
