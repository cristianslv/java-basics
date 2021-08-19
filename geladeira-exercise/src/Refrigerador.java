public class Refrigerador {
    protected float temperaturaSelecionada;
    public Carga ventilador;
    protected SensorDeTemperatura sensor;

    public Refrigerador() {
        this.ventilador = new Carga();
        this.sensor = new SensorDeTemperatura();
    }

    public void selecionarTemperatura(float temperaturaRefrigerador) {
        this.temperaturaSelecionada = temperaturaRefrigerador;
    }

    public void controlarTemperatura() {
        if (sensor.getTemperaturaAtual() > this.temperaturaSelecionada) {
            ventilador.ligar();
        } else {
            ventilador.desligar();
        }
    }
}
