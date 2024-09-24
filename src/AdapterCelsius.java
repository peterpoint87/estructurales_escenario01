public class AdapterCelsius implements DispositivoTemperatura {
    private DispositivoCelsius dispositivoCelsius;

    public AdapterCelsius(DispositivoCelsius dispositivoCelsius) {
        this.dispositivoCelsius = dispositivoCelsius;
    }

    @Override
    public double getTemperatura() {
        return dispositivoCelsius.getTemperaturaCelsius();  // No requiere conversión
    }
}