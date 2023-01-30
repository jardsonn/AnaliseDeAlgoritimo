import algoritmos.NotEfficient;
import algoritmos.algoritmosefientes.HeapSort;
import algoritmos.algoritmosefientes.MergeSort;
import algoritmos.algoritmosefientes.QuickSort;
import dados.Dados100;

import java.util.*;

public class Main {


    public static void main(String[] args) {
//        int[] elemets = Dados100.ELEMENTOS_ALEATORIO_COM_REPETICAO_100;
        int[] elemets10000 = new SequenceGenerator(SequenceGenerator.ELEMENTOS_ALEATORIO_SEM_REPETICAO_10000).elements10000();

        int[] elemets = elemets10000;

        System.out.println("---------- EFICIENTES----------");
        heapSortPrint(elemets);
        mergeSortPrint(elemets);
        quickSortPrint(elemets);
        System.out.println("---------- NÃO EFICIENTES----------");
        printBubbleSort(elemets);
        printInsertionSort(elemets);
        printSelectionSort(elemets);
    }

    public static int[] copy(int[] elementos) {
        int[] e = new int[elementos.length];
        System.arraycopy(elementos, 0, e, 0, elementos.length);
        return e;
    }

    private static void printBubbleSort(int[] elementos) {
        int[] e = copy(elementos);
        System.out.println("##### BubbleSort #####");
        System.out.println("ELEMENTOS DE ENTRADA: " + Arrays.toString(e));
        long start = System.currentTimeMillis();
        NotEfficient.bubbleSort(e);
        long duration = System.currentTimeMillis() - start;
        System.out.println("ELEMENTOS ORDENADOS: " + Arrays.toString(e));
        System.out.println("TEMPO DE EXECUÇÃO: " + duration + " milissegundos\n\n");
    }

    private static void printInsertionSort(int[] elementos) {
        int[] e = copy(elementos);
        System.out.println("##### InsertionSort #####");
        System.out.println("ELEMENTOS DE ENTRADA: " + Arrays.toString(e));
        long start = System.currentTimeMillis();
        NotEfficient.insertionSort(e);
        long duration = System.currentTimeMillis() - start;
        System.out.println("ELEMENTOS ORDENADOS: " + Arrays.toString(e));
        System.out.println("TEMPO DE EXECUÇÃO: " + duration + " milissegundos\n\n");
    }

    private static void printSelectionSort(int[] elementos) {
        int[] e = copy(elementos);
        System.out.println("##### SelectionSort #####");
        System.out.println("ELEMENTOS DE ENTRADA: " + Arrays.toString(e));
        long start = System.currentTimeMillis();
        NotEfficient.selectionSort(e);
        long duration = System.currentTimeMillis() - start;
        System.out.println("ELEMENTOS ORDENADOS: " + Arrays.toString(e));
        System.out.println("TEMPO DE EXECUÇÃO: " + duration + " milissegundos\n\n");
    }


    public static void heapSortPrint(int[] elementos) {
        int[] e = copy(elementos);
        System.out.println("##### HeapSort #####");
        System.out.println("ELEMENTOS DE ENTRADA: " + Arrays.toString(e));
        long start = System.currentTimeMillis();
        HeapSort.ordenar(e);
        long duration = System.currentTimeMillis() - start;
        System.out.println("ELEMENTOS ORDENADOS: " + Arrays.toString(e));
        System.out.println("TEMPO DE EXECUÇÃO: " + duration + " milissegundos\n\n");
    }

    public static void mergeSortPrint(int[] elementos) {
        int[] e = copy(elementos);
        System.out.println("##### MergeSort #####");
        System.out.println("ELEMENTOS DE ENTRADA: " + Arrays.toString(e));
        long start = System.currentTimeMillis();
        MergeSort.ordenar(e);
        long duration = System.currentTimeMillis() - start;
        System.out.println("ELEMENTOS ORDENADOS: " + Arrays.toString(e));
        System.out.println("TEMPO DE EXECUÇÃO: " + duration + " milissegundos\n\n");
    }


    public static void quickSortPrint(int[] elementos) {
        int[] e = copy(elementos);
        System.out.println("##### QuickSort #####");
        System.out.println("ELEMENTOS DE ENTRADA: " + Arrays.toString(e));
        long start = System.currentTimeMillis();
        QuickSort.ordenar(e);
        long duration = System.currentTimeMillis() - start;
        System.out.println("ELEMENTOS ORDENADOS: " + Arrays.toString(e));
        System.out.println("TEMPO DE EXECUÇÃO: " + duration + " milissegundos\n\n");
    }


}
