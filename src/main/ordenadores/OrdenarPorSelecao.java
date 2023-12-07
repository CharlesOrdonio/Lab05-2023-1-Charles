package ordenadores;

public class OrdenarPorSelecao implements Ordenador{

    @Override
    public int[] ordene(int[] array) {
        int n = array.length;
        for(int i = 0; i < n - 1; i++){
            int menor = i;
            for(int j = i + 1; j < n; j++){
                if(array[j] < array[menor]){
                    menor = j;
                }
            }
            int atual = array[menor];
            array[menor] = array[i];
            array[i] = atual;
        }
        return array;
    }
    
}
