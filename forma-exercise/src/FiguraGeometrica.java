public abstract class FiguraGeometrica {
    private int X;
    private int Y;
    private int corDeFundo;
    private int corDeBorda;

    public FiguraGeometrica(int x, int y) {
        X = x;
        Y = y;
        corDeFundo = 0x0000FF;
        corDeBorda = 0x0000FF;
    }

    public abstract int calcularArea();
}
