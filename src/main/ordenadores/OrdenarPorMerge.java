package ordenadores;
public class OrdenarPorMerge implements Ordenador{

    @Override
    public int[] ordene(int[] array) {
        return array;
    }

    public int[] merge(int[] array, int[] array2) {
        int x = array.length + array2.length;
        int[] marray = new int[x];
        int y = 0;
        int z = 0;
        for(int i = 0; i < x; i++){
            if(array[y + i] < array2[z + i]){
                y++;
                
            }
        }
        return array;
    }
    
}
