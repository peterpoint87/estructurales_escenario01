public class Main {
    public static void main(String[] args) {
        // Crear dispositivos
        DispositivoCelsius dispositivoCelsius = new DispositivoCelsius(25.0);
        DispositivoTemperatura adaptadorCelsius = new AdapterCelsius(dispositivoCelsius);

        DispositivoFahrenheit dispositivoFahrenheit = new DispositivoFahrenheit(77.0);
        DispositivoTemperatura adaptadorFahrenheit = new AdapterFahrenheit(dispositivoFahrenheit);

        // Crear bloques
        Bloque bloqueA = new Bloque("Bloque A");
        bloqueA.agregarDispositivo(adaptadorCelsius);
        bloqueA.agregarDispositivo(adaptadorFahrenheit);

        // Mostrar temperaturas por bloque
        bloqueA.mostrarTemperaturas();
    }
}