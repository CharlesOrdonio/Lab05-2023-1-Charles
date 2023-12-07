package ordenadores;

public class OrdenarPorInsercao implements Ordenador {

    @Override
    public int[] ordene(int[] array) {
        System.out.println("Teste");
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int atual = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > atual) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = atual;
        }

        return array;
    }
}
