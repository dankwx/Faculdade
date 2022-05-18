package danielKondlatschOrdencaoM1;

public class HeapSort {
    public static String trocasFormatado = "";
    public static int contarTrocas = 0;

    public static void sort(int arr[]) {
        long inicioContador = System.currentTimeMillis();

        int contarComparacoes = 0;
        trocasFormatado = "fd";
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        for (int i = n - 1; i >= 0; i--) {
            contarComparacoes++;

            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
        long fimContador = System.currentTimeMillis();
        System.out.println("\nVetor de " + arr.length + " posicoes:");
        System.out.println("Tempo levado: " + (fimContador - inicioContador) + "ms");
        System.out.println("Comparaçoes: " + contarComparacoes);
        trocasFormatado = String.valueOf(contarTrocas);
        System.out.println("Trocas: " + trocasFormatado.replaceAll("-", ""));

    }

    public static void heapify(int vetorHeap[], int n, int i) {

        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && vetorHeap[l] > vetorHeap[largest])
            largest = l;

        if (r < n && vetorHeap[r] > vetorHeap[largest])
            largest = r;

        if (largest != i) {
            int swap = vetorHeap[i];
            vetorHeap[i] = vetorHeap[largest];
            vetorHeap[largest] = swap;
            contarTrocas++;

            heapify(vetorHeap, n, largest);
        }

    }

}
