package algoritmos.algoritmosefientes;

public class MergeSort {
    // Método principal do algoritmo
    public static void ordenar(int[] vetor) {
        // Verifica se o tamanho do vetor é maior que 1
        if (vetor.length > 1) {
            // Calcula o meio do vetor
            int meio = vetor.length / 2;
            // Cria dois vetores com tamanhos metade do vetor original
            int[] esquerda = new int[meio];
            int[] direita = new int[vetor.length - meio];
            // Copia os elementos do vetor original para os vetores esquerda e direita
            for (int i = 0; i < meio; i++) {
                esquerda[i] = vetor[i];
            }
            for (int i = meio; i < vetor.length; i++) {
                direita[i - meio] = vetor[i];
            }
            // Chama o método ordenar recursivamente para os vetores esquerda e direita
            ordenar(esquerda);
            ordenar(direita);
            // Mescla os vetores esquerda e direita ordenados de volta para o vetor original
            mesclar(vetor, esquerda, direita);
        }
    }
    // Método auxiliar para mesclar os vetores esquerda e direita ordenados de volta para o vetor original
    public static void mesclar(int[] vetor, int[] esquerda, int[] direita) {
        int indiceEsquerda = 0;
        int indiceDireita = 0;
        int indiceVetor = 0;
        // Enquanto o índice dos vetores esquerda e direita for menor que seus respectivos tamanhos
        while (indiceEsquerda < esquerda.length && indiceDireita < direita.length) {
            // Compara os elementos dos vetores esquerda e direita e adiciona o menor de volta para o vetor original
            if (esquerda[indiceEsquerda] < direita[indiceDireita]) {
                vetor[indiceVetor] = esquerda[indiceEsquerda];
                indiceEsquerda++;
            } else {
                vetor[indiceVetor] = direita[indiceDireita];
                indiceDireita++;
            }
            indiceVetor++;
        }
        // Adiciona os elementos restantes dos vetores esquerda e direita de volta para o vetor original
        while (indiceEsquerda < esquerda.length) {
            vetor[indiceVetor] = esquerda[indiceEsquerda];
            indiceEsquerda++;
            indiceVetor++;
        }
        while (indiceDireita < direita.length) {
            vetor[indiceVetor] = direita[indiceDireita];
            indiceDireita++;
            indiceVetor++;
        }
    }
}
