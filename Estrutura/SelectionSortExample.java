public class SelectionSortExample {
    public static void main(String[] args) {
        int arr[] = {5, 2, 3, 1, 4};

        System.out.println("Após ordenação da selação");
        for (int i : arr) {
            System.out.println(i + "");

            selectionSort(arr);
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int indice = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[indice]) {
                    indice = j; //procurando menor indice
                }
            }

            int menorNumero = arr[indice];
            arr[indice] = arr[i];
            arr[i] = menorNumero;
        }
    }
}
