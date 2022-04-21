package Matriz;

import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {
        String[][] matriz = new String[5][5];

        Scanner entrada = new Scanner(System.in);
        System.out.println("Matriz M[5][5]\n");

        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                System.out.printf("Insira o conteudo M[%d][%d]: ", linha + 1, coluna + 1);
                matriz[linha][coluna] = entrada.nextLine();
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Linha: " + i + " Coluna: " + j + " - " + matriz[i][j]);
            }
        }
    }
}