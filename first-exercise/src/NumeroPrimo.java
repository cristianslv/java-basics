import java.util.ArrayList;

public class NumeroPrimo {
    public ArrayList<Integer> getPrimosEntre(int inicio, int fim) {
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = inicio; i <= fim; i++) {
            if (isPrimo(i)) {
                lista.add(i);
            }
        }

        return lista;
    }

    private Boolean isPrimo(int numero) {
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
