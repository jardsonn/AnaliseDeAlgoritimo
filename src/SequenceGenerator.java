import java.util.*;

public class SequenceGenerator {

    public static final int ELEMENTOS_ORDENADOS_SEM_REPETICAO_10000 = 0;
    public static final int ELEMENTOS_ORDENADOS_COM_REPETICAO_10000 = 1;
    public static final int ELEMENTOS_INVERSAMENTE_ORDENADOS_SEM_REPETICAO_10000 = 2;
    public static final int ELEMENTOS_INVERSAMENTE_ORDENADOS_COM_REPETICAO_10000 = 3;
    public static final int ELEMENTOS_ALEATORIO_SEM_REPETICAO_10000 = 4;
    public static final int ELEMENTOS_ALEATORIO_COM_REPETICAO_10000 = 5;
    public static final int ELEMENTOS_QUASE_ORDENADOS_COM_REPETICAO_10000 = 6;
    public static final int ELEMENTOS_QUASE_ORDENADOS_SEM_REPETICAO_10000 = 7;

    private static final int n = 10000;
    private final int e;

    public SequenceGenerator(int e) {
        this.e = e;
    }

    public int[] elements10000(){
        int[] arr = new int[n];
        int i = 0;
        for (Object e : switchElemets()){
            arr[i] = (int) e;
            i++;
        }
        return arr;
    }

    Random r = new Random();
    private Object[] switchElemets() {
        switch (e) {
            case ELEMENTOS_ORDENADOS_SEM_REPETICAO_10000 -> {
                ArrayList<Integer> ordSemRep = new ArrayList<>();
                for (int i = 1; i <= n; i++) {
                    ordSemRep.add(i);
                }
                return ordSemRep.toArray();
            }
            case ELEMENTOS_ORDENADOS_COM_REPETICAO_10000 -> {
                ArrayList<Integer> ordComRep = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    ordComRep.add(i % (n / 10) + 1);
                }
                return ordComRep.toArray();
            }
            case ELEMENTOS_INVERSAMENTE_ORDENADOS_SEM_REPETICAO_10000 -> {
                ArrayList<Integer> invOrdSemRep = new ArrayList<>();
                for (int i = n; i >= 1; i--) {
                    invOrdSemRep.add(i);
                }
                return invOrdSemRep.toArray();
            }
            case ELEMENTOS_INVERSAMENTE_ORDENADOS_COM_REPETICAO_10000 -> {
                ArrayList<Integer> invOrdComRep = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    invOrdComRep.add(n - i % (n / 10));
                }
                return invOrdComRep.toArray();
            }
            case ELEMENTOS_ALEATORIO_SEM_REPETICAO_10000 -> {
                ArrayList<Integer> randSemRep = new ArrayList<>();
                for (int i = 1; i <= n; i++) {
                    randSemRep.add(i);
                }
                Collections.shuffle(randSemRep);
                return randSemRep.toArray();
            }
            case ELEMENTOS_ALEATORIO_COM_REPETICAO_10000 -> {
                ArrayList<Integer> randComRep = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    randComRep.add(r.nextInt(n / 10) + 1);
                }
                return randComRep.toArray();
            }
            case ELEMENTOS_QUASE_ORDENADOS_COM_REPETICAO_10000 -> {
                ArrayList<Integer> quasiOrdComRep = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    if (i % 10 == 0) {
                        quasiOrdComRep.add(r.nextInt(n / 10) + 1);
                    } else {
                        quasiOrdComRep.add(i % (n / 10) + 1);
                    }
                }
                return quasiOrdComRep.toArray();
            }
            case ELEMENTOS_QUASE_ORDENADOS_SEM_REPETICAO_10000 -> {
                ArrayList<Integer> quasiOrdSemRep = new ArrayList<>();
                for (int i = 1; i <= n; i++) {
                    quasiOrdSemRep.add(i);
                }
                int m = n / 10;
                for (int i = 0; i < m; i++) {
                    int a = r.nextInt(n);
                    int b = r.nextInt(n);
                    int temp = quasiOrdSemRep.get(a);
                    quasiOrdSemRep.set(a, quasiOrdSemRep.get(b));
                    quasiOrdSemRep.set(b, temp);
                }
                return quasiOrdSemRep.toArray();
            }
        }
        return new Object[0];
    }

}

