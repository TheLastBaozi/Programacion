package E02_Mascotas;

public class Loro extends Aves{
    private String origen;
    private boolean habla;

    public Loro(String nombre, int edad, String estado, String fechaNacimiento, String pico, boolean vuela, String origen, boolean habla) {
        super(nombre, edad, estado, fechaNacimiento, pico, vuela);
        this.origen = origen;
        this.habla = habla;
    }

    public void muestra(){

    }

    public void habla(){


    }

    public void volar(){

    }
}
