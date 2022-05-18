package danielKondlatschOrdencaoM1;

public class SelectionSort {
    public static void sortSelection(int[] vetorSelection) {
        long inicioContador = System.currentTimeMillis();
        int contarTrocas = 0;
        int contarComparacoes = 0;
        String trocasFormatado = "";

        for (int i = 0; i < vetorSelection.length - 1; i++) {
            contarComparacoes++;
            int index = i;
            for (int j = i + 1; j < vetorSelection.length; j++) {
                if (vetorSelection[j] < vetorSelection[index]) {
                    contarTrocas++;
                    index = j;
                }
            }
            int smallerNumber = vetorSelection[index];
            vetorSelection[index] = vetorSelection[i];
            vetorSelection[i] = smallerNumber;
        }
        long fimContador = System.currentTimeMillis();
        System.out.println("\nVetor de " + vetorSelection.length + " posicoes:");
        System.out.println("Tempo levado: " + (fimContador - inicioContador) + "ms");
        System.out.println("Comparaçoes: " + contarComparacoes);
        trocasFormatado = String.valueOf(contarTrocas);
        System.out.println("Trocas: " + trocasFormatado.replaceAll("-", ""));
    }

}
