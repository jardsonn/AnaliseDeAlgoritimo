import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class SequenceGenerator {
    public static void main(String[] args) {
        int[] sizes = {10, 100, 1000, 10000, 100000, 1000000};
        for (int size : sizes) {
            // Gera sequencia ordenada
            Integer[] orderedSequence = new Integer[size];
            for (int i = 0; i < size; i++) {
                orderedSequence[i] = i;
            }
            System.out.println("Sequencia ordenada de tamanho " + size + ":");
            System.out.println(Arrays.toString(orderedSequence));
            Arrays.sort(orderedSequence);
            System.out.println("Sequencia ordenada após ordenação:");
            System.out.println(Arrays.toString(orderedSequence) + "\n");

            // Gera sequencia inversamente ordenada
            Integer[] reverseOrderedSequence = new Integer[size];
            for (int i = 0; i < size; i++) {
                reverseOrderedSequence[i] = size - i - 1;
            }
            System.out.println("Sequencia inversamente ordenada de tamanho " + size + ":");
            System.out.println(Arrays.toString(reverseOrderedSequence));
            Arrays.sort(reverseOrderedSequence);
            System.out.println("Sequencia inversamente ordenada após ordenação:");
            System.out.println(Arrays.toString(reverseOrderedSequence) + "\n");

            // Gera sequencia quase ordenada
            Integer[] almostOrderedSequence = new Integer[size];
            for (int i = 0; i < size; i++) {
                almostOrderedSequence[i] = i;
            }
            Random rand = new Random();
            for (int i = 0; i < size / 10; i++) {
                int randomIndex = rand.nextInt(size);
                int temp = almostOrderedSequence[randomIndex];
                almostOrderedSequence[randomIndex] = almostOrderedSequence[i];
                almostOrderedSequence[i] = temp;
            }
            System.out.println("Sequencia quase ordenada de tamanho " + size + ":");
            System.out.println(Arrays.toString(almostOrderedSequence));
            Arrays.sort(almostOrderedSequence);
            System.out.println("Sequencia quase ordenada após ordenação:");
            System.out.println(Arrays.toString(almostOrderedSequence) + "\n");

            // Gera sequencia aleatória sem valores repetidos
            Integer[] randomSequence = new Integer[size];
            for (int i = 0; i < size; i++) {
                randomSequence[i] = i;
            }
            Collections.shuffle(Arrays.asList(randomSequence));
            System.out.println("Sequencia aleatória sem valores repetidos de tamanho " + size + ": ");
            System.out.println(Arrays.toString(randomSequence));
            Arrays.sort(randomSequence);
            System.out.println("Sequencia aleatória sem valores repetidos após ordenação:");
            System.out.println(Arrays.toString(randomSequence) + "\n");
        }
    }
}

