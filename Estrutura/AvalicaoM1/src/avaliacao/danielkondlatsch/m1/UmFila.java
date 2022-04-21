/* ===================== AVISO =====================
 * !!!!!!!!!!!!! questão três e cinco não consegui realizar !!!!!!!!!!!!! *
 * * feito no IntelliJ
 */

package avaliacao.danielkondlatsch.m1;

import java.util.Scanner;

public class UmFila {


    public static void main(String[] args) {

        String[] Fila = new String[20];
        Scanner scanner = new Scanner(System.in);

        int aux = 20;
        int conta = 0;
        int filaContaVazia = 0;
        int filaContaVaziaDois = 0;
        int escolha = 0;
        int escolhaInterna = 0;


        System.out.println("\nQual opção deseja?\n1. Adicionar valores\n2. Remover valor\n3. Exibir valores\n" +
                "4. Verificar se está vazia\n5. Verificar se está cheia\n");
        escolha = Integer.parseInt(scanner.nextLine());
        while (escolha != 6) {
            switch (escolha) {
                case 1:
                    System.out.println("Insira 20 valores");
                    for (int i = 0; i < aux; i++) {

                        Fila[i] = new String(scanner.nextLine());            //  Fila[i] = new String(String.valueOf(i));
                    }
                    for (int y = 0; y < 20; y++) {
                        if (Fila[y].equals("0")) {
                            filaContaVazia++;

                        }
                        filaContaVaziaDois = filaContaVazia;
                    }

                    System.out.println("Deseja abrir o menu novamente ou sair? 1-abrir 2-sair");
                    escolhaInterna = Integer.parseInt(scanner.nextLine());
                    if (escolhaInterna == 2) {
                        escolha = 6;
                    } else {
                        escolha = 0;
                        System.out.println("\nQual opção deseja?\n1. Adicionar valores\n2. Remover valor\n3. Exibir valores\n" +
                                "4. Verificar se está vazia\n5. Verificar se está cheia\n");
                        escolha = Integer.parseInt(scanner.nextLine());
                    }

                    break;

                case 2:
                    System.out.println("Deseja remover qual item da fila?");
                    conta = Integer.parseInt(scanner.nextLine());
                    System.out.println("\n Item a ser removido: " + conta);
                    Fila[conta] = "0";
                    System.out.println("Deseja abrir o menu novamente ou sair? 1-abrir 2-sair");
                    escolhaInterna = Integer.parseInt(scanner.nextLine());
                    if (escolhaInterna == 2) {
                        escolha = 6;
                    } else {
                        escolha = 0;
                        System.out.println("\nQual opção deseja?\n1. Adicionar valores\n2. Remover valor\n3. Exibir valores\n" +
                                "4. Verificar se está vazia\n5. Verificar se está cheia\n");
                        escolha = Integer.parseInt(scanner.nextLine());
                    }
                    break;
                case 3:
                    System.out.println("\nFila ficou:\n");
                    for (int i = 0; i < aux; i++) {
                        System.out.println(Fila[i]);
                    }
                    System.out.println("Deseja abrir o menu novamente ou sair? 1-abrir 2-sair");
                    escolhaInterna = Integer.parseInt(scanner.nextLine());
                    if (escolhaInterna == 2) {
                        escolha = 6;
                    } else {
                        escolha = 0;
                        System.out.println("\nQual opção deseja?\n1. Adicionar valores\n2. Remover valor\n3. Exibir valores\n" +
                                "4. Verificar se está vazia\n5. Verificar se está cheia\n");
                        escolha = Integer.parseInt(scanner.nextLine());
                    }
                    break;
                case 4:
                    if (filaContaVazia == 20) {
                        System.out.println("Fila está vazia");
                    } else {
                        System.out.println("Fila não está vazia");
                    }
                    System.out.println("Deseja abrir o menu novamente ou sair? 1-abrir 2-sair");
                    escolhaInterna = Integer.parseInt(scanner.nextLine());
                    if (escolhaInterna == 2) {
                        escolha = 6;
                    } else {
                        escolha = 0;
                        System.out.println("\nQual opção deseja?\n1. Adicionar valores\n2. Remover valor\n3. Exibir valores\n" +
                                "4. Verificar se está vazia\n5. Verificar se está cheia\n");
                        escolha = Integer.parseInt(scanner.nextLine());
                    }
                    break;

                case 5:
                    if (filaContaVazia == 0) {
                        System.out.println("Fila está cheia");


                    } else {
                        System.out.println("Fila não está cheia");
                    }
                    System.out.println("Deseja abrir o menu novamente ou sair? 1-abrir 2-sair");
                    escolhaInterna = Integer.parseInt(scanner.nextLine());
                    escolhaInterna = Integer.parseInt(scanner.nextLine());
                    if (escolhaInterna == 2) {
                        escolha = 6;
                    } else {
                        escolha = 0;
                        System.out.println("\nQual opção deseja?\n1. Adicionar valores\n2. Remover valor\n3. Exibir valores\n" +
                                "4. Verificar se está vazia\n5. Verificar se está cheia\n");
                        escolha = Integer.parseInt(scanner.nextLine());
                    }
                    break;

            }
        }
        System.out.println("Programa encerrado");

        /*
        // ============= Adicionar valor a fila (ENQUEUE) ============= //
        for (int i = 0; i < aux; i++) {

            Fila[i] = new String(scanner.nextLine());            //  Fila[i] = new String(String.valueOf(i));
        }


        // ============= Remover item da fila (DEQUEUE) ============= //
        /*
        System.out.println("Deseja remover qual item da fila?");
        conta = Integer.parseInt(scanner.nextLine());
        System.out.println("\n Item a ser removido: " + conta);
        Fila[conta] = "0";*/


        // ============= Exibir valores da fila (SHOW) ============= //
        /*System.out.println("\nFila ficou:\n");
        for (int i = 0; i < aux; i++) {
            System.out.println(Fila[i]);
        }*/

        // ============= Verificar se está vazia (isEmpty) ============= //
        /*System.out.println("\nVerificando se a fila está vazia...\n");
        for (int i = 0; i < 20; i++) {
            if (Fila[i] == "0") {
                filaContaVazia++;

            } else {
                filaContaVazia = filaContaVazia;
            }
        }*/

        // ============= Verificar se fila possui valores ============= //
        /*System.out.println("\nVerificando se a fila está vazia...\n");
        for (int y = 0; y < 20; y++) {
            System.out.println(y);
            if (Fila[y].equals("0")) {
                filaContaVazia++;

            }
            filaContaVaziaDois = filaContaVazia;
        }

        if (filaContaVazia == 0) {
            System.out.println("Fila está cheia");

        }
        if (filaContaVazia == 20) {
            System.out.println("Fila está vazia");
        }


*/






        /* teste de inserir
        Fila[1] = new String("10");
         teste :System.out.println("bucetaaaaa"+Fila[2]);*/
        //isEmpty

        /*for (int i = 0; i < aux; i++) {
            if (
                    Fila[i].equalsIgnoreCase("0")
            ) {
                System.out.println("Fila possui posições com valor zero");
                conta++;
            }
        }*/


        /*if (conta == 10) {
            System.out.println("Fila está vazia");
        } else System.out.println("Fila não está vazias");*/
    }

}

