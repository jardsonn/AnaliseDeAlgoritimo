package algoritmos.algoritmosefientes;

public class QuickSort {
    public static void ordenar(int[] arr) {
        ordenarRapido(arr, 0, arr.length - 1);
    }

    private static void ordenarRapido(int[] arr, int baixo, int alto) {
        // caso base: retorne se o índice baixo for maior ou igual ao índice alto
        if (baixo >= alto) return;
        // escolha o índice do elemento central como o elemento do meio
        int indiceCentro = (baixo + alto) / 2;
        // particione o array em torno do elemento do centro
        int indiceParticao = particionar(arr, baixo, alto, indiceCentro);
        // ordene recursivamente os elementos antes da particão
        ordenarRapido(arr, baixo, indiceParticao - 1);
        // ordene recursivamente os elementos depois da particão
        ordenarRapido(arr, indiceParticao, alto);
    }

    private static int particionar(int[] arr, int baixo, int alto, int indiceCentro) {
        int valorCentro = arr[indiceCentro];
        // mova o elemento do centro para o final do array
        trocar(arr, indiceCentro, alto);
        // inicialize o índice da particão
        int indiceParticao = baixo;
        // itere pelo array e mova os elementos menores que o centro para a esquerda da particão
        for (int i = baixo; i < alto; i++) {
            if (arr[i] < valorCentro) {
                trocar(arr, i, indiceParticao);
                indiceParticao++;
            }
        }
        // mova o elemento do centro para o índice da particão
        trocar(arr, indiceParticao, alto);
        return indiceParticao;
    }

    private static void trocar(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

