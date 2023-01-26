package algoritmos.algoritmosefientes;

public class HeapSort {

    public static void ordenar(int[] array) {
        // Construir a árvore de heap
        int n = array.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        // Extrair elementos um por um
        for (int i = n - 1; i >= 0; i--) {
            // Move o elemento raiz para o final
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Reordena a árvore de heap
            heapify(array, i, 0);
        }
    }

    // Método auxiliar para construir a árvore de heap
    private static void heapify(int[] array, int n, int i) {
        int maior = i;
        int esquerda = 2 * i + 1;
        int direita = 2 * i + 2;

        // Se o filho da esquerda for maior do que a raiz
        if (esquerda < n && array[esquerda] > array[maior]) {
            maior = esquerda;
        }

        // Se o filho da direita for maior do que a raiz
        if (direita < n && array[direita] > array[maior]) {
            maior = direita;
        }

        // Se a raiz não for o maior elemento
        if (maior != i) {
            int temp = array[i];
            array[i] = array[maior];
            array[maior] = temp;

            // Reordena a sub-árvore afetada
            heapify(array, n, maior);
        }
    }
}
