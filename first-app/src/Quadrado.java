public class Quadrado {
    private int x;
    private int y;
    protected int base;

    public Quadrado(int x, int y, int base) {
        this.x = x;
        this.y = y;
        this.base = base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int calculaArea()
    {
        return this.x * this.y;
    }
}
