package E07_Monopoly;

enum colores{ROJO, AMARILLO, VERDE, AZUL}
public class Jugador {
    private String nombre;
    private String color;

    public Jugador(String nombre, colores color){
        this.nombre = nombre;
        switch (color){
            case ROJO -> this.color="\u001B[31m";
            case AMARILLO -> this.color="\u001B[33m";
            case VERDE -> this.color="\u001B[32m";
            case AZUL -> this.color="\u001B[34m";
        }
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

}
