package danielKondlatschOrdencaoM1;

public class ShellSort {
    public static int contarComparacoes = 0;
    public static String trocasFormatado = "";
    public static int contarTrocas = 0;

    public static void sortShell(int vetorShell[]) {
        int n = vetorShell.length;
        long inicioContador = System.currentTimeMillis();

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {

                int key = vetorShell[i];
                int j = i;
                while (j >= gap && vetorShell[j - gap] > key) {
                    contarTrocas++;

                    vetorShell[j] = vetorShell[j - gap];
                    j -= gap;
                }
                contarComparacoes++;
                vetorShell[j] = key;
            }
        }
        long fimContador = System.currentTimeMillis();
        System.out.println("\nVetor de " + vetorShell.length + " posicoes:");
        System.out.println("Tempo levado: " + (fimContador - inicioContador) + "ms");
        System.out.println("Comparaçoes: " + contarComparacoes);
        trocasFormatado = String.valueOf(contarTrocas);
        System.out.println("Trocas: " + trocasFormatado.replaceAll("-", ""));

    }

}
