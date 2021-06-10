public class Retangulo extends Quadrado {
    private int altura;

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Retangulo(int x, int y, int base, int altura) {
        super(x,y,base);

        this.altura = altura;
    }

    public int calcularArea() {
        return base*altura;
    }
}
