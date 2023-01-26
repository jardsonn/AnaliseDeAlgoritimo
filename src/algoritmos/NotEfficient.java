package algoritmos;

public class NotEfficient {

    /**Insertion Sort
     * A complexidade desse algoritmo é O(n^2), pois ele possui um loop externo que
     * itera n vezes (onde n é o tamanho do array) e um loop interno que também itera
     * n vezes, mas em geral irá iterar menos vezes à medida que o array for ordenado.
     **/
    public static void insertionSort(int[] array) {
        // loop externo que itera n vezes
        for (int i = 1; i < array.length; i++) {
            // armazena o valor atual na variavel "atual"
            int atual = array[i];
            int j = i - 1;
            // loop interno que itera enquanto j for maior ou igual a 0 e o valor de array[j] for maior que atual
            while (j >= 0 && array[j] > atual) {
                // move os elementos maiores do que atual uma posição para a direita
                array[j + 1] = array[j];
                j--;
            }
            // insere o valor de key na posição correta
            array[j + 1] = atual;
        }
    }


    /** Bubble Sort
     * A complexidade desse algoritmo é O(n^2),
     * onde n é o tamanho do array. Isso ocorre devido à utilização de um
     * loop interno (for) que é executado n vezes para cada iteração do loop
     * externo (for), e a cada iteração o maior elemento é "bubblado" para
     * o final do array, o que gera uma complexidade quadrática. A adição de
     * um teste para verificar se houve trocas durante a iteração pode melhorar
     * a eficiência em casos onde o array já está quase ordenado.
     */
    public static void bubbleSort(int[] array) {
        //flag para verificar se houve trocas
        boolean swapped;
        //loop externo para percorrer o array inteiro
        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;
            //loop interno para comparar os elementos vizinhos
            for (int j = 0; j < array.length - i - 1; j++) {
                //verifica se o elemento atual é maior que o próximo
                if (array[j] > array[j + 1]) {
                    //realiza a troca dos elementos
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    //marca que houve troca
                    swapped = true;
                }
            }
            //verifica se houve trocas
            if (!swapped) {
                //se não houve, o array já está ordenado e sai do loop
                break;
            }
        }
    }


    /**Seletion Sort
     * A complexidade desse algoritmo de ordenação por seleção é O(n^2), onde n
     * é o tamanho do array. Isso ocorre devido à utilização de dois loops aninhados,
     * onde o loop interno é executado n vezes para cada iteração do loop
     * externo, buscando o menor elemento e trocando-o com o elemento atual,
     * o que gera uma complexidade quadrática.
     */
    public static void selectionSort(int[] array) {
        //loop externo para percorrer o array inteiro
        for (int i = 0; i < array.length - 1; i++) {
            //inicia minIndex com o indice atual
            int minIndex = i;
            //loop interno para comparar os elementos restantes
            for (int j = i + 1; j < array.length; j++) {
                //verifica se o elemento atual é menor que o elemento armazenado em minIndex
                if (array[j] < array[minIndex]) {
                    //atualiza minIndex
                    minIndex = j;
                }
            }
            //realiza a troca dos elementos
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }


}
