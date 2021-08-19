import java.util.ArrayList;
import java.util.List;

public class AreaDeDesenho {
    private List<FiguraGeometrica> lista = new ArrayList<FiguraGeometrica>();

    public void add(FiguraGeometrica figura) {
        lista.add(figura);
    }

    public void delete(FiguraGeometrica figura) {
        lista.remove(figura);
    }

    public void atualizar() {
        for (FiguraGeometrica figuraGeometrica : lista) {
            System.out.println("A área é: " + figuraGeometrica.calcularArea());
        }
    }
}
