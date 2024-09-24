import java.util.ArrayList;
import java.util.List;

public class Bloque {
    private String nombre;
    private List<DispositivoTemperatura> dispositivos;

    public Bloque(String nombre) {
        this.nombre = nombre;
        this.dispositivos = new ArrayList<>();
    }

    public void agregarDispositivo(DispositivoTemperatura dispositivo) {
        dispositivos.add(dispositivo);
    }

    public void mostrarTemperaturas() {
        System.out.println("Temperaturas en el bloque: " + nombre);
        for (DispositivoTemperatura dispositivo : dispositivos) {
            System.out.println(" - Temperatura: " + dispositivo.getTemperatura() + "°C");
        }
    }
}