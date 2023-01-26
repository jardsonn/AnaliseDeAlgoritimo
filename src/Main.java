import algoritmos.NotEfficient;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        int[] elemets = Dados100.ELEMENTOS_QUASE_ORDENADOS_SEM_REPETICAO_100;

        printBubbleSort(elemets);
        printInsertionSort(elemets);
        printSelectionSort(elemets);
    }

    private static void printBubbleSort(int[] elementos) {
        System.out.println("##### BubbleSort #####");
        System.out.println("ELEMENTOS DE ENTRADA: " + Arrays.toString(elementos));
        long start = System.currentTimeMillis();
        NotEfficient.bubbleSort(elementos);
        long duration = System.currentTimeMillis() - start;
        System.out.println("ELEMENTOS ORDENADOS: " + Arrays.toString(elementos));
        System.out.println("TEMPO DE EXECUÇÃO: " + duration + " milissegundos\n\n");
    }

    private static void printInsertionSort(int[] elementos) {
        System.out.println("##### InsertionSort #####");
        System.out.println("ELEMENTOS DE ENTRADA: " + Arrays.toString(elementos));
        long start = System.currentTimeMillis();
        NotEfficient.insertionSort(elementos);
        long duration = System.currentTimeMillis() - start;
        System.out.println("ELEMENTOS ORDENADOS: " + Arrays.toString(elementos));
        System.out.println("TEMPO DE EXECUÇÃO: " + duration + " milissegundos\n\n");
    }

    private static void printSelectionSort(int[] elementos) {
        System.out.println("##### SelectionSort #####");
        System.out.println("ELEMENTOS DE ENTRADA: " + Arrays.toString(elementos));
        long start = System.currentTimeMillis();
        NotEfficient.selectionSort(elementos);
        long duration = System.currentTimeMillis() - start;
        System.out.println("ELEMENTOS ORDENADOS: " + Arrays.toString(elementos));
        System.out.println("TEMPO DE EXECUÇÃO: " + duration + " milissegundos\n\n");
    }


}
