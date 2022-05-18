package danielKondlatschOrdencaoM1;

public class InsectionSort {
    public static void sortInsection(int[] vetorInsection) {
        long inicioContador = System.currentTimeMillis();
        int contarTrocas = 0;
        int contarComparacoes = 0;
        String trocasFormatado = "";

        for (int i = 1; i < vetorInsection.length; ++i) {
            contarComparacoes++;
            int key = vetorInsection[i];
            int j = i - 1;

            while (j >= 0 && vetorInsection[j] > key) {
                contarTrocas++;
                vetorInsection[j + 1] = vetorInsection[j];
                j = j - 1;
            }
            vetorInsection[j + 1] = key;
        }
        long fimContador = System.currentTimeMillis();
        System.out.println("\nVetor de " + vetorInsection.length + " posicoes:");
        System.out.println("Tempo levado: " + (fimContador - inicioContador) + "ms");
        System.out.println("Comparaçoes: " + contarComparacoes);
        trocasFormatado = String.valueOf(contarTrocas);
        System.out.println("Trocas: " + trocasFormatado.replaceAll("-", ""));
    }

}
