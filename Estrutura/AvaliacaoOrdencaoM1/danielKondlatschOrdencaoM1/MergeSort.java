package danielKondlatschOrdencaoM1;

public class MergeSort {

    public static int contarComparacoes = 0;
    public static String trocasFormatado = "";
    public static int contarTrocas = 0;

    public static void merge(int arr[], int l, int m, int r) {

        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];

        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            contarTrocas++;

            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

    }

    public static void sort(int arr[], int l, int r) {
        if (l < r) {
            contarComparacoes++;

            int m = l + (r - l) / 2;

            sort(arr, l, m);
            sort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    public static void printarResultadosMergeUm(int arr[]) {
        System.out.println("\nVetor de " + arr.length + " posicoes:");
    }

    public static void printarResultadosMerge(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print("");
        System.out.println("Comparaçoes: " + contarComparacoes);
        trocasFormatado = String.valueOf(contarTrocas);
        System.out.println("Trocas: " + trocasFormatado.replaceAll("-", ""));
    }

}
