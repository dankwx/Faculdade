import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ordenacaoAleatoria {

    static void quickSort(int[] arr) {
        // new sort


    }

    static void bubbleSort(int[] arr) {
        int temp = 0;
        int cont = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                //trocar
                if (arr[j] > arr[j + 1]) {
                    ++cont;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("VEZES TROCADOS " + cont);
    }

    public static void main(String[] args) {
        int arr[] = arr = new Random().ints(1, 50001).distinct().limit(50000).toArray();

//        System.out.println("*** Lista antes do sort ***");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
        System.out.println("Tempo levado");
        long tempoInicial = System.currentTimeMillis();
        bubbleSort(arr);
        long stopTime = System.currentTimeMillis();
        System.out.println(stopTime - tempoInicial + " ms");
        long resultado = stopTime - tempoInicial;
        int seconds = (int) ((resultado / 1000) % 60);
        System.out.println(TimeUnit.MILLISECONDS.toSeconds(resultado) + " segundos");

//        System.out.println("*** Lista depois do sort ***");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
    }
}
