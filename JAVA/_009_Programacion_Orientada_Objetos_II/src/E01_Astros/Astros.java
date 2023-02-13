package E01_Astros;

/**
 * <h2>Ejercicio 1 - ASTROS</h2>
 * <p>
 *  Define una jerarquía de clases que permita almacenar datos sobre los planetas y satélites (lunas)
 *  que forman parte del sistema solar.
 * <p>
 *  Algunos atributos que necesitaremos almacenar son:
 * <ul>
 *      <li>Masa del cuerpo</li>
 *      <li>Diámetro medio</li>
 *      <li>Período de rotación sobre su propio eje</li>
 *      <li>Período de traslación alrededor del cuerpo que orbitan</li>
 *      <li>Distancia media a ese cuerpo</li>
 *      <li>etc</li>
 * </ul>
 * <p>
 *  Define las clases necesarias conteniendo:
 *  <ul>
 *      <li>Constructores</li>
 *      <li>Métodos para recuperar y almacenas atributos</li>
 *      <li>Método para mostrar la información del objeto</li>
 *  </ul>
 * <p>
 *  Define un método, que dado un objeto del sistema solar (planeta o satélite),
 *  imprimatoda la información que se dispone sobre el mismo (además de su lista de satélites si lostuviera).
 * <p>
 * <p>
 *  Una posible solución sería crear una lista de objetos, insertar los planetas y satélites
 *  (directamente   mediante   código o solicitándolos por pantalla)
 *  y luego mostrar un pequeño menú que permita al usuario imprimir la información del astro que elija
 */
public class Astros {
    private double radioEcuatorial; //Km
    private double rotacionSobreSuEJE; //rad/s
    private double masa; //Kg

    private double temperaturaMedia; //ºC (Celsius?)

    private double gravedad; //m/s2 ( I am not physic... I don't know what variable to use ewe

    public Astros(double radioEcuatorial, double rotacionSobreSuEJE, double masa, double temperaturaMedia, double gravedad) {
        this.radioEcuatorial = radioEcuatorial;
        this.rotacionSobreSuEJE = rotacionSobreSuEJE;
        this.masa = masa;
        this.temperaturaMedia = temperaturaMedia;
        this.gravedad = gravedad;
    }


    public void mostrarRadioEcuatorial() {
        return radioEcuatorial;
    }

    public void mostrarRotacionSobreSuEJE() {
        return rotacionSobreSuEJE;
    }

    public void mostrarMasa() {
        return masa;
    }

    public void mostrarTemperaturaMedia() {
        System.out.println("Temperatura Media : ");
    }

    public void mostrarGravedad() {
        return gravedad;
    }

    @Override
    public String toString() {
        return "Astros{" +
                "radioEcuatorial=" + radioEcuatorial +
                ", rotacionSobreSuEJE=" + rotacionSobreSuEJE +
                ", masa=" + masa +
                ", temperaturaMedia=" + temperaturaMedia +
                ", gravedad=" + gravedad +
                '}';
    }
}