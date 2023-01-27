package algoritmos.algoritmosefientes;

public class QuickSort {

    public static void ordenar(int[] arr) {
        quicksort(arr, 0, arr.length - 1);
    }
    public static void quicksort(int[] array, int esquerda, int direita) {
        // Verifica se o índice esquerdo é menor do que o índice direito
        if (esquerda < direita) {
            // Encontra o ponto de particionamento
            int posicaoCentro = dividir(array, esquerda, direita);
            // Ordena o lado esquerdo do centro
            quicksort(array, esquerda, posicaoCentro - 1);
            // Ordena o lado direito do centro
            quicksort(array, posicaoCentro + 1, direita);
        }
    }

    public static int dividir(int[] array, int esquerda, int direita) {
        // Escolhe o elemento do meio como o centro
        int centro = array[(esquerda + direita) / 2];
        // Enquanto os índices esquerdo e direito não se cruzam
        while (esquerda <= direita) {
            // Encontra um elemento do lado esquerdo que deva ser movido para o lado direito
            while (array[esquerda] < centro) {
                esquerda++;
            }
            // Encontra um elemento do lado direito que deva ser movido para o lado esquerdo
            while (array[direita] > centro) {
                direita--;
            }
            // Troca os elementos encontrados
            if (esquerda <= direita) {
                int temp = array[esquerda];
                array[esquerda] = array[direita];
                array[direita] = temp;
                esquerda++;
                direita--;
            }
        }
        // Retorna a posição do centro
        return esquerda;
    }
}


