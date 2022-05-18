package danielKondlatschOrdencaoM1;

public class BubbleSort {

    public static void sortBubble(int[] vetorBubble) {

        int contarTrocas = 0;
        int contarComparacoes = 0;
        String trocasFormatado = "";
        long inicioContador = System.currentTimeMillis();

        for (int i = 0; i < vetorBubble.length - 1; i++) {
            contarComparacoes++;
            for (int j = 0; j < vetorBubble.length - 1 - i; j++) {
                //
                if (vetorBubble[j] > vetorBubble[j + 1]) {
                    contarTrocas++;
                    int aux = vetorBubble[j];
                    vetorBubble[j] = vetorBubble[j + 1];
                    vetorBubble[j + 1] = aux;
                }
            }
        }
        long fimContador = System.currentTimeMillis();
        System.out.println("\nVetor de " + vetorBubble.length + " posicoes:");
        System.out.println("Tempo levado: " + (fimContador - inicioContador) + "ms");
        System.out.println("Comparaçoes: " + contarComparacoes);
        trocasFormatado = String.valueOf(contarTrocas);
        System.out.println("Trocas: " + trocasFormatado.replaceAll("-", ""));

    }

}
