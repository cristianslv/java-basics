public class Retangulo extends Quadrado{
    private int base;

    public Retangulo(int x, int y) {
        super(x, y);
        base = 50;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getBase() {
        return this.base;
    }

    public int calcularArea() {
        return base * super.getLado();
    }
}
