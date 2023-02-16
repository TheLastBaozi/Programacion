package E07_Monopoly;

import java.util.ArrayList;

public class Tablero {

    private ArrayList<Casilla> tablero = new ArrayList<>();

    public Tablero(){
        tablero.add(new Terreno("Avenida Feriado", 100, 200, 50));
        tablero.add(new Terreno("Avenida Feriado 2", 100, 200, 50));
        tablero.add(new Estaciones("Estación Norte", 100, 200));
        tablero.add(new Terreno("Avenida Feriado", 100, 200, 50));

        tablero.add(new Estaciones("Estación Sur", 100, 200));
    }

}
