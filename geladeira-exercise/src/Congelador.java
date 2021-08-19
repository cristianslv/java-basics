public class Congelador extends Refrigerador{
    public Carga compressor;

    public Congelador() {
        super();
        this.compressor = new Carga();
    }

    public void controlarTemperatura() {
        super.controlarTemperatura();

        if (ventilador.estaLigado()) {
            compressor.ligar();
        } else {
            compressor.desligar();
        }
    }
}
