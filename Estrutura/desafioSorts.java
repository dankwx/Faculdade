import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class desafioSorts {

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        int cont = 0;
        for (int i = 0; i < n; i++) {

            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    ++cont;
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }


        }
        System.out.println("VEZES: " + cont);
    }

    public static void main(String[] args) {


        int arr[] = arr = new Random().ints(1, 50000).limit(50001).toArray();

//        System.out.println("Array Before Bubble Sort");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();

//        bubbleSort(arr);//sorting array elements using bubble sort

        System.out.println("Tempo levado:");
        long tempoInicial = System.currentTimeMillis();
        bubbleSort(arr);
        long stopTime = System.currentTimeMillis();
        System.out.println(stopTime - tempoInicial + " ms");
        long resultado = stopTime - tempoInicial;
        int seconds = (int) ((resultado / 1000) % 60);
        System.out.println(TimeUnit.MILLISECONDS.toSeconds(resultado) + " segundos");

//        long tempoInicial = System.currentTimeMillis();
//        Arrays.sort(arr);
//        long stopTime = System.currentTimeMillis();
//        System.out.println(stopTime - tempoInicial);
    }

}
