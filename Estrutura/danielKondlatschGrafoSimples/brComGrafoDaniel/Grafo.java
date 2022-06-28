package brComGrafoDaniel;

import java.util.Scanner;

public class Grafo {

    public static void criarGrafo(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grafo = new int[n][n];
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            grafo[u][v] = 1;
            grafo[v][u] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grafo[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grafo[i][j] + " ");
            }
            System.out.println();
        }
    }

    // primeiro valor é o número de vértices e o segundo é o número de arestas
    // use 0 e 1 para formar
    // sem o método de busca funcionado
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        criarGrafo(sc);
    }
}