package E02_Mascotas;

public class Gato extends Mascotas{
    private String color;
    private boolean peloLargo;

    public Gato(String nombre, int edad, String estado, String fechaNacimiento, String color, boolean peloLargo) {
        super(nombre, edad, estado, fechaNacimiento);
        this.color = color;
        this.peloLargo = peloLargo;
    }
}
