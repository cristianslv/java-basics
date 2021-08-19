public class Geladeira {
    private int nivelDaTemperatura;
    private Congelador congelador;
    private Refrigerador refrigerador;

    public Geladeira() {
        this.congelador = new Congelador();
        this.refrigerador = new Refrigerador();
    }

    public void selecionarTemperatura(int nivel) {
        this.nivelDaTemperatura = nivel;

        float temperaturaRefrigerador = 0f;
        float temperaturaCongelador = 0f;

        switch (nivel) {
            case 0 -> {
                temperaturaCongelador = -28f;
                temperaturaRefrigerador = 2.5f;
            }
            case 1 -> {
                temperaturaCongelador = -22.25f;
                temperaturaRefrigerador = 5f;
            }
            case 2 -> {
                temperaturaCongelador = -18f;
                temperaturaRefrigerador = 9.0f;
            }
        }

        this.refrigerador.selecionarTemperatura(temperaturaRefrigerador);
        this.congelador.selecionarTemperatura(temperaturaCongelador);
    }

    public void controlarTemperatura() {
        this.congelador.controlarTemperatura();
        this.refrigerador.controlarTemperatura();
    }
}
