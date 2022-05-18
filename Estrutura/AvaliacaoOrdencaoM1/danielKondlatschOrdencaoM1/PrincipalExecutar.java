package danielKondlatschOrdencaoM1;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class PrincipalExecutar {

    // criando vetores com numeros aleatorios e injetando os valores em uma List
    // para tornar os valores
    // imutáveis (para que todos algoritmos usem o vetor com o mesmo valor) já que
    // um vetor não consegue
    // ser imutavel, depois disso convertendo os valores da List para um novo vetor
    // para que seja reutilizado em todos algoritmos
    final static int[] vetMil = new Random().ints(1, 1001).limit(1000).toArray();
    static List<Integer> listMil = Arrays.stream(vetMil).boxed().toList();
    public static int[] vetTempMil = listMil.stream().mapToInt(Integer::intValue).toArray();

    final static int[] vetDezMil = new Random().ints(1, 10001).limit(10000).toArray();
    static List<Integer> listDezMil = Arrays.stream(vetDezMil).boxed().toList();
    public static int[] vetTempDezMil = listDezMil.stream().mapToInt(Integer::intValue).toArray();

    final static int[] vetCinquentaMil = new Random().ints(1, 50001).limit(50000).toArray();
    static List<Integer> listCinquentaMil = Arrays.stream(vetCinquentaMil).boxed().toList();
    public static int[] vetTempCinquentaMil = listCinquentaMil.stream().mapToInt(Integer::intValue).toArray();

    final static int[] vetCemMil = new Random().ints(1, 100001).limit(100000).toArray();
    static List<Integer> listCemMil = Arrays.stream(vetCemMil).boxed().toList();
    public static int[] vetTempCemMil = listCemMil.stream().mapToInt(Integer::intValue).toArray();

    // ************************************OBS*******************************************
    // algumas variaveis estao em ingles pois peguei os algoritmos de sort da
    // internet

    // ************************************OBS*******************************************

    public static void main(String[] args) throws InterruptedException {

        System.out.println("\nAlgoritmo BubbleSort:\n");

        TimeUnit.SECONDS.sleep(2);

        vetTempMil = listMil.stream().mapToInt(Integer::intValue).toArray();
        BubbleSort.sortBubble(vetTempMil);

        vetTempDezMil = listDezMil.stream().mapToInt(Integer::intValue).toArray();
        BubbleSort.sortBubble(vetTempDezMil);

        vetTempCinquentaMil = listCinquentaMil.stream().mapToInt(Integer::intValue).toArray();
        BubbleSort.sortBubble(vetTempCinquentaMil);

        vetTempCemMil = listCemMil.stream().mapToInt(Integer::intValue).toArray();
        BubbleSort.sortBubble(vetTempCemMil);

        System.out.println("\n---- FIM BUBBLESORT ----\n");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("\nAlgoritmo SelectionSort:\n");
        TimeUnit.SECONDS.sleep(2);

        vetTempMil = listMil.stream().mapToInt(Integer::intValue).toArray();
        SelectionSort.sortSelection(vetTempMil);

        vetTempDezMil = listDezMil.stream().mapToInt(Integer::intValue).toArray();
        SelectionSort.sortSelection(vetTempDezMil);

        vetTempCinquentaMil = listCinquentaMil.stream().mapToInt(Integer::intValue).toArray();
        SelectionSort.sortSelection(vetTempCinquentaMil);

        vetTempCemMil = listCemMil.stream().mapToInt(Integer::intValue).toArray();
        SelectionSort.sortSelection(vetTempCemMil);

        System.out.println("\n---- FIM SELECTIONSORT ----\n");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("\nAlgoritmo InsertionSort:\n");
        TimeUnit.SECONDS.sleep(2);

        vetTempMil = listMil.stream().mapToInt(Integer::intValue).toArray();
        InsectionSort.sortInsection(vetTempMil);

        vetTempDezMil = listDezMil.stream().mapToInt(Integer::intValue).toArray();
        InsectionSort.sortInsection(vetTempDezMil);

        vetTempCinquentaMil = listCinquentaMil.stream().mapToInt(Integer::intValue).toArray();
        InsectionSort.sortInsection(vetTempCinquentaMil);

        vetTempCemMil = listCemMil.stream().mapToInt(Integer::intValue).toArray();
        InsectionSort.sortInsection(vetTempCemMil);

        System.out.println("\n---- FIM INSECTIONSORT ----\n");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("\nAlgoritmo QuickSort:\n");
        TimeUnit.SECONDS.sleep(2);

        vetTempMil = listMil.stream().mapToInt(Integer::intValue).toArray();
        QuickSort.informacoesQuick(vetTempMil);
        long inicioContadorUm = System.currentTimeMillis();
        QuickSort.sort(vetTempMil, 0, vetTempMil.length - 1);
        long fimContadorUm = System.currentTimeMillis();
        System.out.println("Tempo levado: " + (fimContadorUm - inicioContadorUm) + "ms");
        System.out.println("Comparaçoes: " + QuickSort.contarComparacoes);
        System.out.println("Trocas: " + QuickSort.tempo + "\n");

        vetTempDezMil = listDezMil.stream().mapToInt(Integer::intValue).toArray();
        QuickSort.informacoesQuick(vetTempDezMil);
        long inicioContadorDois = System.currentTimeMillis();
        QuickSort.sort(vetTempDezMil, 0, vetTempDezMil.length - 1);
        long fimContadorDois = System.currentTimeMillis();
        System.out.println("Tempo levado: " + (fimContadorDois - inicioContadorDois) + "ms");
        System.out.println("Comparaçoes: " + QuickSort.contarComparacoes);
        System.out.println("Trocas: " + QuickSort.tempo + "\n");

        vetTempCinquentaMil = listCinquentaMil.stream().mapToInt(Integer::intValue).toArray();
        QuickSort.informacoesQuick(vetTempCinquentaMil);
        long inicioContadorTres = System.currentTimeMillis();
        QuickSort.sort(vetTempCinquentaMil, 0, vetTempCinquentaMil.length - 1);
        long fimContadorTres = System.currentTimeMillis();
        System.out.println("Tempo levado: " + (fimContadorTres - inicioContadorTres) + "ms");
        System.out.println("Comparaçoes: " + QuickSort.contarComparacoes);
        System.out.println("Trocas: " + QuickSort.tempo + "\n");

        vetTempCemMil = listCemMil.stream().mapToInt(Integer::intValue).toArray();
        QuickSort.informacoesQuick(vetTempCemMil);
        long inicioContador = System.currentTimeMillis();
        QuickSort.sort(vetTempCemMil, 0, vetTempCemMil.length - 1);
        long fimContador = System.currentTimeMillis();
        System.out.println("Tempo levado: " + (fimContador - inicioContador) + "ms");
        System.out.println("Comparaçoes: " + QuickSort.contarComparacoes);
        System.out.println("Trocas: " + QuickSort.tempo + "\n");

        System.out.println("\n---- FIM QUICKSORT ----\n");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("\nAlgoritmo HeapSort:\n");
        TimeUnit.SECONDS.sleep(2);

        vetTempMil = listMil.stream().mapToInt(Integer::intValue).toArray();
        HeapSort.sort(vetTempMil);

        vetTempDezMil = listDezMil.stream().mapToInt(Integer::intValue).toArray();
        HeapSort.sort(vetTempDezMil);

        vetTempCinquentaMil = listCinquentaMil.stream().mapToInt(Integer::intValue).toArray();
        HeapSort.sort(vetTempCinquentaMil);

        vetTempCemMil = listCemMil.stream().mapToInt(Integer::intValue).toArray();
        HeapSort.sort(vetTempCemMil);

        System.out.println("\n---- FIM HEAPSORT ----\n");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("\nAlgoritmo MergeSort:\n");
        TimeUnit.SECONDS.sleep(2);

        vetTempMil = listMil.stream().mapToInt(Integer::intValue).toArray();
        long inicioContadorQuatro = System.currentTimeMillis();
        MergeSort.sort(vetTempMil, 0, vetTempMil.length - 1);
        long fimContadorQuatro = System.currentTimeMillis();
        MergeSort.printarResultadosMergeUm(vetTempMil);
        System.out.println("Tempo levado: " + (fimContadorQuatro - inicioContadorQuatro) + "ms");
        MergeSort.printarResultadosMerge(vetTempMil);

        vetTempDezMil = listDezMil.stream().mapToInt(Integer::intValue).toArray();
        long inicioContadorCinco = System.currentTimeMillis();
        MergeSort.sort(vetTempDezMil, 0, vetTempDezMil.length - 1);
        long fimContadorCinco = System.currentTimeMillis();
        MergeSort.printarResultadosMergeUm(vetTempDezMil);
        System.out.println("Tempo levado: " + (fimContadorCinco - inicioContadorCinco) + "ms");
        MergeSort.printarResultadosMerge(vetTempDezMil);

        vetTempCinquentaMil = listCinquentaMil.stream().mapToInt(Integer::intValue).toArray();
        long inicioContadorSeis = System.currentTimeMillis();
        MergeSort.sort(vetTempCinquentaMil, 0, vetTempCinquentaMil.length - 1);
        long fimContadorSeis = System.currentTimeMillis();
        MergeSort.printarResultadosMergeUm(vetTempCinquentaMil);
        System.out.println("Tempo levado: " + (fimContadorSeis - inicioContadorSeis) + "ms");
        MergeSort.printarResultadosMerge(vetTempCinquentaMil);

        vetTempCemMil = listCemMil.stream().mapToInt(Integer::intValue).toArray();
        long inicioContadorSete = System.currentTimeMillis();
        MergeSort.sort(vetTempCemMil, 0, vetTempCemMil.length - 1);
        long fimContadorSete = System.currentTimeMillis();
        MergeSort.printarResultadosMergeUm(vetTempCemMil);
        System.out.println("Tempo levado: " + (fimContadorSete - inicioContadorSete) + "ms");
        MergeSort.printarResultadosMerge(vetTempCemMil);

        System.out.println("\n---- FIM MERGESORT ----\n");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("\nAlgoritmo ShellSort:\n");
        TimeUnit.SECONDS.sleep(2);

        vetTempMil = listMil.stream().mapToInt(Integer::intValue).toArray();
        ShellSort.sortShell(vetTempMil);

        vetTempDezMil = listDezMil.stream().mapToInt(Integer::intValue).toArray();
        ShellSort.sortShell(vetTempDezMil);

        vetTempCinquentaMil = listCinquentaMil.stream().mapToInt(Integer::intValue).toArray();
        ShellSort.sortShell(vetTempCinquentaMil);

        vetTempCemMil = listCemMil.stream().mapToInt(Integer::intValue).toArray();
        ShellSort.sortShell(vetTempCemMil);

        System.out.println("\n---- FIM SHELLSORT ----\n");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Todos algoritmos foram executados.");
        System.out.println(
                "Algoritmos utilizados:\n- BubbleSort\n- SelectionSort\n- InsertionSort\n- QuickSort\n- HeapSort\n- MergeSort\n- ShellSort\n");

        // alguns timers estao no codigo main pois nao consegui implementar nas funcoes
        // respectivas, mas funcionam normalmente
    }

}
