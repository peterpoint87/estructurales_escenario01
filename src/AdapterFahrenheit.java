public class AdapterFahrenheit implements DispositivoTemperatura {
    private DispositivoFahrenheit dispositivoFahrenheit;

    public AdapterFahrenheit(DispositivoFahrenheit dispositivoFahrenheit) {
        this.dispositivoFahrenheit = dispositivoFahrenheit;
    }

    @Override
    public double getTemperatura() {
        // Convertir de Fahrenheit a Celsius
        return (dispositivoFahrenheit.getTemperaturaFahrenheit() - 32) * 5 / 9;
    }
}