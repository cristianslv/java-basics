public class Carga {
    private boolean ligado;

    public Carga() {
        this.ligado = true;
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }

    public boolean estaLigado() {
        return this.ligado;
    }
}
