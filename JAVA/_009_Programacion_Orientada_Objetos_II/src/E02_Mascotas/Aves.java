package E02_Mascotas;

public abstract class Aves extends Mascotas{
    private String pico;

    private boolean vuela;

    public Aves(String nombre, int edad, String estado, String fechaNacimiento, String pico, boolean vuela) {
        super(nombre, edad, estado, fechaNacimiento);
        this.pico = pico;
        this.vuela = vuela;
    }

    public void volar(){

    }
}
