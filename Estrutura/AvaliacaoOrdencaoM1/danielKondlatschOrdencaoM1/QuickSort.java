package danielKondlatschOrdencaoM1;

public class QuickSort {
    public static int tempo = 0;
    public static int contarComparacoes = 0;
    public static String trocasFormatado = "";
    public static int contarTrocas = 0;

    public static int partition(int arr[], int low, int high) {
        int contarTrocas = 0;

        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            contarComparacoes++;

            if (arr[j] <= pivot) {
                contarTrocas++;
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        tempo = tempo + contarTrocas;

        return +i + 1;

    }

    public static void sort(int arr[], int low, int high) {

        if (low < high) {

            int pi = partition(arr, low, high);

            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);

        }

    }

    public static void informacoesQuick(int arr[]) {
        System.out.println("Vetor de " + arr.length + " posicoes:");
    }

}
